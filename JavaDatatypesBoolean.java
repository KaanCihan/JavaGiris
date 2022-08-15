package Giris;

import java.util.Scanner;

public final class JavaDatatypesBoolean {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double x;
        x = input.nextDouble();
        boolean xByte = (x >= -128) && (x <= 127),
                xShort = (x >= -32.768) && (x <=32.768),
                xInt = (x >= -Math.pow(2, 31) ) && (x <= Math.pow(2, 31) -1),
                xLong = (x >= -Math.pow(2, 63) ) && (x <= Math.pow(2, 63) - 1),
                xCanNotFitted = (x <= -Math.pow(2,63) - 1) | (x >= Math.pow(2,63));

        String xxByte, xxShort, xxInt, xxLong, xxCanNotFitted;
        xxByte = xByte ? "\n* byte" : "";
        xxShort = xShort ? "\n* short" : "";
        xxInt = xInt ? "\n* int" : "";
        xxLong = xLong ? "\n* long"  : "" ;
        xxCanNotFitted = xCanNotFitted ? "\r" + x + " can't be fitted anywhere" : "";


        System.out.print("can be fitted in :" + xxByte + xxShort + xxInt + xxLong + xxCanNotFitted);









    }




}
