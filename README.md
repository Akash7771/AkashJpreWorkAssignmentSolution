# AkashJpreWorkAssignmentSolution
Write a program that performs multiple operations and submit the solution by pasting your Github public repository link (Name your public repository in github as Prework Assessment) in the text box given below.


check for palindrome number
prints the pattern of stars in decreasing order based on the input
check whether the input number is a prime number
print Fibonacci series of size n with first two numbers as 0, 1
 
Using Switch case and do-While loop provide all the above functionality, such that user can select the functions that he/she needs to perform and exit the program based on the input.

Function Explanations in Brief: 

Palindrome number: 

The numbers which give the same value when reversed are called palindrome numbers.

Example: 121, 12321, 512215, etc.,

Pattern of stars: 
 
Based on the input integer, the levels in the pattern and the number of stars in each level are decided. At every level, the number of stars is 1 less than the previous level.


    Example: If the input number is 4, then the output will be

    ****

    ***

    **

    *


     if input no is 5, then the output will be

    *****

    ****

    ***

    **

    *

    If input no is 2, then the output will be

    **

    *

Prime number: 
 
The numbers which are only divisible by 1 & themselves are called prime numbers. 

(Or) 

The numbers which have factors 1 and themselves are called prime numbers.

 

    Example_1: If the input number is 23

    Factors of 23 are 1, 23, and other than 1 it  is divisible by 23 only

    Hence the number is prime.

    Example_2: If the input number is 22

    Factors of 22 are 1,2, 11, 22 and are divisible by 2 and 11.

    Hence the number is not a prime number.

Fibonacci series: 
 

The series of numbers whose next number is the sum of its previous two numbers is called the Fibonacci series.

Example_1: If the input number is 5,

The Fibonacci series  is: 0, 1, 1, 2, 3, 5 (by default first two numbers are 0 and 1)



    Example_2: If the input number is 7 and the first two numbers are 3 and 4,

    The Fibonacci series is: 0, 1, 1, 2, 3, 5 , 8, 13 

 

Exit:

The program should ask the user to choose the task they want to perform after executing a task till the choice 0 is entered to exit the program.

 

_________________________________________________________________________________

Solution Submit Instructions :

Create a git repository name it as {yourName preWorkAssignmentSolution}, make it public

Push your solution to the repository

Submit the git URL link in the text entry box.

_______________________________________________________________________________


STUB CODE :

    import java.util.Scanner;



    public class Main {



    Scanner sc = new Scanner(System.in);



               //function to checkPalindrome

           public void checkPalindrome()  {

          }



                //function to printPattern

           public void printPattern() {

          }



              //function to check no is prime or not

            public void checkPrimeNumber() {

            }



              // function to print Fibonacci Series

              public void printFibonacciSeries() {

                    //initialize the first and second value as 0,1 respectively.

               int first = 0, second = 1;

              }



    //main method which contains switch and do while loop

          public static void main(String[] args) {

                    Main obj = new Main();

                    int choice;

                    Scanner sc = new Scanner(System.in);

    do {

    System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"

    + "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

    + "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

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



    } while (choice != 0);

    System.out.println("Exited Successfully!!!");

    sc.close();

    }



    }

