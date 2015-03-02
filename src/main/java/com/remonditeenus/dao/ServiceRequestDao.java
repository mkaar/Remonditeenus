package com.remonditeenus.dao;

import com.remonditeenus.entities.ServiceRequestEntity;

import java.util.List;

/**
 * Created by markoka on 2.03.2015.
 */
public interface ServiceRequestDao {
    public void create(ServiceRequestEntity entity) throws Exception;

    public void update(ServiceRequestEntity entity);

    public void delete(Integer id);

    public ServiceRequestEntity getById(Integer id);

    public List<ServiceRequestEntity> getAll();
}
