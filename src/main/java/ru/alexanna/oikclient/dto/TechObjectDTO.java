package ru.alexanna.oikclient.dto;

import lombok.Value;

import java.util.List;

@Value
public class TechObjectDTO {
    int id;
    String name;
    List<LocationDTO> locations;
}
