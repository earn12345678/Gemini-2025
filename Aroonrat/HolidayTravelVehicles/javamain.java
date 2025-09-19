public class javamain {
    public static void main(String[] args) {
        Vehicle car = new Vehicle();
        car.setSerialNumber("V12345");
        car.setVehicleName("Civic");
        car.setModel("EX");
        car.setYear(2023);
        car.setManufacturer("Honda");
        car.setBaseCost(850000.0);

        System.out.println("=== Vehicle Information ===");
        System.out.println("Serial Number: " + car.getSerialNumber());
        System.out.println("Vehicle Name : " + car.getVehicleName());
        System.out.println("Model        : " + car.getModel());
        System.out.println("Year         : " + car.getYear());
        System.out.println("Manufacturer : " + car.getManufacturer());
        System.out.println("Base Cost    : " + car.getBaseCost());
    }
}
