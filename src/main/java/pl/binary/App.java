package pl.binary;
import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;


public class App 
{
    public static void main( String[] args )
    {

        System.out.println("Wpisz liczbę z przedziału od 0 do 15");

        int inputDecimal = readFromUser();

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
            myArr[i] = input % 2;
            input = input / 2;
        }
        return myArr;
    }


    public static int readFromUser() {
        int decimalToReturn;
        while (true) {

            try {
                Scanner userInput = new Scanner(System.in);
                int inputDecimal = userInput.nextInt();


                if (inputDecimal >= 0 && inputDecimal <= 15) {
                    decimalToReturn = inputDecimal;
                    break;
                }
                System.out.println("Wpisałeś liczbę: " + inputDecimal + " a ta liczba nie jest z przedziału od 1 do 15. Wpisz raz jeszcze");
            } catch (java.util.InputMismatchException e) {
                System.out.println("Pewnie wpisałeś literę, wpisz liczbę z przedziału od 1 do 15");
            }

        }
    return decimalToReturn;
    }

    public static String tabToString(int[] arr){
        String toString = null;

        for(int i=0;i<4;i++)
            toString = toString + arr[i];

        return toString.substring(4);
    }

}
