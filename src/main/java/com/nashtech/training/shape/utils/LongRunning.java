package com.nashtech.training.shape.utils;

import lombok.SneakyThrows;

public class LongRunning {

    @SneakyThrows
    public static void run(){
        Thread.sleep(5000);
    }
}
