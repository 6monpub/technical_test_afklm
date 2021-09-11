package fr.simon.lemaire.technical.test.afklm.collection;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum Gender {
    @JsonProperty("F")
    FEMALE ("F"),
    @JsonProperty("M")
    MALE ("M"),
    @JsonProperty("O")
    OTHER ("O");

    private String letter;

    Gender(String letter) {
        this.letter = letter;
    }

    public String getLetter() {
        return letter;
    }

    public static Gender findByLetter(String letter) {

        for (Gender gender : Gender.values()) {
            if (gender.getLetter().equals(letter)) {
                return gender;
            }
        }
        return null;
    }

}
