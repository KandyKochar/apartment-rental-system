# Apartment Rental System

A Java console application that models a 2D apartment rental management system, handling tenant information and apartment rent calculations.

## Overview

This project implements an object-oriented apartment rental system where users can input tenant details and apartment specifications to calculate and display rental information. The system demonstrates core OOP concepts including encapsulation, string manipulation, and interactive console I/O.

## Features

- Tenant registration with name, floor, and bedroom count
- Rent calculation based on apartment specifications
- String utility helpers for formatted output
- Interactive console-based UI
- Input validation and test coverage

## Technologies Used

- **Language:** Java (JDK 8+)
- **Build Tool:** Apache Ant (NetBeans project)
- **IDE:** Apache NetBeans

## Project Structure

```
src/
├── StringUtility.java   # Reusable string formatting helpers
├── Tenant.java          # Tenant data model with input/display methods
├── Rent.java            # Apartment rent calculation logic
└── RentTest.java        # Test cases and main entry point
```

## Getting Started

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- Apache NetBeans IDE (optional)

### Running the Application

**From the command line:**
```bash
javac src/*.java -d out/
java -cp out/ RentTest
```

**From NetBeans:**
1. Open the project folder in NetBeans
2. Click **Run Project** (F6)

## Screenshots

> _Screenshots coming soon_

## Author

Kandy Kochar
