/**
 * Write a description of class EwalletPayment here.
 *
 * @author Hanif Zufar Rafif
 * @version 01/04/2021
 */
public class EwalletPayment extends Invoice
{
    // instance variables
    private static final PaymentType PAYMENT_TYPE = PaymentType.EwalletPayment;
    private Bonus bonus;
    
    /**
     * Constructor for objects of class EwalletPayment
     *
     * @param  id - merupakan nilai inputan untuk variable id
     * @param job - merupakan nilai inputan untuk variable job
     * @param date - merupakan nilai inputan untuk variable date
     * @param jobseeker - merupakan nilai inputan untuk variable jobseeker
     * @param invoiceStatus - merupakan nilai inputan untuk variable status
     */
    public EwalletPayment(int id, Job job, String date, Jobseeker jobseeker, InvoiceStatus invoiceStatus){
        super(id, job, date, jobseeker, invoiceStatus);
    }
    
    /**
     * Constructor for objects of class EwalletPayment
     * 
     * @param id - merupakan nilai inputan untuk variable id
     * @param job - merupakan nilai inputan untuk variable job
     * @param date - merupakan nilai inputan untuk variable date (tanggal)
     * @param jobseeker - merupakan nilai inputan untuk variable jobseeker
     * @param invoiceStatus - merupakan nilai inputan untuk variable status
     * @param bonus merupakan - nilai inputan untuk variable bonus
     */
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
