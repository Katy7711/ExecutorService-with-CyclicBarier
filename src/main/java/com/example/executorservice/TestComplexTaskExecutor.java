package com.example.executorservice;


public class TestComplexTaskExecutor {

  public static void main(String[] args) {
    ComplexTaskExecutor taskExecutor = new ComplexTaskExecutor();
    taskExecutor.executeTasks(20);

  }
}
