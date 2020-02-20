package com.DevTraining.Mission4.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

//ControllerAdvice(annotations = RestController.class)
class PetNotFoundAdvice {
    @ResponseBody
    @ExceptionHandler(PetNotFoundException.class)
    String employeeNotFoundHandler(PetNotFoundException ex) {
        return ex.getLocalizedMessage();
    }
}
