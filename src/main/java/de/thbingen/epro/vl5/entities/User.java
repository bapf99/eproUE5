package de.thbingen.epro.vl5.entities;

import de.thbingen.epro.vl5.entities.AbstractEntity;
import de.thbingen.epro.vl5.entities.Group;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "\"user\"")
public class User extends AbstractEntity {
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    private String firstName;

    private String name;

    private String email;

    private String password;

    @ManyToOne
    private Group group;

}
