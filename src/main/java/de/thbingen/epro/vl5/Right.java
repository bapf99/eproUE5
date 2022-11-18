package de.thbingen.epro.vl5;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Right extends AbstractEntity{

    private String name;

    private String description;

    private String key;

    @ManyToMany
    private List<Group> groups;

}
