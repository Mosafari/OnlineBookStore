package Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String username;
    private String password;
    private String roles;
    
 // No-argument constructor (required by JPA)
    public User() {
    }
    
    public User(String username, String password, String roles) {
    	this.username = username;
    	this.password = password;
    	this.roles = roles;
    }
    
 // Getter and setter methods

    public Long getId() {
        return id;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }
}
