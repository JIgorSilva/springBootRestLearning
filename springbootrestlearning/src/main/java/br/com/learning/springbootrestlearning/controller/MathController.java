package br.com.learning.springbootrestlearning.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
public class MathController {

    @RequestMapping("/sum/{numberOne}/{numberTwo}")
    public Double sum(@PathVariable("numberOne")String numberOne,@PathVariable ("numberTwo")String numberTwo){

        return convertToDouble(numberTwo)+convertToDouble(numberOne);
    }

    private Double convertToDouble(String number) {
        return Double.parseDouble(number);
    }
}
