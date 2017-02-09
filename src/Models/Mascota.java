package Models;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;

/**
 * Created by Carlos Prieto on 09/02/2017.
 */

@Entity
@Table(name="dbo.BI_Mascotas")
public class Mascota {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private String cod;

    @Column(name="Raza")
    private String raza;

    @Column(name="Especie")
    private String especie;

    @Column(name="FechaNacimiento")
    private Date fechaNacimiento;

    @Column(name="FechaFallecimiento")
    private Date fechaFallecimiento;

    @Column(name="Alias")
    private String alias;

    @OneToMany(mappedBy="idVisita",cascade = CascadeType.ALL)
    private Set<Visita> visitas = new HashSet();

    @ManyToOne
    @JoinColumn(name="CodigoPropietario")
    private Cliente codPropietario;


    @OneToMany(mappedBy="mascota", cascade= CascadeType.ALL)
    private Set<EnfermedadMascota> enfermedadesMascotas;

    public Mascota(){}

    public Mascota(String cod, String raza, String especie, Date fechaNacimiento, Date fechaFallecimiento, String alias, Set<Visita> visitas, Cliente codPropietario) {

        super();
        this.cod = cod;
        this.raza = raza;
        this.especie = especie;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaFallecimiento = fechaFallecimiento;
        this.alias = alias;
        this.visitas = visitas;
        this.codPropietario = codPropietario;

    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
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

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public Set<Visita> getVisitas() {
        return visitas;
    }

    public void setVisitas(Set<Visita> visitas) {
        this.visitas = visitas;
    }

    public Cliente getcodPropietario() {
        return codPropietario;
    }

    public void setcodPropietario(Cliente codPropietario) {
        this.codPropietario = codPropietario;
    }

    public Set<EnfermedadMascota> getEnfermedadesMascotas() {
        return enfermedadesMascotas;
    }

    public void setEnfermedadesMascotas(Set<EnfermedadMascota> enfermedadesMascotas) {
        this.enfermedadesMascotas = enfermedadesMascotas;
    }

}
