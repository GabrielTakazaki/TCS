package com.springSenai.demo.models;

import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class User {
    @Id
    private String id;
    @Indexed(unique = true, direction = IndexDirection.DESCENDING, dropDups = true)
    private String email;
    private String password;
    private String fullName;
    private boolean enable;
    @DBRef
    private Set<Role> roles;
    
    public String getId () {
        return id;
    }
    public String getEmail () {
        return email;
    }
    public String getPassword () {
        return password;
    }
    public String getfullName () {
        return fullName;
    }
    public boolean getEnable () {
        return enable;
    }
    public Set<Role> getRoles () {
        return roles;
    }
    public void setId (String id){
        this.id = id;
    }
    public void setEmail (String email) {
        this.email = email;
    }
    public void setPassword (String password) {
        this.password = password;
    }
    public void setFullName (String fullName) {
        this.fullName = fullName;
    } 
    public void setEnable (boolean enable) {
        this.enable = enable;
    }
    public void setRoles (Set<Role> roles) {
        this.roles = roles;
    }
}