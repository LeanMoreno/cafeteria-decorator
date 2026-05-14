package ar.edu.unahur.obj2.decorator.decoradores;

import ar.edu.unahur.obj2.decorator.infusiones.Iinfusion;

public class Crema extends IngredienteDecorator{

    protected Crema(Iinfusion infusion) {
        super(infusion);
    }

    @Override
    protected Double getCostoExtra() {
        return 1.5;
    }

    @Override
    protected String getNombreIngrediente() {
        return "Crema";
    }
    
}
