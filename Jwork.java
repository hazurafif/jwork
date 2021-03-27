/**
 * Write a description of class Jwork here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class JWork
{
    public JWork(){
    }
    
    public static void main(String[] args) {
        Location location1 = new Location ("Jakarta", "Jakarta Pusat", "Dekat Mall");
        Recruiter recruiter1 = new Recruiter (1, "Hanif", "hanif.zufar@ui.ac.id", "085781726006", location1);
        Job job1 = new Job (1,"Junior Desainer",recruiter1,5000000,JobCategory.WebDeveloper);
        Jobseeker jobseeker1= new Jobseeker(99, "zufar", "zufar@gmail.com", "zufar", "27/3/2020");
        Invoice invoice1 = new Invoice(123, job1.getId(), "27/3/2020", job1.getFee(), jobseeker1, PaymentType.BankPayment, InvoiceStatus.OnGoing);
        invoice1.printData();
    }
}
