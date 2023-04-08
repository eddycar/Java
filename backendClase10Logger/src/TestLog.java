import org.apache.log4j.Logger;

public class TestLog {
    private static final Logger logger = Logger.getLogger((TestLog.class));

    public static void main(String[] args) {
        logger.info("Empezamos nuestro método MAIN");
        try {
            String variable = "Hola";
            int división = 1/0;
        }
        catch (Exception e){
            logger.error("Error por dividir por cero ", e );
        }
        logger.warn("Advertencia el metodo Main esta por finalizar");
        logger.debug("Esto va a mostrarse solo si el infoLogger esta en DEBUG");
        logger.info("Finalizamos el thread MAIN");
    }
}
