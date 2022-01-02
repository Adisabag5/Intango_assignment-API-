package com.colorvotes.colorvoteapi;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.concurrent.atomic.AtomicLong;

import static com.colorvotes.colorvoteapi.DatabaseClass.globalColorList;
import static com.colorvotes.colorvoteapi.DatabaseClass.increaseVotesById;

@RestController
public class ColorListController {

    @CrossOrigin
    @GetMapping("/color-list")
    public ColorList greeting(){

        return globalColorList;

    }
    @CrossOrigin
    @PutMapping("/vote/{id}")
    public Boolean updateColorList(@PathVariable("id") int id){
        if(increaseVotesById(id) == true){
            return true;
        }
        return false;
    }
}
