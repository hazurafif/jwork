
/**
 * Write a description of class EwalletPayment here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EwalletPayment extends Invoice
{
    private static final PaymentType PAYMENT_TYPE = PaymentType.EwalletPayment;
    private Bonus bonus;
    
    public EwalletPayment(int id, Job job, String date, Jobseeker jobseeker, InvoiceStatus invoiceStatus){
        super(id, job, date, jobseeker, invoiceStatus);
    }
    
    public EwalletPayment(int id, Job job, String date, Jobseeker jobseeker, InvoiceStatus invoiceStatus, Bonus bonus){
        super(id, job, date, jobseeker, invoiceStatus);
        this.setBonus(bonus);
    }
    
    @Override
    public PaymentType getPaymentType(){
        return PAYMENT_TYPE;
    }
    
    public Bonus getBonus(){
        return bonus;
    }
    
    public void setBonus(Bonus bonus){
        this.bonus=bonus;
    }
    
    @Override
    public void setTotalFee(){
        if(bonus!=null&&(bonus.getActive()==true)&&(totalFee > bonus.getMinTotalFee())){
            super.totalFee = getJob().getFee() + bonus.getExtraFee();
        }
        else{
            super.totalFee = getJob().getFee();
        }
    }
    
    @Override
    public void printData(){
        System.out.println("===================== INVOICE =====================");
        System.out.println("ID: " + getId());
        System.out.println("Job: " + getJob().getName());
        System.out.println("Date: " + getDate());
        System.out.println("Job Seeker: " + getJobseeker().getName());
        if (bonus != null && (bonus.getActive() == true) && getJob().getFee() > bonus.getMinTotalFee()) {
            System.out.println("Referral Code: " + bonus.getReferralCode());
        }
        setTotalFee();
        System.out.println("Total Fee: " + getTotalFee());
        System.out.println("Status: " + getInvoiceStatus());
        System.out.println("Payment Type: " + PAYMENT_TYPE);
    }
}
