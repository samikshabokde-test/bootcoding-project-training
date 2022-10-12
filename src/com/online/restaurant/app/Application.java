package com.online.restaurant.app;

import com.online.restaurant.Customer;
import com.online.restaurant.Order;
import com.online.restaurant.Vendor;

import java.util.Date;

public class Application {
    public static void main(String[] args) {
        Customer samiksha = new Customer();

        samiksha.setName("Samiksha");
        samiksha.setCity("Nagpur");
        samiksha.setAddress("New Nandanwan , Nagpur");
        samiksha.setState("Maharashtra");
        samiksha.setEmailId("abc@gmail.com");
        samiksha.setPhonenumber(8847792752L);

        System.out.println("Name : "+ samiksha.getName());
        System.out.println("City : "+ samiksha.getCity());
        System.out.println("Address :"+ samiksha.getAddress());
        System.out.println("State :"+ samiksha.getState());
        System.out.println("Email Id :"+ samiksha.getEmailId());
        System.out.println("Phone:"+ samiksha.getPhonenumber());



        Vendor haldiram  =  new Vendor();
        haldiram.setName("Haldiram Veg Restaurant");
        haldiram.setAddress("Ajni Square,Nagpur");
        haldiram.setCategory("VEG");
        haldiram.setPhonenumber("5237648326");
        haldiram.setRating(5.0);
        haldiram.setState("Maharashtra");
        haldiram.setCity("Nagpur");

        System.out.println("Vendor Details:");
        System.out.println("Name: "+ haldiram.getName());
        System.out.println("Address :"+ haldiram.getAddress());
        System.out.println("Category :"+ haldiram.getCategory());
        System.out.println("Phone:"+ haldiram.getPhonenumber() );
        System.out.println("Rating:"+ haldiram.getRating());
        System.out.println("State:"+ haldiram.getState());
        System.out.println("City:"+ haldiram.getCity());

        Order order =  new Order();
        order .setCustomer(samiksha);
        order .setVendor(haldiram);
        order .setOrderDate(new Date());
        order .setDeliveryaddress("101,Civil line Nagpur");


        System.out.println("Order Details:");
        System.out.println("Order Date: "+ order.getOrderDate());
        System.out.println("Order Delivery Address:"+ order.getDeliveryaddress());


    }
}
