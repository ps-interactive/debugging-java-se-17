class Program {

  public static int MAX_WEIGHT = 150;
  public static String ERROR_MESSAGE = "Overweight";
  public static String OK_MESSAGE = "OK";

  public static String safetyCheck(int actualWeight) {

    if (actualWeight < MAX_WEIGHT) {
      return ERROR_MESSAGE;
    } else {
      return OK_MESSAGE;
    }
  }
}
