package de.thbingen.epro.vl5;

import de.thbingen.epro.vl5.entities.User;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends Repository<User, Long> {

    List<User> findByFirstName(@Param("firstName") String firstName);

    List<User> getAllById();

    User getUserById(@Param("id") long id);

    void save(@Param("user") User user);

}
