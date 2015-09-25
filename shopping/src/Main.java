import java.util.Arrays;
import java.util.Scanner;
public class Main {

    public static void main(String[] args)
    {
        String[] items = {"shed", "bagette", "snail", "tractor"};

        System.out.println("What would you like to buy?");

        for (int i = 0; i < items.length; i++)
        {
            System.out.println(i + 1 + ". " + items[i]);
        }

        Scanner myScanner = new Scanner(System.in);

        int itemNumber = myScanner.nextInt();
        myScanner.nextLine();

        System.out.println("How many?");

        int quantity = myScanner.nextInt();
        myScanner.nextLine();
        String [] addresses = new String[quantity] ;

        for (int i = 0; i < addresses.length; i++)
        {
         System.out.println("What is your address?");
            addresses [i] = myScanner.nextLine() ;
        }

        System.out.println("Thanks! Sending " + quantity + " " + items[itemNumber] + "s to the following addresses");

        for (int i = 0; i < addresses.length; i++)
        {
            System.out.println(i + 1 + ". " + addresses[i]);


        }





    }




      }

