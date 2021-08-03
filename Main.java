//package com.greatlearning.java.preworkassignment;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    Scanner sc = new Scanner(System.in);

    //function to checkPalindrome
    public void checkPalindrome()  {
        try{
            System.out.println("Enter the number");
            Integer number = sc.nextInt();
            Integer number_copy = number;
            Integer length = number.toString().length();
            Integer reverse = 0;

            for(int i=0 ; i <length ; i++){
                if(reverse!=0){
                    reverse = reverse * 10;
                }
                reverse = reverse + (number_copy % 10);
                number_copy = number_copy / 10;
            }
            if(number.equals( reverse)){
                System.out.println("The number is palindrome");
            }else{
                System.out.println("The number is not a palindrome");
            }

        }catch(InputMismatchException ime){
            ime.printStackTrace();
            System.err.println("Invalid input type expected numbers.");
        }
    }

    //function to printPattern
    public void printPattern() {
        System.out.println("Enter the length of pattern:");
        try{
            Integer n = sc.nextInt();
            for(int i=n; i>=0; i--){
                for(int j=0;j<i;j++)
                    System.out.print("*");
                System.out.print("\n");
            }
        }
        catch(InputMismatchException ime){
            System.err.println("Invalid input type expected integer.");
        }
    }

    //function to check no is prime or not
    public void checkPrimeNumber() {
        Boolean isPrime = true;
        System.out.println("Enter a number");
        try {
            Integer n  = sc.nextInt() ;
            for(int i = 2 ; i<(n/2) ;i++){
                if (n % i == 0) {
                    isPrime=false;
                    break;
                }
            }
            if(isPrime)
                System.out.println("The number is prime number");
            else
                System.out.println("The number is not a prime number");
        }
        catch (InputMismatchException ime){
            System.err.println("Invalid input type expected integer.");
        }


    }

    // function to print Fibonacci Series
    public void printFibonacciSeries() {

        //initialize the first and second value as 0,1 respectively.
        int first = 0, second = 1;
        System.out.println("Enter the length of series");
        try{
            Integer n = sc.nextInt();
            Integer fab =0;
            System.out.print(first + " "+ second + " ");
            for(int i = 0 ; i < n -1 ; i ++){
                fab = first + second;
                System.out.print(fab);
                first = second;
                second = fab;

                System.out.print(" ");
            }
            System.out.println("");

        }catch (InputMismatchException ime){
            System.err.println("Invalid input type expected integer.");
        }
    }

    //main method which contains switch and do while loop
    public static void main(String[] args) {

        Main obj = new Main();
        int choice;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter your choice from below list.\n" +
                    "1. Find palindrome of number.\n" +
                    "2. Print Pattern for a given no.\n" +
                    "3. Check whether the no is a  prime number.\n" +
                    "4. Print Fibonacci series.\n" +
                    "--> Enter 0 to Exit.\n");

            System.out.println();
            choice = sc.nextInt();

            switch (choice) {
                case 0:
                    choice = 0;
                    break;
                case 1: {
                        obj.checkPalindrome();
                    }
                    break;
                case 2: {
                        obj.printPattern();
                    }
                    break;
                case 3: {
                        obj.checkPrimeNumber();
                    }
                    break;
                case 4: {
                        obj.printFibonacciSeries();
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Enter a valid no.\n");
            }
        }
        while (choice != 0);

        System.out.println("Exited Successfully!!!");
        sc.close();
    }
}
