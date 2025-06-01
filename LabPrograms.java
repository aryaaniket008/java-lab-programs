package labexam;

import java.util.*;

public class LabPrograms {
    
    // Program 1: Bank Account Demo
    public static void runBankAccountDemo() {
        Scanner scanner = new Scanner(System.in);
        BankAccount account = new BankAccount();

        System.out.print("Enter Account Number: ");
        int accNo = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Account Holder Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Address: ");
        String address = scanner.nextLine();

        System.out.print("Enter Initial Balance: ");
        double initialBalance = scanner.nextDouble();

        account.setInitialValues(accNo, name, address, initialBalance);
        
        boolean running = true;
        while (running) {
            System.out.println("\nBank Operations Menu:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Account Details");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    account.deposit(scanner.nextDouble());
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    account.withdraw(scanner.nextDouble());
                    break;
                case 3:
                    account.displayAccount();
                    break;
                case 4:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    // Program 2: Retail Store Demo
    public static void runRetailStoreDemo() {
        RetailItem item1 = new RetailItem("Jacket", 12, 59.95);
        RetailItem item2 = new RetailItem("Jeans", 40, 34.95);
        RetailItem item3 = new RetailItem("Shirt", 20, 24.95);

        System.out.println("Initial Retail Items:");
        item1.displayItem();
        item2.displayItem();
        item3.displayItem();

        System.out.println("\nUpdating item1...");
        item1.setUnits(15);
        item1.setPrice(55.99);
        item1.displayItem();
    }

    // Program 3: Shape Demo
    public static void runShapeDemo() {
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);

        System.out.println("Shape Areas:");
        circle.showArea();
        rectangle.showArea();
    }

    // Program 4: Interface Demo
    public static void runInterfaceDemo() {
        DemoI obj = new DemoI();
        obj.methodI();
        obj.methodI1();
        obj.methodI2();
        obj.methodI12();
    }

    // Program 5: Triangle Area Demo
    public static void runTriangleDemo() {
        AreaTriangle triangle = new AreaTriangle(10.0, 5.0);
        System.out.println("Area of Triangle: " + triangle.Area());
    }

    // Program 6: String Operations Demo
    public static void runStringDemo() {
        String s1 = new String("hello");
        String s2 = new String("hello");
        String s3 = "hello";
        String s4 = "hello";

        System.out.println("String Comparison Demo:");
        System.out.println("s1 == s2: " + (s1 == s2));
        System.out.println("s1.equals(s2): " + s1.equals(s2));
        System.out.println("s3 == s4: " + (s3 == s4));

        String palindrome = "madam";
        String reversed = new StringBuilder(palindrome).reverse().toString();
        System.out.println("\nPalindrome Check:");
        System.out.println(palindrome + " is" + (palindrome.equals(reversed) ? "" : " not") + " a palindrome");
    }

    // Program 7: Generic Stack Demo
    public static void runGenericStackDemo() {
        Gen<Integer> intStack = new Gen<>();
        System.out.println("Integer Stack Demo:");
        intStack.push(10);
        intStack.push(20);
        intStack.display();
        intStack.pop();
        intStack.display();

        Gen<Float> floatStack = new Gen<>();
        System.out.println("\nFloat Stack Demo:");
        floatStack.push(3.14f);
        floatStack.push(6.28f);
        floatStack.display();
        floatStack.pop();
        floatStack.display();
    }

    // Program 8: ArrayList Demo
    public static void runArrayListDemo() {
        ArrayList<String> colorList = new ArrayList<>();
        colorList.add("Red");
        colorList.add("Green");
        colorList.add("Blue");
        
        System.out.println("Original ArrayList: " + colorList);
        
        colorList.addAll(Arrays.asList("Orange", "Pink"));
        System.out.println("After adding more colors: " + colorList);
        
        String[] colorArray = colorList.toArray(new String[0]);
        System.out.println("Array conversion: " + Arrays.toString(colorArray));
        
        Collections.reverse(colorList);
        System.out.println("Reversed: " + colorList);
        
        Collections.sort(colorList);
        System.out.println("Sorted: " + colorList);
    }

    // Main menu to run all demos
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nLab Programs Menu:");
            System.out.println("1. Bank Account Demo");
            System.out.println("2. Retail Store Demo");
            System.out.println("3. Shape Demo");
            System.out.println("4. Interface Demo");
            System.out.println("5. Triangle Area Demo");
            System.out.println("6. String Operations Demo");
            System.out.println("7. Generic Stack Demo");
            System.out.println("8. ArrayList Demo");
            System.out.println("9. Exit");
            System.out.print("Enter your choice (1-9): ");

            int choice = scanner.nextInt();
            System.out.println();

            switch (choice) {
                case 1: runBankAccountDemo(); break;
                case 2: runRetailStoreDemo(); break;
                case 3: runShapeDemo(); break;
                case 4: runInterfaceDemo(); break;
                case 5: runTriangleDemo(); break;
                case 6: runStringDemo(); break;
                case 7: runGenericStackDemo(); break;
                case 8: runArrayListDemo(); break;
                case 9:
                    running = false;
                    System.out.println("Thank you for using the Lab Programs!");
                    break;
                default:
                    System.out.println("Invalid choice! Please select 1-9.");
            }
        }
        scanner.close();
    }
} 