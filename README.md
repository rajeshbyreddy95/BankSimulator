# 💰 Java Bank Account Simulator (CLI)

A command-line banking system built using Java. Users can create accounts (Savings or Checking), deposit/withdraw money, and view balances — all stored in memory with unique account numbers and basic transaction logic.

---

## 🧠 Concepts Used

- **Object-Oriented Programming (OOP):**
  - Inheritance: `Account` → `SavingsAccount`, `CheckingAccount`
  - Abstraction: Abstract `Account` class
  - Polymorphism: Common interface for account operations
- **Collections API:**
  - `HashMap` for account storage
- **CLI Input/Output:**
  - User interaction through `Scanner`
- **Simple Data Persistence:**
  - In-memory account management (no file/database needed)
- **Random Account Number Generation**
  - `UUID`-based 8-digit account numbers
- **Date/Time (Expandable):**
  - Ready to integrate `LocalDateTime` for timestamps

---

## 🧪 Features

- Create Savings or Checking accounts
- Random account number generation
- Deposit & withdraw operations with validation
- Account balance display
- In-memory transaction logic

---

## 🧱 Technologies

- Java 11+
- No frameworks or external dependencies

---

## 🏃 How to Run

1. Clone or download the repo:
   ```bash
   git clone https://github.com/rajeshbyreddy/BankSimulatorCLI.git
   cd BankSimulatorCLI
