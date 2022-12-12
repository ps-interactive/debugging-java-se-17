class Program {

  public static String checkBoundary(int number){
    int a=5,c=15;
    if(number<a) return "small"; else if(number>c) return "large"; else return "medium";
  }

  public static void main(String[] args) {
    System.out.println(checkBoundary(4));
    System.out.println(checkBoundary(10));
    System.out.println(checkBoundary(16));
  }
}
