package pl.sda.pol141.program;

import java.util.ArrayList;
import java.util.List;

public class CarRegistry {
    private List<Car> cars;

    public CarRegistry() {
        this.cars = new ArrayList<>();
    }

    public void addCar(Car car) {
        this.cars.add(car);
    }

    public List<Car> findCarsByRegistrationNumber(String registrationNumber) {
        List<Car> result = new ArrayList<>();
        for (Car car : cars) {
            if (car.getRegistrationNumber().equals(registrationNumber)) {
                result.add(car);
            }
        }
        return result;
    }

    public List<Car> findCarsByVin(String vin) {
        List<Car> result = new ArrayList<>();
        for (Car car : cars) {
            if (car.getVin().equals(vin)) {
                result.add(car);
            }
        }
        return result;
    }

    public List<Car> findCarsByBrand(String brand) {
        List<Car> result = new ArrayList<>();
        for (Car car : cars) {
            if (car.getBrand().equals(brand)) {
                result.add(car);
            }
        }
        return result;
    }

    public List<Car> findCarsByModel(String model) {
        List<Car> result = new ArrayList<>();
        for (Car car : cars) {
            if (car.getModel().equals(model)) {
                result.add(car);
            }
        }
        return result;
    }

    public List<Car> findCarsByEngineType(String engineType) {
        List<Car> result = new ArrayList<>();
        for (Car car : cars) {
            if (car.getEngineType().equals(engineType)) {
                result.add(car);
            }
        }
        return result;
    }

    public List<Car> findCarsByEngineCapacity(int engineCapacity) {
        List<Car> result = new ArrayList<>();
        for (Car car : cars) {
            if (car.getEngineCapacity() == engineCapacity) {
                result.add(car);
            }
        }
        return result;
    }


    public List<Car> findCarsByOwnerFirstName(String firstName) {
        List<Car> result = new ArrayList<>();
        for (Car car : cars) {
            if (car.getOwnerFirstName().equals(firstName)) {
                result.add(car);
            }
        }
        return result;
    }

    public List<Car> findCarsByOwnerLastName(String lastName) {
        List<Car> result = new ArrayList<>();
        for (Car car : cars) {
            if (car.getOwnerLastName().equals(lastName)) {
                result.add(car);
            }
        }
        return result;
    }

    public List<Car> findCarsByPhoneNumber(String phoneNumber) {
        List<Car> result = new ArrayList<>();
        for (Car car : cars) {
            if (car.getPhoneNumber().equals(phoneNumber)) {
                result.add(car);
            }
        }
        return result;
    }

    public String toString() {
        return "CarRegistry{" +
                "cars=" + cars +
                '}';
    }
}

