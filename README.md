
Multi-Language Calculator with GUI

This repository contains a simple calculator application implemented using three different programming languages: Java, C, and Python. Each version has a graphical user interface (GUI) that allows the user to perform basic arithmetic operations like addition, subtraction, multiplication, and division.

Features

GUI Interface for ease of use.

Basic arithmetic operations: Addition, Subtraction, Multiplication, Division.

Implemented in three programming languages:

Java (Swing)

C (GTK)

Python (Tkinter)



Table of Contents

1. Java Version


2. C Version


3. Python Version


4. Installation and Setup


5. Usage


6. Contributing


7. License




---

Java Version

This version of the calculator is created using Java with Swing for the GUI. It offers a user-friendly interface and allows the user to perform basic arithmetic operations.

Requirements:

Java Development Kit (JDK) 8 or later


To run:

1. Compile the Java code:

javac Calculator.java


2. Run the application:

java Calculator




---

C Version

This version of the calculator is implemented in C using the GTK library for the GUI.

Requirements:

GCC compiler

GTK library (version 3.x or later)


To run:

1. Compile the C code:

gcc -o calculator calculator.c `pkg-config --cflags --libs gtk+-3.0`


2. Run the application:

./calculator




---

Python Version

This version is implemented in Python using the Tkinter library to create the GUI.

Requirements:

Python 3.x

Tkinter (should be installed by default)


To run:

1. Run the Python script:

python calculator.py




---

Installation and Setup

Java Version:

1. Install Java JDK from Oracle’s website.


2. Download or clone the repository.


3. Navigate to the java/ folder and follow the instructions in the "Java Version" section.



C Version:

1. Install GCC and GTK from your package manager or GTK official website.


2. Download or clone the repository.


3. Navigate to the c/ folder and follow the instructions in the "C Version" section.



Python Version:

1. Ensure Python 3.x is installed. You can download it from here.


2. Download or clone the repository.


3. Navigate to the python/ folder and follow the instructions in the "Python Version" section.




---

Usage

Launch the application.

Use the calculator GUI to input numbers and perform calculations by clicking the appropriate buttons.

The calculator supports the basic operations: addition, subtraction, multiplication, and division.



---

Contributing

Contributions are welcome! If you find any bugs or want to add new features, feel free to submit a pull request. Please make sure to follow the coding conventions and include tests where applicable.


