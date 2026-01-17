# Getting-into-Practice-Input-Output
##  Exercise 1: Simulating the `ls` Command
###  Problem
The goal of this exercise is to simulate the Unix `ls` command using Java.
The program must:
* Ask the user to enter a full directory path
* Display all files and directories inside the given directory
* Indicate:
  * `<DIR>` for directories
  * `<FILE>` for files
  * Access permissions:
    * `r` if readable
    * `w` if writable
    * `h` if hidden (cache file)
### Solution
The solution uses the `java.io.File` class to:
* Check if the given path exists and is a directory
* Retrieve the list of files using `listFiles()`
* For each file:
  * Determine its type (file or directory)
  * Check read, write, and hidden permissions
* Display the formatted result for each entry
  <img width="1277" height="336" alt="tp4 exerc1" src="https://github.com/user-attachments/assets/97f99457-b103-400a-8ed0-54c57b0a381f" />

## Exercise 2: Object Serialization – `products.dat`
### Problem
The objective is to manage a collection of `Product` objects and store them permanently in a file using serialization.
The program must:

* Create a `Product` class implementing `Serializable`
* Define an interface for product management
* Implement CRUD operations (add, search, delete, list)
* Save and load products from a file named `products.dat`
* Provide a menu-driven application for user interaction

### Solution

The solution includes:

* A `Product` class with attributes such as id, name, brand, price, description, and stock
* An interface declaring all required product management methods
* A concrete implementation using `ObjectInputStream` and `ObjectOutputStream`
* A menu-based `Application` class using a loop to interact with the user
* Data persistence using object serialization
<img width="1097" height="342" alt="tp4exer2" src="https://github.com/user-attachments/assets/3c2e2f65-2aef-48b9-bcec-071583e60a9e" />
<img width="1013" height="243" alt="tp4 exr22" src="https://github.com/user-attachments/assets/9cb48a7f-6010-483e-9eee-7163c35d780a" />

---

## Exception Handling – Practice Exercises

---

## Exercise 1: Calculator with Error Handling

###  Problem

Create a `Calculator` class that:

* Performs division and handles division by zero
* Converts a string to a number and handles invalid input
* Performs basic arithmetic operations (+, -, *, /)
* Displays appropriate error messages when errors occur

###  Solution

The solution implements:

* A `divide` method that checks for division by zero
* A `convertToNumber` method using `try/catch` to handle invalid input
* A `calculate` method using a `switch` statement to manage supported operations
* Clear error messages for unsupported operations or invalid values
<img width="523" height="314" alt="calcule" src="https://github.com/user-attachments/assets/862a7fa5-cf30-4bf1-9cc2-f2890ee1182c" />

---

## Exercise 2: Custom Exception – `TooFastException`
###  Problem
This exercise requires:
* Creating a custom exception class `TooFastException`
* Throwing the exception when a vehicle’s speed exceeds 90
* Displaying the call stack of the exception

###  Solution
The solution includes:
* A custom exception class extending `Exception`
* A `Vehicle` class with a `testSpeed` method
* The method throws `TooFastException` when the speed limit is exceeded
* The `main` method tests different speeds and displays the exception stack trace using `printStackTrace()`
<img width="1320" height="209" alt="exercice3" src="https://github.com/user-attachments/assets/14d8c4f9-9d76-4c63-8900-2b2cc0119d4e" />



