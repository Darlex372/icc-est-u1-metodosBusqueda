package views;

import java.util.Scanner;

public class ShowConsole 
{
    private Scanner scanner;

    public ShowConsole(){
        this.scanner = new Scanner(System.in);
        showBanner();

    }

    public void showBanner(){
        System.out.println("*** Metodos de Busqueda ***");
    }

    public int inputCode(){
        System.out.println("Ingrese un codigo");
        int code = scanner.nextInt();
        return code;
    }

    public void showMessage(String message){
        System.out.println(message);
    }
    
    public int inputSearchOption(){
        System.out.println("Seleccione el tipo de búsqueda:");
        System.out.println("1. Buscar por código");
        System.out.println("2. Buscar por nombre");
        return scanner.nextInt();
    }
    
    public String inputName(){
        System.out.println("Ingrese un nombre");
        scanner.nextLine();
        return scanner.nextLine();
    }
    

}
