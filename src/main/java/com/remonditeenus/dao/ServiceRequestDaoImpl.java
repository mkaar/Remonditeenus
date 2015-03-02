package com.remonditeenus.dao;

import com.remonditeenus.entities.ServiceRequestEntity;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by markoka on 3.03.2015.
 */
@Service
public class ServiceRequestDaoImpl implements ServiceRequestDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void create(ServiceRequestEntity entity) throws Exception {
        try {
            entityManager.persist(entity);
        } catch (Exception e) {
            //logger.log(e);
        }
    }

    @Override
    public void update(ServiceRequestEntity entity) {
        ServiceRequestEntity managed;
        try {
            managed = getById(entity.getServiceRequest());
            managed.copyPropertiesFrom(entity);
        } catch (Exception e) {
            //logger.log(e);
        }
    }

    @Override
    public void delete(Integer id) {
        ServiceRequestEntity entity = getById(id);
        entityManager.remove(entity);
    }

    @Override
    public ServiceRequestEntity getById(Integer id) {
        return entityManager.find(ServiceRequestEntity.class, id);
    }

    @Override
    public List<ServiceRequestEntity> getAll() {
        return entityManager.createQuery(
                "SELECT o FROM ServiceRequestEntity o",
                ServiceRequestEntity.class)
                .getResultList();
    }
}
