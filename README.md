# Game Development Framework: Classic Board Games Implementation in Java

A comprehensive Java-based framework for implementing classic board games, featuring Snake and Ladder and Tic Tac Toe games with extensible architecture and design patterns. The framework provides modular components for game board management, player interactions, and game state handling.

This project demonstrates object-oriented design principles and common design patterns through the implementation of classic board games. It features a flexible architecture that allows for easy extension and modification of game rules and components. The framework includes complete implementations of Snake and Ladder and Tic Tac Toe games, with support for multiple players, custom board sizes, and various game pieces.

Key features include:
- Modular game components with clear separation of concerns
- Support for multiple players and different piece types
- Flexible board size configuration
- Turn-based gameplay management
- Command-line interface for game interactions
- Implementation of Observer pattern for game state updates
- Database integration capabilities through abstract interfaces

## Repository Structure
```
.
├── Open/                          # Open-closed principle demonstration
│   └── src/                      # Database integration examples
├── PUBSUB/                       # Publisher-Subscriber pattern implementation
│   └── src/                      # Weather station example using Observer pattern
├── SnakeLadder/                  # Snake and Ladder game implementation
│   └── src/                      # Core game logic and components
├── Tic Tac Toe/                  # Tic Tac Toe game implementation
│   └── src/                      # Game board and player management
└── S/                            # SOLID principles demonstration
    └── src/                      # Example implementations
```

## Usage Instructions
### Prerequisites
- Java Development Kit (JDK) 8 or higher
- Java IDE (IntelliJ IDEA recommended, as project uses .iml files)
- Basic understanding of Java programming concepts

### Installation
1. Clone the repository:
```bash
git clone <repository-url>
```

2. Open the project in IntelliJ IDEA:
- File -> Open -> Select the project directory

3. Build the project:
```bash
# For Unix-based systems
./gradlew build

# For Windows
gradlew.bat build
```

### Quick Start
1. Running Snake and Ladder game:
```java
public class Main {
    public static void main(String[] args) {
        SnakeLadderGame game = new SnakeLadderGame();
        String winner = game.startGame();
        System.out.println("Winner: " + winner);
    }
}
```

2. Running Tic Tac Toe game:
```java
public class Main {
    public static void main(String[] args) {
        TicTacToeGame game = new TicTacToeGame(3); // 3x3 board
        String winner = game.startGame();
        System.out.println("Winner: " + winner);
    }
}
```

### More Detailed Examples
1. Creating a custom game board:
```java
Board board = new Board(100); // Creates a 100-square board for Snake and Ladder
board.initializeBoard(); // Sets up snakes and ladders
```

2. Managing players:
```java
Player player1 = new Player("Player1", new PieceTypeO());
Player player2 = new Player("Player2", new PieceTypeX());
players.add(player1);
players.add(player2);
```

### Troubleshooting
Common issues and solutions:

1. Game board initialization fails:
```java
// Ensure proper board size
if (size <= 0) {
    throw new IllegalArgumentException("Board size must be positive");
}
```

2. Invalid player moves:
- Check if the selected position is within bounds
- Verify if the cell is empty before placing a piece
- Ensure correct turn order is maintained

## Data Flow
The games follow a turn-based flow where players take actions that modify the game state, which is then validated and updated accordingly.

```ascii
[Player Input] -> [Game Controller] -> [Board State]
       ^                |                  |
       |                v                  v
[Input Validation] <- [Game Rules] <- [State Update]
```

Component interactions:
1. Player provides input through command line interface
2. Game controller validates the move
3. Board state is updated if move is valid
4. Game rules are checked for win conditions
5. Turn passes to next player
6. Game state is displayed to players
7. Process repeats until win condition or draw