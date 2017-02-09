import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Carlos Prieto on 09/02/2017.
 */
public class Manejadora {

    MySessionFactory sessionFactory = new MySessionFactory();

    /**
     * Recibe un resulset de la tabla actualizaciones y hará comprobaciones
     * @param resul
     * @return
     */
    public int comprobacion(ResultSet resul){

        String raza;
        String enfermedad;

        int comprobacion = 0;

        try {

            raza = resul.getString("Raza");
            enfermedad = resul.getString("Enfermedad");

            if (raza == null){

                if (enfermedad == null){
                    comprobacion = 1;
                }else{
                    comprobacion = 2;
                }

            }else {

                if(enfermedad == null){
                    comprobacion = 3;
                }else{
                    comprobacion = 4;
                }

            }

        }catch (SQLException e){
            e.printStackTrace();
        }

        return comprobacion;

    }

    /**
     * Inserta en la tabla visitas una fila con los datos
     * @param resul
     */
    public void insertaVisitas(ResultSet resul){

        int peso;
        int temperatura;
        String codMascota;
        Date fechaVisita;

        try {

            fechaVisita = resul.getDate("Fecha");
            temperatura = resul.getInt("Temperatura");
            peso = resul.getInt("Peso");
            codMascota = resul.getString("CodigoMascota");

            //Ahora hay que hacer la sentencia sql para insertar en la BBDD una nueva fila con los datos de la misma pero no se como

        }catch (SQLException e){
            e.printStackTrace();
        }

    }

    /**
     * Crea una mascota nueva con los datos de la fila del resulset
     * @param resul
     */
    public void crearNuevaMascota(ResultSet resul){

        String cod;
        String raza;
        String especie;
        Date fechaNacimiento;
        String alias;
        int codPropietario;

        try {

            cod = resul.getString("Cod");
            raza = resul.getString("Raza");
            especie = resul.getString("Especie");
            fechaNacimiento = resul.getDate("FechaNacimiento");
            alias = resul.getString("Alias");
            codPropietario = resul.getInt("CodPropietario");

            String sql = "INSERT INTO BI_Mascotas (Codigo, Raza , Especie, FechaNacimiento, Alias, CodigoPropietario) VALUES (" + cod + ", " + raza + ", " + especie + ", " + fechaNacimiento + ", " + alias + ", " + codPropietario + ")";

            //Ahora hay que abrir una conexion, ejecutar la sentencia sql mediante un executeQuery(sql) y cerrar la conexion pero no se como


        }catch (SQLException e){
            e.printStackTrace();
        }

    }

    /**
     * Ingresa la enfermedad con los catos del resulset
     * @param resul
     */
    public void addEnfermedad(ResultSet resul){

        String nombre;
        String codMascota;
        Date fechaDiagnostico;

        try {

            nombre = resul.getString("Enfermedad");
            codMascota = resul.getString("codigoMascota");
            fechaDiagnostico = resul.getDate("Fecha");

            //Ahora hay que hacer la sentencia sql para añadir la nueva enfermedad a la tabla con los datos del resulset pero no se como y cerrar la conexion

        }catch (SQLException e){
            e.printStackTrace();
        }

    }

}
