package viewModel;

import model.ActividadStringModel;
/**
 *
 * @author Duvan
 */
public class Main {

    public static void main(String[] args) {
        String rutaAchivoString = "src\\model\\data\\strings1";
        String rutaArchivoEnunciados = "src\\model\\data\\enunciados1";
        String rutaAchivoString2 = "src\\model\\strings2";
        String rutaArchivoEnunciados2 = "src\\model\\data\\enunciados2";
        String rutaAchivoString3 = "src\\model\\data\\strings3";
        String rutaArchivoEnunciados3 = "src\\model\\data\\enunciados3";
        String rutaAchivoString4 = "src\\model\\data\\strings4";
        String rutaArchivoEnunciados4 = "src\\model\\data\\enunciados4";
        //Actividad numero 1:
        //ActividadStringModel a1 = new ActividadStringModel(rutaAchivoString,rutaArchivoEnunciados);
        //ControladorActividad c1 = new ControladorActividad(a1.getActividades(),a1.getEnunciados());
        //Actividad numero 2:
        //ActividadStringModel a2 = new ActividadStringModel(rutaAchivoString2, rutaArchivoEnunciados2);
        //ControladorActividad c2 = new ControladorActividad(a2.getActividades(),a2.getEnunciados());
        //Actividad numero 3:
        //ActividadStringModel a3 = new ActividadStringModel(rutaAchivoString3, rutaArchivoEnunciados3);
        //ControladorActividad c3 = new ControladorActividad(a3.getActividades(), a3.getEnunciados());
        //Actividad numero 4:
        ActividadStringModel a4 = new ActividadStringModel(rutaAchivoString4, rutaArchivoEnunciados4);
        ControladorActividad c4 = new ControladorActividad(a4.getActividades(),a4.getEnunciados());
    }
}
