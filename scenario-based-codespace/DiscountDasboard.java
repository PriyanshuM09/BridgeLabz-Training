// 8. Shopkeeper’s Discount Dashboard 

import java.util.Scanner;
public class DiscountDasboard{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);

   final double DISCOUNT20 = 0.20;
    final double DISCOUNT10 = 0.10;
    final double DISCOUNT5  = 0.05;
		
		
  int productNumber=sc.nextInt();
  int product;
  int productTot=0;
  double discount;
  double finalPrice;

for(int i=0;i<productNumber;i++){
     product=sc.nextInt();
	 productTot+=product;
}
      if(productTot>=5000){
       discount= productTot* DISCOUNT20;
           }
	else if(productTot>=3000){
          discount= productTot* DISCOUNT10;
      }
	  else if(productTot>=2000){
        discount= productTot* DISCOUNT5;
     }else{
	 discount=0;
	 }
	 
	  finalPrice = productTot - discount;

        // Display result
   System.out.println(" Bill Summary ");
  System.out.println("Total Bill Amount : " + productTot);
   System.out.println("Discount Amount  : " + discount);
  System.out.println("Final Payable     : " + finalPrice);

}
}