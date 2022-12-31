package com.globomantics.shipping;

import java.util.ArrayList;
import java.util.List;

public class Program {

  public static void main(String[] args) {
    List<byte[]> memoryUser = new ArrayList<>();
    for (int i = 1; i < 10; i++) {
      byte[] mb = new byte[10 * 1024 * 1024];
      memoryUser.add(mb);
      Runtime rt = Runtime.getRuntime();
      System.out.printf("[%2s] Available heap memory: %s%n", i, rt.freeMemory());
    }
    System.out.println("Successfully completed program");
  }
}