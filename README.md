# Lab 7: Construction for Reuse

## Overview
This project demonstrates important object-oriented programming concepts in Java, including interfaces, composition, generics, the Liskov Substitution Principle (LSP), and object sorting using Comparable and Comparator.

## Technologies Used
- Java
- Apache Maven
- NetBeans IDE
- Git and GitHub

## Lab Tasks

### Task 1: Black-Box Reuse Using Interfaces
- Created a `PaymentMethod` interface with a `pay()` method.
- Implemented `CreditCardPayment` and `JazzCashPayment`.
- Used dependency injection in `EcommerceCart` to support different payment methods.

### Task 2: Generics
- Created a generic `DataBox<T>` class.
- Stored different data types, including `String` and `Integer`.
- Demonstrated type safety using Java generics.

### Task 3: Liskov Substitution Principle (LSP)
- Demonstrated an LSP violation using `Rectangle` and `Square`.
- Explained the problems caused by inappropriate inheritance.
- Fixed the design using a common `Shape` interface.

### Task 4: Comparable and Comparator
- Created a `Student` class implementing `Comparable<Student>`.
- Sorted students by roll number in ascending order.
- Used `CgpaComparator` to sort students by CGPA in descending order.

## Project Structure

```text
Lab_7/
├── pom.xml
├── README.md
└── src/
    └── main/
        └── java/
            ├── Task1/
            ├── Task2/
            ├── Task3/
            └── Task4/
```

## How to Run
1. Clone or download this repository.
2. Open the project in NetBeans.
3. Allow Maven to load the project dependencies.
4. Run the main class for the task you want to test:
   - Task 1: `Task1.Lab_7`
   - Task 2: `Task2.Task2`
   - Task 3: `Task3.Task3Main`
   - Task 4: `Task4.Task4Main`

## Learning Outcomes
Through this lab, I learned how interfaces and composition improve code flexibility, how generics provide type safety, how to identify and correct LSP violations, and how Comparable and Comparator support sorting objects using different criteria.

## Author
Aisha159
