import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        final String path = "data/todo.csv";

        ItemLoader itemLoader = new ItemLoader();
        ArrayList<Item> items = itemLoader.loadFile(path);

        TodoList todoList = new TodoList(items);

        todoList.displayItems();

        // Mark all items as 'done'
        items.get(1).markAsDone();
        items.get(2).markAsDone();
        System.out.println(); // Empty line

        todoList.displayItems();
    }
}
