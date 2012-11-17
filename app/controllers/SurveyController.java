package controllers;

import java.util.Map;

import play.*;
import play.cache.Cache;
import play.mvc.*;
import play.data.*;

import models.*;

import views.html.*;

public class SurveyController extends Controller {

  // declarations  
  static Form<Survey> surveyForm = form(Survey.class);

  // methods
  public static Result index() {
    Survey survey = new Survey(true);

    surveyForm = surveyForm.fill(survey);

    Logger.info(surveyForm.toString());

    return ok(form.render(surveyForm, survey.getQuestions()));
  }

  public static Result send() {
    surveyForm = surveyForm.bindFromRequest();

    Logger.info("Checking to see if the input was valid: " + surveyForm);
    
    if (surveyForm.hasErrors()) {
      Survey survey = new Survey(true);
      
      Logger.info("Validation failed.");
      Logger.info(surveyForm.errorsAsJson().toString());

      return badRequest(form.render(surveyForm, survey.getQuestions()));
    }

    Logger.info("Found " + surveyForm.get().getQuestions().size() + " questions.");

    for (Question q : surveyForm.get().getQuestions()) {
      Logger.info("Question: " + q.getText() + ", answer: " + q.getAnswer());
    }

    Logger.info("No errors found!");
    
    return ok(result.render());
  }

}
