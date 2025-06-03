import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        final String path = "data/todo.csv";

        ItemLoader itemLoader = new ItemLoader();
        ArrayList<Item> items = itemLoader.loadFile(path);

        TodoList todoList = new TodoList(items);

        // Before running:
        // Set index 1 & 2 to false
        // Delete last index on .csv
        todoList.displayItems();

        // Mark items as 'done'
        items.get(1).markAsDone();
        items.get(2).markAsDone();

        // Create new item
        todoList.addItem("Aflever bøger til Tine", false);
        System.out.println(); // Empty line

        // Save changes to .csv
        itemLoader.saveFile(path, items);

        todoList.displayItems();
    }
}