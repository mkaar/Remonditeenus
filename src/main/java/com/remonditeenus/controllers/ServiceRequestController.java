package com.remonditeenus.controllers;

import com.remonditeenus.services.ServiceRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by markoka on 3.03.2015.
 */
@RequestMapping("/servicerequest/**")
@Controller
public class ServiceRequestController {

    private static final String CONTROLLER = "servicerequest";
    private static final String INDEX = CONTROLLER + "/index";

    @Autowired
    ServiceRequestService serviceRequestService;

    @RequestMapping
    public String index(Model uiModel) throws Exception {
        return INDEX;
    }
}
