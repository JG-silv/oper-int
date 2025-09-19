# Java Arithmetic Operations

## Description
A simple **Java console program** that stores **two integer numbers** and displays their **sum, subtraction, multiplication, division, and modulus**.  
This project is ideal for beginners learning basic arithmetic operations, user input, and console output in Java.

## Features
- Input two integer numbers from the user
- Calculates and displays:
  - Sum
  - Subtraction
  - Multiplication
  - Division (as a double value)
  - Modulus (remainder)
- Console-based, easy to understand

## Usage
1. Open the project in a **Java IDE** (Eclipse, IntelliJ, VS Code with Java).
2. Compile and run the `Somarsub01.java` file.
3. Enter two integer numbers when prompted.
4. The program will display all the arithmetic results in the console.

## Code Example
```java
Scanner sc = new Scanner(System.in);
int x = sc.nextInt();
int y = sc.nextInt();
System.out.println("Sum: " + (x + y));
System.out.println("Subtraction: " + (x - y));
System.out.println("Multiplication: " + (x * y));
System.out.println("Division: " + ((double)x / y));
System.out.println("Modulus: " + (x % y));
sc.close();
