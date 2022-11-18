package de.thbingen.epro.vl5;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "\"user\"")
public class User extends AbstractEntity{

    private String firstName;

    private String name;

    private String email;

    private String password;

    @ManyToOne
    private Group group;
    
}
