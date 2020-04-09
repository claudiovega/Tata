package cl.exam.exam.controller;

import cl.exam.exam.helper.Helper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/exam/service/controller")
public class Controller {

    static Logger logger = LogManager.getLogger(Controller.class);

    @Autowired
    Helper helper;

    @CrossOrigin
    @RequestMapping(value ="/metodoRequestParam", method = RequestMethod.POST)
    public String metodoRequestParam(@RequestParam String param){
        logger.info("Parametro recibido: "+param);
        String result = "";


        return result;
    }
    @CrossOrigin
    @RequestMapping(value ="/metodoRequestBody", method = RequestMethod.POST)
    public String metodoRequestBody(@RequestBody String param){
        logger.info("Parametro recibido: "+param);
        String result = "";


        return result;
    }
}
