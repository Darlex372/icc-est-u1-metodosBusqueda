import controllers.MetodosBusquedaBinaria;
import models.Persona;

public class App 
{
    public static void main(String[] args)
    {
        Persona[] personas = new Persona[7];
        personas[0] = new Persona(101, "dennis");
        personas[1] = new Persona(102, "flopi");
        personas[2] = new Persona(103, "mauro");
        personas[3] = new Persona(104, "carmen");
        personas[4] = new Persona(105, "wilson");
        personas[5] = new Persona(106, "castro");
        personas[6] = new Persona(107, "devora");
        //MetodosBusqueda mB = new MetodosBusqueda(personas);
        MetodosBusquedaBinaria mBB = new MetodosBusquedaBinaria(personas);
        mBB.showPerson();
    }
}
