package pl.sda.pol141.program;

public class Garage {
    public static void main(String[] args) {
        Garage garage = new Garage();

        // Dodaj kilku klientów
        Customer customer1 = new Customer("Jan", "Kowalski", "555-123-456");
        Customer customer2 = new Customer("Anna", "Nowak", "555-234-567");
        garage.addCustomer(customer1);
        garage.addCustomer(customer2);

        // Dodaj kilka samochodów dla klientów
        Car car1 = new Car("ABC123", "12345678901234567", "Ford", "Focus", "Sedan", 2.4);
        Car car2 = new Car("XYZ789", "89012345678901234", "Toyota", "Corolla", "Sedan", 1.6);
        customer1.addCar(car1);
        customer2.addCar(car2);

        // Dodaj kilka napraw dla samochodów
        Car.Repair repair1 = new Car.Repair("Wymiana oleju", 100.0);
        Car.Repair repair2 = new Car.Repair("Wymiana klocków hamulcowych", 200.0);
        Car.Repair repair3 = new Car.Repair("Wymiana tarcz hamulcowych", 300.0);
        Car.Repair repair4 = new Car.Repair("Wymiana paska klinowego", 150.0);
        car1.addRepair(repair1);
        car1.addRepair(repair2);
        car1.addRepair(repair3);
        car2.addRepair(repair4);

        // Dodaj kilka części dla napraw
        Part part1 = new Part("Olej silnikowy", "54",50.0);
        Part part2 = new Part("Klocki hamulcowe", "123h",100.0);
        Part part3 = new Part("Tarcze hamulcowe", "ate1070",250.0);
        Part part4 = new Part("Pasek klinowy", "6pk1073",75.0);
        repair1.addPart(part1);
        repair2.addPart(part2);
        repair3.addPart(part3);
        repair4.addPart(part4);

        // Wyświetl informacje o samochodzie klienta
        CustomerInterface customerInterface = new CustomerInterface(garage);
        customerInterface.showCustomerInfo(customer1);
    }

    private void addCustomer(Customer customer1) {
    }
}