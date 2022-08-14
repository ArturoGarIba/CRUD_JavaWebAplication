
package modelo;

public class Productos {
    
    private int id, existencia;
    private String codigo, nombre;
    private double precio;

    public Productos(int id, int existencia, String codigo, String nombre, double precio) {
        this.id = id;
        this.existencia = existencia;
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
}
