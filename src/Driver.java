/*
 * Project Description: Uses objects File and Email which are inheritant from the Document Class
 *  to sort data, and call on the data using the toString() method. Then, uses the contains() method
 * to find the objects that have the string "Java" contained
 * Name: Joshua Randall
 * Course: COSC 211, Winter 2023
 * Due date: 1-26-23
 */
public class Driver {
    public static void main(String[] args){
        printHeader();
        System.out.println();

        // Initialize object vairables
        Email email1 = new Email("The super keyword is crucial in Java", "Timothy", "Samantha",
        "The super keyword");
        Email email2 = new Email("Where do we fall? Where do we stand", "Josh", "Samuel",
         "Last minute philosphy");
        File file1 = new File("Java runs the open source world", "propoganda.txt");
        File file2 = new File("Java also is a decent language to code in", "propoganda2.txt");

        // Print out all object variables via toString() methods
        System.out.println(email1.toString());
        System.out.println();
        System.out.println(email2.toString());
        System.out.println();
        System.out.println(file1.toString());
        System.out.println();
        System.out.println(file2.toString());
        System.out.println();
        // Runs contains() to check for string "Java" in all four objects
        System.out.println("Which object contains Java?");
        if(contains(email1, "Java"))
        System.out.println("\temail1");
        if(contains(email2, "Java"))
        System.out.println("\temail2");
        if(contains(file1, "Java"))
        System.out.println("\tfile1");
        if(contains(file2, "Java"))
        System.out.println("\tfile2");
    }

    // From lab3.pdf
    public static boolean contains (Document doc, String target){
        if (doc.toString().indexOf (target, 0) >= 0)
            return true;
        return false;
}

    public static void printHeader(){
        System.out.println("Programmer:\t Joshua Randall"
				+ "\nCourse:\t\t COSC 211, Winter '23"
				+ "\nLab#:\t\t 3"
				+ "\nDue date:\t 2-2-2023");
    }
}
/*
 * Output:
Programmer:      Joshua Randall
Course:          COSC 211, Winter '23
Lab#:            3
Due date:        2-2-2023

Sender: Timothy
Recipient: Samantha
Title: The super keyword
message: The super keyword is crucial in Java

Sender: Josh
Recipient: Samuel
Title: Last minute philosphy
message: Where do we fall? Where do we stand

Pathname: propoganda.txt
File contents: Java runs the open source world

Pathname: propoganda2.txt
File contents: Java also is a decent language to code in

Which object contains Java?
        email1
        file1
        file2
 */