import java.util.*;

public class bakeOrder {
   public static void main(String[] args){
       Scanner scan = new Scanner(System.in);
       
       int numberOrders;
       double totalPrice = 0;
       int numberCakes;
       int cakeType = -1;
       double orderPrice;
       double cakePrice;
       int totalCakes = 0;
       int orderCount = 0;
       
       
       System.out.print("How many orders do you fucking want?: ");     
       numberOrders = scan.nextInt();
       
       if (numberOrders < 0){
         
         System.out.println("Stop wasting my time with this petty bs");
         
         while (numberOrders < 0) {
            System.out.print("How many orders do you fucking want?: ");     
            numberOrders = scan.nextInt();
               
         } 
            orderCount = numberOrders;
       }
       
       
       
    
          do {
          
          System.out.print("How many fuckin cakes is it, ya asshole?: ");
          numberCakes = scan.nextInt();
          
          while (numberCakes < 5){
            System.out.println("Please enter a number greater than 4");
            numberCakes = scan.nextInt();
                        
            } 
          
          totalCakes += numberCakes;     
            
            
            
            
            while (cakeType > 4 || cakeType < 1){
               
               displayMenu();
               
               cakeType = scan.nextInt();
               if (cakeType > 4 || cakeType < 1){
               System.out.println("Please enter a valid cake selection");
               cakeType = scan.nextInt();
               }
               
            } 
            
            cakePrice = cakePrice(cakeType);
            
          
            orderPrice = orderPrice(numberCakes, cakePrice);
            
            
            
            orderPrice += addDeliveryCharge(orderPrice);
            
            totalPrice += orderPrice;
            
            System.out.println("Your total for order number " + numberOrders + " is: $" + orderPrice);
            
            numberOrders--;
            cakeType = 0;
            orderPrice = 0;
            
         } while (numberOrders > 0);
         
         System.out.print("Your total of cakebags is " + totalCakes + ", for " + orderCount + " is fuck you owe me: $ " + totalPrice);
         
       
   }
   private static void displayTotalPrice(double totalPrice){
      
   
   }
   
   private static double addDeliveryCharge(double orderPrice) {
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Are you a lazy ass today? (y/n):");
      char deliveryAsk;
      deliveryAsk = scan.next().charAt(0);
      if (deliveryAsk == 'y'){
         return (orderPrice * .1);
         
      }
      return 0.0;
      
   }
   
   private static void displayMenu(){
      System.out.println("Whatdya have, we got cakes: ");
      System.out.println("1: Choccy  ");
      System.out.println("2: Milly Vanilly ");
      System.out.println("3: Rawberry ");
      System.out.println("4: Red Death");
            
   
   }
   private static double cakePrice(int cakeType){
      double cakePrice = 0.0;
           
            switch (cakeType){
             case 1 : 
               cakePrice = 4.5;
                  break;
              case 2: 
                cakePrice = 5.0;
                  break;
              case 3: 
                cakePrice = 5.5;        
                  break;
              case 4:
                cakePrice = 6.0;
                  break;
                  
               default:
               break;       
            }
            return cakePrice;
   
   }
   
   private static double orderPrice(int numberCakes, double cakePrice){
      return cakePrice * numberCakes;
      
   }
}