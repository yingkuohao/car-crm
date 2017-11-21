package com.ying.js.car.dao.model;

import java.util.Date;

public class FeeBase {
    private Long id;

    private String name;

    private String address;

    private Byte carType;

    private String carLicenseNum;

    private String carFrameNum;

    private String content;

    private Date gmtCreate;

    private Date gmtModified;

    private String phone;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Byte getCarType() {
        return carType;
    }

    public void setCarType(Byte carType) {
        this.carType = carType;
    }

    public String getCarLicenseNum() {
        return carLicenseNum;
    }

    public void setCarLicenseNum(String carLicenseNum) {
        this.carLicenseNum = carLicenseNum == null ? null : carLicenseNum.trim();
    }

    public String getCarFrameNum() {
        return carFrameNum;
    }

    public void setCarFrameNum(String carFrameNum) {
        this.carFrameNum = carFrameNum == null ? null : carFrameNum.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }
}