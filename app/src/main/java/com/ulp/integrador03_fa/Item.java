package com.ulp.integrador03_fa;

public class Item {

    private int estrella;
    private  int imagen;

    public Item(int imagen, int estrella){
        this.imagen=imagen;
        this.estrella=estrella;
    }
    public int getEstrella(){
        return estrella;
    };
    public  int getImagen()
    {
        return imagen;
    }
}
