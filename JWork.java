import java.util.GregorianCalendar;

/**
 * Write a description of class Jwork here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class JWork
{
    // instance variables-replace the example below with your own
    public JWork(){
    }
    
    public static void main(String[] args) {
        Jobseeker jobseeker1 = new Jobseeker(1, "Zufar", "hanif.zufar@ui.ac.id", "HanifZufar", new GregorianCalendar(2000, 7, 22));
        Jobseeker jobseeker2 = new Jobseeker(2, "Zufar", "hanif.zufar@ui.ac.id", "Hanif123", 2000, 3, 28);
        Jobseeker jobseeker3 = new Jobseeker(3, "Zufar", "hanif.zufar@ui.ac.id", "Hanif123");
        System.out.println(jobseeker1.toString());
        System.out.println(jobseeker2.toString());
        System.out.println(jobseeker3.toString());
    }
        
}
