import java.util.*;
class SalesPerson {
    private String salesPersonName;
    private String salesPersonID;

    private List<SalesInvoice> invoices = new ArrayList<>(); // 0..*

    // getters and setters

    public String getSalesPersonName() { 
        return salesPersonName; 
    }

    public void setSalesPersonName(String salesPersonName) { 
        this.salesPersonName = salesPersonName; 
    }

    public String getSalesPersonID() { 
        return salesPersonID; 
    }

    public void setSalesPersonID(String salesPersonID) { 
        this.salesPersonID = salesPersonID; 
    }
}