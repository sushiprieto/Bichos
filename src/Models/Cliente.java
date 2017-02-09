package Models;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;

/**
 * Created by Carlos Prieto on 09/02/2017.
 */

@Entity
@Table(name="dbo.BI_Clientes")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cod;

    @Column(name="Nombre")
    private String nombre;

    @Column(name="NumeroCuenta")
    private String numeroCuenta;

    @Column(name="Telefono")
    private String telefono;

    @Column(name="Direccion")
    private String direccion;

    @OneToMany(mappedBy="cliente",cascade= CascadeType.ALL)
    private Set<Mascota> mascotas = new HashSet();

    public Cliente() {
    }

    public Cliente(String nombre, String numeroCuenta, String telefono, String direccion, Set<Mascota> mascotas) {

        this.nombre = nombre;
        this.numeroCuenta = numeroCuenta;
        this.telefono = telefono;
        this.direccion = direccion;
        this.mascotas = mascotas;

    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Set<Mascota> getMascotas() {
        return mascotas;
    }

    public void setMascotas(Set<Mascota> mascotas) {
        this.mascotas = mascotas;
    }

}
