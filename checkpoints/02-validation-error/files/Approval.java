class Approval {

  public static double threshold = 5000;

  public static boolean needsApproval(double amount){
    if(amount > threshold){
      return true;
    } else {
      return false;
    }
  }

  public static void main(String[] args) {
    double amount = 3000;
    System.out.println(amount + " needs approval: ");
    System.out.println(needsApproval(amount));

    amount = 7500;
    System.out.println(amount + " needs approval: ");
    System.out.println(needsApproval(amount));

    amount = 12500;
    System.out.println(amount + " needs approval: ");
    System.out.println(needsApproval(amount));
  }

}