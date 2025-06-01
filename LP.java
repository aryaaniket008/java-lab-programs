JAVA LAB PGMS : JUGAAD 


P1 Bank Acc

package javaproject;
import java.util.Scanner;

class BankAccount {
    private int accountNumber;
    private String accountHolder;
    private String address;
    private double balance;

    public void setInitialValues(int accNo, String name, String addr, double initialBalance) {
        this.accountNumber = accNo;
        this.accountHolder = name;
        this.address = addr;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited: $" + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrawn: $" + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    public void displayAccount() {
        System.out.println("\nAccount Details:");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Address: " + address);
        System.out.println("Current Balance: $" + balance);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount account = new BankAccount();

        System.out.print("Enter Account Number: ");
        int accNo = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter Account Holder Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Address: ");
        String address = scanner.nextLine();

        System.out.print("Enter Initial Balance: ");
        double initialBalance = scanner.nextDouble();

        account.setInitialValues(accNo, name, address, initialBalance);

        while (true) {
            System.out.println("\nBank Operations Menu:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Account Details");
            System.out.println("4. Exit");
            System.out.println("5. Exit (Alternative)");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    account.displayAccount();
                    break;
                case 4:
                    System.out.println("Exiting... Thank you for using our banking system.");
                    scanner.close();
                    System.exit(0);
                    break;
                case 5:
                    System.out.println("Exiting... Have a great day!");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}



==================================================================================

P2 Retail Item

package javaproject;

class RetailItem {
    private String description;
    private int units;
    private double price;

    public RetailItem(String description, int units, double price) {
        this.description = description;
        this.units = units;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getUnits() {
        return units;
    }

    public void setUnits(int units) {
        if (units >= 0) {
            this.units = units;
        } else {
            System.out.println("Units cannot be negative.");
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Price cannot be negative.");
        }
    }

    // Method to display item details
    public void displayItem() {
        System.out.println("Description: " + description);
        System.out.println("Units in Stock: " + units);
        System.out.println("Price: $" + price);
        System.out.println("----------------------");
    }
}

public class RetailStore {
    public static void main(String[] args) {
        RetailItem item1 = new RetailItem("Jacket", 12, 59.95);
        RetailItem item2 = new RetailItem("Jeans", 40, 34.95);
        RetailItem item3 = new RetailItem("Shirt", 20, 24.95);

        System.out.println("Retail Items:");
        item1.displayItem();
        item2.displayItem();
        item3.displayItem();

        // update the values
        item1.setUnits(15);
        item1.setPrice(55.99);

        System.out.println("Updated details of item1:");
        item1.displayItem();
    }
}


==================================================================

P3  SHAPE

class Shape {
    // Method to be overridden by derived classes
    public void showArea() {
        System.out.println("Area calculation is specific to the shape.");
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void showArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

class Rectangle extends Shape {
    private double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void showArea() {
        double area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
}

public class ShapeTest {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);

        circle.showArea();
        rectangle.showArea();
    }
}


===================================================================

P4 Interface I

interface I {
    int CONST_I = 10;

    void methodI();
}

interface I1 extends I {
    int CONST_I1 = 20;
    void methodI1();
}

interface I2 extends I {
    int CONST_I2 = 30;
    void methodI2();
}

interface I12 extends I1, I2 {
    int CONST_I12 = 40;
    void methodI12();
}

class DemoI implements I12 {
    public void methodI() {
        System.out.println("Inside methodI(): Constant from I = " + CONST_I);
    }

    public void methodI1() {
        System.out.println("Inside methodI1(): Constant from I1 = " + CONST_I1);
    }

    public void methodI2() {
        System.out.println("Inside methodI2(): Constant from I2 = " + CONST_I2);
    }

    public void methodI12() {
        System.out.println("Inside methodI12(): Constant from I12 = " + CONST_I12);
    }

    public static void main(String[] args) {
        DemoI obj = new DemoI();
        obj.methodI();
        obj.methodI1();
        obj.methodI2();
        obj.methodI12();
    }
}


====================================================================

P5 Triangle Area


// in file AreaTriangle.java

package mypack;

public class AreaTriangle {
    private double base;
    private double height;

    public AreaTriangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double Area() {
        return 0.5 * base * height;
    }
}


// in File Triangle.java 

package mypack1;

import mypack.AreaTriangle;

public class Triangle {
    public static void main(String[] args) {
        AreaTriangle obj = new AreaTriangle(10.0, 5.0);
        double area = obj.Area();
        System.out.println("Area of Triangle: " + area);
    }
}

==================================================================

P 10 String operations

public class StringOperations {
    public static void main(String[] args) {
        String s1 = new String("hello");
        String s2 = new String("hello");
        String s3 = "hello";
        String s4 = "hello";

        System.out.println("i) Difference between equals() and == operator:");
        System.out.println("s1 == s2: " + (s1 == s2));             // false, different objects
        System.out.println("s1.equals(s2): " + s1.equals(s2));     // true, same content
        System.out.println("s3 == s4: " + (s3 == s4));             // true, string pool

        System.out.println();

        // Palindrome check
        String original = "madam";
        String reversed = new StringBuilder(original).reverse().toString();
        System.out.println("ii) Palindrome Check:");
        if (original.equals(reversed)) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }

        System.out.println();

        // Convert to character array
        System.out.println("iii) String to character array:");
        char[] charArray = original.toCharArray();
        System.out.print("Character Array: ");
        for (char c : charArray) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
}


P 11 GEN wala code

import java.util.LinkedList;
import java.util.EmptyStackException;

class Gen<T> {
    private LinkedList<T> stack;

    public Gen() {
        stack = new LinkedList<>();
    }

    public void push(T item) {
        stack.addFirst(item);
        System.out.println("Pushed: " + item);
    }

    public T pop() {
        if (stack.isEmpty()) {
            throw new EmptyStackException();
        }
        T item = stack.removeFirst();
        System.out.println("Popped: " + item);
        return item;
    }

    public T peek() {
        if (stack.isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.getFirst();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void display() {
        System.out.println("Stack contents: " + stack);
    }
}

public class GenericStackDemo {
    public static void main(String[] args) {
        Gen<Integer> intStack = new Gen<>();
        System.out.println("Integer Stack Operations:");
        intStack.push(10);
        intStack.push(20);
        intStack.display();
        intStack.pop();
        intStack.display();

        System.out.println();

        Gen<Float> floatStack = new Gen<>();
        System.out.println("Float Stack Operations:");
        floatStack.push(3.14f);
        floatStack.push(6.28f);
        floatStack.display();
        floatStack.pop();
        floatStack.display();
    }
}

===============================================================

P 12 Array List

import java.util.*;

public class ColorArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> colorList = new ArrayList<>();
        colorList.add("Red");
        colorList.add("Green");
        colorList.add("Blue");
        colorList.add("Yellow");
        colorList.add("Purple");

        System.out.println("Original ArrayList: " + colorList);

        // i) Add elements of List to ArrayList
        List<String> moreColors = Arrays.asList("Orange", "Pink");
        colorList.addAll(moreColors);
        System.out.println("After adding more colors: " + colorList);

        // ii) Copy ArrayList to Array
        String[] colorArray = new String[colorList.size()];
        colorArray = colorList.toArray(colorArray);
        System.out.println("Copied Array: " + Arrays.toString(colorArray));

        // iii) Reverse ArrayList content
        Collections.reverse(colorList);
        System.out.println("Reversed ArrayList: " + colorList);

        // iv) Get Sub list from an ArrayList (index 1 to 3)
        List<String> subList = colorList.subList(1, 4);
        System.out.println("Sublist (index 1 to 3): " + subList);

        // v) Sort the ArrayList
        Collections.sort(colorList);
        System.out.println("Sorted ArrayList: " + colorList);
    }
}


=============================================================
