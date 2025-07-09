import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter 1 for Normal Pizza and 2 for Delux Pizza");
         int user=sc.nextInt();
         if(user==1){
                Pizza basePizza = new Pizza(true);
                basePizza.addExtraToppings();
                basePizza.addExtraCheese();
                basePizza.takeAway();
                basePizza.getBill();
         }
         else{
               DeluxPizza dp=new DeluxPizza(true);
               dp.getBill();
         }

         
    }
}
