package com.online.restaurant.exercise;

public class ArrayExercise {
    public static void main(String[] args) {
        int[] numbers = {10,20,30,40,50};
        int[] ages = new int[5];
//        ages[0] = 10;
//        ages[1] = 20;
//        ages[2] = 30;
//        ages[3] = 40;
//        ages[4] = 50;
        for(int i = 0; i < ages.length;i++) {
            ages[i] = (i + 1) * 10;
        }

        for(int i = 0; i< ages.length; i++){
            System.out.println(i + " = " + ages[i]);


            String[] months = { "January", "Febrruary","March","April","May","June","july","August","September","october","Nov","dec"};


            for(int i1=0; i < months.length;i++) {
                System.out.println(months.length);

            }
        }
    }
}
