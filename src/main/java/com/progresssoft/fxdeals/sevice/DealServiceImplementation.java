package com.progresssoft.fxdeals.sevice;

import com.progresssoft.fxdeals.DTO.DealRequestDto;
import com.progresssoft.fxdeals.controller.DealController;
import com.progresssoft.fxdeals.entity.DealEntity;
import com.progresssoft.fxdeals.exception.ValidationException;
import com.progresssoft.fxdeals.interfaces.DealService;
import com.progresssoft.fxdeals.repository.DealRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Currency;
import java.util.List;

@Service
public class DealServiceImplementation implements DealService {

    private static final Logger logger = LogManager.getLogger(DealController.class);
    private final DealRepository dealRepository;


    public DealServiceImplementation(DealRepository dealRepository) {
        this.dealRepository = dealRepository;
    }

    @Override
    public List<DealEntity> getAll() {
        logger.info("*** The service here at your service ;) and jumping to repository ***");
        List<DealEntity> data = dealRepository.findAll();
        return data;
    }

    @Override
    public DealEntity create(DealRequestDto dto) throws ValidationException {
        this.isValidCurrency(dto.getFromCurrency());
        this.isValidCurrency(dto.getToCurrency());
        DealEntity deal = new DealEntity();
        deal.setFromCurrency(dto.getFromCurrency());
        deal.setToCurrency(dto.getToCurrency());
        deal.setAmount(dto.getAmount());
        deal.setDealTime(LocalDateTime.now());
        logger.info("*** Ready for creating resource ***");

        return dealRepository.saveAndFlush(deal);
    }

    private boolean isValidCurrency(String currencyCode) throws ValidationException {
        try {
            Currency currency = Currency.getInstance(currencyCode);
            return true;
        } catch (IllegalArgumentException e) {
            throw new ValidationException("Currency should be valid");
        }
    }

}
