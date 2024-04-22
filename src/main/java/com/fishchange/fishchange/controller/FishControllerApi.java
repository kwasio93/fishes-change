package com.fishchange.fishchange.controller;

import com.fishchange.fishchange.model.domain.Fish;
import org.springframework.data.domain.Sort;
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

    @GetMapping("/find-all/{name}")
    ResponseEntity<List<Fish>> findAllByName(@PathVariable String name);

    @GetMapping("/find-fish/{name}")
    ResponseEntity<List<Fish>> findFishesByName(@PathVariable String name);

    @GetMapping("/sort-fish-with-query")
    ResponseEntity<List<Fish>> sortWithQuery();

    @GetMapping("/sort-fish-with-default")
    ResponseEntity<List<Fish>> sortWithDefault();

    @GetMapping("/sort-fish-with-parameter/{sortBy}")
    ResponseEntity<List<Fish>> sortWithParameter(@PathVariable String sortBy);

    @GetMapping("/sort-fish-with-parameter/{sortBy}/{isAscending}")
    ResponseEntity<List<Fish>> sortWithMethod(@PathVariable String sortBy, @PathVariable Boolean isAscending);

    @DeleteMapping("/{id}")
    ResponseEntity<Fish> delete(@PathVariable Integer id);
}
