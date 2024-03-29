package Loops;

/**
 * practice
 */
public class practice {

    public static void main(String[] args) {

        System.out.println("----------------------------------------------------------------------------------------------------------------");
        
        System.out.println("Question 1: Write a program to print the pattern:-");
        // ****
        // ***
        // **
        // *

        int k = 4;
        for (int i = k; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        System.out.println("----------------------------------------------------------------------------------------------------------------");

        System.out.println("Question 2: Write a program to sum first n even numbers:-");
        int sum = 0;
        int n = 4;
        for (int i = 0; i < n; i++) {
            sum = sum + (2 * i);
        }
        System.out.print("Sum of the first " + n + " even numbers is: ");
        System.out.println(sum);
        // First 4 even numbers are - 0 2 4 6

        System.out.println("----------------------------------------------------------------------------------------------------------------");

        System.out.println("Question 3: Write a program to print the multiplication table of a given number n:");
        int a = 5;
               //for(int i=0; i<10; i++) - Goes from i=0 to i=9
               for(int i=1;i<=10;i++){
                   System.out.printf("%d X %d = %d\n", a, i, a*i);
               }

        System.out.println("----------------------------------------------------------------------------------------------------------------");

        System.out.println("Question 4: Write a program to print a multiplication table of 10 in reverse order:");
        int b = 10;
               //for(int i=0; i<10; i++) - Goes from i=0 to i=9
               for(int i=10;i>=1;i--){
                   System.out.printf("%d X %d = %d\n", b, i, b*i);
               }

        System.out.println("----------------------------------------------------------------------------------------------------------------");

        System.out.println("Question 5: Write a program to find the factorial of a given number using for loops:");
        int c,fact = 1;  
        int number = 5;      //It is the number to calculate factorial    
        for(c=1; c<=number; c++){    
            fact=fact*c;    
        }    
        System.out.println("Factorial of "+number+" is: "+fact);    

        System.out.println("----------------------------------------------------------------------------------------------------------------");

        System.out.println("Question 6: Repeat problem 5 using a while loop:");
        int e = 4;
       // What is factorial n = n * n-1 * n-2 ..... 1
       // 4! = 4*3*2*1 = 24
        int d = 1;
        int factorial = 1;
        while(d<=e){
           factorial *= d;
           d++;
        }
        System.out.println("Factorial of "+ e +" is: "+factorial);    
        
        System.out.println("----------------------------------------------------------------------------------------------------------------");

        System.out.println("Question 7: Repeat problem 1 using while loop:");
        int rows = 4;  // Number of rows in the pattern
        int f = 1;     // Loop counter for rows

        while (f <= rows) {
            int g = 1;  // Loop counter for columns (asterisks)
            while (g <= rows - f + 1) {  // Print asterisks in each row
                System.out.print("*");
                g++;
            }
            System.out.println();  // Move to the next line after each row
            f++;
        }

        System.out.println("----------------------------------------------------------------------------------------------------------------");

        System.out.println("Question 9: Write a program to calculate the sum of the numbers occurring in the multiplication table of 8:");
        int p = 8;
        int plus = 0;
        //for(int i=0; i<10; i++) - Goes from i=0 to i=9
        for(int q=1;q<=10;q++){
            plus += p*q;
        }
        System.out.println("Answer:- " + plus);

        System.out.println("----------------------------------------------------------------------------------------------------------------");

        System.out.println("Question 11: Repeat problem 2 using while loop:");
        int r = 5; // Assuming n is 5, as in the given code
        int addition = 0;
        int s = 0;
        while (s < r) {
            addition += 2 * s;
            s++;
        }
        System.out.print("Sum of the first " + r + " even numbers is:- ");
        System.out.println(addition);

        System.out.println("----------------------------------------------------------------------------------------------------------------");

    }
}