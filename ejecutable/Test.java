package ejecutable;

import modelo.UsuarioImpresora;
import vista.ImpresoraLaser;
import vista.InyeccionTinta;

public class Test
{
    public static void main(String[] args) {
        ImpresoraLaser impresoraLaser = new ImpresoraLaser();
        InyeccionTinta inyeccionTinta = new InyeccionTinta(); 

        UsuarioImpresora miUsuario = new UsuarioImpresora();


        // Establecer la impresora láser para el usuario
        miUsuario.setImpresora(impresoraLaser);

        // Imprimir un documento
        miUsuario.imprimirDocumento("Documento 1");

        // Cambiar a la impresora de inyección de tinta
        miUsuario.setImpresora(inyeccionTinta);

        // Imprimir otro documento
        miUsuario.imprimirDocumento("Documento 2");
    }


    

    
}