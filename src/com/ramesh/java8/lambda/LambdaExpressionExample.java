package com.ramesh.java8.lambda;

interface Drawable{  
    public void draw();  
}  
public class LambdaExpressionExample {  
    public static void main(String[] args) {  
        int width=10;  
  
        //without lambda, Drawable implementation using anonymous class  
        Drawable withoutLambda =new Drawable(){  
            public void draw(){System.out.println("Drawing "+width);}  
        };  
        withoutLambda.draw();  
        
        //with lambda 
        Drawable withLambda=()->{  
            System.out.println("Drawing "+width);  
        };  
        withLambda.draw();  
    }  
} 
