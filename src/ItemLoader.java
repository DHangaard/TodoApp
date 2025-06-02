import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ItemLoader {

    // Attributes

    // Constructor


    // Methods
    // TODO Create itemWriter/itemSaver and loader
    // TODO try catch around scanner
    public ArrayList<Item> loadFile(String path){

        ArrayList<Item> items = new ArrayList<>();
        File file = new File(path);

        try {
            Scanner scanner = new Scanner(file);
            scanner.nextLine(); // Skip header

            while (scanner.hasNext()){
                String line = scanner.nextLine();

                // Handle .csv data
                String description = csvToString(line);
                boolean status = csvToStatus(line);

                // Create instance of Item - add to list
                items.add(new Item(description, status));
            }

            scanner.close();

        } catch (FileNotFoundException e) {
            System.err.println("Error: " + e.getMessage()); // TODO Handle exception different
        }

        return items;
    }


    private String csvToString(String line){

        String[] values = line.split(",");
        String description = values[0];

        return description;
    }


    private boolean csvToStatus(String line){

        String[] values = line.split(",");
        String tmpStatus = values[1].trim();

        boolean status = Boolean.parseBoolean(tmpStatus);

        return status;
    }
}
