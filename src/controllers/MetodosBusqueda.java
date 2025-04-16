package controllers;

import models.Persona;
import views.ShowConsole;

public class MetodosBusqueda 
{
    private ShowConsole showConsole;
    private Persona[] people;

    public MetodosBusqueda(Persona[] persons){
        showConsole = new ShowConsole();
        this.people = persons;
        showMenu();
    }

    public void showMenu() {
        int option = showConsole.inputSearchOption();
        if (option == 1) {
            showPersonByCode();
        } else if (option == 2) {
            showPersonByName();
        } else {
            showConsole.showMessage("Opción inválida");
        }
    }

    public int findPersonByCode(int code){
        for (int i = 0; i < people.length; i++) {
            if (people[i].getCode() == code) {
                return i;
            }
        }
        return -1;
    }

    public int findPersonByName(String name){
        for (int i = 0; i < people.length; i++) {
            if (people[i].getName().equalsIgnoreCase(name)) {
                return i;
            }
        }
        return -1;
    }

    public void showPersonByCode(){
        int codeToFind = showConsole.inputCode();
        int indexPerson = findPersonByCode(codeToFind);
        
        if (indexPerson >= 0){
            showConsole.showMessage("Persona con código " + codeToFind + " encontrada");
            showConsole.showMessage(people[indexPerson].toString());
        } else {
            showConsole.showMessage("Persona no encontrada");
        }
    }

    public void showPersonByName(){
        String nameToFind = showConsole.inputName();
        int indexPerson = findPersonByName(nameToFind);
        
        if (indexPerson >= 0){
            showConsole.showMessage("Persona con nombre '" + nameToFind + "' encontrada");
            showConsole.showMessage(people[indexPerson].toString());
        } else {
            showConsole.showMessage("Persona no encontrada");
        }
    }
}

