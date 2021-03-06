package com.app05.ch02;

public class DecrementThread extends Thread {
    private MyData myData;

    public DecrementThread(MyData myData) {
        this.myData = myData;
    }

    @Override
    public void run() {
        for(int i=0;i<100_000;i++){
            myData.decrement();
        }
    }
}
