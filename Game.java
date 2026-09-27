import java.util.*;

/**
 * Game class manages the entire game flow and logic
 * Demonstrates: Map, Set, List, Arrays, Loops, Nested Loops,
 * Conditional statements, Exception Handling, OOP
 */
public class Game {
    private Player player;
    private Map<String, Room> rooms;
    private Map<String, List<String>> roomConnections; // Demonstrates Map<String, List<String>>
    private Set<String> visitedRooms; // Demonstrates Set<String>
    private Scanner scanner;
    private boolean gameRunning;
    private int exploredRoomsCount;
    private String endingType;
    private String[][] mineMap; // Demonstrates 2D Array
    private List<Puzzle> puzzles; // Demonstrates List

    // Constructor
    public Game(String playerName) {
        this.player = new Player(playerName);
        this.rooms = new HashMap<>();
        this.roomConnections = new HashMap<>();
        this.visitedRooms = new HashSet<>();
        this.scanner = new Scanner(System.in);
        this.gameRunning = true;
        this.exploredRoomsCount = 0;
        this.endingType = "";
        this.mineMap = new String[3][3]; // 2D Array for mine map
        this.puzzles = new ArrayList<>();
        
        initializeGame();
    }

    // Initialize all game components
    private void initializeGame() {
        createRooms();
        createConnections();
        createPuzzles();
        initializeMap();
        visitedRooms.add("A"); // Starting room
    }

    // Create all rooms in the mine
    private void createRooms() {
        rooms.put("A", new Room("A", "Mining Shaft", 
            "A large vertical shaft used for mining operations. Picks and tools line the walls.", 
            "None", false, ""));
        
        rooms.put("B", new Room("B", "Old Tunnel", 
            "An abandoned tunnel from years ago. Dust and cobwebs everywhere.", 
            "Darkness", false, ""));
        
        rooms.put("C", new Room("C", "Storage Room", 
            "An old storage facility with forgotten equipment and supplies.", 
            "None", false, ""));
        
        rooms.put("D", new Room("D", "Underground Junction", 
            "A crossroads where multiple tunnels meet. Water drips from the ceiling.", 
            "Slippery Floor", false, "5 + 7 × 2 = ?"));
        
        rooms.put("E", new Room("E", "Abandoned Workshop", 
            "An old maintenance workshop with rusted machinery and tools.", 
            "Toxic Gas", false, "2, 4, 8, 16, ?"));
        
        rooms.put("F", new Room("F", "Gas Tunnel", 
            "A dangerous tunnel with visible toxic gas clouds.", 
            "Gas Leak", false, ""));
        
        rooms.put("G", new Room("G", "Emergency Tunnel", 
            "A rarely-used emergency escape route. Signs point toward safety.", 
            "Weak Structure", false, "10 - 3 + 5 = ?"));
        
        rooms.put("H", new Room("H", "Locked Chamber", 
            "A sealed chamber with a heavy locked door. Something valuable is here.", 
            "None", true, ""));
        
        rooms.put("X", new Room("X", "Exit Chamber", 
            "The emergency exit! Fresh air and daylight ahead! FREEDOM!", 
            "None", false, ""));

        // Add initial items to rooms
        rooms.get("A").addItem(new Item("Torch", "A bright flashlight", 0, 20, 0));
        rooms.get("C").addItem(new Item("First Aid Kit", "Medical supplies", 25, 0, 0));
        rooms.get("C").addItem(new Item("Water Bottle", "Fresh water", 0, 0, 2));
        rooms.get("D").addItem(new Item("Pickaxe", "A sturdy mining tool", 0, 0, 0));
        rooms.get("E").addItem(new Item("Rope", "Strong climbing rope", 0, 0, 0));
        rooms.get("G").addItem(new Item("Mine Key", "The key to the locked exit", 0, 0, 0));
    }

    // Create room connections - Demonstrates Map<String, List<String>>
    private void createConnections() {
        roomConnections.put("A", Arrays.asList("B", "D"));
        roomConnections.put("B", Arrays.asList("A", "C", "E"));
        roomConnections.put("C", Arrays.asList("B", "F"));
        roomConnections.put("D", Arrays.asList("A", "E", "G"));
        roomConnections.put("E", Arrays.asList("B", "D", "F", "H"));
        roomConnections.put("F", Arrays.asList("C", "E"));
        roomConnections.put("G", Arrays.asList("D", "H", "X"));
        roomConnections.put("H", Arrays.asList("E", "G", "X"));
        roomConnections.put("X", Arrays.asList("G", "H"));
    }

