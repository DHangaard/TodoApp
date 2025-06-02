public class Item {

    // Attributes
    private String description;
    private boolean isDone;


    // Constructor
    Item(String description, boolean isDone){
        this.description = description;
        this.isDone = isDone;
    }


    // Methods
    public void markAsDone(){
        this.isDone = true;
    }


    // Formats from boolean to String done / not done
    private String formatStatus(){
        if (isDone){
            return "done";
        } else {
            return "not done";
        }
    }


    @Override
    public String toString(){
        String status = formatStatus();
        String message = this.description + ", " + status;
        return message;
    }

    // TODO use this when writing file
    public String toCSVString(){
        return this.description + ", " + this.isDone;
    }

}
