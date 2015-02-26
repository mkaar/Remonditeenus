package com.remonditeenus.entities;

import javax.persistence.*;

/**
 * Created by markoka on 26.02.2015.
 */
@Entity
@Table(name = "address", schema = "public", catalog = "remonditeenus")
public class AddressEntity {
    private int address;
    private Integer addressTypeFk;
    private Integer subjectFk;
    private Integer subjectTypeFk;
    private String country;
    private String county;
    private String townVillage;
    private String streetAddress;
    private String zipcode;

    @Id
    @Column(name = "address", nullable = false, insertable = true, updatable = true, precision = 0)
    public int getAddress() {
        return address;
    }

    public void setAddress(int address) {
        this.address = address;
    }

    @Basic
    @Column(name = "address_type_fk", nullable = true, insertable = true, updatable = true, precision = 0)
    public Integer getAddressTypeFk() {
        return addressTypeFk;
    }

    public void setAddressTypeFk(Integer addressTypeFk) {
        this.addressTypeFk = addressTypeFk;
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
    @Column(name = "subject_type_fk", nullable = true, insertable = true, updatable = true, precision = 0)
    public Integer getSubjectTypeFk() {
        return subjectTypeFk;
    }

    public void setSubjectTypeFk(Integer subjectTypeFk) {
        this.subjectTypeFk = subjectTypeFk;
    }

    @Basic
    @Column(name = "country", nullable = true, insertable = true, updatable = true, length = 50)
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Basic
    @Column(name = "county", nullable = true, insertable = true, updatable = true, length = 100)
    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    @Basic
    @Column(name = "town_village", nullable = true, insertable = true, updatable = true, length = 100)
    public String getTownVillage() {
        return townVillage;
    }

    public void setTownVillage(String townVillage) {
        this.townVillage = townVillage;
    }

    @Basic
    @Column(name = "street_address", nullable = true, insertable = true, updatable = true, length = 100)
    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    @Basic
    @Column(name = "zipcode", nullable = true, insertable = true, updatable = true, length = 50)
    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AddressEntity that = (AddressEntity) o;

        if (address != that.address) return false;
        if (addressTypeFk != null ? !addressTypeFk.equals(that.addressTypeFk) : that.addressTypeFk != null)
            return false;
        if (country != null ? !country.equals(that.country) : that.country != null) return false;
        if (county != null ? !county.equals(that.county) : that.county != null) return false;
        if (streetAddress != null ? !streetAddress.equals(that.streetAddress) : that.streetAddress != null)
            return false;
        if (subjectFk != null ? !subjectFk.equals(that.subjectFk) : that.subjectFk != null) return false;
        if (subjectTypeFk != null ? !subjectTypeFk.equals(that.subjectTypeFk) : that.subjectTypeFk != null)
            return false;
        if (townVillage != null ? !townVillage.equals(that.townVillage) : that.townVillage != null) return false;
        if (zipcode != null ? !zipcode.equals(that.zipcode) : that.zipcode != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = address;
        result = 31 * result + (addressTypeFk != null ? addressTypeFk.hashCode() : 0);
        result = 31 * result + (subjectFk != null ? subjectFk.hashCode() : 0);
        result = 31 * result + (subjectTypeFk != null ? subjectTypeFk.hashCode() : 0);
        result = 31 * result + (country != null ? country.hashCode() : 0);
        result = 31 * result + (county != null ? county.hashCode() : 0);
        result = 31 * result + (townVillage != null ? townVillage.hashCode() : 0);
        result = 31 * result + (streetAddress != null ? streetAddress.hashCode() : 0);
        result = 31 * result + (zipcode != null ? zipcode.hashCode() : 0);
        return result;
    }
}
