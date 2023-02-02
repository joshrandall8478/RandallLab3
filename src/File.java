public class File extends Document {
    private String pathname;
    // Initialize pathname
    public File(){
        pathname = "";
    }
    // Assign pathname 
    public File(String text, String pathname){
        super(text);
        this.pathname = pathname;
    }
    // Getter setter methods
    public String getPathName(){
        return pathname;
    }
    public void setPathName(String pathname){
        this.pathname = pathname;
    }
    // Override toString from class Document
    @Override
    public String toString(){
        return "Pathname: " + pathname
        + "\nFile contents: " + super.toString();
    }
}
