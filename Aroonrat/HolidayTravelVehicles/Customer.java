import java.util.*;
class Customer {
    private String customerName;
    private String customerID;
    private String address;
    private String phoneNumber;
    private String email;

    private List<Vehicle> vehicles = new ArrayList<>(); // 0..*
    private List<SalesInvoice> invoices = new ArrayList<>(); // 0..*

    // getters and setters

    public String getCustomerName() { 
        return customerName; 
    }

    public void setCustomerName(String customerName) { 
        this.customerName = customerName; }

    public String getCustomerID() { 
        return customerID; 
    }

    public void setCustomerID(String customerID) { 
        this.customerID = customerID; 
    }

    public String getAddress() { 
        return address; 
    }

    public void setAddress(String address) { 
        this.address = address; 
    }

    public String getPhoneNumber() { 
        return phoneNumber; 
    }

    public void setPhoneNumber(String phoneNumber) { 
        this.phoneNumber = phoneNumber; 
    }

    public String getEmail() { 
        return email; 
    }

    public void setEmail(String email) { 
        this.email = email; 
    }
}
