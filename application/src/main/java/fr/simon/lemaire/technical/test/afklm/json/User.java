package fr.simon.lemaire.technical.test.afklm.json;

import fr.simon.lemaire.technical.test.afklm.collection.Gender;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class User {

    private Long id;

    private  String name;

    private Date birthday;

    private String country;

    private String phoneNumber;

    private Gender gender;
}
