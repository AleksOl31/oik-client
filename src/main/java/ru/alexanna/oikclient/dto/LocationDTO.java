package ru.alexanna.oikclient.dto;

import lombok.Value;

import java.util.List;

@Value
public class LocationDTO {
    int id;
    String name;
    List<CheckPointDTO> checkPoints;
}
