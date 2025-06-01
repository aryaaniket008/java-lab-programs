# Java Lab Programs Package

This package contains all the Java lab programs organized in an easy-to-use format. During your exam, you can quickly import and use any program you need.

## Quick Setup During Exam

1. Create a new file called `pom.xml` in your exam workspace and paste this content:
   ```xml
   <?xml version="1.0" encoding="UTF-8"?>
   <project xmlns="http://maven.apache.org/POM/4.0.0"
            xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
            xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
       <modelVersion>4.0.0</modelVersion>
   
       <groupId>exam</groupId>
       <artifactId>exam</artifactId>
       <version>1.0-SNAPSHOT</version>
   
       <repositories>
           <repository>
               <id>jitpack.io</id>
               <url>https://jitpack.io</url>
           </repository>
       </repositories>
   
       <dependencies>
           <dependency>
               <groupId>com.github.aryaaniket008</groupId>
               <artifactId>java-lab-programs</artifactId>
               <version>main-SNAPSHOT</version>
           </dependency>
       </dependencies>
   </project>
   ```

2. Create your exam solution file (e.g., `ExamSolution.java`) and import the package:
   ```java
   import labexam.LabPrograms;

   public class ExamSolution {
       public static void main(String[] args) {
           // Run any program you need
           LabPrograms.runBankAccountDemo();
           // or
           LabPrograms.runRetailStoreDemo();
           // etc...
       }
   }
   ```

## Available Programs

1. Bank Account System (Program 1)
   ```java
   LabPrograms.runBankAccountDemo();
   ```

2. Retail Store System (Program 2)
   ```java
   LabPrograms.runRetailStoreDemo();
   ```

3. Shape Area Calculator (Program 3)
   ```java
   LabPrograms.runShapeDemo();
   ```

4. Interface Inheritance Demo (Program 4)
   ```java
   LabPrograms.runInterfaceDemo();
   ```

5. Triangle Area Calculator (Program 5)
   ```java
   LabPrograms.runTriangleDemo();
   ```

6. String Operations Demo (Program 6)
   ```java
   LabPrograms.runStringDemo();
   ```

7. Generic Stack Demo (Program 7)
   ```java
   LabPrograms.runGenericStackDemo();
   ```

8. ArrayList Operations Demo (Program 8)
   ```java
   LabPrograms.runArrayListDemo();
   ```

## Example Usage During Exam

If you need to implement a bank account system in your exam:

```java
import labexam.LabPrograms;

public class ExamSolution {
    public static void main(String[] args) {
        // This will run the complete bank account program
        LabPrograms.runBankAccountDemo();
    }
}
```

Or if you need to demonstrate string operations:

```java
import labexam.LabPrograms;

public class ExamSolution {
    public static void main(String[] args) {
        // This will run the string operations demo
        LabPrograms.runStringDemo();
    }
}
```

## Important Notes

1. Make sure you have internet access during the exam to download the package
2. The package will be automatically downloaded when you run your code
3. All programs are organized in a menu system - you can also run the main program to access all demos:
   ```java
   import labexam.LabPrograms;

   public class ExamSolution {
       public static void main(String[] args) {
           // This will show a menu of all available programs
           LabPrograms.main(args);
       }
   }
   ``` 