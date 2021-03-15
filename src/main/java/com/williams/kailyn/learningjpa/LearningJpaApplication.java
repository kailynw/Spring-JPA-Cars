package com.williams.kailyn.learningjpa;

import com.williams.kailyn.learningjpa.entity.Cars;
import com.williams.kailyn.learningjpa.service.CarsRepository;
import com.williams.kailyn.learningjpa.service.CarsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.util.Date;
import java.util.Optional;

@SpringBootApplication
public class LearningJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearningJpaApplication.class, args);
	}

//	@Autowired
//	CarsService carsService;
//
//	@Bean
//	CommandLineRunner commandLineRunner(CarsRepository carsRepository){
//		return args -> {
//
//			//Cars car1= new Cars("Bugatti", "Germany", "$900,000", true, LocalDate.of(2007, Month.JUNE, 5),"jamesteggey@gmail.com ", "864-232-2428");
//			Cars findCar= carsService.getCarById(12L);
//			System.out.println(findCar.getName());
//			// carsRepository.save(car1);
//		};
//	}

}
