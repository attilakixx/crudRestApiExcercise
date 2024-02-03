package car.db.carDbCrud.Models;

import jakarta.persistence.*;

@Entity
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String number_plate;
    @Column
    private String manufacturer;
    @Column
    private String model;
    @Column
    private int manufacture_year;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumber_plate() {
        return number_plate;
    }

    public void setNumber_plate(String number_plate) {
        this.number_plate = number_plate;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getManufacture_year() {
        return manufacture_year;
    }

    public void setManufacture_year(int manufacture_year) {
        this.manufacture_year = manufacture_year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", number_plate='" + number_plate + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", manufacture_year=" + manufacture_year +
                '}';
    }
}
