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
            // Add counter to display numbered list
            String prefix = counter + ". ";
            System.out.println(prefix + i);
            counter ++;
        }
    }
}
