package ar.edu.unahur.obj2.decorator.decoradores;

import ar.edu.unahur.obj2.decorator.infusiones.Iinfusion;

public class ChocolateExtra extends IngredienteDecorator{

    protected ChocolateExtra(Iinfusion infusion) {
        super(infusion);
    }

    @Override
    protected Double getCostoExtra() {
        return 0.75;
    }

    @Override
    protected String getNombreIngrediente() {
        return "Chocolate Extra";
    }

}
