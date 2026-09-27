# MINE ESCAPE: THE LAST SHIFT

## 1. PROJECT TITLE
**MINE ESCAPE: THE LAST SHIFT** - A Java Console-Based Survival Game

---

## 2. PROJECT OVERVIEW

This is an interactive, text-based survival and escape game built entirely in Java. The player takes the role of a miner trapped underground after a sudden rockfall blocks the main exit. To escape, the player must explore the mine, collect items, solve puzzles, manage limited resources, and find the emergency exit.

The project was created as an academic assessment to demonstrate core Java programming concepts in a practical, creative, and interactive context.

---

## 3. PROBLEM STATEMENT

**Challenge:** Build a complete Java application that:
- Demonstrates all major Java concepts meaningfully
- Is complex enough to be interesting and interactive
- Is simple enough for a student to understand and explain
- Shows proper software design principles
- Works completely within a console environment
- Provides engaging user experience

---

## 4. PROPOSED SOLUTION

**Mine Escape: The Last Shift** is a survival game that combines gameplay mechanics with Java programming concepts. Rather than artificially fitting Java concepts into a project, the game's design naturally requires:

- Object-oriented design (Player, Room, Item, Puzzle classes)
- Data structures to manage game state (List, Set, Map collections)
- Control flow for game logic (loops, conditionals, switch statements)
- String manipulation for user interaction
- Exception handling for robust input validation
- 2D arrays for spatial representation

---

## 5. OBJECTIVES

The project demonstrates:

1. ✓ Proficiency with core Java programming concepts
2. ✓ Understanding of Object-Oriented Programming (OOP)
3. ✓ Appropriate use of collections (List, Set, Map)
4. ✓ Game design and algorithm thinking
5. ✓ User experience and interactive programming
6. ✓ Professional code structure and documentation
7. ✓ Ability to integrate multiple concepts into a cohesive application

---

## 6. GAME STORY

**Setting:** Deep underground in an abandoned mine

**Scenario:** 
You are a experienced miner working the night shift. Without warning, a massive rockfall collapses the main exit, trapping you approximately 100 meters below the surface. Your emergency radio doesn't work down here. You are alone.

**Objective:**
You must:
- Explore the interconnected tunnels of the mine
- Navigate around hazards (toxic gas, unstable floors, darkness)
- Find and collect useful items (torch, pickaxe, rope, water, medicine)
- Solve mining safety puzzles
- Locate and collect the Mine Key
- Discover the Emergency Exit
- Escape before your resources run out

**Challenge:**
- Health decreases when you take damage from hazards
- Battery power decreases as you explore (needed for light)
- Water supply is limited (needed for survival)
- Some areas are blocked until you find the right items
- Every decision affects your chance of survival

---

## 7. HOW THE GAME WORKS

### Game Flow

1. **Start:** Player enters their miner name
2. **Explore:** Player chooses to explore connected rooms
3. **Interact:** Player encounters hazards, items, and puzzles
4. **Manage:** Player uses inventory, consumes resources, manages health
5. **Progress:** Player navigates toward the emergency exit
6. **Escape:** Player finds key, reaches exit, and escapes
7. **End:** Game displays survival report and final score

### Key Mechanics

**Navigation:**
- Player moves between connected rooms
- Each room has a location ID (A-X)
- Only adjacent rooms are accessible
- Player must find the Mine Key to unlock the exit

**Resource Management:**
- **Health (0-100):** Decreases from hazards. Game over if it reaches 0.
- **Battery (0-100):** Decreases with exploration. Critical in dark areas.
- **Water (0-5):** Limited resource needed for survival.

**Item Collection:**
- Torch: Lights up dark areas, restores battery
- Pickaxe: Clears blocked passages
- Rope: Safely navigate slippery areas
- Water Bottle: Restores water supply
- First Aid Kit: Restores health
- Mine Key: Required to unlock emergency exit

**Puzzle Solving:**
- Mathematical puzzles must be solved to progress
- Wrong answers cause damage and resource loss
- Correct answers open paths and provide rewards

**Hazards:**
- Darkness: Requires torch or causes health loss
- Toxic Gas: Causes significant health damage
- Slippery Floor: Requires rope or causes fall damage
- Weak Structure: Requires pickaxe to pass safely
- Gas Leak: Causes immediate health and battery loss

**Scoring:**
- Room exploration: +50 points per room
- Puzzle solving: +100 points per puzzle
- Item collection: +25 points per item
- Survival bonuses: Health/Battery/Explorer bonuses
- Successful escape: Base +500 points

---

## 8. FEATURES

### Core Features Implemented

- ✓ **Complete game world** with 9 interconnected rooms
- ✓ **Realistic item system** where items are required for progression
- ✓ **Puzzle system** with multiple mathematical puzzles
- ✓ **Resource management** (health, battery, water)
- ✓ **Hazard system** with consequences for choices
- ✓ **Inventory management** with item effects
- ✓ **Scoring system** with multiple bonus categories
- ✓ **Multiple endings** (successful escape, health failure, resource failure)
- ✓ **Visual map display** showing explored vs. unexplored areas
- ✓ **Status display** for real-time resource monitoring
- ✓ **Robust input handling** with exception handling
- ✓ **Save game state** in player object during session

### User Experience Features

- Clean ASCII-based menu system
- Clear room descriptions and item information
- Visual warnings for hazards and danger
- Progress tracking (rooms explored, puzzles solved)
- Meaningful feedback for player actions
- No crashes from invalid input
- Clear victory/defeat conditions

---

## 9. GAME FLOW

```
START
  ↓
GET PLAYER NAME
  ↓
SHOW INTRODUCTION & GAME WORLD
  ↓
MAIN MENU LOOP
  ├─ EXPLORE MINE
  │   ├─ Show current room
  │   ├─ Handle hazards
  │   ├─ Collect items
  │   ├─ Solve puzzles
  │   ├─ Show available paths
  │   └─ Move to new room
  │
  ├─ CHECK MAP
  │   └─ Display 2D grid with visited/unexplored
  │
  ├─ CHECK INVENTORY
  │   └─ List all items
  │
  ├─ VIEW STATUS
  │   └─ Display health, battery, water, score
  │
  ├─ USE ITEM
  │   ├─ Select item
  │   └─ Apply effects (heal, restore battery, etc)
  │
  ├─ REST
  │   └─ Restore some resources
  │
  └─ EXIT GAME
      └─ Show final report and exit
  ↓
CHECK GAME STATE
  ├─ IF ESCAPED: SHOW SUCCESS & END GAME
  ├─ IF HEALTH ≤ 0: SHOW DEFEAT & END GAME
  ├─ IF BATTERY ≤ 0 (in dark): SHOW DEFEAT & END GAME
  └─ ELSE: CONTINUE
  ↓
ASK PLAY AGAIN
  ├─ YES → RESTART
  └─ NO → EXIT
  ↓
END
```

---

## 10. CLASS STRUCTURE

### Architecture Overview

The project uses 6 main classes with clear responsibilities:

