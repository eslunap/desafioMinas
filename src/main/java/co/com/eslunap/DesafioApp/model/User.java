/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.eslunap.DesafioApp.model;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author ESLUNAP
 */

@Entity
@Table(name = "users")
public class User implements Serializable{
 
    @Id
    @Column (name ="user_id", nullable = false)
    private Long userId;
    
    @Column(name = "user_name", nullable = false)
    private String userName;

    @Column(name = "user_lastname", nullable = false)
    private String userLastname;

    @Column(name = "user_email", nullable = false)
    private String userEmail;

    @Column(name = "user_phone", nullable = false)
    private Long userPhone;

    @Column(name = "user_birthday", nullable = false)
    private String userBirthday;
    
    @Column (name="user_hobbies", nullable = true)
    private String userHobbies;
    
    @Column(name = "user_image", nullable = true )
    private byte[] userImage;
    
    @Column(unique = true) 
    private String username;
    
    @Column
    private String password;

    @Transient 
    private String confirmPassword;
    
    @ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name="user_roles"
		,joinColumns=@JoinColumn(name="user_id")
		,inverseJoinColumns=@JoinColumn(name="role_id"))
	private Set<Role> roles;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserLastname() {
        return userLastname;
    }

    public void setUserLastname(String userLastname) {
        this.userLastname = userLastname;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public Long getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(Long userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserBirthday() {
        return userBirthday;
    }

    public void setUserBirthday(String userBirthday) {
        this.userBirthday = userBirthday;
    }

    public String getUserHobbies() {
        return userHobbies;
    }

    public void setUserHobbies(String userHobbies) {
        this.userHobbies = userHobbies;
    }

    public byte[] getUserImage() {
        return userImage;
    }

    public void setUserImage(byte[] userImage) {
        this.userImage = userImage;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "User{" + "userId=" + userId + ", userName=" + userName + ", userLastname=" + userLastname + ", userEmail=" + userEmail + ", userPhone=" + userPhone + ", userBirthday=" + userBirthday + ", userHobbies=" + userHobbies + ", userImage=" + userImage + ", username=" + username + '}';
    }

  
}
