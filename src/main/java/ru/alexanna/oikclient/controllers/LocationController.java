package ru.alexanna.oikclient.controllers;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import ru.alexanna.oikclient.dto.LocationDTO;
import ru.alexanna.oikclient.dto.TechObjectMapper;
import ru.alexanna.oikclient.services.LocationService;

@Slf4j
@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/", produces = "application/json")
@RequiredArgsConstructor
public class LocationController {
    private final LocationService locationService;

    @GetMapping("/locations/{id}")
    public Iterable<LocationDTO> findLocationsByTechObjectId(@PathVariable int id) {
        return locationService.findLocationsByTechObjectId(id).stream().map(TechObjectMapper::toDTO).toList();
    }
}
