import java.util.*;
class SalesInvoice {
    private String invoiceID;
    private Date invoiceDate;
    private double finalNegotiatedPrice;
    private double taxes;
    private double licenseFees;
    private String customerSignature;

    private Customer customer; // 1
    private SalesPerson salesPerson; // 1
    private List<DealerInstalledOption> options = new ArrayList<>(); // 0..*
    private List<Vehicle> vehicles = new ArrayList<>(); // 1..*

    // getters and setters

    public String getInvoiceID() { 
        return invoiceID; 
    }

    public void setInvoiceID(String invoiceID) { 
        this.invoiceID = invoiceID; 
    }

    public Date getInvoiceDate() { 
        return invoiceDate; 
    }

    public void setInvoiceDate(Date invoiceDate) { 
        this.invoiceDate = invoiceDate; 
    }

    public double getFinalNegotiatedPrice() { 
        return finalNegotiatedPrice; 
    }

    public void setFinalNegotiatedPrice(double finalNegotiatedPrice) { 
        this.finalNegotiatedPrice = finalNegotiatedPrice; 
    }

    public double getTaxes() { 
        return taxes; 
    }

    public void setTaxes(double taxes) { 
        this.taxes = taxes; 
    }

    public double getLicenseFees() { 
        return licenseFees; 
    }

    public void setLicenseFees(double licenseFees) { 
        this.licenseFees = licenseFees; 
    }

    public String getCustomerSignature() { 
        return customerSignature; 
    }

    public void setCustomerSignature(String customerSignature) { 
        this.customerSignature = customerSignature; 
    }
}