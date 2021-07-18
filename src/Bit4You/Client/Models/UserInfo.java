package Bit4You.Client.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class UserInfo {

    @SerializedName("sub")
    private Integer sub;
    @SerializedName("iss")
    private String iss;
    @SerializedName("aud")
    private String aud;
    @SerializedName("iat")
    private Integer iat;
    @SerializedName("authTime")
    private Integer authTime;
    @SerializedName("verified")
    private Boolean verified;
    @SerializedName("isChild")
    private Boolean isChild;
    @SerializedName("fullLocked")
    private Boolean fullLocked;
    @SerializedName("name")
    private String name;
    @SerializedName("familyName")
    private String familyName;
    @SerializedName("givenName")
    private String givenName;
    @SerializedName("middleName")
    private String middleName;
    @SerializedName("gender")
    private String gender;
    @SerializedName("birthplace")
    private String birthplace;
    @SerializedName("zoneinfo")
    private String zoneinfo;
    @SerializedName("locale")
    private String locale;
    @SerializedName("currency")
    private String currency;
    @SerializedName("updatedAt")
    private String updatedAt;
    @SerializedName("idNumber")
    private String idNumber;
    @SerializedName("nationality")
    private String nationality;

    public Integer getSub() {
        return sub;
    }

    public void setSub(Integer sub) {
        this.sub = sub;
    }

    public String getIss() {
        return iss;
    }

    public void setIss(String iss) {
        this.iss = iss;
    }

    public String getAud() {
        return aud;
    }

    public void setAud(String aud) {
        this.aud = aud;
    }

    public Integer getIat() {
        return iat;
    }

    public void setIat(Integer iat) {
        this.iat = iat;
    }

    public Integer getAuthTime() {
        return authTime;
    }

    public void setAuthTime(Integer authTime) {
        this.authTime = authTime;
    }

    public Boolean getVerified() {
        return verified;
    }

    public void setVerified(Boolean verified) {
        this.verified = verified;
    }

    public Boolean getIsChild() {
        return isChild;
    }

    public void setIsChild(Boolean isChild) {
        this.isChild = isChild;
    }

    public Boolean getFullLocked() {
        return fullLocked;
    }

    public void setFullLocked(Boolean fullLocked) {
        this.fullLocked = fullLocked;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthplace() {
        return birthplace;
    }

    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace;
    }

    public String getZoneinfo() {
        return zoneinfo;
    }

    public void setZoneinfo(String zoneinfo) {
        this.zoneinfo = zoneinfo;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

}
