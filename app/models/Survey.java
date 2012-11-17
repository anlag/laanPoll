package models;

import java.util.*;

import javax.validation.Valid;

import play.data.validation.Constraints.*;

public class Survey {
  // declarations
  @Valid
  private List<Question> questions;

  // default constructor
  public Survey() { }

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
