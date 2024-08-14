package ru.alexanna.oikclient.aspects;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import ru.alexanna.oikclient.dto.LocationDTO;
import ru.alexanna.oikclient.dto.TechObjectDTO;

import java.util.Arrays;
import java.util.List;

@Aspect
@Component
@Slf4j
public class LoggingAspect {

    @AfterReturning(value = "execution(Iterable ru.alexanna.oikclient.controllers.TechObjectsController.findAllTechObjects())", returning = "returnedValue")
    public void logAllTechObjects(List<TechObjectDTO> returnedValue) {
        log.info("{} technological objects were returned", returnedValue.size());
    }

    @Around("execution(Iterable ru.alexanna.oikclient.controllers.LocationController.findLocationsByTechObjectId(int))")
    @SuppressWarnings("unchecked")
    public Object logLocationsByTechObjId(ProceedingJoinPoint joinPoint) throws Throwable {
        int techObjId = (int) Arrays.stream(joinPoint.getArgs()).findFirst().orElse(0);
        List<LocationDTO> locations = (List<LocationDTO>) joinPoint.proceed();
        log.info("Locations have been returned in the amount of - {}, by techObject id - {}", locations.size(), techObjId);
        return locations;
    }
}
