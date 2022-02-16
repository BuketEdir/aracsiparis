
package com.aracsiparis.aracsiparis.controller;
import com.aracsiparis.aracsiparis.model.Mercedes;
import com.aracsiparis.aracsiparis.model.Renault;
import com.aracsiparis.aracsiparis.model.Toyota;
import com.aracsiparis.aracsiparis.model.Volswagen;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping
public class AracController {

@GetMapping
    public ResponseEntity<List<String>> getAraclar()
{
    Mercedes arac1= new Mercedes(1,"A180");
    Mercedes arac2=new Mercedes(2,"AMG");
    Renault arac3=new Renault(3,"Megane");
    Renault arac4=new Renault(4,"Broadway");
    Toyota arac5=new Toyota(5,"Auris");
    Toyota arac6=new Toyota(6,"Yaris");
    Volswagen arac7=new Volswagen(7,"Caddy");
    Volswagen arac8=new Volswagen(8,"Golf");



    List<String> Araclar= Arrays.asList(arac1.getAracinfo(),arac2.getAracinfo(),arac3.getAracinfo(),arac4.getAracinfo(),arac5.getAracinfo(),arac6.getAracinfo(),arac7.getAracinfo(),arac8.getAracinfo());

    return new ResponseEntity<List<String>>(Araclar,HttpStatus.OK);
}

}
