package com.plant;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//accessing database when using JPA, in the brackets, it specifies what type of obbject the repository is working
// with and the id for the type we are working with
//this interface is responsible for data access
@Repository
public interface PlantRepository
        extends JpaRepository <Plant, Long>{
}