    // Create puzzle questions
    private void createPuzzles() {
        puzzles.add(new Puzzle("5 + 7 × 2 = ?", "19", "Path opens"));
        puzzles.add(new Puzzle("2, 4, 8, 16, ?", "32", "Secret revealed"));
        puzzles.add(new Puzzle("10 - 3 + 5 = ?", "12", "Exit found"));
    }

    // Initialize the mine map with room positions
    private void initializeMap() {
        // Map layout:
        // A B C
        // D E F
        // G H X
        
        mineMap[0][0] = "A";
        mineMap[0][1] = "B";
        mineMap[0][2] = "C";
        mineMap[1][0] = "D";
        mineMap[1][1] = "E";
        mineMap[1][2] = "F";
        mineMap[2][0] = "G";
        mineMap[2][1] = "H";
        mineMap[2][2] = "X";
    }

    // Main game loop
    public void start() {
        showIntro();
        
        while (gameRunning && !player.hasEscaped()) {
            showMainMenu();
            
            if (!player.canContinue()) {
                endGame("RESOURCE_FAILURE");
                break;
            }
        }
        
        if (player.hasEscaped()) {
            showFinalReport();
        }
    }

    // Display introduction
    private void showIntro() {
        clearScreen();
        System.out.println("========================================");
        System.out.println("        MINE ESCAPE: THE LAST SHIFT");
        System.out.println("========================================");
        System.out.println();
        System.out.println("A sudden ROCKFALL has collapsed the main exit!");
        System.out.println("You are trapped " + (100 - player.getBattery()) + " meters underground...");
        System.out.println();
        System.out.println("Explore the mine, find the Mine Key,");
        System.out.println("solve puzzles, and reach the Emergency Exit!");
        System.out.println();
        System.out.println("========================================");
        System.out.println("Press ENTER to begin...");
        scanner.nextLine();
        clearScreen();
    }

    // Display main menu - Demonstrates Switch statement
    private void showMainMenu() {
        System.out.println("========================================");
        System.out.println("          MAIN MENU");
        System.out.println("========================================");
        System.out.println();
        System.out.println("Player: " + player.getName());
        System.out.println("Health  : " + player.getHealth());
        System.out.println("Battery : " + player.getBattery());
        System.out.println("Water   : " + player.getWater());
        System.out.println();
        System.out.println("1. Explore Mine");
        System.out.println("2. Check Map");
        System.out.println("3. Check Inventory");
        System.out.println("4. View Status");
        System.out.println("5. Use Item");
        System.out.println("6. Rest");
        System.out.println("7. Exit Game");
        System.out.println();
        System.out.print("Enter your choice (1-7): ");

        try {
            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear buffer

            // Demonstrates Switch statement
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
                    pressEnter();
            }
        } catch (InputMismatchException e) {
            // Exception Handling for invalid input
            System.out.println("❌ Invalid input! Please enter a number (1-7).");
            scanner.nextLine();
            pressEnter();
        }

