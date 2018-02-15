import static java.lang.System.out;
import java.util.Scanner;

public class groceryList
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        String ItemOne;
        String ItemTwo;
        String ItemThree;
        int ItemOneQuant;
        int ItemTwoQuant;
        int ItemThreeQuant;
        Float ItemOnePrice;
        Float ItemTwoPrice;
        Float ItemThreePrice;
        Float TotalPrice;
        {
            //Code below this line

            out.println("Please list three items on your grocery shopping list.");
            out.println("Item 1?");
            ItemOne = keyboard.nextLine();
            out.println("Item 2?");
            ItemTwo = keyboard.nextLine();
            out.println("Item 3?");
            ItemThree = keyboard.nextLine();
            out.println("");
            out.println("Now, please enter the quantity of each item.");
            out.println("How many " + ItemOne + "?");
            ItemOneQuant = keyboard.nextInt();            
            out.println("");
            out.println("How many " + ItemTwo + "?");
            ItemTwoQuant = keyboard.nextInt();
            out.println("");
            out.println("How many " + ItemThree + "?");
            ItemThreeQuant = keyboard.nextInt();
            out.println("");
            out.println("How much does one " + ItemOne + " cost?");
            ItemOnePrice = keyboard.nextFloat();
            out.println("");
            out.println("How much does one " + ItemTwo + " cost?");
            ItemTwoPrice = keyboard.nextFloat();
            out.println("");
            out.println("How much does one " + ItemThree + " cost?");
            ItemThreePrice = keyboard.nextFloat();
            out.println("");
            out.println("Calculating your grocery bill.");
            TotalPrice =  ((ItemOneQuant * ItemOnePrice) + (ItemTwoQuant * ItemTwoPrice) + (ItemThreeQuant * ItemThreePrice));
            out.println("Your total cost is " + TotalPrice);

        

        }

    }
}