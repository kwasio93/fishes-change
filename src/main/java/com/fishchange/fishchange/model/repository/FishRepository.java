package com.fishchange.fishchange.model.repository;

import com.fishchange.fishchange.model.domain.Fish;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FishRepository extends JpaRepository<Fish, Integer> {
    @Query("select f From Fish f where f.name = ?1")
    List<Fish> findAllByName(String name);

    @Query(value = "Select f From Fish f where f.name =?1")
    List<Fish> findFishesByName(String name);

    @Query("select f from Fish f order by f.name asc")
    List<Fish> sortAllFish();

    //TODO:
    // typ zwracany: List<Fish>
    // nazwa: findAll
    // parametry: Sort
}
