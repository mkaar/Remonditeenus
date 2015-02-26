package com.remonditeenus.entities;

import javax.persistence.*;

/**
 * Created by markoka on 26.02.2015.
 */
@Entity
@Table(name = "employee_role_type", schema = "public", catalog = "remonditeenus")
public class EmployeeRoleTypeEntity {
    private int employeeRoleType;
    private String typeName;

    @Id
    @Column(name = "employee_role_type", nullable = false, insertable = true, updatable = true, precision = 0)
    public int getEmployeeRoleType() {
        return employeeRoleType;
    }

    public void setEmployeeRoleType(int employeeRoleType) {
        this.employeeRoleType = employeeRoleType;
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

        EmployeeRoleTypeEntity that = (EmployeeRoleTypeEntity) o;

        if (employeeRoleType != that.employeeRoleType) return false;
        if (typeName != null ? !typeName.equals(that.typeName) : that.typeName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = employeeRoleType;
        result = 31 * result + (typeName != null ? typeName.hashCode() : 0);
        return result;
    }
}
