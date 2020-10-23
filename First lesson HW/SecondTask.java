package com.company;

public class SecondTask {

    public static void checkFor3(int n){
       int powN = (int) Math.pow(n , 2);
       String number=Integer.toString(powN);
       if(number.contains("3")){
           System.out.println("this number contain 3");
       }
       else{System.out.println("there is no 3 in the number");}
    }

    public static int reverse(int n){
        String number=Integer.toString(n);
        String reversed=new StringBuffer(number).reverse().toString();
        int reversedNumber=Integer.parseInt(reversed);
        return reversedNumber;
    }

    public static int firstAndLast(int n){
        String number = Integer.toString(n);
        number = number.substring(number.length()-1)+number.substring(1,number.length()-1)+number.substring(0,1);
        int changedInt=Integer.parseInt(number);
        return changedInt;
    }

    public static int add1(int n){
        String number = Integer.toString(n);
        number="1"+number+"1";
        int changedInt=Integer.parseInt(number);
        return changedInt;
    }

    public static void main(String[] args){
        int n = (int) (Math.random()*10000);
        //int n = 37;
        System.out.println("Our number is: " + n);
        System.out.println("--------------------------------");
        checkFor3(n);
        System.out.println("--------------------------------");
        System.out.println("Reversed number: " + reverse(n));
        System.out.println("--------------------------------");
        System.out.println("Number with swapped last and first symbol: " + firstAndLast(n));
        System.out.println("--------------------------------");
        System.out.println("Number with 1 on start and end: " + add1(n));
    }
}
