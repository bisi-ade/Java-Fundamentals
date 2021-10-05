//importing the Date Class
import java.util.Date;
public class ImportDemo {
    public String getCurrentDate() {            //Create a Method getCurrentDate
        Date date = new Date();                 // Initialize a New Date
        return "Current date is: " + date;      // Return a string
    }
}