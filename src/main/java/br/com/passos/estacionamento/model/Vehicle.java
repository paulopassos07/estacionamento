package br.com.passos.estacionamento.model;

import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@EqualsAndHashCode
@Entity
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String plate;

    private String carBrand;

    private String model;

    public Vehicle(String plate, String carBrand, String model) {
        this.plate = plate;
        this.carBrand = carBrand;
        this.model = model;
    }

}
