package com.ejemplo.Kyosuke;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
	    //Utilizando la clase String
        String s1 = "Este es una cadena!";
        System.out.println(s1);
        String s2 = "Este es otra cadena!";
        System.out.println(s2);
        String s3 = "Tamaño de sueter: ";
        String s4 = "M";
        String s5 = s3 + s4 + ", Cantidad " + 4;
        System.out.println(s5);
        char[] chars = {'H', 'O', 'L', 'A'};
        String s6 = new String(chars);
        System.out.println(s6);
        char[] chars2 = s6.toCharArray();
        for (char c : chars2)
        {
            System.out.println(c);
        }
        //Primitives to String
        int intValue = 42;
        String fromInt = Integer.toString(intValue);
        System.out.println(fromInt);

        boolean boolValue = true;
        String fromBool = Boolean.toString(boolValue);
        System.out.println(fromBool);

        long longValue = 10000000;
        NumberFormat formatter = NumberFormat.getNumberInstance();
        String formatted = formatter.format(longValue);
        System.out.println(formatted);

        //Clase StringBuilder
        String str1 = "Hola";
        String str2 = "Mundo";
        String str3 = str1 + ", " + str2 + "!";
        System.out.println(str3);

        StringBuilder sb = new StringBuilder("Hola");
        sb.append(", ");
        sb.append("Mundo");
        sb.append("!");
        System.out.println(sb);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un valor: ");
        String entrada = scanner.nextLine();
        System.out.println(entrada);
        sb.delete(0, sb.length());
        for (int i = 0; i < 3; i++);
    }
}