```
Main.java
├─ Entry point
├─ Handles main game loop
└─ Manages replay functionality

Game.java
├─ Core game logic
├─ Room management
├─ Room connections (Map)
├─ Visited rooms tracking (Set)
├─ Menu system (Switch)
├─ Exploration logic
├─ Hazard handling
├─ Puzzle system
├─ Mine map display (2D Array)
├─ Resource management
└─ Ending determination

Player.java
├─ Player state management
├─ Resource tracking (health, battery, water)
├─ Inventory management (List)
├─ Score calculation
├─ Item searching utility
└─ Encapsulation of private fields

Room.java
├─ Room representation
├─ Items list (List)
├─ Room metadata
├─ Hazard and puzzle data
└─ Item collection/removal

Item.java
├─ Item properties
├─ Resource restoration values
├─ Item usage tracking
└─ String representations

Puzzle.java
├─ Puzzle questions
├─ Answer validation (String methods)
├─ Reward information
└─ Solved status tracking
```

### Class Relationships

```
Main
  └─→ Game
        └─→ Player
        └─→ Room (multiple)
              └─→ Item (multiple)
        └─→ Puzzle (multiple)
        └─→ Scanner (input handling)
```

---

## 11. DETAILED EXPLANATION OF JAVA CONCEPTS

### A. SWITCH STATEMENTS

**Where Used:** Main menu selection in `Game.java`

**Code Example:**
```java
switch (choice) {
    case 1:
        exploreMine();
        break;
    case 2:
        displayMineMap();
        break;
    case 3:
        displayInventory();
        break;
    case 4:
        displayStatus();
        break;
    case 5:
        useItem();
        break;
    case 6:
        rest();
        break;
    case 7:
        endGame("EXIT");
        break;
    default:
        System.out.println("Invalid choice. Please try again.");
}
```

**Why Used:** 
- Cleaner than multiple if-else statements for menu selection
- More efficient for checking multiple exact values
- Makes code more readable and maintainable
- In game design, switch statements are standard for menu systems

**Why Not Just If-Else:**
- If-else is better for range checking or complex conditions
- Switch is better for exact value matching (which we have: 1, 2, 3, etc.)
- Switch has better performance for multiple exact matches

---

### B. CONDITIONAL STATEMENTS (If/Else/Else-If)

**Where Used Throughout:**

1. **Item Usage** - Checking which item player selected
2. **Hazard Handling** - Different responses for different hazards
3. **Puzzle Solving** - Checking correct/incorrect answers
4. **Resource Management** - Checking if player has enough resources
5. **Game Ending** - Determining which ending condition was met
6. **Navigation** - Checking if destination is valid/accessible

**Example from Hazard Handling:**
```java
if (player.hasItem("Torch")) {
    System.out.println("You use your Torch to navigate safely.");
    player.useBattery(3);
} else {
    System.out.println("The darkness is overwhelming!");
    System.out.println("You stumble and injure yourself.");
    player.takeDamage(15);
}
```

**Why Used:**
- Need to make decisions based on game state
- Different scenarios require different outcomes
- Central to interactive storytelling
- Classic control flow mechanism

---

### C. LOOPS

**Where Used:**

1. **Main Game Loop** - Keeps game running until exit condition
```java
while (gameRunning && !player.hasEscaped()) {
    showMainMenu();
    if (!player.canContinue()) {
        endGame("RESOURCE_FAILURE");
        break;
    }
}
```

2. **Replay Loop** - Allows multiple games
```java
while (playing) {
    Game game = new Game(playerName);
    game.start();
    // ask if play again
}
```

3. **Item Iteration** - Loop through inventory
```java
for (Item item : inventory) {
    if (item.getName().equalsIgnoreCase(itemName)) {
        return true;
    }
}
```

4. **Room Initialization** - Setup game world
```java
for (Item item : new ArrayList<>(room.getItems())) {
    player.addToInventory(item);
    room.removeItem(item);
}
```

**Why Used:**
- Main game loop runs until win/loss condition
- Iterating collections (items, puzzles, rooms)
- Repeating actions until conditions change
- Fundamental to game design

---

### D. NESTED LOOPS

**Where Used:** Mine Map Display with 2D Array

**Code Example:**
```java
// Nested loops to display 2D array
for (int i = 0; i < mineMap.length; i++) {
    for (int j = 0; j < mineMap[i].length; j++) {
        String roomId = mineMap[i][j];
        
        if (roomId.equals(player.getCurrentLocation())) {
            System.out.print("[ @ ] ");
        } else if (visitedRooms.contains(roomId)) {
            System.out.print("[ " + roomId + " ] ");
        } else {
            System.out.print("[ ? ] ");
        }
    }
    System.out.println();
}
```

**Map Layout:**
```
mineMap[0][0] = A,  mineMap[0][1] = B,  mineMap[0][2] = C
mineMap[1][0] = D,  mineMap[1][1] = E,  mineMap[1][2] = F
mineMap[2][0] = G,  mineMap[2][1] = H,  mineMap[2][2] = X
```

**Output Example:**
```
[ @ ] [ B ] [ ? ]
[ D ] [ E ] [ ? ]
[ ? ] [ ? ] [ ? ]
```

**Why Used:**
- 2D arrays naturally represent grids/maps
- Nested loops are the standard way to traverse 2D arrays
- Outer loop iterates rows, inner loop iterates columns
- Perfect for displaying game map visually

**Why This Matters:**
- Shows understanding of multidimensional data structures
- Demonstrates loop nesting and variable scoping
- Essential skill for graphics, game boards, matrices

---

### E. STRINGS

**Where Used Throughout:**

1. **Room Names and Descriptions**
```java
new Room("A", "Mining Shaft", 
    "A large vertical shaft used for mining operations...", 
    "None", false, "")
```

2. **Item Names and Effects Checking**
```java
if (item.getName().equals("Mine Key")) {
    player.setHasMineKey(true);
}
```

3. **String Method: `equalsIgnoreCase()`**
```java
String answer = scanner.nextLine().trim().toLowerCase();
if (answer.equals("y")) {
    // execute action
}
```

4. **String Method: `trim()`** - Remove whitespace
```java
String playerAnswer = scanner.nextLine();
if (puzzle.checkAnswer(playerAnswer.trim())) {
    // correct answer
}
```

5. **String Method: `contains()`** - Check substring
```java
if (puzzle.getQuestion().contains(room.getPuzzle())) {
    // puzzle found
}
```

6. **String Concatenation**
```java
System.out.println("You are at: " + rooms.get(currentRoom).getRoomName());
```

**String Methods Used:**
- `equals()` - Exact comparison
- `equalsIgnoreCase()` - Case-insensitive comparison
- `trim()` - Remove leading/trailing whitespace
- `toLowerCase()` - Convert to lowercase
- `contains()` - Check if substring exists
- `length()` - Get string length

**Why Used:**
- Core to text-based games
- User input validation requires string processing
- Game messages and descriptions are strings
- Item identification and commands use strings

---

### F. ARRAYS

**Where Used:** 2D Array for Mine Map

**Declaration and Initialization:**
```java
private String[][] mineMap; // Declare 2D array

// In constructor:
this.mineMap = new String[3][3]; // Create 3×3 array

// In initializeMap():
mineMap[0][0] = "A";
mineMap[0][1] = "B";
mineMap[0][2] = "C";
mineMap[1][0] = "D";
// ... and so on
```

