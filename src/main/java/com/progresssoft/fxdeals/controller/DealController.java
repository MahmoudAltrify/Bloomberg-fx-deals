package com.progresssoft.fxdeals.controller;

import com.progresssoft.fxdeals.DTO.DealRequestDto;
import com.progresssoft.fxdeals.entity.DealEntity;
import com.progresssoft.fxdeals.exception.ValidationException;
import com.progresssoft.fxdeals.interfaces.DealService;
import com.progresssoft.fxdeals.sevice.DealServiceImplementation;
import jakarta.validation.Valid;
import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import java.util.List;

@RestController
public class DealController {

    private static final Logger logger = LogManager.getLogger(DealController.class);
    private final DealService dealService;

    public DealController(DealServiceImplementation dealService) {
        this.dealService = dealService;
    }

    @GetMapping("api/v1/deals")
    public ResponseEntity<List<DealEntity>> getAll() {
        logger.info("*** The controller here at your service and jumping to service ***");
        List<DealEntity> deals = dealService.getAll();
        logger.info("*** Back to controller ***");
        return ResponseEntity.ok(deals);
    }

    @PostMapping("api/v1/deals")
    public ResponseEntity<String> create(@Valid @RequestBody DealRequestDto deal, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            List<String> errors = bindingResult.getAllErrors().stream().map(DefaultMessageSourceResolvable::getDefaultMessage).toList();
            return ResponseEntity.badRequest().body(new ValidationException(errors.toString()).toString());
        }

        try {
            dealService.create(deal);
        }catch (ValidationException validationException){
            return ResponseEntity.badRequest().body(validationException.toString());
        }
        return ResponseEntity.status(HttpStatus.CREATED).body("Request created successfully");
    }
}
