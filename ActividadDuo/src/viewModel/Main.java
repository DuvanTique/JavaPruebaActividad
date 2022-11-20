package viewModel;

import java.util.HashMap;
import model.ActividadStringModel;
/**
 *
 * @author Duvan
 */
public class Main {

    public static void main(String[] args) {
        String rutaAchivoString = "C:\\Users\\Familia\\Documents\\UNAL\\Programacion orientada a objetos\\Java\\Pruebas\\ActividadDuo\\src\\model\\strings1";
        String rutaArchivoEnunciados = "C:\\Users\\Familia\\Documents\\UNAL\\Programacion orientada a objetos\\Java\\Pruebas\\ActividadDuo\\src\\model\\enunciados1";
        String rutaAchivoString2 = "C:\\Users\\Familia\\Documents\\UNAL\\Programacion orientada a objetos\\Java\\Pruebas\\ActividadDuo\\src\\model\\strings2";
        String rutaArchivoEnunciados2 = "C:\\Users\\Familia\\Documents\\UNAL\\Programacion orientada a objetos\\Java\\Pruebas\\ActividadDuo\\src\\model\\enunciados2";
        String rutaAchivoString3 = "C:\\Users\\Familia\\Documents\\UNAL\\Programacion orientada a objetos\\Java\\Pruebas\\ActividadDuo\\src\\model\\strings3";
        String rutaArchivoEnunciados3 = "C:\\Users\\Familia\\Documents\\UNAL\\Programacion orientada a objetos\\Java\\Pruebas\\ActividadDuo\\src\\model\\enunciados3";
        //Actividad numero 1:
        //ActividadStringModel a1 = new ActividadStringModel(rutaAchivoString,rutaArchivoEnunciados);
        //ControladorActividad c1 = new ControladorActividad(a1.getActividades(),a1.getEnunciados());
        //Actividad numero 2:
        //ActividadStringModel a2 = new ActividadStringModel(rutaAchivoString2, rutaArchivoEnunciados2);
        //ControladorActividad c2 = new ControladorActividad(a2.getActividades(),a2.getEnunciados());
        //Actividad numero 3:
        ActividadStringModel a3 = new ActividadStringModel(rutaAchivoString3, rutaArchivoEnunciados3);
        ControladorActividad c3 = new ControladorActividad(a3.getActividades(), a3.getEnunciados());
    }
}
