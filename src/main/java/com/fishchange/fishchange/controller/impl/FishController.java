package com.fishchange.fishchange.controller.impl;

import com.fishchange.fishchange.controller.FishControllerApi;
import com.fishchange.fishchange.model.domain.Fish;
import com.fishchange.fishchange.service.FishService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class FishController implements FishControllerApi {
    private final FishService fishService;

    @Override
    public ResponseEntity<Fish> save(Fish fish) {
        return ResponseEntity.ok(fishService.save(fish));
    }

    @Override
    public ResponseEntity<List<Fish>> findAll() {
        return ResponseEntity.ok(fishService.findAll());
    }

    @Override
    public ResponseEntity<Fish> update(Fish fish) {
        return ResponseEntity.ok(fishService.update(fish));
    }

    @Override
    public ResponseEntity<Fish> delete(Integer id) {
        return ResponseEntity.ok(fishService.delete(id));
    }
}
