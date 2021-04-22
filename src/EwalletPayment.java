import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;

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
    public EwalletPayment(int id, Job job, Jobseeker jobseeker, InvoiceStatus invoiceStatus){
        super(id, job, jobseeker, invoiceStatus);
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
    public EwalletPayment(int id, Job job,Jobseeker jobseeker, Bonus bonus, InvoiceStatus invoiceStatus){
        super(id, job, jobseeker, invoiceStatus);
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
    public String toString(){
        SimpleDateFormat formattedDate = new SimpleDateFormat("dd-MMMM-yyyy");
        String date = formattedDate.format(getDate().getTime());
        if ((bonus != null) && (bonus.getActive() == true) && (getJob().getFee() > bonus.getMinTotalFee()))
        {
            return ("Id = " + getId() + "\nJob = " + getJob().getName() + "\nDate = " + date + "\nJob Seeker = "
                + getJobseeker().getName() + "Referral Code = " + bonus.getReferralCode() + "\nTotal Fee = " + getTotalFee() + "\nStatus = " + getInvoiceStatus() + "\nPayment = " + PAYMENT_TYPE);
        }else
        {
            return ("Id = " + getId() + "\nJob = " + getJob().getName() + "\nDate = " + date + "\nJob Seeker = "
                + getJobseeker().getName()+ "\nTotal Fee = " + getTotalFee() + "\nStatus = " + getInvoiceStatus() + "\nPayment = " + PAYMENT_TYPE);
        }
    }
}