**Why This Array:**
- Represents 9 rooms in a 3×3 grid
- Spatial data is naturally 2D
- Allows logical room layout
- Essential for visual map display

**Why Not Use a List Instead:**
- Arrays provide direct index access by position
- More efficient for fixed-size grids
- Natural representation of Cartesian coordinates
- Easier to visualize as a grid

**Alternative: Could we use HashMap instead?**
Yes, but:
- HashMap doesn't maintain spatial order
- Requires manual position tracking
- Less intuitive for grid-based data
- Arrays are the right choice for spatial data

---

### G. OBJECT-ORIENTED PROGRAMMING (OOP)

#### 1. **Classes and Objects**

**Classes Created:**
- `Player` - Represents the miner
- `Room` - Represents mine locations
- `Item` - Represents collectible objects
- `Puzzle` - Represents solvable puzzles
- `Game` - Manages game logic
- `Main` - Entry point

**Example - Player Class:**
```java
public class Player {
    private String name;
    private int health;
    private int battery;
    private int water;
    private List<Item> inventory;
    // ... other fields
}

Player player = new Player("Shiva"); // Creating an object
```

**Why Objects:**
- Real-world entities map to objects (player, rooms, items)
- Encapsulates related data and behavior
- Makes code modular and reusable
- Mirrors how we think about the game world

#### 2. **Constructors**

**Demonstrated in Every Class:**

```java
// Player Constructor
public Player(String name) {
    this.name = name;
    this.health = 100;
    this.battery = 80;
    // ... initialize all fields
}

// Room Constructor
public Room(String roomId, String roomName, String description, ...) {
    this.roomId = roomId;
    this.roomName = roomName;
    // ... initialize fields
}

// Item Constructor
public Item(String name, String description, ...) {
    this.name = name;
    // ... initialize fields
}
```

**Why Used:**
- Ensures objects are properly initialized
- Sets default values (player starts at 100 health)
- Required before using an object
- Prevents incomplete/broken objects

#### 3. **Encapsulation (Data Hiding)**

**Private Fields:**
```java
public class Player {
    private String name;        // Not directly accessible
    private int health;         // Controlled through methods
    private List<Item> inventory;
}
```

**Public Getters:**
```java
public String getName() {
    return name;
}

public int getHealth() {
    return health;
}

public List<Item> getInventory() {
    return inventory;
}
```

**Public Setters (Controlled):**
```java
public void setEscaped(boolean escaped) {
    this.escaped = escaped;
}

public void takeDamage(int damage) {
    this.health -= damage;
    if (this.health < 0) {
        this.health = 0; // Validation
    }
}
```

**Why This Matters:**
- Prevents invalid state (e.g., health > 100)
- Methods can validate changes
- Internal implementation can change without affecting code using the class
- Security and data integrity

**Example of Validation:**
```java
public void heal(int amount) {
    this.health += amount;
    if (this.health > 100) {  // Validate max health
        this.health = 100;
    }
}
```

Without encapsulation, someone could write:
```java
player.health = -50; // Invalid!
player.health = 999; // Invalid!
```

With encapsulation, it's impossible.

#### 4. **Methods**

**Instance Methods (operate on object data):**

```java
// In Player class
public void addToInventory(Item item) {
    inventory.add(item);
}

public void removeFromInventory(Item item) {
    inventory.remove(item);
}

public void takeDamage(int damage) {
    this.health -= damage;
}
```

**Why Methods:**
- Bundle related operations
- Hide implementation details
- Reusable code
- Business logic encapsulated

#### 5. **Object Interaction**

Objects communicate and work together:

```java
// In Game class
Player player = new Player("Shiva"); // Create player
Room room = rooms.get("A"); // Get room
Item item = room.getItems().get(0); // Get item from room
player.addToInventory(item); // Player takes item
item.getName(); // Get item's name
player.takeDamage(20); // Player takes damage
```

**Real-World Flow:**
```
Game creates Player
Player explores Room
Room contains Items
Player collects Item
Item effects Player's health/battery
Puzzle asks Player questions
Player's state updates
Game checks if Player escaped
```

#### 6. **toString() Method**

Every class overrides toString() for readable output:

```java
@Override
public String toString() {
    return "Player: " + name + " | Health: " + health + 
           " | Battery: " + battery + " | Water: " + water;
}
```

Used for debugging and display:
```java
System.out.println(player); // Calls toString() automatically
```

---

### H. EXCEPTION HANDLING

**What Problems We Handle:**

1. **Invalid Menu Input** - User enters text instead of number
2. **Invalid Puzzle Answer** - User enters wrong format
3. **Invalid Room Selection** - User chooses non-existent room
4. **Empty Input** - User enters nothing

**Exception Type Used: `InputMismatchException`**

**Example 1: Main Menu Selection**
```java
try {
    int choice = scanner.nextInt();
    scanner.nextLine(); // Clear buffer
    
    switch (choice) {
        case 1:
            exploreMine();
            break;
        // ... more cases
        default:
            System.out.println("Invalid choice.");
    }
} catch (InputMismatchException e) {
    System.out.println("❌ Invalid input! Please enter a number (1-7).");
    scanner.nextLine(); // Clear invalid input
    pressEnter();
}
```

**Example 2: Room Selection**
```java
try {
    int choice = scanner.nextInt();
    scanner.nextLine();
    
    if (choice > 0 && choice <= connectedRooms.size()) {
        String nextRoom = connectedRooms.get(choice - 1);
        player.setCurrentLocation(nextRoom);
    } else {
        System.out.println("Invalid choice.");
    }
} catch (InputMismatchException e) {
    System.out.println("Invalid input!");
    scanner.nextLine();
}
```

**Example 3: Player Name Validation**
```java
try {
    String playerName = scanner.nextLine().trim();
    
    if (playerName.isEmpty()) {
        System.out.println("Name cannot be empty. Using default name: Miner");
        playerName = "Miner";
    }
    
    Game game = new Game(playerName);
    game.start();
} catch (InputMismatchException e) {
    System.out.println("Invalid input detected.");
    scanner.nextLine();
}
```

**Why Exception Handling Matters:**

- **Without it:** Invalid input crashes the program
- **With it:** Invalid input is caught and handled gracefully
- **Good UX:** User gets helpful message, can try again
- **Professional Code:** Real applications must handle errors

**Why We Don't Use Try-Catch Everywhere:**

Some places we use regular if-else instead:
```java
// Good: Simple validation with if-else
if (choice > 0 && choice <= connectedRooms.size()) {
    // proceed
} else {
    System.out.println("Invalid choice.");
}
```

Reason: We're checking a condition, not catching an exception. If-else is clearer and faster.

**Rule of Thumb:**
- Use try-catch for **exceptions** (error conditions)
- Use if-else for **validation** (checking logic)

---

### I. LIST COLLECTION (List<Item>)

**Where Used:** Player Inventory

**Declaration:**
```java
private List<Item> inventory; // In Player class

// Initialize in constructor
this.inventory = new ArrayList<>(); // ArrayList implements List
```

