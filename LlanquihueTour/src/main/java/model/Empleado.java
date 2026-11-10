package model;
/** Empleado de la agencia, especializado a partir de Persona. */
public class Empleado extends Persona {
    private String cargo;
    private int sueldo;
    public Empleado(String rut, String nombre, String telefono, Direccion direccion, String cargo, int sueldo) {
        super(rut,nombre,telefono,direccion);
        setCargo(cargo); setSueldo(sueldo);
    }
    public String getCargo(){return cargo;}
    public void setCargo(String cargo){this.cargo=cargo;}
    public int getSueldo(){return sueldo;}
    public void setSueldo(int sueldo){if(sueldo<0) throw new IllegalArgumentException("Sueldo negativo"); this.sueldo=sueldo;}
    @Override public String toString(){return "Empleado ["+super.toString()+", cargo: "+cargo+", sueldo: $"+sueldo+"]";}
}
