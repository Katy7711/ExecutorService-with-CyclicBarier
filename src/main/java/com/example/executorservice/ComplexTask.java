package com.example.executorservice;

import static com.example.executorservice.ComplexTaskExecutor.BARRIER;
import static java.util.concurrent.TimeUnit.SECONDS;

import java.util.concurrent.BrokenBarrierException;
import lombok.Data;
import lombok.SneakyThrows;

@Data
public class ComplexTask implements Runnable {

  private int number;
  public static int count = 1;

  public ComplexTask() {
    this.number = count++;
  }

  @SneakyThrows
  @Override
  public void run() {
    try {
    System.out.printf("%s is starting\n", this);
      SECONDS.sleep(10);
    System.out.printf("%s has completed\n", this);
      BARRIER.await();
    } catch (InterruptedException | BrokenBarrierException e) {
      throw new RuntimeException(e);
    }
  }
}


