import controllers.MetodosBusqueda;
import models.Persona;

public class App 
{
    public static void main(String[] args)
    {
        Persona[] personas = new Persona[7];
        personas[0] = new Persona(1, "dennis");
        personas[1] = new Persona(2, "flopi");
        personas[2] = new Persona(3, "mauro");
        personas[3] = new Persona(4, "carmen");
        personas[4] = new Persona(5, "wilson");
        personas[5] = new Persona(6, "castro");
        personas[6] = new Persona(7, "devora");

        MetodosBusqueda mB = new MetodosBusqueda(personas);
        
    }
}
