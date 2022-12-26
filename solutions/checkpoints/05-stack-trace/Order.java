package com.globomantics.shipping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
  private Date delivery;
  private List<Item> itemList;
  private String customer;

  public Order(Date delivery, String customer) {
    this.delivery = delivery;
    this.customer = customer;
    this.itemList = new ArrayList<Item>();
  }

  public void removeItem(Item item) {
    this.itemList.remove(item);
  }

  public void addItem(Item item) {
    this.itemList.add(item);
  }

  public List<Item> getItemList() {
    return itemList;
  }

  public Date getDelivery() {
    return delivery;
  }

  public void setDelivery(Date delivery) {
    this.delivery = delivery;
  }

  public String getCustomer() {
    return customer;
  }

  public void setCustomer(String customer) {
    this.customer = customer;
  }
}