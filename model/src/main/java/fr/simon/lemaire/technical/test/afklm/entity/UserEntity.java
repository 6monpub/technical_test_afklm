package fr.simon.lemaire.technical.test.afklm.entity;

import fr.simon.lemaire.technical.test.afklm.validator.MustBeMajor;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
@Entity
@Table(name = "user")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    @NotNull
    @NotBlank
    private  String name;

    @MustBeMajor
    @Column(name = "birthday")
    @NotNull
    private Date birthday;

    @Column(name = "country")
    @NotNull
    private String country;

    @Column(name = "phonenumber")
    private String phoneNumber;

    @Column(name = "gender")
    private String gender;
}
