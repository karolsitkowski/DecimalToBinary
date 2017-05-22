package pl.binary;
import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Wpisz liczbę z przedziału od 0 do 15");
        int inputDecimal;

        while(true){

            try {
                inputDecimal = readFromUser();


                if (inputDecimal >= 0 && inputDecimal <= 15) {
                    break;
                }
                System.out.println("Wpisałeś liczbę: " + inputDecimal +  " a ta liczba nie jest z przedziału od 1 do 15. Wpisz raz jeszcze");
            }
            catch (java.util.InputMismatchException e) {
                System.out.println("Pewnie wpisałeś literę, wpisz liczbę z przedziału od 1 do 15");
            }

        }

        System.out.println("Reprezentacją liczby " + inputDecimal + " w postaci binarnej jest: " + tabToString(toDecimal(inputDecimal)));


        //TODO
        //Dlaczego for iteruje inaczej od Foreach'a?
        /*
        int[] testTab = toDecimal(inputDecimal);
        System.out.println("For Each: ");
        for(int i : testTab) {
            System.out.print(testTab[i]);
        }
        System.out.println();
        System.out.println("Zwykły for: ");
        for(int i=0;i<4;i++)
            System.out.print(testTab[i]);
        */
    }

    public static int[] toDecimal(int input){


        int[] myArr = new int[4];

        for (int i = 3;i >= 0;i--) {
            if (input % 2 == 0)
                myArr[i] = 0;

            if (input % 2 == 1)
                myArr[i] = 1;
            input = input / 2;
        }
        return myArr;
    }


    public static int readFromUser(){
        Scanner userInput = new Scanner(System.in);
        return userInput.nextInt();
    }

    public static String tabToString(int[] arr){
        String toString = null;

        for(int i=0;i<4;i++)
            toString = toString + arr[i];

        return toString.substring(4);
    }

}
