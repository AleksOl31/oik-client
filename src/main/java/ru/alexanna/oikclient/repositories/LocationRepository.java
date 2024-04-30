package ru.alexanna.oikclient.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.alexanna.oikclient.entities.Location;

import java.util.Set;

public interface LocationRepository extends JpaRepository<Location, Integer> {
    Set<Location> findLocationsByTechObjectId(int id);
}
