public class Email extends Document {
    // Declare sender, recipient, title
    private String sender, recipient, title;
    // Default constructor to initialize texet
    public Email(){
        sender = "";
        recipient = "";
        title = "";
    }
    // Constructor to assign all variables
    public Email(String text, String sender, String recipient, String title){
        super(text);
        this.sender = sender;
        this.recipient = recipient;
        this.title = title;
    }
    // Getter-setter methods
    public void setSender(String sender){
        this.sender = sender;
    }
    public String getSender(){
        return sender;
    }
    public void setRecipient(String recipient){
        this.recipient = recipient;
    }
    public String getRecipient(){
        return recipient;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return title;
    }
    // Override toString() from Document
    @Override
    public String toString(){
        return "Sender: " + sender
        + "\nRecipient: " + recipient
        + "\nTitle: " + title
        + "\nmessage: " + super.toString();
    }
}
