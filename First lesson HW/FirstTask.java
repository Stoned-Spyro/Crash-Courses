package com.company;

public class FirstTask {

    public static void check(int a, int b, int x, int y){
        if(a<=x && b<=y){
            System.out.println("Brick can enter the hole!!!");
        }
        else if(a<=y && b<=x){
            System.out.println("Brick can enter the hole!!!");
        }
        else {
            System.out.println("Brick can't enter the hole :c !!!");
        }
    }

    public static void main(String[] args) {
        Brick b1=new Brick(3,6,8);  //This brick can enter the hole
        Brick b2=new Brick(5,9,6);  //This brick can't enter the hole
        Hole hole=new Hole(4,6);       //This is hole
        b1.edgeFinder();
        check(b1.firstSmallEdge, b1.secondSmallEdge, hole.x, hole.y);
        System.out.println("--------------------------");
        b2.edgeFinder();
        check(b2.firstSmallEdge, b2.secondSmallEdge, hole.x, hole.y);
    }
}
class Brick{
    int a;
    int b;
    int c;
    int firstSmallEdge;
    int secondSmallEdge;
    public Brick(int a, int b, int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public void edgeFinder(){
         firstSmallEdge = c;
         secondSmallEdge= c;
        if(a<=c | a<=b){firstSmallEdge=a;}
        if (b<=c | b<=a){secondSmallEdge=b;}
        System.out.println("first edge= " + firstSmallEdge);
        System.out.println("second edge= " + secondSmallEdge);
    }
}
class Hole{
    int x;
    int y;
    public Hole(int x, int y){
        this.x=x;
        this.y=y;
    }
}
