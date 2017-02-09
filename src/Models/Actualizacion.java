package Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by Carlos Prieto on 09/02/2017.
 */

@Entity
@Table(name = "dbo.BI_Actualizaciones")
public class Actualizacion {

    @Id
    private int id;
    @Column(name = "Raza")
    private String raza;
    @Column(name = "Especie")
    private String especie;
    @Column(name = "Fecha")
    private Date fecha;
    @Column(name = "Temperatura")
    private int temperatura;
    @Column(name = "Peso")
    private int peso;
    @Column(name = "CodigoMascota")
    private String codigoMascota;
    @Column(name = "FechaNacimiento")
    private Date fechaNacimiento;
    @Column(name = "FechaFallecimiento")
    private Date fechaFallecimiento;

    public Actualizacion() {
    }

    public Actualizacion(int id, String raza, String especie, Date fecha, int temperatura, int peso, String codigoMascota, Date fechaNacimiento, Date fechaFallecimiento) {
        this.id = id;
        this.raza = raza;
        this.especie = especie;
        this.fecha = fecha;
        this.temperatura = temperatura;
        this.peso = peso;
        this.codigoMascota = codigoMascota;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaFallecimiento = fechaFallecimiento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getCodigoMascota() {
        return codigoMascota;
    }

    public void setCodigoMascota(String codigoMascota) {
        this.codigoMascota = codigoMascota;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Date getFechaFallecimiento() {
        return fechaFallecimiento;
    }

    public void setFechaFallecimiento(Date fechaFallecimiento) {
        this.fechaFallecimiento = fechaFallecimiento;
    }

}
