package com.engr.necy.numberClassificationApi_FunFact.service;

import com.engr.necy.numberClassificationApi_FunFact.dto.NumberResponseDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
@Service
public class NumberClassificationService {
    @Value("${numbers.api.url}")
    private String numbers_api_url;
    public NumberResponseDto getNumberClassification(int number){
        Boolean is_prime = is_prime(number);
        Boolean is_perfect = is_perfect(number);
        List<String> properties = new ArrayList<>();

        if(is_armstrong(number)){
            properties.add("armstrong");
        }
        if(number % 2 == 0){
            properties.add("even");
        }else{
            properties.add("odd");
        }
        int digit_sum = calculate_digit_sum(number);

        String fun_fact = get_fun_fact(number);

        return new NumberResponseDto(number, is_prime,is_perfect, properties,digit_sum, fun_fact);
    }


    private Boolean is_prime(int number) {
        if (number <= 1)
            return false;
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }

    private Boolean is_perfect(int number) {
            if(number <=1)
                return false;

            int sum = 1;
            int sqrt = (int) Math.sqrt(number);

            for(int i = 2; i <= sqrt; i++){
                if(number % i == 0)
                    sum += i;
                if(i != number / i)
                    sum += number / i;
            }
            return  sum == number;
        }


    private Boolean is_armstrong(int number) {
        int sum = 0;
        int originalNum = number;
        int digit_length = String.valueOf(number).length();

        while (number > 0) {
            int digit = number % 10;
             sum += Math.pow(digit, digit_length);
             number /= 10;
        }
        return sum == originalNum;
    }

    private int calculate_digit_sum(int number){
        int sum = 0;
        while ( number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }


    private String get_fun_fact(int number) {
        RestTemplate restTemplate = new RestTemplate();
        String url = numbers_api_url + "/" + number + "/math";
        return restTemplate.getForObject(url, String.class);
    }
}
