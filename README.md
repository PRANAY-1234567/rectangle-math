# Rectangle Area and Perimeter Calculator in Java

## 📌 Overview

This project is a simple Java console application that calculates the **area** and **perimeter** of a rectangle based on user-provided dimensions.
The program accepts the **length** and **breadth** of a rectangle as input, performs the necessary calculations using standard mathematical formulas, and displays the results.
It is an ideal beginner project for learning Java fundamentals such as user input, variables, arithmetic operations, and console output.

---

## 🚀 Features

* Accepts length and breadth from the user
* Calculates the area of a rectangle
* Calculates the perimeter of a rectangle
* Uses floating-point (`double`) values for precise calculations
* Beginner-friendly and easy to understand

---

## 🛠️ Technologies Used

* Java
* Scanner Class
* Arithmetic Operators

---

## 📂 Project Structure

```text
├── Rectangle.java
└── README.md
```

---

## 💻 Source Code

```java
import java.util.Scanner;

class Rectangle {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter the length of rectangle : ");
        double l = inp.nextDouble();

        System.out.print("Enter the breadth of rectangle : ");
        double b = inp.nextDouble();

        double a = l * b;
        double p = 2 * (l + b);

        System.out.println("Area of rectangle : " + a);
        System.out.println("Perimeter of rectangle : " + p);
    }
}
```

---

## ▶️ How to Run

### Clone the Repository

```bash
git clone https://github.com/your-username/java-rectangle-calculator.git
cd java-rectangle-calculator
```

### Compile the Program

```bash
javac Rectangle.java
```

### Run the Program

```bash
java Rectangle
```

---

## 📋 Sample Output

### Example

```text
Enter the length of rectangle : 10
Enter the breadth of rectangle : 5

Area of rectangle : 50.0
Perimeter of rectangle : 30.0
```

---

## 🧠 Concepts Covered

* Java Basics
* User Input using `Scanner`
* Variables and Data Types
* Arithmetic Operators
* Formula Implementation
* Console Output

---

## 📐 Formulas Used

### Area of Rectangle

```text
Area = Length × Breadth
```

### Perimeter of Rectangle

```text
Perimeter = 2 × (Length + Breadth)
```

---

## 🔍 Algorithm

1. Start the program.
2. Read the length of the rectangle.
3. Read the breadth of the rectangle.
4. Calculate the area using:

   ```
   Area = Length × Breadth
   ```
5. Calculate the perimeter using:

   ```
   Perimeter = 2 × (Length + Breadth)
   ```
6. Display the calculated area and perimeter.
7. End the program.

---

## ⏱️ Complexity Analysis

| Operation        | Complexity |
| ---------------- | ---------- |
| Time Complexity  | **O(1)**   |
| Space Complexity | **O(1)**   |

The program performs a constant number of operations regardless of the input values.

---

## 🔮 Future Improvements

* Validate user input
* Calculate the diagonal of the rectangle
* Compare areas of multiple rectangles
* Build a menu-driven geometry calculator
* Create a GUI version using Java Swing or JavaFX

---

## 🎯 Learning Outcomes

After completing this project, you will understand:

* How to take user input in Java
* How to use the `Scanner` class
* How to perform arithmetic calculations
* How to apply mathematical formulas in programming
* How to display formatted output in the console

---

## 👨‍💻 Author

**Pranay Jadhao**

Electronics & Telecommunication Engineer

Aspiring Software Engineer | Java | Python | SQL | Data Analytics

---

## 📄 License

This project is open-source and available for educational and learning purposes.
