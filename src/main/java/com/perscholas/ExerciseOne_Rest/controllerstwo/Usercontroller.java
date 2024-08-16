package com.perscholas.ExerciseOne_Rest.controllerstwo;

import com.perscholas.ExerciseOne_Rest.model.User;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Usercontroller {
    @PostMapping("/users")
    public void printData(@RequestBody User user){
        System.out.println("Printing the user data:" + user);
    }

    @ModelAttribute("countries")
    public List< String > getUserCountries() {
        List < String > countries = new ArrayList< >();
        countries.add("UK");
        countries.add("USA");
        countries.add("Japan");
        return countries;
    }

    @ModelAttribute
    public void getUsers (Model model) {
        User u1 = new User(1,"haseeb","haseeb@gmail.com");
        User u2 = new User(2,"Josph","Josph@gmail.com");
        User u3 = new User(3,"Ameer","Ameer@gmail.com");
        List < User> myuser = new ArrayList < > ();
        myuser.add(u1);
        myuser.add(u2);
        myuser.add(u3);
        model.addAttribute("myuserAttribute", myuser);
    }
}