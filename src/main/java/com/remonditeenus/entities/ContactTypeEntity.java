package com.remonditeenus.entities;

import javax.persistence.*;

/**
 * Created by markoka on 26.02.2015.
 */
@Entity
@Table(name = "contact_type", schema = "public", catalog = "remonditeenus")
public class ContactTypeEntity {
    private int contactType;
    private String typeName;

    @Id
    @Column(name = "contact_type", nullable = false, insertable = true, updatable = true, precision = 0)
    public int getContactType() {
        return contactType;
    }

    public void setContactType(int contactType) {
        this.contactType = contactType;
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

        ContactTypeEntity that = (ContactTypeEntity) o;

        if (contactType != that.contactType) return false;
        if (typeName != null ? !typeName.equals(that.typeName) : that.typeName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = contactType;
        result = 31 * result + (typeName != null ? typeName.hashCode() : 0);
        return result;
    }
}
