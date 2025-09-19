
class TradeInVehicle {
    private String serialNumber;
    private String vehicleName;
    private String model;
    private int year;
    private String manufacturer;
    private double tradeInAllowance;

    // getters and setters

    public String getSerialNumber() { 
        return serialNumber; 
    }

    public void setSerialNumber(String serialNumber) { 
        this.serialNumber = serialNumber; 
    }

    public String getVehicleName() { 
        return vehicleName; 
    }

    public void setVehicleName(String vehicleName) { 
        this.vehicleName = vehicleName; 
    }

    public String getModel() { 
        return model; 
    }

    public void setModel(String model) { 
        this.model = model; 
    }

    public int getYear() { 
        return year; 
    }

    public void setYear(int year) { 
        this.year = year; 
    }

    public String getManufacturer() { 
        return manufacturer; 
    }

    public void setManufacturer(String manufacturer) { 
        this.manufacturer = manufacturer; 
    }

    public double getTradeInAllowance() { 
        return tradeInAllowance; 
    }

    public void setTradeInAllowance(double tradeInAllowance) { 
        this.tradeInAllowance = tradeInAllowance; 
    }
}