package ru.alexanna.oikclient.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.alexanna.oikclient.entities.Location;
import ru.alexanna.oikclient.repositories.LocationRepository;

import java.util.Set;

@Slf4j
@Service
@RequiredArgsConstructor
public class LocationService {
    private final LocationRepository locationRepository;

    public Set<Location> findLocationsByTechObjectId(int id) {
        return locationRepository.findLocationsByTechObjectId(id);
    }
}
