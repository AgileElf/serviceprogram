/*
 * Author:             Aaron Cowl  
 * Date:               2/7/2025
 * Assignment:         Assignment 3
 * Description:        Create a program to use super classes and subclasses
 */
public class Repair extends Service
{
   private int hours;
   private double hourly_rate;
   
   public Repair(int invoice, String first, String last, boolean discount_applied, double discount, int hours, double hourly_rate)
   {
      super(invoice, first, last, discount_applied, discount);
      this.hours = hours;
      this.hourly_rate = hourly_rate;
   }
   public double getDiscount()
   {
      return super.getDiscount();
   }
   
   public int getHours()
   {
      return hours;
   }
   
   public double getPay()
   {
      return hourly_rate;
   }
   
   @Override
   public double calculateCost()
   {
      double labor = hourly_rate * hours;
      return labor * getDiscount();
   
   }
   @Override
   public String toString(){
         return super.toString() + ", \nHours: " + hours + ", \nHourly Rate: " + hourly_rate + ", \nTotal Cost: " + calculateCost();
   }
   
   

}