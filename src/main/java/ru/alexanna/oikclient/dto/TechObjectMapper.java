package ru.alexanna.oikclient.dto;

import ru.alexanna.oikclient.entities.CheckPoint;
import ru.alexanna.oikclient.entities.Location;
import ru.alexanna.oikclient.entities.Signal;
import ru.alexanna.oikclient.entities.TechObject;

import java.util.stream.Collectors;

public class TechObjectMapper {
    public static TechObjectDTO toDTO(TechObject entity) {
        return new TechObjectDTO(entity.getId(),
                entity.getName(),
                entity.getLocations().stream().map(TechObjectMapper::toDTO).collect(Collectors.toList()));
    }

    public static LocationDTO toDTO(Location entity) {
        return new LocationDTO(entity.getId(),
                entity.getName(),
                entity.getCheckPoints().stream().map(TechObjectMapper::toDTO).collect(Collectors.toList()));
    }

    private static CheckPointDTO toDTO(CheckPoint entity) {
        return new CheckPointDTO(entity.getId(),
                entity.getName(),
                entity.getAddress(),
                entity.getSignals().stream().map(TechObjectMapper::toDTO).collect(Collectors.toList()));
    }

    private static SignalDTO toDTO(Signal entity) {
        return new SignalDTO(entity.getId(),
                entity.getName(),
                entity.getNumber(),
                entity.getChannel());
    }
}
