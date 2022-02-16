package com.aracsiparis.aracsiparis.model;

public class Renault extends Arac {

    String model;
    public Renault(int id, String model)
    {
        super(id,"Renault");
        this.model=model;
    }

    String getModel()
    {
        return this.model;
    }

    public String getAracinfo()
    {
        return String.valueOf(this.getId())+ " "+this.getMarka()+" "+this.getModel();
    }
}
