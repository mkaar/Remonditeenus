package com.remonditeenus.entities;

import javax.persistence.*;

/**
 * Created by markoka on 26.02.2015.
 */
@Entity
@Table(name = "service_action_status_type", schema = "public", catalog = "remonditeenus")
public class ServiceActionStatusTypeEntity {
    private int serviceActionStatusType;
    private String typeName;

    @Id
    @Column(name = "service_action_status_type", nullable = false, insertable = true, updatable = true, precision = 0)
    public int getServiceActionStatusType() {
        return serviceActionStatusType;
    }

    public void setServiceActionStatusType(int serviceActionStatusType) {
        this.serviceActionStatusType = serviceActionStatusType;
    }

    @Basic
    @Column(name = "type_name", nullable = true, insertable = true, updatable = true, length = 200)
    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ServiceActionStatusTypeEntity that = (ServiceActionStatusTypeEntity) o;

        if (serviceActionStatusType != that.serviceActionStatusType) return false;
        if (typeName != null ? !typeName.equals(that.typeName) : that.typeName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = serviceActionStatusType;
        result = 31 * result + (typeName != null ? typeName.hashCode() : 0);
        return result;
    }
}
