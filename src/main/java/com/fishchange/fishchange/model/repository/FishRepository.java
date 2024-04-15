package com.fishchange.fishchange.model.repository;

import com.fishchange.fishchange.model.domain.Fish;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FishRepository extends JpaRepository<Fish, Integer> {
}
