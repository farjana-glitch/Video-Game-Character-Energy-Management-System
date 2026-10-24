# 🎮 Video Game Character Energy Management System

A Java-based application that applies Object-Oriented Programming (OOP) principles to model video game characters, their unique energy levels, regeneration rates, and custom exception handling.

---

## 💡 Key OOP Concepts Demonstrated
- **Abstraction:** Abstract `Character` class defining core energy behaviors.
- **Inheritance & Polymorphism:** Subclasses like `PlayerCharacter`, `Mage`, and `Warrior` overriding calculation methods.
- **Custom Exception Handling:** `InsufficientEnergyException` thrown when energy levels drop below action thresholds.

---

## 🛠️ Project Structure
```text
src/
├── Character.java
├── PlayerCharacter.java
├── Mage.java
├── Warrior.java
├── InsufficientEnergyException.java
└── Main.java
