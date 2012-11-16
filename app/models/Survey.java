package models;

import java.util.*;
import play.data.validation.Constraints.*;

public class Survey {

  // declarations
  private List<Question> questions;

  // methods
  public Survey(boolean test) {
    questions = new ArrayList<Question>();

    if (test) {
      Question question = new Question();
      question.setText("What's your name?");

      questions.add(question);

      question = new Question();
      question.setText("How old are you?");

      questions.add(question);
    }
  }

  public void setQuestions(List<Question> questions) {
    this.questions = questions;
  }

  public List<Question> getQuestions() {
    return this.questions;
  }

}
