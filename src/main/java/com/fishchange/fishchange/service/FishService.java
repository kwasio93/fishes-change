package com.fishchange.fishchange.service;

import com.fishchange.fishchange.model.domain.Fish;
import org.springframework.data.domain.Sort;

import java.util.List;

public interface FishService {
    Fish save(Fish fish);

    List<Fish> findAll();

    List<Fish> findAllByName(String name);

    List<Fish> findFishesByName(String name);

    List<Fish> sortWithQuery();

    List<Fish> sortWithDefault(Sort sort);

    Fish update(Fish fish);

    Fish delete(Integer id);
}
