package com.remonditeenus.entities;

import javax.persistence.*;
import java.math.BigInteger;

/**
 * Created by markoka on 26.02.2015.
 */
@Entity
@Table(name = "subject_attribute_type", schema = "public", catalog = "remonditeenus")
public class SubjectAttributeTypeEntity {
    private int subjectAttributeType;
    private Integer subjectTypeFk;
    private String typeName;
    private BigInteger dataType;
    private Integer orderby;
    private String required;
    private String multipleAttributes;
    private String createdByDefault;

    @Id
    @Column(name = "subject_attribute_type", nullable = false, insertable = true, updatable = true, precision = 0)
    public int getSubjectAttributeType() {
        return subjectAttributeType;
    }

    public void setSubjectAttributeType(int subjectAttributeType) {
        this.subjectAttributeType = subjectAttributeType;
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
    @Column(name = "type_name", nullable = true, insertable = true, updatable = true, length = 200)
    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    @Basic
    @Column(name = "data_type", nullable = true, insertable = true, updatable = true, precision = 0)
    public BigInteger getDataType() {
        return dataType;
    }

    public void setDataType(BigInteger dataType) {
        this.dataType = dataType;
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
    @Column(name = "required", nullable = true, insertable = true, updatable = true, length = 1)
    public String getRequired() {
        return required;
    }

    public void setRequired(String required) {
        this.required = required;
    }

    @Basic
    @Column(name = "multiple_attributes", nullable = true, insertable = true, updatable = true, length = 1)
    public String getMultipleAttributes() {
        return multipleAttributes;
    }

    public void setMultipleAttributes(String multipleAttributes) {
        this.multipleAttributes = multipleAttributes;
    }

    @Basic
    @Column(name = "created_by_default", nullable = true, insertable = true, updatable = true, length = 1)
    public String getCreatedByDefault() {
        return createdByDefault;
    }

    public void setCreatedByDefault(String createdByDefault) {
        this.createdByDefault = createdByDefault;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SubjectAttributeTypeEntity that = (SubjectAttributeTypeEntity) o;

        if (subjectAttributeType != that.subjectAttributeType) return false;
        if (createdByDefault != null ? !createdByDefault.equals(that.createdByDefault) : that.createdByDefault != null)
            return false;
        if (dataType != null ? !dataType.equals(that.dataType) : that.dataType != null) return false;
        if (multipleAttributes != null ? !multipleAttributes.equals(that.multipleAttributes) : that.multipleAttributes != null)
            return false;
        if (orderby != null ? !orderby.equals(that.orderby) : that.orderby != null) return false;
        if (required != null ? !required.equals(that.required) : that.required != null) return false;
        if (subjectTypeFk != null ? !subjectTypeFk.equals(that.subjectTypeFk) : that.subjectTypeFk != null)
            return false;
        if (typeName != null ? !typeName.equals(that.typeName) : that.typeName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = subjectAttributeType;
        result = 31 * result + (subjectTypeFk != null ? subjectTypeFk.hashCode() : 0);
        result = 31 * result + (typeName != null ? typeName.hashCode() : 0);
        result = 31 * result + (dataType != null ? dataType.hashCode() : 0);
        result = 31 * result + (orderby != null ? orderby.hashCode() : 0);
        result = 31 * result + (required != null ? required.hashCode() : 0);
        result = 31 * result + (multipleAttributes != null ? multipleAttributes.hashCode() : 0);
        result = 31 * result + (createdByDefault != null ? createdByDefault.hashCode() : 0);
        return result;
    }
}
