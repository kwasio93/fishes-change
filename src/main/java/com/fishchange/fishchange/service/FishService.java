package com.fishchange.fishchange.service;

import com.fishchange.fishchange.model.domain.Fish;

import java.util.List;

public interface FishService {
    Fish save(Fish fish);

    List<Fish> findAll();

    Fish update(Fish fish);

    Fish delete(Integer id);
}
