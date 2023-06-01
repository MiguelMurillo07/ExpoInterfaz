package vista;

import modelo.Impresora;

public class InyeccionTinta implements Impresora
{
    public void imprimir(String documento)
    {
        System.out.println("Imprimiendo documento con una impresora de inyección de tinta: "+documento);
    }
}
