package de.thbingen.epro.vl5;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Group extends AbstractEntity{

    private String name;
    private String description;

    @ManyToMany
    private List<Right> rights;

}
