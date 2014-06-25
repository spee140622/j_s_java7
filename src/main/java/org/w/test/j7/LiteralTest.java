package org.w.test.j7;

/**
 * @version 1.5
 *          Created by wenzhouyang on 6/25/2014.
 */
public class LiteralTest {

    public void byteLiteral() {
        System.out.println(0b001001);
        System.out.println(0B001001);
    }

    public void unDerscore() {
        //数字间隔
        System.out.println(1_500_000);
        double value1 = 5_6.3_4;
        System.out.println(value1);
        int value2 = 89_3__1;
        System.out.println(value2);
    }

    public static void main(String[] args) {
        LiteralTest literalTest = new LiteralTest();
        literalTest.byteLiteral();
        literalTest.unDerscore();
    }
}
