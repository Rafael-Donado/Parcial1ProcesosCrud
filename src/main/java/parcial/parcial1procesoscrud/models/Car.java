package parcial.parcial1procesoscrud.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String car;
    private String car_model;
    private String car_color;
    private String car_model_year;
    private String car_vin;
    private Double price;
    private boolean availability;
}
