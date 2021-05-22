package hanifzufarrafif.jwork.controller;

import hanifzufarrafif.jwork.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RequestMapping("/invoice")
@RestController

public class InvoiceController {

    @RequestMapping(" ")
    public ArrayList<Invoice> getAllInvoice() {
        return DatabaseInvoice.getInvoiceDatabase();
    }

    @RequestMapping("/{id}")
    public Invoice getInvoiceById(@PathVariable int id) {
        Invoice invoice = null;
        try{
            invoice = DatabaseInvoice.getInvoiceById(id);
        } catch (InvoiceNotFoundException e) {
            e.getMessage();
            return null;
        }
        return invoice;
    }

    @RequestMapping("/Jobseeker/{JobseekerId}")
    public ArrayList<Invoice> getInvoiceByJobseeker(@PathVariable int jobseekerid) {
        ArrayList<Invoice> invoice = null;
        invoice = DatabaseInvoice.getInvoiceByJobseeker(jobseekerid);

        return invoice;
    }

    @RequestMapping(value = "invoiceStatus/{id}", method = RequestMethod.PUT)
    public Invoice changeInvoiceStatus(@PathVariable int id,
                                       @RequestParam(value = "status") InvoiceStatus status){
        Invoice invoice = null;
        try {
            invoice = DatabaseInvoice.getInvoiceById(id);
            invoice.setInvoiceStatus(status);
            return invoice;
        } catch (InvoiceNotFoundException e) {
            e.getMessage();
            return null;
        }

    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public boolean removeInvoice(@PathVariable int id) {
        try {
            DatabaseInvoice.removeInvoice(id);
            return true;
        } catch (InvoiceNotFoundException e) {
            e.printStackTrace();
        }
        return false;
    }

    @RequestMapping(value = "/createBankPayment", method = RequestMethod.POST)
    public Invoice addBankPayment(
            @RequestParam(value="jobs") ArrayList<Job> jobs,
            @RequestParam(value="jobseeker") Jobseeker jobseeker,
            @RequestParam(value="adminFee") int adminFee
    ) throws OngoingInvoiceAlreadyExistsException {
        Invoice invoice = new BankPayment(DatabaseInvoice.getLastId() + 1, jobs, jobseeker, adminFee);
        try{
            DatabaseInvoice.addInvoice(invoice);
        }
        catch(OngoingInvoiceAlreadyExistsException e){
            e.getMessage();
            return null;
        }
        return invoice;
    }

    @RequestMapping(value = "/createEWalletPayment", method = RequestMethod.POST)
    public Invoice addEWalletPayment(
            @RequestParam(value="jobs") ArrayList<Job> jobs,
            @RequestParam(value="jobseeker") Jobseeker jobseeker,
            @RequestParam(value="adminFee") int adminFee
    ) throws OngoingInvoiceAlreadyExistsException {
        Invoice invoice = new BankPayment(DatabaseInvoice.getLastId() + 1, jobs, jobseeker, adminFee);
        try{
            DatabaseInvoice.addInvoice(invoice);
        }
        catch(OngoingInvoiceAlreadyExistsException e){
            e.getMessage();
            return null;
        }
        return invoice;
    }


}
