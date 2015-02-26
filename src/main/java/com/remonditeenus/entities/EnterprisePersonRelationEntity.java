package com.remonditeenus.entities;

import javax.persistence.*;

/**
 * Created by markoka on 26.02.2015.
 */
@Entity
@Table(name = "enterprise_person_relation", schema = "public", catalog = "remonditeenus")
public class EnterprisePersonRelationEntity {
    private int enterprisePersonRelation;
    private Integer personFk;
    private Integer enterpriseFk;
    private Integer entPerRelationTypeFk;

    @Id
    @Column(name = "enterprise_person_relation", nullable = false, insertable = true, updatable = true, precision = 0)
    public int getEnterprisePersonRelation() {
        return enterprisePersonRelation;
    }

    public void setEnterprisePersonRelation(int enterprisePersonRelation) {
        this.enterprisePersonRelation = enterprisePersonRelation;
    }

    @Basic
    @Column(name = "person_fk", nullable = true, insertable = true, updatable = true, precision = 0)
    public Integer getPersonFk() {
        return personFk;
    }

    public void setPersonFk(Integer personFk) {
        this.personFk = personFk;
    }

    @Basic
    @Column(name = "enterprise_fk", nullable = true, insertable = true, updatable = true, precision = 0)
    public Integer getEnterpriseFk() {
        return enterpriseFk;
    }

    public void setEnterpriseFk(Integer enterpriseFk) {
        this.enterpriseFk = enterpriseFk;
    }

    @Basic
    @Column(name = "ent_per_relation_type_fk", nullable = true, insertable = true, updatable = true, precision = 0)
    public Integer getEntPerRelationTypeFk() {
        return entPerRelationTypeFk;
    }

    public void setEntPerRelationTypeFk(Integer entPerRelationTypeFk) {
        this.entPerRelationTypeFk = entPerRelationTypeFk;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EnterprisePersonRelationEntity that = (EnterprisePersonRelationEntity) o;

        if (enterprisePersonRelation != that.enterprisePersonRelation) return false;
        if (entPerRelationTypeFk != null ? !entPerRelationTypeFk.equals(that.entPerRelationTypeFk) : that.entPerRelationTypeFk != null)
            return false;
        if (enterpriseFk != null ? !enterpriseFk.equals(that.enterpriseFk) : that.enterpriseFk != null) return false;
        if (personFk != null ? !personFk.equals(that.personFk) : that.personFk != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = enterprisePersonRelation;
        result = 31 * result + (personFk != null ? personFk.hashCode() : 0);
        result = 31 * result + (enterpriseFk != null ? enterpriseFk.hashCode() : 0);
        result = 31 * result + (entPerRelationTypeFk != null ? entPerRelationTypeFk.hashCode() : 0);
        return result;
    }
}
