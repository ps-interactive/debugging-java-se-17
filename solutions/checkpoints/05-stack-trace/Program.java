package com.globomantics.shipping;

import java.util.Date;
import java.time.Instant;

public class Program {

  public static void main(String[] args) {
    Item first = new Item("Paper", "White");
    Item second = new Item("Pen", "Black");
    Order monthly = new Order(Date.from(Instant.now()), "Wired Coffee");
    monthly.addItem(first);
    monthly.addItem(second);
    processItem(monthly.getItemList().get(1));
  }

  public static void processItem(Item item) {
    // stub method for example. This could contain logic to check for sales
    // or other actions related to an item in an order list.
  }

}
