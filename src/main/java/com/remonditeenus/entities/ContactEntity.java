package com.remonditeenus.entities;

import javax.persistence.*;

/**
 * Created by markoka on 26.02.2015.
 */
@Entity
@Table(name = "contact", schema = "public", catalog = "remonditeenus")
public class ContactEntity {
    private int contact;
    private Integer subjectFk;
    private Integer contactTypeFk;
    private String valueText;
    private Integer orderby;
    private Integer subjectTypeFk;
    private String note;

    @Id
    @Column(name = "contact", nullable = false, insertable = true, updatable = true, precision = 0)
    public int getContact() {
        return contact;
    }

    public void setContact(int contact) {
        this.contact = contact;
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
    @Column(name = "contact_type_fk", nullable = true, insertable = true, updatable = true, precision = 0)
    public Integer getContactTypeFk() {
        return contactTypeFk;
    }

    public void setContactTypeFk(Integer contactTypeFk) {
        this.contactTypeFk = contactTypeFk;
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
    @Column(name = "orderby", nullable = true, insertable = true, updatable = true, precision = 0)
    public Integer getOrderby() {
        return orderby;
    }

    public void setOrderby(Integer orderby) {
        this.orderby = orderby;
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
    @Column(name = "note", nullable = true, insertable = true, updatable = true, length = 2147483647)
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ContactEntity that = (ContactEntity) o;

        if (contact != that.contact) return false;
        if (contactTypeFk != null ? !contactTypeFk.equals(that.contactTypeFk) : that.contactTypeFk != null)
            return false;
        if (note != null ? !note.equals(that.note) : that.note != null) return false;
        if (orderby != null ? !orderby.equals(that.orderby) : that.orderby != null) return false;
        if (subjectFk != null ? !subjectFk.equals(that.subjectFk) : that.subjectFk != null) return false;
        if (subjectTypeFk != null ? !subjectTypeFk.equals(that.subjectTypeFk) : that.subjectTypeFk != null)
            return false;
        if (valueText != null ? !valueText.equals(that.valueText) : that.valueText != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = contact;
        result = 31 * result + (subjectFk != null ? subjectFk.hashCode() : 0);
        result = 31 * result + (contactTypeFk != null ? contactTypeFk.hashCode() : 0);
        result = 31 * result + (valueText != null ? valueText.hashCode() : 0);
        result = 31 * result + (orderby != null ? orderby.hashCode() : 0);
        result = 31 * result + (subjectTypeFk != null ? subjectTypeFk.hashCode() : 0);
        result = 31 * result + (note != null ? note.hashCode() : 0);
        return result;
    }
}
