package com.progresssoft.fxdeals.controller;

import com.progresssoft.fxdeals.DTO.DealRequestDto;
import com.progresssoft.fxdeals.sevice.DealService;
import jakarta.validation.Valid;
import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DealController {

    private final DealService dealService;

    public DealController(DealService dealService) {
        this.dealService = dealService;
    }

    @GetMapping("api/v1/deals")
    public String getAll() {
        return "Hello, World!";
    }

    @PostMapping("api/v1/deals")
    public @ResponseBody Object create(@Valid @RequestBody DealRequestDto deal, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            List<String> errors = bindingResult.getAllErrors().stream()
                    .map(DefaultMessageSourceResolvable::getDefaultMessage)
                    .toList();

            return ResponseEntity.badRequest().body("Validation errors: " + errors);
        }


        return dealService.create(deal);
    }
}