**Operations:**

1. **Add Item:**
```java
player.addToInventory(item);
// Internally:
inventory.add(item);
```

2. **Remove Item:**
```java
player.removeFromInventory(item);
// Internally:
inventory.remove(item);
```

3. **Iterate Through:**
```java
for (Item item : inventory) {
    System.out.println("• " + item.getName());
}
```

4. **Search:**
```java
public boolean hasItem(String itemName) {
    for (Item item : inventory) {
        if (item.getName().equalsIgnoreCase(itemName)) {
            return true;
        }
    }
    return false;
}
```

5. **Get Size:**
```java
System.out.println("Items: " + player.getInventory().size());
```

**Why List?**

- **Dynamic Size:** Inventory can grow/shrink
- **Ordered:** Items stay in collection order
- **Allows Duplicates:** Multiple water bottles possible
- **Easy Iteration:** For-each loop works perfectly
- **Index Access:** Can access by position if needed

**Why Not Array?**
- Array size is fixed at creation
- Inventory size varies during game
- Would need complex resizing logic

**Why ArrayList Specifically?**
- `ArrayList<E>` implements `List<E>`
- Flexible sizing
- Fast random access
- Standard choice for dynamic collections

**Real Usage in Game:**
```java
// Player collects torch
Item torch = new Item("Torch", "A bright flashlight", 0, 20, 0);
player.addToInventory(torch); // Added to List
inventorySize++; // Now size is 1

// Player uses torch
if (player.hasItem("Torch")) {
    player.restoreBattery(20);
    inventory.remove(torch); // Removed from List
}
```

---

### J. SET COLLECTION (Set<String>)

**Where Used:** Visited Rooms Tracking

**Declaration:**
```java
private Set<String> visitedRooms; // In Game class

// Initialize in constructor
this.visitedRooms = new HashSet<>(); // HashSet implements Set
```

**Operations:**

1. **Add Room:**
```java
if (!visitedRooms.contains(currentRoom)) {
    visitedRooms.add(currentRoom);
    exploredRoomsCount++;
    player.addScore(50);
}
```

2. **Check if Contains:**
```java
if (visitedRooms.contains(roomId)) {
    System.out.print("[ " + roomId + " ] "); // Show room
} else {
    System.out.print("[ ? ] "); // Show unknown
}
```

3. **Iterate:**
```java
for (String room : visitedRooms) {
    System.out.println("Visited: " + room);
}
```

4. **Remove:**
```java
visitedRooms.remove("A"); // Though we don't do this in game
```

**Why Set?**

- **No Duplicates:** Each room visited only counted once
- **Fast Lookup:** `contains()` is very fast (O(1))
- **Unordered:** Room order doesn't matter
- **Perfect for Membership:** "Is this room visited?"

**Why Not List?**
- List allows duplicates (room could be visited multiple times in list)
- Checking `contains()` is slower in List (O(n))
- Order doesn't matter for visited rooms

**Why HashSet Specifically?**
- `HashSet<E>` implements `Set<E>`
- Fastest for contains() operations
- Uses hash table internally
- Standard choice for "is element in this collection?"

**Real Usage in Game:**

When player explores:
```
visitedRooms starts as: {}

Player goes to A:
visitedRooms = {A}

Player goes to B:
visitedRooms = {A, B}

Player goes back to A:
- Set already contains A
- No duplicate added
- visitedRooms = {A, B} (unchanged)

Player goes to D:
visitedRooms = {A, B, D}
```

On map display:
```java
if (visitedRooms.contains("A")) {
    // Show room, not question mark
}

// Fast O(1) lookup regardless of set size
```

---

### K. MAP COLLECTION (Map<String, List<String>>)

**Where Used:** Room Connections (Navigation)

**Declaration:**
```java
private Map<String, List<String>> roomConnections; // In Game class

// Initialize
this.roomConnections = new HashMap<>();
```

**Initialization:**
```java
roomConnections.put("A", Arrays.asList("B", "D"));
roomConnections.put("B", Arrays.asList("A", "C", "E"));
roomConnections.put("C", Arrays.asList("B", "F"));
roomConnections.put("D", Arrays.asList("A", "E", "G"));
roomConnections.put("E", Arrays.asList("B", "D", "F", "H"));
roomConnections.put("F", Arrays.asList("C", "E"));
roomConnections.put("G", Arrays.asList("D", "H", "X"));
roomConnections.put("H", Arrays.asList("E", "G", "X"));
roomConnections.put("X", Arrays.asList("G", "H"));
```

**Visual Representation:**
```
From Room A → can go to: [B, D]
From Room B → can go to: [A, C, E]
From Room E → can go to: [B, D, F, H]
```

**Usage in Navigation:**
```java
String currentRoom = player.getCurrentLocation(); // e.g., "A"
List<String> connectedRooms = roomConnections.get(currentRoom);

// Returns: ["B", "D"]

for (int i = 0; i < connectedRooms.size(); i++) {
    String roomId = connectedRooms.get(i);
    Room room = rooms.get(roomId);
    System.out.println((i + 1) + ". " + room.getRoomName());
}
```

**Output:**
```
Available paths from Mining Shaft:
1. Old Tunnel [NEW]
2. Underground Junction [VISITED]

Choose destination:
```

**Validation:**
```java
// Player can only move to connected rooms
if (choice > 0 && choice <= connectedRooms.size()) {
    String nextRoom = connectedRooms.get(choice - 1);
    player.setCurrentLocation(nextRoom); // Safe - we know it's valid
}
```

**Why Map<String, List<String>>?**

- **Key:** Room ID ("A", "B", etc.)
- **Value:** List of connected room IDs
- **Structure:** Maps one room to multiple destinations
- **Data Model:** Perfect for graph/network data

**Why This Structure?**

```
Map provides:
├─ Fast lookup: O(1) to get connections for a room
├─ Clean API: roomConnections.get("A")
└─ Natural representation: "From room X, go to [...]"

List provides:
├─ Preserves order of destinations
├─ Can have duplicate connections (though we don't)
└─ Easy iteration
```

**Real Game Flow:**

```
Player at: "A"
roomConnections.get("A") → ["B", "D"]

"Which room?" → User enters 1
connectedRooms.get(1-1) → connectedRooms.get(0) → "B"

Player moves to: "B"
roomConnections.get("B") → ["A", "C", "E"]

"Which room?" → User enters 3
connectedRooms.get(3-1) → connectedRooms.get(2) → "E"

Player moves to: "E"
```

This prevents players from moving to unconnected rooms through validation.

