package org.qingqiao.bean;

import org.springframework.web.multipart.MultipartFile;

public class User {

    private Integer id;
    private String username;
    private String password;
    private String imgurl;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", imgurl='" + imgurl + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    public User(Integer id, String username, String password, String imgurl) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.imgurl = imgurl;
    }
}
