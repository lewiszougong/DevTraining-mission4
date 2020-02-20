package com.DevTraining.Mission4.Repository;


import com.DevTraining.Mission4.Model.Pet;
import com.DevTraining.Mission4.Model.PostPetRequest;
import com.DevTraining.Mission4.Model.PutPetRequest;

import org.springframework.stereotype.Repository;

@Repository
//<[Entity],[primary key's data type]>
public interface Repo  {
    public String savePet(PostPetRequest postPetRequest);
    public Pet readPet(int ID);
    public String updatePet(int ID, PutPetRequest putPetRequest);
    public String deletePet(int ID);
    }


//    public Statement connectDB() throws SQLException{
//
//        Connection dbConnection = null;
//
//        String urll = "jdbc:mysql://localhost:3306/pet";
//        dbConnection = DriverManager.getConnection(urll, "root", "a1s2d3f4");
//        Statement stat = dbConnection.createStatement();
//
//        return stat;
//    }
//}
