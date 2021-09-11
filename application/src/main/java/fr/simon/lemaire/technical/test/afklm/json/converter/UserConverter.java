package fr.simon.lemaire.technical.test.afklm.json.converter;

import fr.simon.lemaire.technical.test.afklm.collection.Gender;
import fr.simon.lemaire.technical.test.afklm.entity.UserEntity;
import fr.simon.lemaire.technical.test.afklm.json.User;
import org.springframework.stereotype.Component;

@Component
public class UserConverter implements Converter<UserEntity, User> {
    @Override
    public User convertVoToJson(UserEntity userEntity) {

        return new User(userEntity.getId(), userEntity.getName(), userEntity.getBirthday(), userEntity.getCountry()
                , userEntity.getPhoneNumber(),
                userEntity.getGender() != null ? Gender.findByLetter(userEntity.getGender()) : null)
        ;
    }

    @Override
    public UserEntity convertJsonToVo(User user) {
        return new UserEntity(user.getId(),user.getName(), user.getBirthday(), user.getCountry(), user.getPhoneNumber()
                , user.getGender()!=null ? user.getGender().getLetter() : null);
    }
}
