package com.sophia;

import java.util.*;

public class Main {
   static List<Integer> booksNumber = new ArrayList<>();
    public static void main(String[] args) {
	// write your code here

   List<String> books = new ArrayList<>();
   books.add("The Snowy Day");
   books.add("Where the Wild Things Are");
   books.add("The Old Truck");
   books.add("Crown: An Ode to the Fresh Cut");
   books.add("Julián Is A Mermaid");
   // add element
   books.add("Star");
   System.out.println(books);

   booksNumber.add(1);
   booksNumber.add(2);
   booksNumber.add(3);
   booksNumber.add(4);
   booksNumber.add(5);
   booksNumber.add(6);
   booksNumber.add(7);
   System.out.println(booksNumber);
   //remove element
    booksNumber.remove(1);
        System.out.println(booksNumber);


   //Using Java for loops (NOT FOR EACH), loop over these and output each element on a new line.
        for(int i = 0; i < books.size();i++) {
            System.out.println(books.get(i));

        }



        for (int i = 0 ;i < booksNumber.size();i++) {
            System.out.println(booksNumber.get(i));

        }


//Create a method that sums up the numbers from your numbers arraylist and returns that sum.


        int sum = 0;
        for (int i =0;i< booksNumber.size();i++) {
            sum += booksNumber.get(i);

        }
        System.out.println(sum);
        }







}


//      // when user input 100 then stop.otherwise keep going to enter number,use while loop.
////            Scanner scanner = new Scanner(System.in);
////            int number = 0;
////            while (number != 100) {
////                System.out.println("Number: ");
////                number = scanner.nextInt();
////
////            }
//
//