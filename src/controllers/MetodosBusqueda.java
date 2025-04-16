package controllers;

import models.Persona;
import views.ShowConsole;

public class MetodosBusqueda 
{
    private ShowConsole showConsole;
    private Persona[] people;

    public MetodosBusqueda(Persona[] persons){
        showConsole = new ShowConsole();
        this.people=persons;
        showPerson();
    }
    public int busquedaLineal(int[] arreglo, int valor) 
    {
        for (int i = 0; i < arreglo.length; i++) 
        {
            if (arreglo[i] == valor) 
            {
                return i;
            }
        }
        return -1;
    }

    public int findPersonByCode(int code){
        for (int i = 0; i < people.length; i++) {
            if (people[i].getCode() == code) 
            {
                return i;
            }
            
        }
        return -1;
    }

    public void showPerson(){
        int codeTofind = showConsole.inputCode();
        int indexPerson = findPersonByCode(codeTofind);
        
        if (indexPerson >= 0){
            showConsole.showMessage("Persona con codigo " + codeTofind + " encontada");
            showConsole.showMessage(people[indexPerson].toString());
        }else{
            showConsole.showMessage("Persona no encontrada");
        }

    }
}
