import static java.lang.System.out;
import java.util.Scanner;

public class SandwichShop
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int SandwichSalesGoal = 50;
        int BurgerSalesGoal = 250;
        int SubsSalesGoal = 180;
        int SoupSalesGoal = 70;
        out.println("Checking sales goals.");
        out.println("");
        out.println("The sales goal for veggie sandwiches is " + SandwichSalesGoal + ".");
        out.println("How many veggie sandwiches were sold today?");
        int SandwichSold = keyboard.nextInt();
        if (SandwichSold >= SandwichSalesGoal) {
            out.println("Made goal for veggie sandwiches.");
        } else {
            out.println("Fell short of goal for veggie sandwiches.");
        }
        out.println("");
        out.println("The sales goal for burgers is " + BurgerSalesGoal + ".");
        out.println("How many burgers were sold today?");
        int BurgerSold = keyboard.nextInt();
        if (BurgerSold >= BurgerSalesGoal) {
            out.println("Made goal for burgers.");
        } else {
            out.println("Fell short of goal for burgers.");
        }
        out.println("");      
        out.println("The sales goal for subs is " + SubsSalesGoal + ".");
        out.println("How many subs were sold today?");
        int SubsSold = keyboard.nextInt();
        if (SubsSold >= SubsSalesGoal) {
            out.println("Made goal for subs.");
        } else {
            out.println("Fell short of goal for subs.");
        }
        out.println("");
        out.println("The sales goal for soup is " + SoupSalesGoal + ".");
        out.println("How many soups were sold today?");
        int SoupSold = keyboard.nextInt();
        if (SoupSold >= SoupSalesGoal) {
            out.println("Made goal for soup.");
        } else {
            out.println("Fell short of goal for soup.");
        }
        int TotalSalesGoal = (BurgerSalesGoal + SoupSalesGoal + SandwichSalesGoal + SubsSalesGoal);
        int TotalSold = (BurgerSold + SoupSold + SandwichSold + SubsSold);
        if (TotalSold >= TotalSalesGoal) {
            out.println("Made goal for everything!");
        
        }
        
        
        
    }
}
