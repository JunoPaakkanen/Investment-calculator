# Investment Calculator (Clean Code Practice)

A modular Java-based CLI application designed to calculate compound interest over a set time horizon. This project was developed as a practice exercise to implement **"Clean Code"** principles and professional Java architecture.

## 🛠 Technical Highlights
* **Separation of Concerns**: Divided the logic into distinct modules: `Calculator`, `Validator`, `Reader`, and `UI` to follow the Single Responsibility Principle.
* **Non-Local Flow Control**: Implemented a custom `UserExitException` to handle graceful program termination from deep within the input stack without messy boolean flags or `System.exit()`.
* **Centralized Messaging**: Externalized all user-facing strings into a `Messages` constants class to ensure maintainability and simplicity.
* **Robust Validation**: Built a custom validation engine to handle edge cases and invalid inputs without crashing the application.

## 🚀 How to Run
This project uses **Maven**. Ensure you have it installed before proceeding.

1. **Clone the repository**
   ```bash
   git clone https://github.com/JunoPaakkanen/Investment-calculator.git
   
2. **Compile and execute** Navigate to the project root and run:
    ```bash
   mvn compile exec:java "-Dexec.mainClass=com.junopaakkanen.App"

## 📖 Design Decisions & Elegance

* **Static Utility vs. Instance Logic**: Math logic is contained in a static utility class for efficiency, while the UI is handled via an instance object to demonstrate proper object-oriented initialization.

* **Graceful Termination**: Instead of using System.exit(), the program "unwinds" the stack using a custom exception, allowing the main method to finish naturally.


* Developed for training purposes to showcase **clean, maintainable Java code**.

## 👤 Author

**Juno Paakkanen**
* ICT Engineering Student @ Hämeen ammattikorkeakoulu, HAMK
* https://www.linkedin.com/in/juno-paakkanen-3628ba334/

---
