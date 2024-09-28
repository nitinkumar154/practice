package com.multithreading;

public class PrintEvenOdd {

    int count = 1;
    int max = 21;
    boolean oddflag ; // falg to check if count id odd
    public PrintEvenOdd(boolean oddflag){
        this.oddflag=oddflag;
    }

    public void printOdd(){
        synchronized (this){
            while(count<max){
                while(!oddflag){
                    System.out.println("waiting for odd number");
                    try {
                        this.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println( " odd number is "+ count);
                oddflag = false;
                count = count+1;
                this.notifyAll();
            }


        }

    }
    public void printEven(){
        synchronized (this){
            while(count<max){
                while(oddflag){
                    System.out.println("waiting for even number");
                    try {
                        this.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println("even number is "+count);
                oddflag = true;
                count = count+1;
               this.notifyAll();
            }

        }


    }
    public static void main(String[] args) {
        PrintEvenOdd ob = new PrintEvenOdd(true);
        Runnable rn1 = ()->{
            ob.printOdd();
        };
        Runnable rn2 = ()->{ob.printEven();};
        Thread t1= new Thread(rn1);
        Thread t2 = new Thread(rn2);
        t1.start();
        t2.start();
    }
}
