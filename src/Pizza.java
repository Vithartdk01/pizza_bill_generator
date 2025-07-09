public class Pizza {
        private int price;
        private Boolean veg;
        private int extraCheesePrice=100;
        private int extraToppingsPrice=150;
        private int bagpackPrice=20;
        private int basePizzaPrice;
        private Boolean isExtraCheeseAdded=false;
        private Boolean isExtraToppingAdded=false;
        private Boolean isOptedTakeaway=false;


public Pizza(Boolean veg){
      this.veg=veg;
      if(this.veg){
        this.price=300; //veg pizza
      }
      else{
        this.price=400; //non-veg pizza
      }
      basePizzaPrice=this.price;
}   
public void addExtraCheese(){
      isExtraCheeseAdded=true;
       this.price+=extraCheesePrice;
}
public void addExtraToppings(){
    isExtraToppingAdded=true;
    this.price+=extraToppingsPrice;
}
public void takeAway(){
    isOptedTakeaway=true;
    this.price+=bagpackPrice;
}
public void getBill(){
   String bill="";
   System.out.println("Pizza:"+basePizzaPrice);
   if(isExtraCheeseAdded){
       bill+="Extra Cheese Added:"+extraCheesePrice+"\n";
   }
   if(isExtraToppingAdded){
       bill+="Extra Topping Added:"+extraToppingsPrice+"\n";
   }
   if(isOptedTakeaway){
       bill+="Take Away:"+bagpackPrice+"\n";
   }
   bill+="Bill:"+this.price+"\n";
   System.out.println(bill);
}
}
