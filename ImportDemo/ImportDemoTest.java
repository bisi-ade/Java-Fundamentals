public class ImportDemoTest {
    public static void main(String[] args) {
        ImportDemo iD = new ImportDemo();                       // We are initiating a new ImportDemo Object
        String currentDate = iD.getCurrentDate();               // Calling the getCurrentDate() method on the object.
        System.out.println(currentDate);                        //Printing the currentDate string
    }
}