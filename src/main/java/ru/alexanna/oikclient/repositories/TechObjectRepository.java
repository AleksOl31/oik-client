package ru.alexanna.oikclient.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.alexanna.oikclient.entities.TechObject;

public interface TechObjectRepository extends JpaRepository<TechObject, Integer> {
}
