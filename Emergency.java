/*
 * Author:             Aaron Cowl  
 * Date:               2/7/2025
 * Assignment:         Assignment 3
 * Description:        Create a program to use super classes and subclasses
 */
public class Emergency extends Repair
{
   private double fee;
   public Emergency(int invoice, String first, String last, boolean discount_applied, double discount, int hours, double hourly_rate, double fee)
   {
      super(invoice, first, last, discount_applied, discount, hours, hourly_rate);
      this.fee = fee;
   }
   
   @Override
   public double calculateCost()
   {
      double repairCost = super.calculateCost();
      return repairCost * fee;
   }
   
   @Override
   public String toString(){
         return super.toString() + ", \nEmergency Rate: " + fee;
                  
   }
   
}