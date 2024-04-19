package com.example.DMS.repository;
import java.util.List;

//@S564196
//Lakshmi Pravallika Bhupathi
import org.springframework.data.repository.CrudRepository;

import com.example.DMS.Models.Dog;

public interface DogRepository extends CrudRepository<Dog, Integer>{
	List<Dog> findByName(String name);

}
