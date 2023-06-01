package vista;

import modelo.Impresora;

public class ImpresoraLaser implements Impresora
{
    public void imprimir(String documento)
    {
        System.out.println("Imprimiendo documento con una impresora láser: " + documento);
    }
}
