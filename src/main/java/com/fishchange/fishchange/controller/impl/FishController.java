package com.fishchange.fishchange.controller.impl;

import com.fishchange.fishchange.controller.FishControllerApi;
import com.fishchange.fishchange.model.domain.Fish;
import com.fishchange.fishchange.service.FishService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Scanner;

@RestController
@RequiredArgsConstructor
public class FishController implements FishControllerApi {
    private final FishService fishService;

    @Override
    public ResponseEntity<Fish> save(Fish fish) {
        return ResponseEntity.ok(fishService.save(fish));
    }

    @Override
    public ResponseEntity<List<Fish>> sortWithDefault() {
        Sort sortByNameAsc = Sort.by(Sort.Direction.ASC, "name");
        return ResponseEntity.ok(fishService.sortWithDefault(sortByNameAsc));
    }

    @Override
    public ResponseEntity<List<Fish>> sortWithParameter(String sortBy) {
        Sort sortByAsc = Sort.by(Sort.Direction.ASC, sortBy);
        return ResponseEntity.ok(fishService.sortWithDefault(sortByAsc));
    }

    @Override
    public ResponseEntity<List<Fish>> sortWithMethod(String sortBy, Boolean isAscending) {
        return ResponseEntity.ok(fishService.sortWithDefault(
                Sort.by(isAscending ? Sort.Direction.ASC : Sort.Direction.DESC, sortBy)));
    }

    @Override
    public ResponseEntity<List<Fish>> findAllByName(String name) {
        return ResponseEntity.ok(fishService.findAllByName(name));
    }

    @Override
    public ResponseEntity<List<Fish>> findFishesByName(String name) {
        return ResponseEntity.ok(fishService.findFishesByName(name));
    }

    @Override
    public ResponseEntity<List<Fish>> sortWithQuery() {
        return ResponseEntity.ok(fishService.sortWithQuery());
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
