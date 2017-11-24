/* Clases necesarias para poder crear procesos. */
import java.lang.Process;
import java.lang.Runtime;

/**/
public class LanzaProcesos {
    public static void main(String[] arg) {
        Process nuevoProceso=null; //Definimos una variable de tipo Process
        try{
            nuevoProceso = Runtime.getRuntime().exec("java -classpath ./bin IncrementarEnFichero");
            nuevoProceso = Runtime.getRuntime().exec("java -classpath ./bin IncrementarEnFichero");
            nuevoProceso = Runtime.getRuntime().exec("java -classpath ./bin IncrementarEnFichero");
        }catch (SecurityException ex){
            System.out.println("Ha ocurrido un error de Seguridad."+
                    "No se ha podido crear el proceso por falta de permisos.");
        }catch (Exception ex){
            System.out.println("Ha ocurrido un error, descripción: "+
                    ex.toString());
        }
    }
}
