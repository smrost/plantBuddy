package com.plant;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;


@Configuration
public class PlantConfig {

    @Bean //bean annotations make the method below run
    CommandLineRunner commandLineRunner(PlantRepository repository){
        return args -> {
            Plant fiddle_leaf_fig = new Plant(
                    "Fiddle leaf Fig ",
                    "Ficus lyrata",
                    "Indoor",
                    "Light watering",
                    "Medium light",
                    "Beginner"
            );
            Plant anthurium = new Plant(
                    "Anthurium",
                    "Anthurium andraeanum",
                    "Indoor",
                    "Light watering",
                    "Medium light",
                    "Beginner"
            );

            //to add to database (invoke the repository and .saveAll method passing through
            //plants you want to add to database) you can see the sql Hibernate is running
            repository.saveAll(
                    List.of(fiddle_leaf_fig, anthurium)
            );
        };
    }
}
