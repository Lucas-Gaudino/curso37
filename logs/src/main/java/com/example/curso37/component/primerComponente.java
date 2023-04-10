package com.example.curso37.component;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

@Component("primerComponente")
public class primerComponente {
    private static final Log LOG = LogFactory.getLog(primerComponente.class);
    public void saludar() {
        LOG.info("Hola desde primerComponente");
    }

}
