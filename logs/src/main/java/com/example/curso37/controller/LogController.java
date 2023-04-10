package com.example.curso37.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class LogController {
        @Autowired
        @Qualifier("primerComponente")

        private static final Log LOG = LogFactory.getLog(LogController.class);

        @GetMapping("/metodo1")
        public String Metodo1() {
            LOG.info("INFO TRACE metodo 1");
            return "view1";
        }

        @GetMapping("/metodo2")
        public String Metodo2() {
            LOG.info("INFO TRACE metodo 2");
            return "view2";
        }


}
