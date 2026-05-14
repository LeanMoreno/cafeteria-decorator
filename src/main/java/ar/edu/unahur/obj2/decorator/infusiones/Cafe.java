package ar.edu.unahur.obj2.decorator.infusiones;

public class Cafe implements Iinfusion{

    @Override
    public String getNombre() {
        return "Cafe";
    }

    @Override
    public Double getCosto() {
        return 3.0;
    }
    
}
