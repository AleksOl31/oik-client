package ru.alexanna.oikclient.controllers;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.alexanna.oikclient.entities.TechObject;
import ru.alexanna.oikclient.services.TechObjectService;


@Slf4j
@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/", produces = "application/json")
@RequiredArgsConstructor
public class TechObjectsController {
    private final TechObjectService techObjectService;

    @GetMapping("/tech-objects")
    public Iterable<TechObject> findAllTechObjects() {
        return techObjectService.findAllTechObjects();
    }
}
