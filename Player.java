import java.util.ArrayList;
import java.util.List;

/**
 * Player class represents the player in the game
 * Demonstrates: OOP (encapsulation), Strings, List (collection), constructors
 */
public class Player {
    private String name;
    private int health;
    private int battery;
    private int water;
    private String currentLocation;
    private List<Item> inventory;
    private boolean escaped;
    private int score;
    private int puzzlesSolved;
    private boolean hasMineKey;

    // Constructor
    public Player(String name) {
        this.name = name;
        this.health = 100;
        this.battery = 80;
        this.water = 3;
        this.currentLocation = "A";
        this.inventory = new ArrayList<>();
        this.escaped = false;
        this.score = 0;
        this.puzzlesSolved = 0;
        this.hasMineKey = false;
    }

    // Getters with Encapsulation
    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getBattery() {
        return battery;
    }

    public int getWater() {
        return water;
    }

    public String getCurrentLocation() {
        return currentLocation;
    }

    public List<Item> getInventory() {
        return inventory;
    }

    public boolean hasEscaped() {
        return escaped;
    }

    public int getScore() {
        return score;
    }

    public int getPuzzlesSolved() {
        return puzzlesSolved;
    }

    public boolean hasMineKey() {
        return hasMineKey;
    }

    // Setters for key properties
    public void setCurrentLocation(String location) {
        this.currentLocation = location;
    }

    public void setEscaped(boolean escaped) {
        this.escaped = escaped;
    }

    public void setHasMineKey(boolean hasMineKey) {
        this.hasMineKey = hasMineKey;
    }

    // Resource management methods
    public void takeDamage(int damage) {
        this.health -= damage;
        if (this.health < 0) {
            this.health = 0;
        }
    }

    public void heal(int amount) {
        this.health += amount;
        if (this.health > 100) {
            this.health = 100;
        }
    }

    public void useBattery(int amount) {
        this.battery -= amount;
        if (this.battery < 0) {
            this.battery = 0;
        }
    }

    public void restoreBattery(int amount) {
        this.battery += amount;
        if (this.battery > 100) {
            this.battery = 100;
        }
    }

    public void drinkWater() {
        if (this.water > 0) {
            this.water--;
        }
    }

    public void addWater(int amount) {
        this.water += amount;
        if (this.water > 5) {
            this.water = 5;
        }
    }

    // Inventory management
    public void addToInventory(Item item) {
        inventory.add(item);
    }

    public void removeFromInventory(Item item) {
        inventory.remove(item);
    }

    // Utility method to check if player has specific item
    public boolean hasItem(String itemName) {
        for (Item item : inventory) {
            if (item.getName().equalsIgnoreCase(itemName)) {
                return true;
            }
        }
        return false;
    }

    // Score management
    public void addScore(int points) {
        this.score += points;
    }

    public void incrementPuzzlesSolved() {
        this.puzzlesSolved++;
    }

    // Check if player is alive
    public boolean isAlive() {
        return health > 0;
    }

    // Check if player can continue
    public boolean canContinue() {
        return health > 0 && battery > 0;
    }

    @Override
    public String toString() {
        return "Player: " + name + " | Health: " + health + 
               " | Battery: " + battery + " | Water: " + water;
    }
}
