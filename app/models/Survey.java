package models;

import java.util.*;
import play.data.validation.Constraints.*;

public class Survey {

  // declarations
  public Long id;

  @Required
  public String label;

  // methods
  public static List<Survey> all() {
    return new ArrayList<Survey>();
  }

  public static void create(Survey survey) {
  }

  public static void delete(Long id) {
  }

}
