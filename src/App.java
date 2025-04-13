public class App {
    MetodosBusqueda metodosBusqueda = new MetodosBusqueda();

    public static void main(String[] args) {
        App app = new App();
        int[] arreglo = {5, 8, 12, 3, 7};
        int valorABuscar = 12;

        int indice = app.metodosBusqueda.busquedaLineal(arreglo, valorABuscar);
        if (indice != -1) {
            System.out.println("Valor encontrado en el índice: " + indice);
        } else {
            System.out.println("Valor no encontrado.");
        }
    }
}
