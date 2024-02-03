package car.db.carDbCrud.Controller;

import car.db.carDbCrud.Models.Car;
import car.db.carDbCrud.Repo.CarRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ApiControllers {

    @Autowired
    private CarRepo carRepo;

    @GetMapping(value = "/")
    public String getPage() {
        return "Welcome";
    }

    @GetMapping(value = "/cars")
    public List<Car> getCars() {
        return carRepo.findAll();
    }

    @PostMapping(value = "/save")
    public String saveCar(@RequestBody Car car) {
        carRepo.save(car);
        return "Saved...";
    }

    @PutMapping(value = "update/{id}")
    public String updateCar(@PathVariable Long id, @RequestBody Car car) {
        Car updatedCar = carRepo.findById(id).get();
        updatedCar.setNumber_plate(car.getNumber_plate());
        updatedCar.setManufacturer(car.getManufacturer());
        updatedCar.setModel(car.getModel());
        updatedCar.setManufacture_year(car.getManufacture_year());
        carRepo.save(updatedCar);
        return "updated...";

    }

    @DeleteMapping(value="delete/{id}")
    public String deleteCar(@PathVariable long id){
        Car deleteCar = carRepo.findById(id).get();
        carRepo.delete(deleteCar);
        return "Delete car with the id: "+id;
    }
}
