package ar.edu.unahur.obj2.decorator.decoradores;

import ar.edu.unahur.obj2.decorator.infusiones.Iinfusion;

public class Canela extends IngredienteDecorator{

    protected Canela(Iinfusion infusion) {
        super(infusion);
    }

    @Override
    protected Double getCostoExtra() {
        return 0.5;
        
    }

    @Override
    protected String getNombreIngrediente() {
        return "Canela";
        
    }

}
