package fr.simon.lemaire.technical.test.afklm.service;

import fr.simon.lemaire.technical.test.afklm.json.User;
import fr.simon.lemaire.technical.test.afklm.json.converter.UserConverter;
import fr.simon.lemaire.technical.test.afklm.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserServiceInterface{

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserConverter UserConverter;

    @Override
    public User findById(Long id) {
        return UserConverter.convertVoToJson(userRepository.findById(id).get());
    }

    @Override
    public User save(User user) {
        User result = UserConverter.convertVoToJson(userRepository.save(UserConverter.convertJsonToVo(user)));
        return result;
    }
}
