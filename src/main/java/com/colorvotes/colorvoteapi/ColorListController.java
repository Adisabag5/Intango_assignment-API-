package com.colorvotes.colorvoteapi;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.scheduling.annotation.Async;
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
    @Async
    public ColorList updateColorList(@PathVariable("id") int id){
        if(increaseVotesById(id) == true){
            return globalColorList;
        }
        System.out.println('e');
        return globalColorList;
    }

//    @CrossOrigin
//    @MessageMapping("/update")
//    @SendTo("/topic/update-list")
//    public ColorList updateColorListBySocket(){
//
//        return globalColorList;
//    }
}
