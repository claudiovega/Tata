package cl.exam.exam.helper;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("helper")
public class Helper {
    static Logger logger = LogManager.getLogger(Helper.class);
    @Value("${mensaje.en.properties}")
    String valorMensaje;

    /**
     * Metodo que realiza una acción determinada
     * recibe como parametro un String
     * @return String
     */
    public String metodoHelper(String param){
        logger.info("Init metodoHelper");
        String result = "";
        logger.info(valorMensaje);
        logger.info("End metodoHelper");
        return result;
    }

}
