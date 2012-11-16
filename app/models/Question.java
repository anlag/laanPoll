package models;

//import java.util.*;
//import play.data.validation.Constraints.*;

public class Question {

//  public Long id;
  private String text;
  private String answer;

  public void setText(String text) {
    this.text = text;
  }

  public String getText() {
    return this.text;
  }
  
  public void setAnswer(String answer) {
    this.answer = answer;
  }

  public String getAnswer() {
    return this.answer;
  }

}
