package com.fishchange.fishchange.controller;

import com.fishchange.fishchange.model.domain.Fish;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/v1/fish")
public interface FishControllerApi {
    @PostMapping
    ResponseEntity<Fish> save(@RequestBody Fish fish);

    @GetMapping
    ResponseEntity<List<Fish>> findAll();

    @PutMapping
    ResponseEntity<Fish> update(@RequestBody Fish fish);

    @DeleteMapping("/{id}")
    ResponseEntity<Fish> delete(@PathVariable Integer id);
}
