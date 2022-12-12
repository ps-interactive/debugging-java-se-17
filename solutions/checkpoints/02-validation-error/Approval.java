class Approval {

  public static double threshold = 10000;

  public static boolean needsApproval(double amount){
    if(amount > threshold){
      return true;
    } else {
      return false;
    }
  }

}