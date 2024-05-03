package ru.alexanna.oikclient.dto;

import lombok.Value;

@Value
public class SignalDTO {
    int id;
    String name;
    int number;
    int channel;
}
