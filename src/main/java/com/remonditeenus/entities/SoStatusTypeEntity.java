package com.remonditeenus.entities;

import javax.persistence.*;

/**
 * Created by markoka on 26.02.2015.
 */
@Entity
@Table(name = "so_status_type", schema = "public", catalog = "remonditeenus")
public class SoStatusTypeEntity {
    private int soStatusType;
    private String typeName;

    @Id
    @Column(name = "so_status_type", nullable = false, insertable = true, updatable = true, precision = 0)
    public int getSoStatusType() {
        return soStatusType;
    }

    public void setSoStatusType(int soStatusType) {
        this.soStatusType = soStatusType;
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

        SoStatusTypeEntity that = (SoStatusTypeEntity) o;

        if (soStatusType != that.soStatusType) return false;
        if (typeName != null ? !typeName.equals(that.typeName) : that.typeName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = soStatusType;
        result = 31 * result + (typeName != null ? typeName.hashCode() : 0);
        return result;
    }
}
