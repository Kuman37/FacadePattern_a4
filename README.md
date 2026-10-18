# Game Launcher — Facade Design Pattern

A simple Java application that demonstrates the **Facade Design Pattern** through a game launcher simulation.

This project was developed for Assignment #4 in the Software Design Patterns course.

## Overview

Launching a game involves several operations, such as checking game files, loading saved progress, applying graphics settings, and starting the game engine.

The Facade pattern simplifies this process by providing a single interface that coordinates these operations.

Instead of interacting with multiple services, the client only uses `GameLauncherFacade`.

## Technologies

- Java 17
- IntelliJ IDEA
- Git and GitHub

## Project Structure

```text
Assignment4Facade/
├── src/
│   ├── Main.java
│   ├── GameLauncherFacade.java
│   ├── GameFileChecker.java
│   ├── SaveManager.java
│   ├── GraphicsSettings.java
│   └── GameEngine.java
└── README.md
```

## Class Responsibilities

| Class | Responsibility |
|---|---|
| `Main` | Demonstrates the launcher |
| `GameLauncherFacade` | Coordinates the game launching process |
| `GameFileChecker` | Verifies whether a game is installed |
| `SaveManager` | Checks and loads existing save data |
| `GraphicsSettings` | Applies graphics configuration |
| `GameEngine` | Starts and stops the game |

## How It Works

When the client calls `startGame()`, the Facade performs the following operations:

1. Checks whether another game is running.
2. Verifies that the requested game is installed.
3. Loads an existing save or starts a new game.
4. Applies graphics settings.
5. Starts the game engine.

If the game is not installed, the launch process stops.

The Facade also provides `stopGame()` to close the current game.

### Example

```java
public class Main {
    public static void main(String[] args) {
        GameLauncherFacade launcher = new GameLauncherFacade();

        launcher.startGame("Minecraft");
        launcher.stopGame();
    }
}
```

## Facade Design Pattern
UML: <img width="1220" height="482" alt="UML" src="https://github.com/user-attachments/assets/00c33094-0aec-4282-a2f8-098998a8b28f" />

The Facade is a structural design pattern that provides a simplified interface to a complex subsystem.

In this project:

- **Facade:** `GameLauncherFacade`
- **Subsystems:** `GameFileChecker`, `SaveManager`, `GraphicsSettings`, `GameEngine`
- **Client:** `Main`

The client does not need to know how each subsystem works. All operations are coordinated by the Facade.

Subsystem classes can also be used independently without the Facade.

## How to Run

1. Clone or download this repository.
2. Open the project in IntelliJ IDEA.
3. Configure JDK 17.
4. Open `Main.java`.
5. Run the `main()` method.

No external libraries are required.

## Conclusion

This project demonstrates how the Facade pattern reduces complexity by combining several subsystem operations into a simple interface.

It improves code readability, separates responsibilities, and makes the application easier to use and maintain.
