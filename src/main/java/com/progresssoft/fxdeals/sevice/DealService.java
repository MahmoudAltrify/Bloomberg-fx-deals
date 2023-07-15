package com.progresssoft.fxdeals.sevice;

import com.progresssoft.fxdeals.DTO.DealRequestDto;
import com.progresssoft.fxdeals.repository.DealRepository;
import org.springframework.stereotype.Service;

@Service
public class DealService {

    private DealRepository dealRepository;

    public DealService(DealRepository dealRepository) {
        this.dealRepository = dealRepository;
    }

    public String getAll(){

        String data = dealRepository.findAll().toString();
        return data;
    }
    public String create(DealRequestDto dto){
        System.out.println(dto);
        return "Hello from service";
    }
}
