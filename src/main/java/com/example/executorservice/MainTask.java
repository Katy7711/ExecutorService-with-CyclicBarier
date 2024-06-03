package com.example.executorservice;

public class MainTask implements  Runnable{

  @Override
  public void run() {
    System.out.println("Completed");
  }
}
