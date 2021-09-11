package fr.simon.lemaire.technical.test.afklm.repository;

import fr.simon.lemaire.technical.test.afklm.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity, Long> {

}
