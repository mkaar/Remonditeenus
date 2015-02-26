package com.remonditeenus.entities;

import javax.persistence.*;

/**
 * Created by markoka on 26.02.2015.
 */
@Entity
@Table(name = "employee_role", schema = "public", catalog = "remonditeenus")
public class EmployeeRoleEntity {
    private int employeeRole;
    private Integer employeeFk;
    private Integer employeeRoleTypeFk;
    private String active;

    @Id
    @Column(name = "employee_role", nullable = false, insertable = true, updatable = true, precision = 0)
    public int getEmployeeRole() {
        return employeeRole;
    }

    public void setEmployeeRole(int employeeRole) {
        this.employeeRole = employeeRole;
    }

    @Basic
    @Column(name = "employee_fk", nullable = true, insertable = true, updatable = true, precision = 0)
    public Integer getEmployeeFk() {
        return employeeFk;
    }

    public void setEmployeeFk(Integer employeeFk) {
        this.employeeFk = employeeFk;
    }

    @Basic
    @Column(name = "employee_role_type_fk", nullable = true, insertable = true, updatable = true, precision = 0)
    public Integer getEmployeeRoleTypeFk() {
        return employeeRoleTypeFk;
    }

    public void setEmployeeRoleTypeFk(Integer employeeRoleTypeFk) {
        this.employeeRoleTypeFk = employeeRoleTypeFk;
    }

    @Basic
    @Column(name = "active", nullable = true, insertable = true, updatable = true, length = 1)
    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmployeeRoleEntity that = (EmployeeRoleEntity) o;

        if (employeeRole != that.employeeRole) return false;
        if (active != null ? !active.equals(that.active) : that.active != null) return false;
        if (employeeFk != null ? !employeeFk.equals(that.employeeFk) : that.employeeFk != null) return false;
        if (employeeRoleTypeFk != null ? !employeeRoleTypeFk.equals(that.employeeRoleTypeFk) : that.employeeRoleTypeFk != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = employeeRole;
        result = 31 * result + (employeeFk != null ? employeeFk.hashCode() : 0);
        result = 31 * result + (employeeRoleTypeFk != null ? employeeRoleTypeFk.hashCode() : 0);
        result = 31 * result + (active != null ? active.hashCode() : 0);
        return result;
    }
}
