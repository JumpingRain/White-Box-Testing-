package com.test.jacoco;

import javax.imageio.event.IIOReadWarningListener;


public class HelloWorld {
    public HelloWorld() {

    }

    public String Method1() {
        return "Hello World";
    }

    public int Method2(int a, int b) {
        return a + b;
    }
    
    public int Method3(int a, int b, int c){
    	if((a>5&&b<0)||c>0) {
    		System.out.println("Condition 1");
    	}
    	else if(a<5 && c<-2 ) {
    		System.out.println("Condition 2");
    	}
    	else {
    		System.out.println("Condition 3");
    	}
    	return 0;
    }
    public int Method4(int a, int b, int c, int d, float e) {
    	if(a == 0) {
    		return 0;
    	}
    	int x = 0;
    	if((a == b) || ((c == d) && (bug(a)))) {
    		 x = 1; 
    	}
    	e = 1+x;
    	return 0;
    }
    public boolean bug(int a) {
    	if(a == 5) return true;
    	return false;
    }
    
    
    public boolean isTriangle(int a, int b, int c) {
		if(a<=0||b<=0||c<=0)
			return false;
		else if(a+b<=c||a+c<=b||b+c<=a)
			return false;
    	return true;
    }
    public boolean isBirthday(int year, int month, int day) {
		//allow year<0, but year 0000 don't exist.
		if(year==0||month<=0||day<=0)
			return false;
    	if(month==2){
			if(year%4==0&&year%100!=0)
				if(day<=29)
					return true;
				else
					return false;
			else
				if(day<=28)
					return true;
				else
					return false;

		}
		else{
			if((month==1||month==3||month==5||month==7||month==8||month==10||month==12)
			&&day<=31)
				return true;
			else if((month==4||month==6||month==9||month==11)
			&&day<=30)
				return true;
			else 
				return false;
		}
    }
    public Double miniCalculator(double a, double b, char op) {
		double result = 0.0;
		switch(op){
			case '+':result=a+b;break;
			case '-':result=a-b;break;
			case '*':result=a*b;break;
			case '/':if (b!=0) result=a/b;else System.out.println("FAULT");break;
			default: System.out.println("FAULT");
		}
    	return result;
    }
    
}