        clearScreen();
    }

    // Exploration logic
    private void exploreMine() {
        String currentRoom = player.getCurrentLocation();
        Room room = rooms.get(currentRoom);

        System.out.println("========================================");
        System.out.println("  EXPLORING: " + room.getRoomName().toUpperCase());
        System.out.println("========================================");
        System.out.println();
        System.out.println(room.getDescription());
        System.out.println();

        // Check for hazards
        if (!room.getHazard().equals("None")) {
            handleHazard(room.getHazard());
        }

        // Check for items
        if (!room.getItems().isEmpty()) {
            System.out.println("You found items!");
            for (int i = 0; i < room.getItems().size(); i++) {
                System.out.println((i + 1) + ". " + room.getItems().get(i).getName());
            }
            System.out.println();

            System.out.print("Collect items? (y/n): ");
            String answer = scanner.nextLine().trim().toLowerCase();
            
            if (answer.equals("y")) {
                for (Item item : new ArrayList<>(room.getItems())) {
                    player.addToInventory(item);
                    if (item.getName().equals("Mine Key")) {
                        player.setHasMineKey(true);
                    }
                    System.out.println("✓ Collected: " + item.getName());
                    room.removeItem(item);
                    player.addScore(25);
                }
            }
        }

        // Check for puzzle
        if (!room.getPuzzle().isEmpty()) {
            solvePuzzle(room);
        }

        // Mark room as visited
        if (!visitedRooms.contains(currentRoom)) {
            visitedRooms.add(currentRoom);
            exploredRoomsCount++;
            player.addScore(50);
        }

        // Use battery for exploration
        player.useBattery(5);

        // Show available paths
        showAvailablePaths();
        pressEnter();
    }

    // Handle room hazards
    private void handleHazard(String hazard) {
        // Demonstrates Strings and conditional statements
        System.out.println("⚠️  WARNING! Hazard detected: " + hazard);
        System.out.println();

        switch (hazard) {
            case "Darkness":
                if (player.hasItem("Torch")) {
                    System.out.println("You use your Torch to navigate safely.");
                    player.useBattery(3);
                } else {
                    System.out.println("The darkness is overwhelming!");
                    System.out.println("You stumble and injure yourself.");
                    player.takeDamage(15);
                }
                break;

            case "Slippery Floor":
                System.out.println("The floor is wet and slippery!");
                if (player.hasItem("Rope")) {
                    System.out.println("You use your Rope to navigate safely.");
                } else {
                    System.out.println("You slip and fall!");
                    player.takeDamage(10);
                }
                break;

            case "Toxic Gas":
                System.out.println("Toxic gas detected in this area!");
                System.out.println("You take damage from inhaling the gas.");
                player.takeDamage(20);
                player.useBattery(5);
                break;

            case "Gas Leak":
                System.out.println("A dangerous gas leak!");
                player.takeDamage(20);
                player.useBattery(5);
                break;

            case "Weak Structure":
                System.out.println("The tunnel structure is unstable!");
                if (player.hasItem("Pickaxe")) {
                    System.out.println("You use your Pickaxe to reinforce the area.");
                } else {
                    System.out.println("A small rockfall hits you!");
                    player.takeDamage(15);
                }
                break;

            default:
                break;
        }

        System.out.println("Health: " + player.getHealth() + " | Battery: " + player.getBattery());
        System.out.println();
    }

    // Solve puzzle logic - Demonstrates Strings and conditionals
    private void solvePuzzle(Room room) {
        System.out.println("🧩 A puzzle blocks your path!");
        System.out.println();

        for (Puzzle puzzle : puzzles) {
            if (puzzle.getQuestion().contains(room.getPuzzle()) && !puzzle.isSolved()) {
                System.out.println("Question: " + puzzle.getQuestion());
                System.out.print("Your answer: ");

                String playerAnswer = scanner.nextLine();

                // Demonstrates String method: equalsIgnoreCase()
                if (puzzle.checkAnswer(playerAnswer)) {
                    System.out.println();
                    System.out.println("✓ Correct! " + puzzle.getReward());
                    puzzle.setSolved(true);
                    player.incrementPuzzlesSolved();
                    player.addScore(100);
                } else {
                    System.out.println();
                    System.out.println("✗ Wrong answer! The path remains blocked.");
                    player.takeDamage(5);
                }
                System.out.println();
                break;
            }
        }
    }

    // Show available paths from current room
    private void showAvailablePaths() {
        String currentRoom = player.getCurrentLocation();
        System.out.println();
        System.out.println("========================================");
        System.out.println("Available paths from " + rooms.get(currentRoom).getRoomName() + ":");
        System.out.println("========================================");

        List<String> connectedRooms = roomConnections.get(currentRoom);
        
        if (connectedRooms != null) {
            for (int i = 0; i < connectedRooms.size(); i++) {
                String roomId = connectedRooms.get(i);
                Room room = rooms.get(roomId);
                String status = visitedRooms.contains(roomId) ? "[VISITED]" : "[NEW]";
                System.out.println((i + 1) + ". " + room.getRoomName() + " " + status);
            }
        }

        System.out.println();
        System.out.print("Choose destination (or 0 to cancel): ");

        try {
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 0) {
                return;
            }

            if (choice > 0 && choice <= connectedRooms.size()) {
                String nextRoom = connectedRooms.get(choice - 1);
                
                // Check if it's the locked exit
                if (nextRoom.equals("X") && !player.hasMineKey()) {
                    System.out.println();
                    System.out.println("========================================");
                    System.out.println("🔒 The exit is LOCKED!");
                    System.out.println("You need the Mine Key to exit.");
                    System.out.println("========================================");
                    pressEnter();
                    return;
                }

                player.setCurrentLocation(nextRoom);
                System.out.println("You move to: " + rooms.get(nextRoom).getRoomName());
                
                // Check if player reached exit
                if (nextRoom.equals("X")) {
                    player.setEscaped(true);
                    endingType = "SUCCESSFUL_ESCAPE";
                }
            } else {
                System.out.println("Invalid choice.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input!");
            scanner.nextLine();
        }
    }

    // Display mine map - Demonstrates 2D Array and Nested Loops
    private void displayMineMap() {
        System.out.println("========================================");
        System.out.println("          MINE MAP");
        System.out.println("========================================");
        System.out.println();

        // Nested loops to display 2D array
        for (int i = 0; i < mineMap.length; i++) {
            for (int j = 0; j < mineMap[i].length; j++) {
                String roomId = mineMap[i][j];
                
                if (roomId.equals(player.getCurrentLocation())) {
                    // Current location marked with @
                    System.out.print("[ @ ] ");
                } else if (visitedRooms.contains(roomId)) {
                    // Visited rooms shown
                    System.out.print("[ " + roomId + " ] ");
                } else {
                    // Unknown rooms marked with ?
                    System.out.print("[ ? ] ");
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Legend: @ = You | ? = Unknown | Letter = Visited");
        System.out.println("Rooms Explored: " + exploredRoomsCount + "/9");
        System.out.println();
        pressEnter();
    }

    // Display inventory
    private void displayInventory() {
        System.out.println("========================================");
        System.out.println("          INVENTORY");
        System.out.println("========================================");
        System.out.println();

        if (player.getInventory().isEmpty()) {
            System.out.println("Your inventory is empty.");
        } else {
            System.out.println("Items in your backpack:");
            for (Item item : player.getInventory()) {
                System.out.println("• " + item.getName() + " - " + item.getDescription());
            }
        }

        System.out.println();
        pressEnter();
    }

    // Display player status
    private void displayStatus() {
        System.out.println("========================================");
        System.out.println("          SURVIVAL STATUS");
        System.out.println("========================================");
        System.out.println();
        System.out.println("Name          : " + player.getName());
        System.out.println("Location      : " + rooms.get(player.getCurrentLocation()).getRoomName());
        System.out.println("Health        : " + player.getHealth() + "/100");
        System.out.println("Battery       : " + player.getBattery() + "/100");
        System.out.println("Water         : " + player.getWater() + "/5");
        System.out.println("Items         : " + player.getInventory().size());
        System.out.println("Rooms Explored: " + exploredRoomsCount);
        System.out.println("Puzzles Solved: " + player.getPuzzlesSolved());
        System.out.println("Current Score : " + player.getScore());
        System.out.println("Mine Key      : " + (player.hasMineKey() ? "YES ✓" : "NO ✗"));
        System.out.println();
        pressEnter();
    }

    // Use item from inventory
    private void useItem() {
        if (player.getInventory().isEmpty()) {
            System.out.println("You have no items to use.");
            pressEnter();
            return;
        }

        System.out.println("========================================");
        System.out.println("          USE ITEM");
        System.out.println("========================================");
        System.out.println();

        List<Item> inventory = player.getInventory();
        for (int i = 0; i < inventory.size(); i++) {
            System.out.println((i + 1) + ". " + inventory.get(i).getName());
        }

        System.out.print("\nChoose item (0 to cancel): ");

        try {
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 0) {
                return;
            }

            if (choice > 0 && choice <= inventory.size()) {
                Item item = inventory.get(choice - 1);

                // Apply item effects
                if (item.getName().equals("First Aid Kit")) {
                    player.heal(item.getHealthRestore());
                    System.out.println("✓ Used " + item.getName() + ". Health restored!");
                    inventory.remove(item);
                } else if (item.getName().equals("Water Bottle")) {
                    player.addWater(item.getWaterRestore());
                    System.out.println("✓ Drank " + item.getName() + ". Water level restored!");
                    inventory.remove(item);
                } else if (item.getName().equals("Torch")) {
                    player.restoreBattery(item.getBatteryRestore());
                    System.out.println("✓ Charged with " + item.getName() + ". Battery restored!");
                } else {
                    System.out.println("You cannot use " + item.getName() + " right now.");
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input!");
            scanner.nextLine();
        }

        System.out.println();
        pressEnter();
    }

    // Rest action
    private void rest() {
        System.out.println("========================================");
        System.out.println("          RESTING");
        System.out.println("========================================");
        System.out.println();
        System.out.println("You find a safe spot and rest for a while...");
        System.out.println();

        player.heal(10);
        player.drinkWater();
        player.restoreBattery(10);

        System.out.println("Health: " + player.getHealth());
        System.out.println("Battery: " + player.getBattery());
        System.out.println("Water: " + player.getWater());
        System.out.println();
        pressEnter();
    }

    // End game logic
    private void endGame(String reason) {
        gameRunning = false;

        System.out.println();
        System.out.println("========================================");

        // Demonstrates conditional statements and String comparisons
        if (reason.equals("SUCCESSFUL_ESCAPE")) {
            System.out.println("🎉 CONGRATULATIONS! YOU ESCAPED! 🎉");
            System.out.println("========================================");
            System.out.println();
            System.out.println("You successfully found the emergency exit!");
            System.out.println("The Mine Key unlocked your freedom.");
            System.out.println("You have survived 'The Last Shift'!");
        } else if (reason.equals("HEALTH_FAILURE")) {
            System.out.println("💀 GAME OVER - HEALTH FAILURE 💀");
            System.out.println("========================================");
            System.out.println();
            System.out.println("Your health reached critical levels.");
            System.out.println("You collapsed in the darkness...");
            endingType = "HEALTH_FAILURE";
        } else if (reason.equals("RESOURCE_FAILURE")) {
            System.out.println("💀 GAME OVER - RESOURCE FAILURE 💀");
            System.out.println("========================================");
            System.out.println();
            System.out.println("Your resources were exhausted.");
            System.out.println("You couldn't continue deeper into the mine...");
            endingType = "RESOURCE_FAILURE";
        } else if (reason.equals("EXIT")) {
            System.out.println("GAME EXITED");
            System.out.println("========================================");
            System.out.println();
            System.out.println("You chose to abandon the escape...");
        }

        System.out.println();
    }

    // Final report - Demonstrates loops for calculating score
    private void showFinalReport() {
        System.out.println();
        System.out.println("========================================");
        System.out.println("       SURVIVAL REPORT");
        System.out.println("========================================");
        System.out.println();
        System.out.println("Rooms Explored   : " + exploredRoomsCount);
        System.out.println("Puzzles Solved   : " + player.getPuzzlesSolved());
        System.out.println("Items Found      : " + player.getInventory().size());
        System.out.println("Health Remaining : " + player.getHealth());
        System.out.println("Battery Remaining: " + player.getBattery());
        System.out.println("Water Remaining  : " + player.getWater());
        System.out.println();

        // Add bonus points
        if (player.getHealth() > 50) {
            player.addScore(100);
            System.out.println("+ 100 (Health Bonus)");
        }
        if (player.getBattery() > 30) {
            player.addScore(50);
            System.out.println("+ 50 (Battery Bonus)");
        }
        if (exploredRoomsCount >= 7) {
            player.addScore(150);
            System.out.println("+ 150 (Explorer Bonus)");
        }

        System.out.println();
        System.out.println("TOTAL SCORE      : " + player.getScore());
        System.out.println();
        System.out.println("========================================");
        System.out.println();
    }

    // Utility methods
    private void pressEnter() {
        System.out.println("Press ENTER to continue...");
        scanner.nextLine();
        clearScreen();
    }

    private void clearScreen() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }
}
