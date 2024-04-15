package com.fishchange.fishchange.service.impl;

import com.fishchange.fishchange.model.domain.Fish;
import com.fishchange.fishchange.model.repository.FishRepository;
import com.fishchange.fishchange.service.FishService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FishServiceImpl implements FishService {
    private final FishRepository fishRepository;

    @Override
    public Fish save(Fish fish) {
        fishRepository.save(fish);
        return fish;
    }

    @Override
    public List<Fish> findAll() {
        return fishRepository.findAll();
    }

    @Override
    public Fish update(Fish fish) {
        save(fish);
        return fishRepository.findById(fish.getId()).orElse(null);
    }

    @Override
    public Fish delete(Integer id) {
        Fish fish = fishRepository.findById(id).orElseThrow();
        fishRepository.deleteById(id);
        return fish;
    }
}
