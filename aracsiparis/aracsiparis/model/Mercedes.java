package com.aracsiparis.aracsiparis.model;
import com.aracsiparis.aracsiparis.model.Arac;



public class Mercedes extends Arac {

    public String model;
    public Mercedes(int id, String model)
    {
        super(id,"Mercedes");
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






