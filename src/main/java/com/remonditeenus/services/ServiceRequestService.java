package com.remonditeenus.services;

import com.remonditeenus.dao.ServiceRequestDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by markoka on 3.03.2015.
 */
@Service
public class ServiceRequestService {

    @Autowired
    private ServiceRequestDaoImpl serviceRequestDao;


}
