/*
 * Author:             Aaron Cowl  
 * Date:               2/7/2025
 * Assignment:         Assignment 3
 * Description:        Create a program to use super classes and subclasses
 */

import java.util.*;
public class Client
{
   public static void main(String[] args)
   {
   int option = 1;
   Scanner keys = new Scanner(System.in);
   List<Service> services = new ArrayList<>();
  
   
   while(true){
   
      System.out.println("---------------------\nWelcome to Home Inspection & Repair Co.\n-----------------\n1:Inspection Service\n2:Repair Service\n3:Emergency Service\n4:View Services\n0:Exit\n-------------------------\nEnter a command:");
      option = keys.nextInt();
      
      if(option == 0)
      {
         break;
      } else if (option == 4)
      {
         for(int i = 0; i < services.size(); i++)
         {
            System.out.println(services.get(i));
         }
         
         continue;
      }
      
      System.out.println("Enter invoice: ");
      int Invoice = keys.nextInt();
      
      System.out.println("Enter first name: ");
      String First = keys.next();
      
      System.out.println("Enter last name: ");
      String Last = keys.next();
      
      System.out.println("Is customer qualified for discount? (true or false): ");
      boolean Qualified = keys.nextBoolean();
      
      System.out.println("Enter discount rate (0 - 1): ");
      double Discount = keys.nextDouble();

         switch (option) {
      case 1: 
      
      
      
      System.out.println("Enter the inspection fee: ");
      double Fee = keys.nextDouble();
      
      Service service = new Inspection(Invoice, First, Last, Qualified, Discount, Fee);
      
      System.out.println(service);
      services.add(service);
      
        break;
      case 2:
      
      
      System.out.println("Enter hours worked: ");
      int Hours = keys.nextInt();
      
      System.out.println("Enter pay rate: ");
      double Pay = keys.nextDouble();
      
      Service Repair = new Repair(Invoice, First, Last, Qualified, Discount, Hours, Pay);
      
      System.out.println(Repair);
      services.add(Repair);
      
      
      
        break;
      case 3:
      
      
      
      
      System.out.println("Enter hours worked: ");
      int Ehours = keys.nextInt();
      
      System.out.println("Enter pay rate: ");
      double Epay = keys.nextDouble();
      
      System.out.println("Enter emergency rate: ");
      double Efee = keys.nextDouble();
      
      Service Emergency = new Emergency(Invoice, First, Last, Qualified, Discount, Ehours, Epay, Efee);
      
      System.out.println(Emergency);
      services.add(Emergency);
      
      
         break;
      case 0:
         System.exit(0);
         break;
         
         
   }
   }
   
   }
}