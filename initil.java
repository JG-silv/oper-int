package initial;

import java.util.Scanner;

public class initial {
public static void main(String[] args) {
// Program to store two integers and display their addition, subtraction, multiplication, division, and modulus
Scanner sc = new Scanner(System.in); // Scanner instantiation

int x, y; // Variable declaration

System.out.print("Enter the first number: ");
x = sc.nextInt();

System.out.print("Enter the second number: ");
y = sc.nextInt();

System.out.println("Sum: " + (x + y));
System.out.println("Subtraction: " + (x - y));
System.out.println("Multiplication: " + (x * y));
System.out.println("Division: " + ((double)x / y));
System.out.println("Modulus: " + (x % y));

sc.close(); // Closing the Scanner
}
}
