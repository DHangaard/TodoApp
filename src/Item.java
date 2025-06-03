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
        String status = this.isDone ? "done" : "not done";
        return status;
    }


    @Override
    public String toString(){
        String status = formatStatus();
        String message = this.description + ", " + status;
        return message;
    }


    public String toCSVString(){
        return this.description + ", " + this.isDone;
    }

    public boolean getIsDone() {
        return this.isDone;
    }

}
