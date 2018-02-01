import java.util.Scanner;

public class GroceryList {

    public static void main(String[] args) {
	System.out.println("please list three items on your grocery list");
	System.out.print("Item 1? ");
        Scanner keyboard = new Scanner(System.in);

        String item1Name= keyboard.nextLine();

        System.out.print("Item 2? ");

        String item2Name= keyboard.nextLine();

        System.out.print("Item 3? ");

        String item3Name= keyboard.nextLine();

System.out.println("Now, please enter the quantity of each item.");
System.out.print("How many milk? ");
int count1 = keyboard.nextInt();
System.out.print("how many bread? ");
int count2 = keyboard.nextInt();
System.out.print("How many egg? ");
int count3 = keyboard.nextInt();
System.out.println("Now, please enter the price of each item.");
System.out.print("How much does one milk cost? ");
float price1 = keyboard.nextFloat();
System.out.print("How much does one bread cost? ");
float price2 = keyboard.nextFloat();
System.out.print("How much does one eggs cost? ");
float price3 = keyboard.nextFloat();
System.out.println("Calculating your grocery bill.");
float total;
total = (count1*price1) + (count2*price2) + (count3*price3);
System.out.println("Your total cost is " + total);




}
}
