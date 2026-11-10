package app;
import model.Direccion;
import model.Persona;
import model.Empleado;
/** Punto de entrada de Llanquihue Tour. */
public class Main {
    public static void main(String[] args) {
        Direccion direccion1 = new Direccion("Los Volcanes", "123", "Llanquihue", "Los Lagos");
        Direccion direccion2 = new Direccion("Costanera", "456", "Puerto Varas", "Los Lagos");
        Persona cliente = new Persona("12.345.678-9", "Ana Perez", "+56911111111", direccion1);
        Empleado guia = new Empleado("11.111.111-1", "Luis Soto", "+56922222222", direccion2, "Guia turistico", 850000);
        Empleado operador = new Empleado("22.222.222-2", "Maria Diaz", "+56933333333", direccion1, "Operadora", 780000);
        System.out.println("=== LLANQUIHUE TOUR ===");
        System.out.println("Cliente: "+cliente);
        System.out.println("Guia: "+guia);
        System.out.println("Operadora: "+operador);
    }
}
