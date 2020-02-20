package com.DevTraining.Mission4.Service;

import com.DevTraining.Mission4.Model.*;
import com.DevTraining.Mission4.Repository.RepoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PostService {
    @Autowired
    private RepoImpl repo;

    public String savePet(PostPetRequest postPetRequest)  {
        return repo.savePet(postPetRequest);
    }

    public Pet readPet(int ID) {
        return repo.readPet(ID);
    }

    public String updatePet(int ID, PutPetRequest putPetRequest) {

        return repo.updatePet(ID,putPetRequest);
   }
    public String deletePet(int ID) {
        return repo.deletePet(ID);
    }

}
