package com.aracsiparis.aracsiparis.model;

public class Toyota extends Arac {

    String model;
    public Toyota(int id, String model)
    {
        super(id,"Toyota");
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
