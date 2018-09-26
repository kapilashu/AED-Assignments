/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment22;
import assignment22.Product;
import assignment22.Supplier;

import java.util.Scanner;

/**
 *
 * @author lENOVO PC
 */
public class ProductTest {
    
    public static void main(String[] args) {
    Product p = new Product();
    {
   try
   {
      Scanner sc = new Scanner(System.in);
        System.out.println("Product name is: ");
        String name = sc.nextLine();
        p.setName(name);
        System.out.println("Product description is: ");
        String description = sc.nextLine();
        p.setDescription(description);
        
        System.out.println("Product price is: ");
        Double price = sc.nextDouble();
        p.setPrice(price);
        
        System.out.println("Product availability is: ");
        int availability = sc.nextInt();
        sc.nextLine();
        p.setAvailability(availability);
        
        System.out.println("Supplier Name is: ");
        String supplierName=sc.nextLine();
        //Supplier suup = new Supplier();
        //suup.setSupplierName("ABC");
        //p.setSupplier(suup);
        p.getSupplier().setSupplierName(supplierName);
        
//        System.out.println("Product availability is: ");
//        int availability = sc.nextInt();
//        sc.nextLine();
//        p.setAvailability(availability);
        System.out.println("Product Name: " + p.getName());
        System.out.println("Product Description: " + p.getDescription());
        System.out.println("Product Price: " + p.getPrice());
        System.out.println("Product Availability: " + p.getAvailability());
        System.out.println("The supplier Name: "+ p.getSupplier().getSupplierName());
        System.out.println("Do you want to update  your product ?(Y/N)");
        String result = sc.nextLine();
        
        while(result.equalsIgnoreCase("Y")){
        Scanner scanner=new Scanner (System.in);
        System.out.println("Product name is: ");
        name = scanner.nextLine();
        p.setName(name);
        System.out.println("Product description is: ");
        description = scanner.nextLine();
        p.setDescription(description);
        
        
        System.out.println("Product price is: ");
        price = scanner.nextDouble();
        p.setPrice(price);
        
        System.out.println("Product availability is: ");
        availability = scanner.nextInt();
        p.setAvailability(availability);
        
        
        System.out.println("The Supplier Name is: ");
        Scanner hh=new Scanner (System.in);
        supplierName=hh.nextLine();
        
        p.getSupplier().setSupplierName(supplierName);
       
        
        //System.out.println("The Supplier name is: " +p.getSupplier().getSupplierName());
        System.out.println("Product Name: " + p.getName());
        System.out.println("Product Description " + p.getDescription());
        System.out.println("Product Price " + p.getPrice());
        System.out.println("Product Availability 1" + p.getAvailability()); 
        System.out.println("The Supplier name is: " +p.getSupplier().getSupplierName());
        Scanner sca=new Scanner (System.in);
        System.out.println("Do you want to update  your product ?(Y/N)"); 
        result = sca.nextLine();
        
        
        //{
       //if(result1.equalsIgnoreCase("Y");
        //}
        }
        System.out.println("Done!");
        
    }
   
   catch(Exception e)
           {
       System.out.println("Invalid Entry");
           }
}
