package com.remonditeenus.entities;

import javax.persistence.*;
import java.math.BigInteger;

/**
 * Created by markoka on 26.02.2015.
 */
@Entity
@Table(name = "service_type", schema = "public", catalog = "remonditeenus")
public class ServiceTypeEntity {
    private int serviceType;
    private Integer serviceUnitTypeFk;
    private String typeName;
    private BigInteger servicePrice;

    @Id
    @Column(name = "service_type", nullable = false, insertable = true, updatable = true, precision = 0)
    public int getServiceType() {
        return serviceType;
    }

    public void setServiceType(int serviceType) {
        this.serviceType = serviceType;
    }

    @Basic
    @Column(name = "service_unit_type_fk", nullable = true, insertable = true, updatable = true, precision = 0)
    public Integer getServiceUnitTypeFk() {
        return serviceUnitTypeFk;
    }

    public void setServiceUnitTypeFk(Integer serviceUnitTypeFk) {
        this.serviceUnitTypeFk = serviceUnitTypeFk;
    }

    @Basic
    @Column(name = "type_name", nullable = true, insertable = true, updatable = true, length = 200)
    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    @Basic
    @Column(name = "service_price", nullable = true, insertable = true, updatable = true, precision = 0)
    public BigInteger getServicePrice() {
        return servicePrice;
    }

    public void setServicePrice(BigInteger servicePrice) {
        this.servicePrice = servicePrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ServiceTypeEntity that = (ServiceTypeEntity) o;

        if (serviceType != that.serviceType) return false;
        if (servicePrice != null ? !servicePrice.equals(that.servicePrice) : that.servicePrice != null) return false;
        if (serviceUnitTypeFk != null ? !serviceUnitTypeFk.equals(that.serviceUnitTypeFk) : that.serviceUnitTypeFk != null)
            return false;
        if (typeName != null ? !typeName.equals(that.typeName) : that.typeName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = serviceType;
        result = 31 * result + (serviceUnitTypeFk != null ? serviceUnitTypeFk.hashCode() : 0);
        result = 31 * result + (typeName != null ? typeName.hashCode() : 0);
        result = 31 * result + (servicePrice != null ? servicePrice.hashCode() : 0);
        return result;
    }
}
