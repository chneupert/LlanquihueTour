package model;
/** Persona vinculada a la agencia; contiene una direccion. */
public class Persona {
    private String rut, nombre, telefono;
    private Direccion direccion;
    public Persona(String rut, String nombre, String telefono, Direccion direccion) {
        setRut(rut); setNombre(nombre); setTelefono(telefono); setDireccion(direccion);
    }
    public String getRut(){return rut;}
    public void setRut(String rut){this.rut=rut;}
    public String getNombre(){return nombre;}
    public void setNombre(String nombre){this.nombre=nombre;}
    public String getTelefono(){return telefono;}
    public void setTelefono(String telefono){this.telefono=telefono;}
    public Direccion getDireccion(){return direccion;}
    public void setDireccion(Direccion direccion){this.direccion=direccion;}
    @Override public String toString(){return "RUT: "+rut+", nombre: "+nombre+", telefono: "+telefono+", direccion: "+direccion;}
}
