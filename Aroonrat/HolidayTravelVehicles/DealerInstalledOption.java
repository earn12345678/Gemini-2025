import java.util.*;
class DealerInstalledOption {
    private String optionName;
    private String optionID;
    private String description;
    private double price;

    private List<Vehicle> vehicles = new ArrayList<>(); // 0..*
    private List<SalesInvoice> invoices = new ArrayList<>(); // 0..*

    // getters and setters

    public String getOptionName() { 
        return optionName; 
    }

    public void setOptionName(String optionName) { 
        this.optionName = optionName; 
    }

    public String getOptionID() {
        return optionID; 
    }

    public void setOptionID(String optionID) { 
        this.optionID = optionID; 
    }

    public String getDescription() { 
        return description; 
    }
    
    public void setDescription(String description) { 
        this.description = description; 
    }

    public double getPrice() { 
        return price; 
    }

    public void setPrice(double price) { 
        this.price = price; 
    }
}
