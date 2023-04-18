package parcial.parcial1procesoscrud.service;

import parcial.parcial1procesoscrud.models.Car;

import java.util.List;
<<<<<<< HEAD

public interface CarService {

=======
public interface CarService {
>>>>>>> 9a718cfc04c25f9f0e87d52b92f92925dc0bb96f
    Car createCar(Car car);

    List<Car> getAll();

    Car getCarById (Long id);

    Car updateCar(Long id,Car car);
}
