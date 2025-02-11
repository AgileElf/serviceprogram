/*
 * Author:             Aaron Cowl  
 * Date:               2/7/2025
 * Assignment:         Assignment 3
 * Description:        Create a program to use super classes and subclasses
 */
public abstract class Service
{
   private int invoice;
   private String first, last;
   private boolean discount_applied;
   private double discount;
   private double viewDiscount;
   
   public Service(int invoice, String first, String last, boolean discount_applied, double discount) {
        this.invoice = invoice;
        this.first = first;
        this.last = last;
        this.discount_applied = discount_applied;
        this.discount = discount;
    }
   
   public abstract double calculateCost();
   
   public double getDiscount()
   {
      if(discount_applied)
      {
      return 1 - discount;
      } else
      {
      return 1;
      }
   }
   
   @Override
    public String toString() {
        return "Invoice Number: " + invoice +
                "\nCustomer Name: " + first + " " + last +
                "\nDiscount Qualified: " + discount_applied +
                "\nDiscount Rate: " + discount;
    }


}