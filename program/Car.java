package pl.sda.pol141.program;

import java.security.Provider;
import java.util.ArrayList;
import java.util.List;

public class Car {
    private String registrationNumber;
    private String vin;
    private String name;
    private String brand;
    private String model;
    private String engineType;
    private double engineCapacity;
    private String ownerFirstName;
    private String ownerLastName;
    private String phoneNumber;
    private double laborCost;

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    private double cost;
    private List<Repair> repairs;
    private List<Part> parts;

    public Car(String registrationNumber, String vin, String brand, String model, String engineType, double engineCapacity
               ) {
        this.registrationNumber = registrationNumber;
        this.vin = vin;
        this.brand = brand;
        this.model = model;
        this.engineType = engineType;
        this.engineCapacity = engineCapacity;
        this.ownerFirstName = ownerFirstName;
        this.ownerLastName = ownerLastName;
        this.phoneNumber = phoneNumber;
        this.laborCost = laborCost;
        this.repairs = new ArrayList<>();
        this.parts = new ArrayList<>();
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public String getOwnerFirstName() {
        return ownerFirstName;
    }

    public void setOwnerFirstName(String ownerFirstName) {
        this.ownerFirstName = ownerFirstName;
    }

    public String getOwnerLastName() {
        return ownerLastName;
    }

    public void setOwnerLastName(String ownerLastName) {
        this.ownerLastName = ownerLastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getLaborCost() {
        return laborCost;
    }

    public void setLaborCost(double laborCost) {
        this.laborCost = laborCost;
    }

    public List<Repair> getRepairs() {
        return repairs;
    }

    public void setRepairs(List<Repair> repairs) {
        this.repairs = repairs;
    }

    public List<Part> getParts() {
        return parts;
    }

    public void setParts(List<Part> parts) {
        this.parts = parts;
    }

    public double calculateTotalCost() {
        double total = laborCost;
        for (Repair repair : repairs) {
            total += repair.getCost();
        }

        for (Part part : parts) {
            total += part.getCost();
        }

        return total;
    }

    public void addRepair(String description, double cost) {

        repairs.add(new Repair(description, cost));
    }

    public void addPart(String name, String number, double cost) {
        parts.add(new Part(name, number, cost));
    }

    public String toString() {
        return "Cars{" +
                "registrationNumber='" + registrationNumber + '\'' +
                ", vin='" + vin + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineType='" + engineType + '\'' +
                ", engineCapacity=" + engineCapacity +
                ", ownerFirstName='" + ownerFirstName + '\'' +
                ", ownerLastName='" + ownerLastName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", laborCost=" + laborCost +
                ", repairs=" + repairs +
                ", parts=" + parts +
                '}';
    }

    public void addRepair(Repair repair2) {
    }


    public class Part {
        public Part(String name, String number, double cost) {
        }

        public double getCost() {

            return cost;
        }

        public String getName() {
        return name;
        }
    }
    public static class Repair {
        private String description;
        private double cost;

        public Repair(String description, double cost) {
            this.description = description;
            this.cost = cost;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public double getCost() {
            return cost;
        }

        public void setCost(double cost) {
            this.cost = cost;
        }


        public void addPart(pl.sda.pol141.program.Part part1) {
        }
    }
}
