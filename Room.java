import java.util.ArrayList;
import java.util.List;

/**
 * Room class represents a location in the mine
 * Demonstrates: OOP (encapsulation, objects), Strings, List (collection)
 */
public class Room {
    private String roomId;
    private String roomName;
    private String description;
    private String hazard;
    private List<Item> items;
    private boolean visited;
    private boolean hasKey;
    private String puzzle;

    // Constructor
    public Room(String roomId, String roomName, String description, 
                String hazard, boolean hasKey, String puzzle) {
        this.roomId = roomId;
        this.roomName = roomName;
        this.description = description;
        this.hazard = hazard;
        this.items = new ArrayList<>();
        this.visited = false;
        this.hasKey = hasKey;
        this.puzzle = puzzle;
    }

    // Getters (Encapsulation)
    public String getRoomId() {
        return roomId;
    }

    public String getRoomName() {
        return roomName;
    }

    public String getDescription() {
        return description;
    }

    public String getHazard() {
        return hazard;
    }

    public List<Item> getItems() {
        return items;
    }

    public boolean isVisited() {
        return visited;
    }

    public boolean hasKey() {
        return hasKey;
    }

    public String getPuzzle() {
        return puzzle;
    }

    // Setters
    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    @Override
    public String toString() {
        return "[" + roomId + "] " + roomName;
    }
}
