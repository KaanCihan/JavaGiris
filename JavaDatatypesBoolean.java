package Giris;

import java.util.Scanner;

public final class JavaDatatypes {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double x;

        x = input.nextDouble();
        boolean xByte = (x >= -128) && (x <= 128),
                xShort = (x >= -32.768) && (x <=32.768),
                xInt = (x >= -Math.pow(2, 31) ) && (x <= Math.pow(2, 31) -1),
                xLong = (x >= -Math.pow(2, 63) ) && (x <= Math.pow(2, 63) - 1),
                xCanNotFitted = (x <= -Math.pow(2,63) - 1) | (x >= Math.pow(2,63));

        String xxByte, xxShort, xxInt, xxLong, xxCanNotFitted;
        xxByte = xByte ? "*Byte" : "\b";
        xxShort = xShort ? "*Short" : "\b";
        xxInt = xInt ? "*Int" : "\b";
        xxLong = xLong ? "*Long"  : "\b" ;
        xxCanNotFitted = xCanNotFitted ? x + " can't be fitted anywhere" : "";


        System.out.println(x + " can be fitted in : ");
        System.out.println(xxByte);
        System.out.println(xxShort);
        System.out.println(xxInt);
        System.out.println(xxLong);
        System.out.println(xxCanNotFitted);



    }




}
