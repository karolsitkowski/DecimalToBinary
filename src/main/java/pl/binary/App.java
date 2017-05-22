package pl.binary;
import java.util.Scanner;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Wpisz liczbę z przedziału od 0 do 15");
        int condition;

        while(true){

            try {
                condition = readFromUser();


                if (condition >= 0 && condition <= 15) {
                    System.out.println(condition);
                    break;
                }
                System.out.println("Wpisałeś liczbę: " + condition +  " a ta liczba nie jest z przedziału od 1 do 15 Wpisz raz jescze");
            }
            catch (java.util.InputMismatchException e) {
                System.out.println("Pewnie wpisałeś literę, wpisz liczbę z przedziału od 1 do 15");
            }

        }



    }

    public static int[] toDecimal(int input){
        int[] myTab = new int[3];




        return myTab;
    }


    public static int readFromUser(){
        Scanner userInput = new Scanner(System.in);
        return userInput.nextInt();
    }
}
