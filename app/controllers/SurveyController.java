package controllers;

import play.*;
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

    return ok(form.render(surveyForm));
  }

}
