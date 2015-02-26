package com.remonditeenus.entities;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Date;

/**
 * Created by markoka on 26.02.2015.
 */
@Entity
@Table(name = "subject_attribute", schema = "public", catalog = "remonditeenus")
public class SubjectAttributeEntity {
    private int subjectAttribute;
    private Integer subjectFk;
    private Integer subjectAttributeTypeFk;
    private Integer subjectTypeFk;
    private Integer orderby;
    private String valueText;
    private BigInteger valueNumber;
    private Date valueDate;
    private BigInteger dataType;

    @Id
    @Column(name = "subject_attribute", nullable = false, insertable = true, updatable = true, precision = 0)
    public int getSubjectAttribute() {
        return subjectAttribute;
    }

    public void setSubjectAttribute(int subjectAttribute) {
        this.subjectAttribute = subjectAttribute;
    }

    @Basic
    @Column(name = "subject_fk", nullable = true, insertable = true, updatable = true, precision = 0)
    public Integer getSubjectFk() {
        return subjectFk;
    }

    public void setSubjectFk(Integer subjectFk) {
        this.subjectFk = subjectFk;
    }

    @Basic
    @Column(name = "subject_attribute_type_fk", nullable = true, insertable = true, updatable = true, precision = 0)
    public Integer getSubjectAttributeTypeFk() {
        return subjectAttributeTypeFk;
    }

    public void setSubjectAttributeTypeFk(Integer subjectAttributeTypeFk) {
        this.subjectAttributeTypeFk = subjectAttributeTypeFk;
    }

    @Basic
    @Column(name = "subject_type_fk", nullable = true, insertable = true, updatable = true, precision = 0)
    public Integer getSubjectTypeFk() {
        return subjectTypeFk;
    }

    public void setSubjectTypeFk(Integer subjectTypeFk) {
        this.subjectTypeFk = subjectTypeFk;
    }

    @Basic
    @Column(name = "orderby", nullable = true, insertable = true, updatable = true, precision = 0)
    public Integer getOrderby() {
        return orderby;
    }

    public void setOrderby(Integer orderby) {
        this.orderby = orderby;
    }

    @Basic
    @Column(name = "value_text", nullable = true, insertable = true, updatable = true, length = 2147483647)
    public String getValueText() {
        return valueText;
    }

    public void setValueText(String valueText) {
        this.valueText = valueText;
    }

    @Basic
    @Column(name = "value_number", nullable = true, insertable = true, updatable = true, precision = 0)
    public BigInteger getValueNumber() {
        return valueNumber;
    }

    public void setValueNumber(BigInteger valueNumber) {
        this.valueNumber = valueNumber;
    }

    @Basic
    @Column(name = "value_date", nullable = true, insertable = true, updatable = true)
    public Date getValueDate() {
        return valueDate;
    }

    public void setValueDate(Date valueDate) {
        this.valueDate = valueDate;
    }

    @Basic
    @Column(name = "data_type", nullable = true, insertable = true, updatable = true, precision = 0)
    public BigInteger getDataType() {
        return dataType;
    }

    public void setDataType(BigInteger dataType) {
        this.dataType = dataType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SubjectAttributeEntity that = (SubjectAttributeEntity) o;

        if (subjectAttribute != that.subjectAttribute) return false;
        if (dataType != null ? !dataType.equals(that.dataType) : that.dataType != null) return false;
        if (orderby != null ? !orderby.equals(that.orderby) : that.orderby != null) return false;
        if (subjectAttributeTypeFk != null ? !subjectAttributeTypeFk.equals(that.subjectAttributeTypeFk) : that.subjectAttributeTypeFk != null)
            return false;
        if (subjectFk != null ? !subjectFk.equals(that.subjectFk) : that.subjectFk != null) return false;
        if (subjectTypeFk != null ? !subjectTypeFk.equals(that.subjectTypeFk) : that.subjectTypeFk != null)
            return false;
        if (valueDate != null ? !valueDate.equals(that.valueDate) : that.valueDate != null) return false;
        if (valueNumber != null ? !valueNumber.equals(that.valueNumber) : that.valueNumber != null) return false;
        if (valueText != null ? !valueText.equals(that.valueText) : that.valueText != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = subjectAttribute;
        result = 31 * result + (subjectFk != null ? subjectFk.hashCode() : 0);
        result = 31 * result + (subjectAttributeTypeFk != null ? subjectAttributeTypeFk.hashCode() : 0);
        result = 31 * result + (subjectTypeFk != null ? subjectTypeFk.hashCode() : 0);
        result = 31 * result + (orderby != null ? orderby.hashCode() : 0);
        result = 31 * result + (valueText != null ? valueText.hashCode() : 0);
        result = 31 * result + (valueNumber != null ? valueNumber.hashCode() : 0);
        result = 31 * result + (valueDate != null ? valueDate.hashCode() : 0);
        result = 31 * result + (dataType != null ? dataType.hashCode() : 0);
        return result;
    }
}
