package com.company;
import java.util.Scanner;

public class ThirdTask {
    public static void task1(double R){
        double per;
        double area;
        per=2*Math.PI*R;
        area=Math.PI*Math.pow(R,2);
        System.out.println("Radius is: " + R);
        System.out.println("Perimetr of circle is: " + per);
        System.out.println("Area of circle is: " + area);
    }
    public static void task2(){
        Scanner in = new Scanner(System.in);
        String name;
        String address;
        System.out.println("What is your name?");
        name=in.nextLine();
        System.out.printf("Where are you live, %s ? \n", name);
        address=in.nextLine();
        System.out.printf("So, your name is %s and you live in %s",name,address);
    }
    public static void task3(){
        Scanner in = new Scanner(System.in);
        System.out.println("input first country units per minute: ");
        float c1=in.nextFloat();
        System.out.println("input second country units per minute: ");
        float c2=in.nextFloat();
        System.out.println("input third country units per minute: ");
        float c3=in.nextFloat();
        System.out.println("Input first call continued: ");
        float t1=in.nextFloat();
        System.out.println("Input second call continued: ");
        float t2=in.nextFloat();
        System.out.println("Input third call continued: ");
        float t3=in.nextFloat();
        float cost1=c1*t1;
        float cost2=c2*t2;
        float cost3=c3*t3;
        float costTogether=cost1+cost2+cost3;
        System.out.println("First phone call cost: " + cost1);
        System.out.println("Second phone call cost: " + cost2);
        System.out.println("Third phone call cost: " + cost3);
        System.out.println("Cost of all calls together: " + costTogether);
    }


    public static void main(String[] args) {
//        task1(Math.random()*100);  //Uncomment to call first task answer
//        task2();                      //Uncomment to call second task answer
//        task3();                      //Uncomment to call third task answer
    }
}
