package com.globomantics.shipping;

import java.util.Objects;

public class Item {
  private String name;
  private String color;

  public Item(String name, String color) {
    this.name = name;
    this.color = color;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Item item = (Item) o;
    return Objects.equals(name.toLowerCase(), item.name.toLowerCase()) && Objects.equals(color, item.color);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  @Override
  public int hashCode() {
    return Objects.hash(name.toLowerCase(), color);
  }
}
