package pl.sda.pol141.program;



    import java.util.List;
import java.util.Scanner;

    public class CustomerInterface {
        private Garage garage;
        private Scanner scanner;

        public CustomerInterface(Garage garage) {
            this.garage = garage;
            this.scanner = new Scanner(System.in);
        }

        public void showCustomerInfo(Customer customer) {
            List<Car> cars = customer.getCars();

            System.out.println("Samochody klienta " + customer.getFirstName() + " " + customer.getLastName() + ":");
            for (int i = 0; i < cars.size(); i++) {
                System.out.println((i + 1) + ". " + cars.get(i).toString());
            }

            int carIndex = getIntInput("Wybierz numer samochodu, dla którego chcesz wyświetlić informacje:");

            if (carIndex < 1 || carIndex > cars.size()) {
                System.out.println("Nieprawidłowy numer samochodu!");
                return;
            }

            Car car = cars.get(carIndex - 1);

            System.out.println("Prace wykonane dla samochodu " + car.getBrand() + " " + car.getModel() + " o numerze VIN " + car.getVin() + ":");
            List<Car.Repair> services = car.getRepairs();
            for (Car.Repair service : services) {
                System.out.println("- " + service.getDescription() + " - " + service.getCost() + " zł");
            }

            System.out.println("Części użyte do napraw dla samochodu " + car.getBrand() + " " + car.getModel() + " o numerze VIN " + car.getVin() + ":");
            List<Car.Part> parts = car.getParts();
            for (Car.Part part : parts) {
                System.out.println("- " + part.getName() + " - " + part.getCost() + " zł");
            }

            double totalCost = car.calculateTotalCost();
            System.out.println("Całkowity koszt napraw dla samochodu " + car.getBrand() + " " + car.getModel() + " o numerze VIN " + car.getVin() + " wynosi: " + totalCost + " zł.");
        }

        private int getIntInput(String message) {
            System.out.println(message);
            while (!scanner.hasNextInt()) {
                System.out.println("To nie jest liczba!");
                scanner.nextLine();
            }
            return scanner.nextInt();
        }
    }

