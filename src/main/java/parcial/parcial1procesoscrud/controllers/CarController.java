package parcial.parcial1procesoscrud.controllers;

<<<<<<< HEAD
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import parcial.parcial1procesoscrud.models.Car;
import parcial.parcial1procesoscrud.service.CarService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class CarController {
    @Autowired
    private CarService carService;

    @PostMapping("/cars/{id}")
    public Car createAllCars (@PathVariable Long id) throws JsonProcessingException {
        RestTemplate restTemplate = new RestTemplate();
        String carrosExternos = restTemplate.getForObject("https://myfakeapi.com/api/cars/" + id, String.class);
        ObjectMapper objectMapper = new ObjectMapper();
        Car car = objectMapper.readValue(carrosExternos.substring(7), Car.class);

        Car carroguardado = carService.createCar(car);
        return carroguardado;
    }

    @GetMapping(value = "/cars")
    public ResponseEntity getAll() {
        Map response = new HashMap();
        try {
            List<Car> carList = carService.getAll();
                response.put("message", "Se encontraron los carros");
                response.put("data", carService.getAll());
                return new ResponseEntity(response, HttpStatus.OK);

        } catch (Exception e) {
            response.put("message", "No se encontraron los carros");
            response.put("data", null);
            return new ResponseEntity(response, HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping(value = "/cars/{id}")
    public ResponseEntity getCar(@PathVariable(name = "id")Long id){
        Map response = new HashMap();
        try{
            response.put("mensaje", "Se encontro el carro");
            response.put("data", carService.getCarById(id));
            return new ResponseEntity(response, HttpStatus.OK);
        }catch (Exception e){
            response.put("mensaje","Error al buscar el carro");
            response.put("data",e.getMessage());
            return new ResponseEntity(response,HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping(value = "/cars/{id}")
    public ResponseEntity updateCar(@PathVariable(name = "id") Long id, @RequestBody Car car){
        Map response = new HashMap();
        try{
            response.put("message", "Carro actualizado correctamente");
            response.put("data", carService.updateCar(id, car));
            return new ResponseEntity(response, HttpStatus.OK);
        }catch (Exception e){
            response.put("message","El carro no se encontro");
            response.put("data",id);
            return new ResponseEntity(response,HttpStatus.NOT_FOUND);
        }
    }
=======

public class CarController {
>>>>>>> 9a718cfc04c25f9f0e87d52b92f92925dc0bb96f
}