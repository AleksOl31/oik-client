package ru.alexanna.oikclient.dto;

import lombok.Value;

import java.util.List;

@Value
public class CheckPointDTO {
    int id;
    String name;
    int address;
    List<SignalDTO> signals;
}
