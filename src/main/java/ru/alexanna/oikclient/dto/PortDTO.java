package ru.alexanna.oikclient.dto;

import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
public class PortDTO {
    protected int id;
    protected String name;
    protected int baudRate;
    protected boolean parity;
    protected String ktms;
    protected String receivedData;
    protected Set<CheckPointDTO> checkPoints = new HashSet<>();
}
