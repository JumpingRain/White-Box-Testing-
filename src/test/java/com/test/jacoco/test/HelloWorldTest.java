package com.test.jacoco.test;

import static org.junit.Assert.assertEquals;

/**
 * Created by superZh on 2019/10/1.
 */

import org.junit.Test;
import com.test.jacoco.HelloWorld;

public class HelloWorldTest {
    @Test
    public void testMethod1() {
        HelloWorld hw = new HelloWorld();
        String a = hw.Method1();
        assertEquals("Hello World", a);
    }

    @Test
    public void testMethod2() {
        HelloWorld hw = new HelloWorld();
        int a = hw.Method2(2, 1);
        assertEquals(3, a);
    }
    
    @Test
    public void testMethod3() {
    	HelloWorld hw = new HelloWorld();
        int a0 = hw.Method3(6, -1, 1);
        int a1 = hw.Method3(6, -1, -1);
        int a2 = hw.Method3(6, 0, 1);
        int a3 = hw.Method3(6, 0, -1);
        int a4 = hw.Method3(4, -1, 1);
        int a5 = hw.Method3(4, -1, -1);
        int a6 = hw.Method3(6, -1, -1);
        int a7 = hw.Method3(4, -1, -3);
        int a8 = hw.Method3(6, -1, -3);
        int a9 = hw.Method3(4, -1, -1);
        assertEquals(a0, 0);
        assertEquals(a1, 0);
        assertEquals(a2, 0);
        assertEquals(a3, 0);
        assertEquals(a4, 0);
        assertEquals(a5, 0);
        assertEquals(a6, 0);
        assertEquals(a7, 0);
        assertEquals(a8, 0);
        assertEquals(a9, 0);
    }

    @Test
    public void testMethod4() {
        HelloWorld hw = new HelloWorld();
        int a0 = hw.Method4(0,1,1,1,(float)1.0);
        int a1 = hw.Method4(1,1,1,1,(float)1.0);
        int a2 = hw.Method4(1,1,1,2,(float)5.0);
        int a3 = hw.Method4(5,5,1,1,(float)5.0);
        int a4 = hw.Method4(5,5,1,2,(float)5.0);
        int a5 = hw.Method4(5,1,1,1,(float)5.0);
        assertEquals(a0, 0);
        assertEquals(a1, 0);
        assertEquals(a2, 0);
        assertEquals(a3, 0);
        assertEquals(a4, 0);
        assertEquals(a5, 0);
        //int a6 = hw.Method4(5,1,1,2,(float)5.0);
        //int a7 = hw.Method4(2,1,1,1,(float)5.0);
        //int a8 = hw.Method4(2,1,1,2,(float)5.0);
    }
    
    @Test
    public void testbug() {
        HelloWorld hw = new HelloWorld();
        boolean a0 = hw.bug(1);
        assertEquals(a0, false);
        boolean a1 = hw.bug(5);
        assertEquals(a1, true);
    }

    @Test
    public void testisTriangle() {
        HelloWorld hw = new HelloWorld();
        boolean a0 = hw.isTriangle(-1,-1,-1);
        boolean a1 = hw.isTriangle(1,-1,-1);
        boolean a2 = hw.isTriangle(1, 1,-1);
        boolean a3 = hw.isTriangle(2,1,1);
        boolean a4 = hw.isTriangle(1,2,1);
        boolean a5 = hw.isTriangle(1,1,2);
        assertEquals(a0, false);
        assertEquals(a1, false);
        assertEquals(a2, false);
        assertEquals(a3, false);
        assertEquals(a4, false);
        assertEquals(a5, false);
        boolean a6 = hw.isTriangle(2,2,1);
        assertEquals(a6, true);
    }

    @Test
    public void testisBirthday() {
        HelloWorld hw = new HelloWorld();
        boolean a;
        a = hw.isBirthday(0,1,1);
        assertEquals(a, false);
        a = hw.isBirthday(1,-1,1);
        assertEquals(a, false);
        a = hw.isBirthday(1,1,-1);
        assertEquals(a, false);
        a = hw.isBirthday(1999,2,28);
        assertEquals(a, true);
        a = hw.isBirthday(1999,2,29);
        assertEquals(a, false);
        a = hw.isBirthday(2004,2,29);
        assertEquals(a, true);
        a = hw.isBirthday(2004,2,30);
        assertEquals(a, false);
        a = hw.isBirthday(2000,2,28);
        assertEquals(a, true);
        a = hw.isBirthday(2000,2,29);
        assertEquals(a, false);

        a = hw.isBirthday(1999,1,31);
        assertEquals(a, true);
        a = hw.isBirthday(1999,1,32);
        assertEquals(a, false);
        a = hw.isBirthday(1999,3,31);
        assertEquals(a, true);
        a = hw.isBirthday(1999,3,32);
        assertEquals(a, false);
        a = hw.isBirthday(1999,5,31);
        assertEquals(a, true);
        a = hw.isBirthday(1999,5,32);
        assertEquals(a, false);
        a = hw.isBirthday(1999,7,31);
        assertEquals(a, true);
        a = hw.isBirthday(1999,7,32);
        assertEquals(a, false);
        a = hw.isBirthday(1999,8,31);
        assertEquals(a, true);
        a = hw.isBirthday(1999,8,32);
        assertEquals(a, false);
        a = hw.isBirthday(1999,10,31);
        assertEquals(a, true);
        a = hw.isBirthday(1999,10,32);
        assertEquals(a, false);
        a = hw.isBirthday(1999,12,31);
        assertEquals(a, true);
        a = hw.isBirthday(1999,12,32);
        assertEquals(a, false);
        
        a = hw.isBirthday(1999,4,30);
        assertEquals(a, true);
        a = hw.isBirthday(1999,4,31);
        assertEquals(a, false);
        a = hw.isBirthday(1999,6,30);
        assertEquals(a, true);
        a = hw.isBirthday(1999,6,31);
        assertEquals(a, false);
        a = hw.isBirthday(1999,9,30);
        assertEquals(a, true);
        a = hw.isBirthday(1999,9,31);
        assertEquals(a, false);
        a = hw.isBirthday(1999,11,30);
        assertEquals(a, true);
        a = hw.isBirthday(1999,11,31);
        assertEquals(a, false);
    }

    @Test
    public void testmimiCalculator() {
        HelloWorld hw = new HelloWorld();
        double a;
        a = hw.miniCalculator(1.0,3.0,'+');
        assertEquals(a, 4.0,0.001);
        a = hw.miniCalculator(1.0,3.0,'-');
        assertEquals(a, -2.0,0.001);
        a = hw.miniCalculator(1.0,3.0,'*');
        assertEquals(a, 3.0,0.001);
        a = hw.miniCalculator(1.0,3.0,'/');
        assertEquals(a, 1.0/3,0.001);
        a = hw.miniCalculator(1.0,0.0,'/');
        assertEquals(a, 0.0,0.001);
        a = hw.miniCalculator(1.0,5.0,'(');
        assertEquals(a, 0.0,0.001);
    }
}

    