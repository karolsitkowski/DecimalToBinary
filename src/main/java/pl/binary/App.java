package pl.binary;
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


        System.out.print("Reprezentacją liczby " + inputDecimal + " w postaci binarnej jest: " );
        for (int i : toDecimal(inputDecimal))
            System.out.print(i);




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
        return null;
    }
}
