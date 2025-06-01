package labexam;

import java.util.*;

// Bank Account Class (Program 1)
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
}

// Retail Item Class (Program 2)
class RetailItem {
    private String description;
    private int units;
    private double price;

    public RetailItem(String description, int units, double price) {
        this.description = description;
        this.units = units;
        this.price = price;
    }

    public void setUnits(int units) {
        if (units >= 0) {
            this.units = units;
        } else {
            System.out.println("Units cannot be negative.");
        }
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Price cannot be negative.");
        }
    }

    public void displayItem() {
        System.out.println("Description: " + description);
        System.out.println("Units in Stock: " + units);
        System.out.println("Price: $" + price);
        System.out.println("----------------------");
    }
}

// Shape Classes (Program 3)
class Shape {
    public void showArea() {
        System.out.println("Area calculation is specific to the shape.");
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
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

    @Override
    public void showArea() {
        double area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
}

// Interface Classes (Program 4)
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
}

// Triangle Area Class (Program 5)
class AreaTriangle {
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

// Generic Stack Class (Program 7)
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

    public void display() {
        System.out.println("Stack contents: " + stack);
    }
} 