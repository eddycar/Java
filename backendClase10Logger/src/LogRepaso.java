import org.apache.log4j.Logger;

public class LogRepaso {
    private static final Logger logger = Logger.getLogger(LogRepaso.class);

    public static void main(String[] args) {
        logger.info("Aqui comienza el MAIN");

        try{
            String variable = "Hola";
            int division = 1/0;
        }
        catch (Exception e){
            logger.error("No se puede dividir entre cero");
        }
    }
}
