package ar.edu.unahur.obj2.decorator.decoradores;

import ar.edu.unahur.obj2.decorator.excepciones.InfusionNulaException;
import ar.edu.unahur.obj2.decorator.infusiones.Iinfusion;

//PATRON DECORATOR - clase abstracta que implementa la interfaz.
/*
Basicamente es una clase abstracta que implementa una interfaz.
luego de esa clase abstracta salen los "decoradores".

Se comienza haciendo la interfaz, luego las clases que usan esa interfaz.
Despues creas la clase abstracta de los decoradores y luego creas los decoradores.
*/
public abstract class IngredienteDecorator implements Iinfusion {
    private final Iinfusion infusion;

    protected IngredienteDecorator(Iinfusion infusion){
        //Validacion/excepcion
        if(infusion == null){
            throw new InfusionNulaException();
        }
        this.infusion = infusion;
    }

    //Aca es cuando se "envuelve" a la clase con un decorador.
    @Override
    public Double getCosto() {
        return infusion.getCosto() + this.getCostoExtra();
    }

    protected abstract Double getCostoExtra();

    @Override
    public String getNombre() {
        return infusion.getNombre() + " con " + this.getNombreIngrediente();
    }

    protected abstract String getNombreIngrediente();

    

    
}
