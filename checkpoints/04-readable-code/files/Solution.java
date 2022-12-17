class Program {

  public static String checkBoundary(int number){
    int smallBoundary = 5;
    int largeBoundary = 15;
    if(number < smallBoundary)
      return "small";
    else if(number > largeBoundary)
      return "large";
    else
      return "medium";
  }
}
