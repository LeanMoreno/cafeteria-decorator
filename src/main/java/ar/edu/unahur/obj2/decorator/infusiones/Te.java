package ar.edu.unahur.obj2.decorator.infusiones;

public class Te implements Iinfusion{
    @Override
    public String getNombre() {
        return "Te";
    }

    @Override
    public Double getCosto() {
        return 2.0;
    }
}
