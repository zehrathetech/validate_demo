package com.example.validate_demo;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class Controller {

    @PostMapping("/validate")
    public String validateUserData(@RequestBody dataModel userData)
    {
        if (userData == null || userData.getMarks() == null || userData.getMarks() <= 0) {
            return "Invalid data. Please provide a valid age .";
        } else {
            return "Valid age entered: " + userData.getMarks();
        }
    }

}
