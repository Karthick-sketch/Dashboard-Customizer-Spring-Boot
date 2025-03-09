package com.example.dashboardcustomizer.util;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class Mapper {
    private final ModelMapper modelMapper =  new ModelMapper();

    public <E, M> M map(E entity, Class<M> modelClass) {
        return modelMapper.map(entity, modelClass);
    }
}
