package com.DevTraining.Mission4.Controller;



import com.DevTraining.Mission4.Exception.PetNotFoundException;
import com.DevTraining.Mission4.Model.*;
import com.DevTraining.Mission4.Service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.sql.SQLException;
import java.sql.SQLOutput;

@RestController
@RequestMapping("/home")
public class Controller {

    @Autowired
    PostService postService;

    @PostMapping
    public String createResponse(@RequestBody PostPetRequest postPetRequest) {

        return postService.savePet(postPetRequest);
    }

    @GetMapping("/{id}")
    public Pet getValue(@PathVariable(value="id") int id) {
            return postService.readPet(id);
    }
    @PutMapping("/{id}")
    public String updateResponse(@PathVariable(value="id") int id, @RequestBody PutPetRequest putPetRequest) {
        return postService.updatePet(id,putPetRequest);
    }
    @DeleteMapping("/{id}")
    public String deleteResponse(@PathVariable(value= "id") int id) {
        return postService.deletePet(id);
    }

}