**Alternative Approaches (and why we didn't use them):**

1. **2D Array of Booleans** - Too complex, wasteful for sparse graph
2. **Adjacency Matrix** - Fine for small games, but Map is cleaner
3. **Multiple if statements** - Unmaintainable, not scalable
4. **Hardcoded in Room class** - Violates separation of concerns

---

## 12. GAME LOGIC & ALGORITHM

### Main Game Algorithm

```
ALGORITHM GameExecution:

1. START
2. CREATE Player with name
3. INITIALIZE all rooms with items, connections, puzzles
4. LOOP (while gameRunning AND NOT escaped):
   a. DISPLAY main menu
   b. GET user choice
   c. EXECUTE choice (using switch):
      - EXPLORE MINE:
        - DISPLAY current room details
        - HANDLE hazards
        - OFFER items for collection
        - OFFER puzzle solving
        - DECREASE battery
        - MARK room as visited
        - SHOW navigation options
        - MOVE to adjacent room (if valid)
        - CHECK if reached exit
        
      - CHECK MAP:
        - USE nested loops to iterate 2D array
        - DISPLAY current position
        - DISPLAY visited vs unknown rooms
        
      - CHECK INVENTORY:
        - ITERATE through List<Item>
        - DISPLAY each item
        
      - VIEW STATUS:
        - DISPLAY all resources
        - DISPLAY score breakdown
        
      - USE ITEM:
        - SHOW List of inventory
        - GET selection
        - APPLY effects (heal, restore battery, etc.)
        - REMOVE used item
        
      - REST:
        - RESTORE some health, battery, water
        - CONSUME water
        
      - EXIT:
        - END game
   d. CHECK win condition:
      - IF at exit room AND has mine key:
        - SET escaped = true
        - ENDING = SUCCESSFUL_ESCAPE
      - IF health <= 0:
        - ENDING = HEALTH_FAILURE
      - IF battery <= 0 in dark tunnel:
        - ENDING = RESOURCE_FAILURE
5. DISPLAY final survival report
6. CALCULATE final score:
   - Add bonus points for health, battery, exploration
   - DISPLAY total score
7. ASK "Play again?"
   - IF yes: GOTO 2
   - IF no: GOTO 8
8. END

KEY DECISION LOGIC:
- Can player move? → Check room connections (Map)
- Is room visited? → Check Set<String>
- Can player pass hazard? → Check inventory (List<Item>)
- Is puzzle correct? → Validate String answer
- Is game over? → Check health, battery, escape status
```

### Pseudocode for Exploration

```
FUNCTION exploreMine():
    currentRoom ← player.getCurrentLocation()
    room ← rooms.get(currentRoom)
    
    PRINT room description
    
    IF room has hazards:
        handleHazard(room.hazard)
        IF not survived:
            endGame()
            RETURN
    
    IF room has items:
        LOOP through room.items:
            PRINT item name
        ASK player to collect
        IF yes:
            LOOP through items:
                player.inventory.add(item)
                room.removeItem(item)
                player.score += 25
    
    IF room has puzzle AND not solved:
        PRINT puzzle question
        GET player answer
        IF answer equals correct answer:
            puzzle.solved = true
            player.score += 100
        ELSE:
            player.health -= 5
    
    IF currentRoom NOT IN visitedRooms:
        visitedRooms.add(currentRoom)
        exploredRoomsCount += 1
        player.score += 50
    
    player.battery -= 5
    
    showAvailablePaths()
END FUNCTION
```

---

## 13. FLOWCHART

```
┌─────────────────────┐
│      START          │
└──────────┬──────────┘
           ↓
┌─────────────────────┐
│ Get Player Name     │
└──────────┬──────────┘
           ↓
┌─────────────────────┐
│ Initialize Game     │
│ (Rooms, Items,      │
│  Puzzles)           │
└──────────┬──────────┘
           ↓
       ┌───┴────────────────────────────────┐
       │ MAIN GAME LOOP                     │
       │ (while not escaped)                │
       │                                    │
       │  ┌──────────────────────────┐     │
       │  │ Show Main Menu           │     │
       │  │ (Switch on choice)       │     │
       │  └───────┬──────────────────┘     │
       │          ↓                        │
       │    ┌──────────────────┐           │
       │    │  Choice = ?      │           │
       │    ├──────────────────┤           │
       │    │ 1: Explore  → ┐  │           │
       │    │ 2: Map      → │  │           │
       │    │ 3: Inventory→ ├─→│ Execute  │
       │    │ 4: Status  → │  │           │
       │    │ 5: Use Item → │  │           │
       │    │ 6: Rest    → │  │           │
       │    │ 7: Exit    → ┘  │           │
       │    └──────────────────┘           │
       │          ↓                        │
       │    ┌──────────────────┐           │
       │    │  Check Game      │           │
       │    │  State           │           │
       │    └─────┬────┬────┬──┘           │
       │          │    │    │              │
       │     Alive?  Battery? Escaped?     │
       │     ┌─No   ├─No    ├─Yes─┐       │
       │     ├─────→ ├──────→└────┐       │
       │    Yes    Yes           │       │
       │     ↓      ↓             ↓       │
       │   LOSE   LOSE          WIN      │
       └─────┬────────┬────────┬──┘
           │    │         │
           └────┼────┬────┘
                │    │
                ↓    ↓
        ┌────────────────────┐
        │ Show Final Report   │
        │ Calculate Score     │
        └────────┬───────────┘
                 ↓
        ┌────────────────────┐
        │ Play Again?         │
        ├──────────┬─────────┤
        │  Yes ←───┘         │ No
        │  (Restart)         │
        └─────┬──────────────┘
              │
              ↓
        ┌────────────────┐
        │  Goodbye Exit   │
        │     END         │
        └─────────────────┘
```

---

## 14. SAMPLE GAMEPLAY

### Session 1: Successful Escape

```
========================================
    MINE ESCAPE: THE LAST SHIFT
========================================

Enter your miner name: Shiva

========================================
        MINE ESCAPE
        THE LAST SHIFT
========================================

A sudden ROCKFALL has collapsed the main exit!
You are trapped 20 meters underground...

Explore the mine, find the Mine Key,
solve puzzles, and reach the Emergency Exit!

========================================
Press ENTER to begin...

========================================
          MAIN MENU
========================================

Player: Shiva
Health  : 100
Battery : 80
Water   : 3

1. Explore Mine
2. Check Map
3. Check Inventory
4. View Status
5. Use Item
6. Rest
7. Exit Game

Enter your choice (1-7): 1

========================================
  EXPLORING: MINING SHAFT
========================================

A large vertical shaft used for mining operations. 
Picks and tools line the walls.

You found items!
1. Torch

Collect items? (y/n): y
✓ Collected: Torch

========================================
Available paths from Mining Shaft:
========================================

1. Old Tunnel [NEW]
2. Underground Junction [VISITED]

Choose destination (or 0 to cancel): 2

You move to: Underground Junction

Press ENTER to continue...

========================================
  EXPLORING: UNDERGROUND JUNCTION
========================================

A crossroads where multiple tunnels meet. 
Water drips from the ceiling.

⚠️  WARNING! Hazard detected: Slippery Floor

The floor is wet and slippery!
You use your Rope to navigate safely.

🧩 A puzzle blocks your path!

Question: 5 + 7 × 2 = ?
Your answer: 19

✓ Correct! Path opens

[Game continues with more exploration...]

[After collecting Mine Key and reaching the exit chamber]

========================================
  EXPLORING: EXIT CHAMBER
========================================

The emergency exit! Fresh air and daylight ahead! FREEDOM!

You have successfully escaped the mine!

========================================
GAME EXITED
========================================

========================================
       SURVIVAL REPORT
========================================

Rooms Explored   : 7
Puzzles Solved   : 3
Items Found      : 5
Health Remaining : 65
Battery Remaining: 30
Water Remaining  : 1

+ 100 (Health Bonus)
+ 50 (Battery Bonus)
+ 150 (Explorer Bonus)

TOTAL SCORE      : 1200

========================================

Do you want to play again? (y/n): n

Thank you for playing Mine Escape: The Last Shift!
Goodbye!
```

### Session 2: Game Over - Resource Failure

```
[After several rounds of exploration and poor resource management]

Player: Ashok
Health  : 45
Battery : 5
Water   : 0

The game detects battery is critically low...

========================================
💀 GAME OVER - RESOURCE FAILURE 💀
========================================

Your resources were exhausted.
You couldn't continue deeper into the mine...

========================================
       SURVIVAL REPORT
========================================

Rooms Explored   : 4
Puzzles Solved   : 1
Items Found      : 2
Health Remaining : 45
Battery Remaining: 5
Water Remaining  : 0

TOTAL SCORE      : 325

========================================

Do you want to play again? (y/n): y
```

---

## 15. PROJECT INNOVATION

### Why This Project is More Than a CRUD Application

**Traditional CRUD Apps:**
- Create, Read, Update, Delete data
- Database-focused
- Data persistence
- Business logic for data management

**Mine Escape is Different:**

1. **Interactive Storytelling**
   - Dynamic narrative based on player choices
   - Multiple endings based on decisions
   - Atmospheric descriptions of game world

2. **Game Mechanics**
   - Real-time resource management
   - Consequences for actions
   - Strategic decision-making
   - Puzzle-solving challenges

3. **State Management**
   - Complex player state (health, battery, water, inventory, location)
   - Room state (visited, items, hazards)
   - Global game state (puzzle solved, ended, score)
   - State changes based on player actions and time

4. **Adaptive Difficulty**
   - Hazards scale consequences
   - Resource scarcity increases challenge
   - Puzzles require thinking
   - Multiple paths encourage exploration

5. **Engagement**
   - Immediate feedback on actions
   - Clear win/loss conditions
   - Scoring rewards exploration
   - Replay value with different strategies

6. **Algorithmic Thinking**
   - Graph-based navigation (room connections)
   - Set operations for visited tracking
   - Item dependency chain
   - Puzzle solving logic

### What Makes It Creative

- **Non-linear Gameplay:** Multiple rooms and paths
- **Consequence System:** Actions have realistic consequences
- **Resource Tension:** Limited resources force tough decisions
- **Environmental Hazards:** Hazards adapted to real mining dangers
- **Puzzle Integration:** Puzzles aren't just obstacles, they're part of the story
- **Scoring System:** Rewards both exploration and skill
- **Multiple Endings:** Different outcomes based on performance

---

## 16. TECHNICAL APPROACH

### Architecture Principles

1. **Separation of Concerns**
   - `Main` handles startup
   - `Game` handles logic
   - `Player/Room/Item` handle data
   - `Puzzle` handles puzzles

2. **Encapsulation**
   - Private fields with controlled access
   - Methods for safe state changes
   - Validation on modifications

3. **Collection Usage**
   - `List<Item>` for dynamic inventory
   - `Set<String>` for efficient visited tracking
   - `Map<String, List<String>>` for graph navigation
   - `String[][]` for spatial layout

4. **Exception Handling**
   - Input validation with try-catch
   - Graceful error messages
   - Recovery from invalid input

5. **Code Reusability**
   - Methods called multiple times
   - Classes instantiated multiple times
   - Parameterized logic

### Class Collaboration

```
Main starts → creates Game
         ↓
Game initializes → creates Rooms with Items
         ↓
Game initializes → creates Puzzles
         ↓
Game runs → uses Player
         ↓
Exploration → modifies Player state
         ↓
Item collection → adds Item to Player's List
         ↓
Visited tracking → adds room to Set
         ↓
Navigation → uses Map to find adjacent rooms
```

---

## 17. COMPILATION AND RUNNING

### Compile Instructions

```bash
# Navigate to source directory
cd /path/to/src

# Compile all Java files
javac *.java

# This generates .class files:
# Main.class, Game.class, Player.class, Room.class, Item.class, Puzzle.class
```

### Run Instructions

```bash
# Run the game
java Main

# Game will prompt for player name and begin
```

### Troubleshooting

**Error: "class Main not found"**
- Ensure all files are compiled: `javac *.java`
- Run from the correct directory

**Error: "package does not exist"**
- No imports needed for this project
- Ensure all files are in same directory

**Game doesn't display properly**
- Ensure terminal/console supports the output
- Try expanding terminal window

---

## 18. LIST OF JAVA CONCEPTS DEMONSTRATED

✅ **Switch Statements** - Main menu selection
✅ **Conditional Statements** - If/else/else-if throughout game logic
✅ **Loops** - Main game loop, item loops, exploration loop
✅ **Nested Loops** - 2D array iteration for map display
✅ **Strings** - Room names, descriptions, item names, puzzle questions
✅ **Arrays** - 2D array for mine map (mineMap[3][3])
✅ **OOP - Classes** - Player, Room, Item, Puzzle, Game
✅ **OOP - Objects** - Multiple instances of each class
✅ **OOP - Constructors** - Initialize all classes properly
✅ **OOP - Encapsulation** - Private fields with getters/setters
✅ **OOP - Methods** - Multiple methods per class
✅ **Exception Handling** - InputMismatchException for invalid input
✅ **List Collection** - List<Item> for inventory
✅ **Set Collection** - Set<String> for visited rooms
✅ **Map Collection** - Map<String, List<String>> for room connections

---

## 19. VIVA QUESTIONS AND ANSWERS

### 1. Why Did You Choose This Project?

**Answer:**
I chose this project because it combines multiple Java concepts into something engaging and interactive. Unlike a simple calculator or CRUD application, a game naturally requires data structures (lists, sets, maps), control flow (loops, conditions), OOP (multiple classes interacting), and exception handling. It demonstrates that Java can build complex, interactive applications beyond business software. Plus, it's something I can actually explain and demonstrate during the viva.

---

### 2. Why Did You Use Object-Oriented Programming?

**Answer:**
OOP is essential here because it models real-world entities. The player is an object with properties (health, inventory, location) and behaviors (takeDamage, addToInventory, move). Rooms are objects with their own properties (items, hazards, descriptions). Items are objects. If I didn't use OOP, I'd need multiple parallel arrays to track everything, which would be confusing and error-prone. OOP keeps related data and logic together, making the code easier to understand and modify.

---

### 3. Why Use ArrayList for Inventory Instead of a Regular Array?

**Answer:**
Arrays have fixed size—I'd need to know the maximum inventory size upfront. With an ArrayList, the inventory can grow dynamically. The player starts with no items and collects more. Plus, remove() operation is built-in. With an array, I'd need to manually shift elements after removal. ArrayList is designed exactly for this use case: a collection that grows and shrinks.

---

### 4. Why Use a Set for Visited Rooms?

**Answer:**
A Set automatically prevents duplicates. The same room should only be counted once, even if visited multiple times. Sets also have fast contains() method (O(1)), which is important when checking if a room is visited many times during the game. A List would require O(n) search time. Plus, conceptually, "Is this room visited?" is a set membership question, not a list ordering question.

---

### 5. Why Use a Map for Room Connections?

**Answer:**
I need to represent a graph where each room connects to multiple other rooms. A Map lets me store roomID → List of adjacent rooms. This is the standard way to represent graphs. The game logic is "Get the adjacent rooms for current room, show them to player, validate their choice." Using a Map makes this fast and intuitive. I could use a 2D boolean array (adjacency matrix), but that wastes space and is harder to interpret.

---

### 6. Where Is the Switch Statement Used?

**Answer:**
The main menu uses a switch statement:
```java
switch (choice) {
    case 1:
        exploreMine();
        break;
    case 2:
        displayMineMap();
        break;
    // ... more cases
}
```
Switch is better than multiple if-else statements here because we're checking exact values (1, 2, 3, etc.). Switch is cleaner and more efficient. The code literally says "what choice did the player make? Do this action."

---

### 7. Where Are Nested Loops Used?

**Answer:**
The mine map display uses nested loops:
```java
for (int i = 0; i < mineMap.length; i++) {
    for (int j = 0; j < mineMap[i].length; j++) {
        // Display cell at [i][j]
    }
    System.out.println(); // Next row
}
```
This iterates through a 3×3 2D array. The outer loop goes through rows, the inner loop goes through columns in each row. We need nested loops because a 2D array has two dimensions. Single loop wouldn't work.

---

### 8. Why Do You Need Exception Handling?

**Answer:**
Without exception handling, invalid input crashes the game. If a user enters "abc" when the game expects a number, InputMismatchException is thrown. With try-catch:
```java
try {
    int choice = scanner.nextInt();
} catch (InputMismatchException e) {
    System.out.println("Invalid input! Please enter a number.");
    scanner.nextLine();
}
```
The game catches the exception, shows a helpful message, clears the bad input, and lets the player try again. This is what professional software does. Games should never crash from invalid input.

---

### 9. How Does the Player Move Between Rooms?

**Answer:**
1. The game displays available paths using `roomConnections.get(currentRoom)`
2. The player chooses a destination number
3. The game validates the choice against the List of connected rooms
4. If valid, `player.setCurrentLocation(newRoom)`
5. If the new room is the exit and player has the Mine Key, `player.setEscaped(true)`
6. The Map ensures players can only move to connected rooms—no teleporting to arbitrary locations

---

### 10. How Does the Scoring System Work?

**Answer:**
The player earns points for:
- Exploring a new room: +50 points
- Solving a puzzle: +100 points
- Collecting an item: +25 points
- Finishing with health > 50: +100 bonus
- Finishing with battery > 30: +50 bonus
- Exploring 7+ rooms: +150 bonus

Points are accumulated in `player.score`. At the end, the game loops through these bonuses and adds them:
```java
if (player.getHealth() > 50) {
    player.addScore(100);
}
```
This rewards both exploration and good decision-making.

---

### 11. What Are the Different Endings?

**Answer:**
1. **Successful Escape** - Player reaches exit with Mine Key. Wins!
2. **Health Failure** - Player takes too much damage and health reaches 0
3. **Resource Failure** - Player runs out of battery in a critical situation
4. **Exit Game** - Player chooses to exit (loss)

Each ending displays a different message and final score. The game tracks `endingType` to display appropriate text.

---

### 12. How Do Hazards Work?

**Answer:**
Each room has a hazard. When the player enters:
```java
if (!room.getHazard().equals("None")) {
    handleHazard(room.getHazard());
}
```
Different hazards have different effects:
- Darkness: Requires Torch to pass safely, otherwise -15 health
- Toxic Gas: -20 health always
- Slippery Floor: Requires Rope, otherwise -10 health
- Weak Structure: Requires Pickaxe, otherwise -15 health

The hazard logic uses if-else and checks if the player has the required item. This makes items essential for progression.

---

### 13. How Do Puzzles Work?

**Answer:**
Each puzzle stores a question and correct answer:
```java
public class Puzzle {
    private String question;
    private String correctAnswer;
    private boolean solved;
}
```
When a player enters a puzzle room, they're shown the question. They provide an answer. The game validates using String method:
```java
if (puzzle.checkAnswer(playerAnswer)) { // equalsIgnoreCase()
    puzzle.setSolved(true);
    player.addScore(100);
}
```
Wrong answers cause -5 health damage. Correct answers give +100 points and open the path.

---

### 14. Can the Player Die in This Game?

**Answer:**
Yes, multiple ways:
1. Take too much damage from hazards → health reaches 0
2. Enter dark area without torch → sufficient damage to die
3. Run out of resources and can't continue

When any condition is met:
```java
if (!player.canContinue()) {
    endGame("RESOURCE_FAILURE");
    break;
}
```
The game ends and displays the final score. The game is beatable but not trivial—poor decisions lead to loss.

---

### 15. Why Does the Mine Key Matter?

**Answer:**
The Mine Key is required to exit:
```java
if (nextRoom.equals("X") && !player.hasMineKey()) {
    System.out.println("The exit is LOCKED!");
    return; // Can't proceed
}
```
The key exists in room "G" (Emergency Tunnel). Players must find it before reaching the exit. This forces exploration and creates a goal. Without the key check, players could win immediately by walking straight to the exit.

---

### 16. What's the Purpose of the 2D Array?

**Answer:**
The 2D array represents the mine layout spatially:
```
mineMap[0][0]=A  mineMap[0][1]=B  mineMap[0][2]=C
mineMap[1][0]=D  mineMap[1][1]=E  mineMap[1][2]=F
mineMap[2][0]=G  mineMap[2][1]=H  mineMap[2][2]=X
```
This creates a 3×3 grid of rooms. When the player views the map, nested loops display this grid with current position (@), visited rooms (letter), and unknown rooms (?). The 2D array makes spatial representation natural. A 1D array would require manual coordinate calculations.

---

### 17. How Does Inventory Management Work?

**Answer:**
Inventory is a List<Item>:
```java
private List<Item> inventory;
```
When player collects item:
```java
inventory.add(item);
```
When player uses item:
```java
inventory.remove(item);
```
When checking if player has item:
```java
public boolean hasItem(String itemName) {
    for (Item item : inventory) {
        if (item.getName().equalsIgnoreCase(itemName)) {
            return true;
        }
    }
    return false;
}
```
This is used everywhere: "Does player have torch? Does player have pickaxe?"

---

### 18. How Did You Prevent Invalid Moves?

**Answer:**
The game validates moves against the room connection map:
```java
List<String> connectedRooms = roomConnections.get(currentRoom);

if (choice > 0 && choice <= connectedRooms.size()) {
    String nextRoom = connectedRooms.get(choice - 1);
    // Safe move - we know it's in the adjacency list
}
```
Players can only move to rooms in the connections map. They can't jump to unconnected rooms. The Map data structure enforces this—only adjacent rooms are listed.

---

### 19. Why Does Battery Matter?

**Answer:**
Battery represents flashlight power. Exploration uses battery:
```java
player.useBattery(5);
```
Some hazards use extra battery:
```java
player.useBattery(5); // Gas leak uses battery
```
Players can't explore forever—they run out of battery and must find the exit. This creates urgency. Torch item restores battery, giving players a dilemma: explore to find Torch, but use battery doing so.

---

### 20. How Would You Improve This Project?

**Answer:**
Several improvements possible:

1. **More Rooms** - Add 10+ more rooms for deeper exploration
2. **More Puzzles** - Different puzzles in different rooms
3. **Item Combinations** - Use Pickaxe + Rope together for special result
4. **Enemy Encounters** - Hazardous creatures in certain rooms
5. **Save/Load** - Persist game state to file
6. **Difficulty Levels** - Easy/Normal/Hard with resource variations
7. **Combat System** - Fight hazards rather than just taking damage
8. **NPC Characters** - Other miners with dialogue
9. **Time Limit** - Race against time to escape
10. **Graphics** - Improve visual presentation with colors/symbols
11. **Sound** - Command-line beeps for events
12. **Procedural Generation** - Randomized room layouts per game
13. **Achievements** - Special unlocks for completing challenges
14. **Leaderboard** - Track high scores

For an academic project, it's good as is. For a full game, these would enhance it significantly.

---

### 21. What's the Biggest Challenge You Faced?

**Answer:**
The biggest challenge was designing the room connection system. I needed to represent a graph where rooms connect to multiple other rooms, but players can only move to adjacent ones. Initially, I considered a 2D boolean array, but that would waste space and be hard to maintain. Using Map<String, List<String>> was much cleaner. It took some thinking to realize this structure naturally enforces the adjacency rules while keeping code readable.

---

### 22. Did You Use Any External Libraries?

**Answer:**
No, this is pure Java with only standard library classes:
- `java.util.Scanner` for input
- `java.util.List`, `ArrayList` for inventory
- `java.util.Set`, `HashSet` for visited rooms
- `java.util.Map`, `HashMap` for room connections
- `java.util.Collections`, `Arrays.asList` for utility

No external GUI frameworks, no database libraries, no game engines. This demonstrates core Java knowledge without dependencies.

---

## 20. PRESENTATION EXPLANATIONS

### One-Sentence Explanation

"Mine Escape is a Java console game where a trapped miner must explore interconnected tunnels, solve puzzles, manage limited resources, and find the emergency exit to escape safely."

### One-Minute Explanation

"Mine Escape: The Last Shift is an interactive text-based survival game I built in Java for this academic project. The scenario is that you're a miner trapped underground after a rockfall blocks the main exit. 

You explore the mine by moving between connected rooms, each with unique descriptions, hazards, and items. Some areas are dangerous—dark tunnels, toxic gas—but you can collect items like a torch or pickaxe to help you survive. 

There are also puzzles you need to solve to progress. You manage limited resources: health decreases from hazards, battery decreases from exploration, and water is scarce. If any resource runs out, you lose.

The goal is to find the Mine Key and reach the emergency exit. When you succeed, you get a survival report showing your score, which is based on rooms explored, puzzles solved, and items collected. The whole thing demonstrates important Java concepts: OOP for classes like Player and Room, Lists for inventory, Sets for tracking visited rooms, Maps for room connections, exception handling for input validation, and various control structures."

### Three-Minute Explanation

"Good morning. I'm presenting Mine Escape: The Last Shift, a Java console-based survival game.

**The Concept:**
The game puts you in the role of a miner trapped 100 meters underground after a rockfall collapses the main exit. You must explore the mine, collect items, solve puzzles, manage resources, and escape through the emergency exit before your resources run out.

**Game Mechanics:**
The mine consists of 9 interconnected rooms. Each room has a description, may contain items or hazards, and connects to other rooms. When you explore, you navigate using a room connection system—you can only move to adjacent rooms, which prevents unrealistic teleportation. The game tracks which rooms you've visited using a Set data structure.

You manage three main resources: Health (decreases from hazards), Battery (decreases from exploration, needed for light), and Water (limited supply). Different items help you—a Torch lets you safely navigate darkness, a Pickaxe helps you through weak structures, Rope helps on slippery floors.

There are puzzles in certain rooms. You must answer math questions correctly to progress. Wrong answers cost health.

**Technical Implementation:**
For the room connections, I use a Map that stores each room ID and maps it to a List of adjacent rooms. This is the most efficient way to represent a graph. For tracking visited rooms, I use a Set because I only need to know membership—has this room been visited?—and Sets are fast for that. Inventory is a List because it can grow dynamically as you collect items.

The main menu uses a switch statement to handle your choices. The mine map is displayed using a 2D array and nested loops—the outer loop iterates rows, inner loop iterates columns, displaying your current position, visited rooms, and unknown areas.

**Multiple Endings:**
The game has different endings: successful escape if you reach the exit with the key, health failure if you take too much damage, resource failure if you run out of battery or water, and game over if you exit manually.

**Why This Project:**
I chose this project because it demonstrates core Java concepts in a context that's engaging and interactive, not just a CRUD application. It required designing multiple classes, using appropriate collections, handling exceptions, and implementing game logic that all works together.

Thank you."

---

## 21. HOW TO COMPILE AND RUN

### Step-by-Step Instructions

#### **Step 1: Prepare Your Files**

Create a folder structure:
```
MineEscape/
└── src/
    ├── Main.java
    ├── Game.java
    ├── Player.java
    ├── Room.java
    ├── Item.java
    └── Puzzle.java
```

#### **Step 2: Open Terminal/Command Prompt**

Navigate to the src directory:
```bash
cd /path/to/MineEscape/src
```

#### **Step 3: Compile All Files**

```bash
javac *.java
```

This compiles all .java files into .class bytecode files.

**Check:** You should now see:
```
Main.class
Game.class
Player.class
Room.class
Item.class
Puzzle.class
```

#### **Step 4: Run the Game**

```bash
java Main
```

#### **Step 5: Play the Game**

Enter your miner name and play!

### Troubleshooting

| Problem | Solution |
|---------|----------|
| "cannot find symbol" | Check that all files are in same directory |
| "class Main not found" | Compile first: `javac *.java` |
| "InputMismatchException" | Normal during gameplay—enter numbers when asked |
| Output looks messy | Expand your terminal window |
| Game exits unexpectedly | Check for Java errors in console |

---

## 22. SUMMARY

This project demonstrates:

- ✅ All required Java concepts used meaningfully
- ✅ Professional code structure and organization
- ✅ Interactive gameplay with real consequences
- ✅ Multiple endings based on player actions
- ✅ Resource management mechanics
- ✅ Puzzle-solving integration
- ✅ Proper exception handling
- ✅ Clean user interface
- ✅ Scalable design

The project is complete, compilable, runnable, and ready for academic assessment.

---

## 23. ACKNOWLEDGMENTS

This project was created as an academic exercise to demonstrate Java programming concepts in a practical, interactive context. All code is original and written from scratch specifically for this project.

---

**END OF README**

Project created for academic assessment.
Total lines of code: ~1500 lines
Estimated development time: 8-10 hours
Difficulty level: Intermediate (appropriate for second-year Java students)
