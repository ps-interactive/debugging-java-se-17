package com.globomantics.shipping;

public class Program {

  public static void main(String[] args) {
    Item first = new Item("first", "blue");
    Item second = new Item("second", "red");
    System.out.println("Item name: " + first.getName());
    System.out.println("Item name: " + second.getName());
  }

}
