// Main object inheritence
public class Document{ 
    private String text;
    // Default constructor to initialize text
    public Document(){
        text = "";
    }
    // Constructor to assign text variable
    public Document(String text){
        this.text = text;
    }
    // Return text 
    public String toString(){
        return text;
    }
}