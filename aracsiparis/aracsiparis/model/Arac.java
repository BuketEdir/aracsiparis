package com.aracsiparis.aracsiparis.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class Arac {
    int id;
    String marka;
    Arac(int id,String marka)
    {
        this.id=id;
        this.marka=marka;
    }

    int getId()
    {
        return this.id;
    }

    public String getMarka() {
        return marka;
    }
}
