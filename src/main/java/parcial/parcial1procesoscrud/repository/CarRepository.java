package parcial.parcial1procesoscrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import parcial.parcial1procesoscrud.models.Car;

@Repository
public interface CarRepository extends JpaRepository <Car,Long> {

}
