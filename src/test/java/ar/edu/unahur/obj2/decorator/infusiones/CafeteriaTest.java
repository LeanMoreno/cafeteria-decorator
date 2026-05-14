package ar.edu.unahur.obj2.decorator.infusiones;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.decorator.decoradores.*;
import ar.edu.unahur.obj2.decorator.excepciones.InfusionNulaException;

public class CafeteriaTest {
    @Test
    void cafeConLecheSale4(){
        Iinfusion cafeConLeche = new Leche(new Cafe());
        
        assertEquals(4.0, cafeConLeche.getCosto());
    }

    @Test
    void cafeConLecheSeMuestraComoCafe_con_Leche(){
        Iinfusion cafeConLeche = new Leche(new Cafe());
        
        assertEquals("Cafe con Leche", cafeConLeche.getNombre());
    }

    @Test
    void cafeConLecheYCanelaSeMuestraComoCafe_con_Leche_con_Canela(){
        Iinfusion cafeConLecheYCanela = new Canela(new Leche(new Cafe()));
        
        assertEquals("Cafe con Leche con Canela", cafeConLecheYCanela.getNombre());
    }

    @Test
    void lanzaExceptionSiSeCreaUnaInfusionDecoradaConDecoradorNulo(){
        
        assertThrows(InfusionNulaException.class, () -> new Leche(null));
    }
}