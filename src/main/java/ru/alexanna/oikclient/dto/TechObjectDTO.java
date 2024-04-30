package ru.alexanna.oikclient.dto;

import lombok.Data;

import java.util.Set;

@Data
public class TechObjectDTO {
    private int id;
    private String name;
    private Set<LocationDTO> locationDTOSet;
}
