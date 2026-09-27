/**
 * Item class represents collectible items in the mine
 * Demonstrates: Strings, OOP (encapsulation), Objects
 */
public class Item {
    private String name;
    private String description;
    private int healthRestore;
    private int batteryRestore;
    private int waterRestore;
    private boolean isUsed;

    // Constructor
    public Item(String name, String description, 
                int healthRestore, int batteryRestore, int waterRestore) {
        this.name = name;
        this.description = description;
        this.healthRestore = healthRestore;
        this.batteryRestore = batteryRestore;
        this.waterRestore = waterRestore;
        this.isUsed = false;
    }

    // Getters (Encapsulation)
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getHealthRestore() {
        return healthRestore;
    }

    public int getBatteryRestore() {
        return batteryRestore;
    }

    public int getWaterRestore() {
        return waterRestore;
    }

    public boolean isUsed() {
        return isUsed;
    }

    public void setUsed(boolean used) {
        isUsed = used;
    }

    @Override
    public String toString() {
        return name + " - " + description;
    }
}
