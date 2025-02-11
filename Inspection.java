/*
 * Author:             Aaron Cowl  
 * Date:               2/7/2025
 * Assignment:         Assignment 3
 * Description:        Create a program to use super classes and subclasses
 */
public class Inspection extends Service
{
   private double fee;
   public Inspection(int invoice, String first, String last, boolean discount_applied, double discount, double fee)
   {
      super(invoice, first, last, discount_applied, discount);
      this.fee = fee;
   }
   
   
   
   @Override
   public double calculateCost()
   {
      return fee * super.getDiscount();
   
   }
   
   @Override
   public String toString() {
        return super.toString() + ", \nService Charge: " + fee + ", \nTotal Cost: " + calculateCost() + "\n";
   }
   
   
   
   
   
}