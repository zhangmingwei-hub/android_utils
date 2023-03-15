package com.zmw.randomUtil;

public  class Random {
    public  static int getRandomInt(){
        int ran = (int) (Math.random()*100);
        System.out.println((int)Math.random()*10);	//优先级
        System.out.println((int)(Math.random()*10));
        return  ran;
    }
}
