package com.williams.kailyn.learningjpa.rest;

import com.williams.kailyn.learningjpa.entity.Cars;
import com.williams.kailyn.learningjpa.service.CarsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@RestController
public class CarsController {

    @Autowired
    CarsService carsService;

    @RequestMapping(path = "/cars", method= RequestMethod.GET)
    public List<Cars> getCarsLimit(@RequestParam Optional<Integer> limit){
        return carsService.getAllCars(limit);
    }

    @RequestMapping(path="/cars/{id}", method=RequestMethod.GET)
    public Cars getCarById(@PathVariable Long id){
        return carsService.getCarById(id);
    }

}
