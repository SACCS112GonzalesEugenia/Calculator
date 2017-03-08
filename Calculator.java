import java.util.Scanner;
public class Calculator{
    @SuppressWarnings("resource")
	public static void main(String[] args) {       

Scanner input = new Scanner(System.in);
        int number1;       

        int number2;       

        int sum;       

       int difference;       

       int product;       

       int quotient;               

       System.out.print("Enter first number: ");     
       number1 = input.nextInt();
       
       System.out.print("Enter second number: ");
        number2 = input.nextInt();
        
        sum = number1 + number2;               
        difference = number1 - number2;
        product = number1 * number2;
        quotient = number1 / number2;  
        
        System.out.printf("The sum is: %d\n", sum);       

       System.out.printf("The difference is: %d\n",difference);      

       System.out.printf("The product is: %d\n", product);      

       System.out.printf("The quotient is: %d\n", quotient); 
    }

}

// Good job, Eugenia.
