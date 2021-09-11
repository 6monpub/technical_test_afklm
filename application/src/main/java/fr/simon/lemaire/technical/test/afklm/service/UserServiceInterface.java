package fr.simon.lemaire.technical.test.afklm.service;

import fr.simon.lemaire.technical.test.afklm.json.User;

public interface UserServiceInterface {

    User findById(Long id);

    User save(User user);
}
