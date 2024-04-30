package ru.alexanna.oikclient.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.alexanna.oikclient.entities.TechObject;
import ru.alexanna.oikclient.repositories.TechObjectRepository;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class TechObjectService {
    private final TechObjectRepository techObjectRepository;

    public List<TechObject> findAllTechObjects() {
        return techObjectRepository.findAll();
    }
}
