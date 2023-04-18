package parcial.parcial1procesoscrud.service;

import parcial.parcial1procesoscrud.models.Car;

import java.util.List;

public interface CarService {

    Car createCar(Car car);

    List<Car> getAll();

    Car getCarById (Long id);

    Car updateCar(Long id,Car car);
}
