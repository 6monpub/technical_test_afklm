package fr.simon.lemaire.technical.test.afklm.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

public class MajorityValidator implements ConstraintValidator<MustBeMajor, Date> {

  @Override
  public boolean isValid(Date value, ConstraintValidatorContext context) {
    LocalDate birth = value.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    return  Period.between(birth, LocalDate.now()).getYears() > 18;
  }

}
