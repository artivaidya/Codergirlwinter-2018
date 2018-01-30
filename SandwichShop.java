import static java.lang.System.out;
import java.util.Scanner;


public class SandwichShop
{
    public static void main (String[] args) {
        Scanner Keyboard = new Scanner(System.in);

        int Veggie_Sandwich;
        int Burgers;
        int Subs;
        int Soup;
        int goalForVeggies = 50;
        int goalForBurgers = 250;
        int goalForSubs = 180;
        int goalForSoup = 70;


        System.out.println("Checking sales goals.\n" +
                "The sales goal for veggie sandwiches is 50\n" +
                "How many veggie sandwiches were sold today? ");
        Veggie_Sandwich = Keyboard.nextInt();

        if (Veggie_Sandwich >= goalForVeggies) {
            System.out.println("Made goal for veggies.");
        } else {
            System.out.println("fellShort");
        }


        System.out.println("The sales goal for burgers is 250\n" +
                "How many burgers were sold today? ");
        Burgers = Keyboard.nextInt();

        if (Burgers >= goalForBurgers) {
            System.out.println("Made goal for Burgers.");
        } else {
            System.out.println("fellShort");
        }

        System.out.println("The sales goal for subs is 180\n" +
                "How many subs were sold today?");
        Subs = Keyboard.nextInt();

        if (Subs >= goalForSubs) {
            System.out.println("Made goal for Subs.");
        } else {
            System.out.println("fellShort");
        }

            System.out.println("The sales goal for soup is 70\n" +
                    "How many soups were sold today?");
            Soup = Keyboard.nextInt();

            if (Soup >= goalForSoup) {
                System.out.println("Made goal for Soup.");
            } else {
                System.out.println("fellShort");


            }

        if (Veggie_Sandwich >= goalForVeggies&&Burgers >= goalForBurgers&&Subs >= goalForSubs&&Soup >= goalForSoup){

                System.out.println("Made Goal For Everything.");
        }

        }

    }