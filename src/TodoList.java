import java.util.ArrayList;

public class TodoList {

    // Attributes
    private ArrayList<Item> items;


    // Constructor
    TodoList(ArrayList<Item> items){
        this.items = items;
    }


    // Methods
    void displayItems(){
        int counter = 1;

        for (Item i : items){
            // Add counter to display as numbered list
            String prefix = counter + ". ";
            System.out.println(prefix + i);
            counter ++;
        }
    }

    void addItem(String description, boolean status) {
        Item item = new Item(description, status);
        items.add(item);
    }
}
