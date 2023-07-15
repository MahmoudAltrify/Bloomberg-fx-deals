package com.progresssoft.fxdeals.interfaces;

import com.progresssoft.fxdeals.DTO.DealRequestDto;
import com.progresssoft.fxdeals.entity.DealEntity;
import com.progresssoft.fxdeals.exception.ValidationException;

import java.util.List;

public interface DealService {
    List<DealEntity> getAll();

    DealEntity create(DealRequestDto dealRequestDto) throws ValidationException;

}
