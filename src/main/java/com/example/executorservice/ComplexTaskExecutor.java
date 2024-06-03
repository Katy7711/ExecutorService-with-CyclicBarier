package com.example.executorservice;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import lombok.Data;

@Data
public class ComplexTaskExecutor {

  public static final CyclicBarrier BARRIER = new CyclicBarrier(10, new MainTask());
  public static ExecutorService EXECUTOR_SERVICE = Executors.newFixedThreadPool(10);


  public void executeTasks(int numberOfTasks) {
    for(int i = 0; i < numberOfTasks; i++) {
      EXECUTOR_SERVICE.execute(new ComplexTask());
    }
    EXECUTOR_SERVICE.shutdown();
  }
}

