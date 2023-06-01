package modelo;

public class UsuarioImpresora 
{
    private Impresora impresora;

    public void setImpresora(Impresora impresora)
    {
        this.impresora = impresora;
    }

    public void imprimirDocumento(String documento)
    {
        if (impresora !=null)
        {
            impresora.imprimir(documento);
        }
        else
        {
            System.out.println("No se ha definido una impresora para la ejecución");
        }
    }
}
