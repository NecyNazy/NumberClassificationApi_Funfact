package com.engr.necy.numberClassificationApi_FunFact.controller;

import com.engr.necy.numberClassificationApi_FunFact.dto.ErrorResponseDto;
import com.engr.necy.numberClassificationApi_FunFact.dto.NumberResponseDto;
import com.engr.necy.numberClassificationApi_FunFact.service.NumberClassificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api")
@CrossOrigin(origins = "*")
public class NumberClassificationController {

    private final NumberClassificationService numberClassificationService;

    public NumberClassificationController(NumberClassificationService numberClassificationService) {
        this.numberClassificationService = numberClassificationService;
    }

    @GetMapping("/classify-number")
    public ResponseEntity<Object> classifyNumber(@RequestParam ("number") String number){
       try {
           int num = Integer.parseInt(number);
           NumberResponseDto response = numberClassificationService.getNumberClassification(num);
           return ResponseEntity.ok(response);
       } catch (NumberFormatException e) {
           return ResponseEntity.badRequest().body(new ErrorResponseDto(number, true));
       }

    }
}
