package com.ying.js.car.dao.model;

/**
 * Created by IntelliJ IDEA.
 * User: chengjing
 * Date: 17/11/21
 * Time: 上午10:36
 * CopyRight: ying
 * Descrption:
 */

public class UserDO {

    private Long id;
    private String userName;
    private String profilePicture;
    private String introduction;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }
}
