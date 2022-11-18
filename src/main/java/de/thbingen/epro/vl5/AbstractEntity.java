package de.thbingen.epro.vl5;

import javax.persistence.*;

@MappedSuperclass
public class AbstractEntity {

    @Id
    @SequenceGenerator(name = "seqGenerator", sequenceName = "DICTIONARY_SEQ")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqGenerator")
    private Long id;

    /**
     * Returns the identifier of the entity.
     *
     * @return the id
     */
    public Long getId() {
        return id;
    }
}
