package com.aracsiparis.aracsiparis.model;

public class Volswagen extends Arac {

    String model;
    public Volswagen(int id, String model)
    {
        super(id,"Volswagen");
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
