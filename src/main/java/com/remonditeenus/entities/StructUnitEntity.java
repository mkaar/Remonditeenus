package com.remonditeenus.entities;

import javax.persistence.*;

/**
 * Created by markoka on 26.02.2015.
 */
@Entity
@Table(name = "struct_unit", schema = "public", catalog = "remonditeenus")
public class StructUnitEntity {
    private int structUnit;
    private Integer enterpriseFk;
    private Integer upperUnitFk;
    private Integer level;
    private String name;

    @Id
    @Column(name = "struct_unit", nullable = false, insertable = true, updatable = true, precision = 0)
    public int getStructUnit() {
        return structUnit;
    }

    public void setStructUnit(int structUnit) {
        this.structUnit = structUnit;
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
    @Column(name = "upper_unit_fk", nullable = true, insertable = true, updatable = true, precision = 0)
    public Integer getUpperUnitFk() {
        return upperUnitFk;
    }

    public void setUpperUnitFk(Integer upperUnitFk) {
        this.upperUnitFk = upperUnitFk;
    }

    @Basic
    @Column(name = "level", nullable = true, insertable = true, updatable = true, precision = 0)
    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    @Basic
    @Column(name = "name", nullable = true, insertable = true, updatable = true, length = 200)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StructUnitEntity that = (StructUnitEntity) o;

        if (structUnit != that.structUnit) return false;
        if (enterpriseFk != null ? !enterpriseFk.equals(that.enterpriseFk) : that.enterpriseFk != null) return false;
        if (level != null ? !level.equals(that.level) : that.level != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (upperUnitFk != null ? !upperUnitFk.equals(that.upperUnitFk) : that.upperUnitFk != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = structUnit;
        result = 31 * result + (enterpriseFk != null ? enterpriseFk.hashCode() : 0);
        result = 31 * result + (upperUnitFk != null ? upperUnitFk.hashCode() : 0);
        result = 31 * result + (level != null ? level.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
