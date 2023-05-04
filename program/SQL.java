package pl.sda.pol141.program;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class SQL {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "registration_number")
    private String registrationNumber;

    @Column(name = "vin")
    private String vin;

    @Column(name = "brand")
    private String brand;

    @Column(name = "model")
    private String model;

    @Column(name = "engine_type")
    private String engineType;

    @Column(name = "engine_capacity")
    private double engineCapacity;

    @Column(name = "owner_name")
    private String ownerName;

    @Column(name = "owner_surname")
    private String ownerSurname;

    @Column(name = "owner_phone_number")
    private String ownerPhoneNumber;
}
