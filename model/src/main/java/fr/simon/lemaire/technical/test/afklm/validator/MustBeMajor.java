package fr.simon.lemaire.technical.test.afklm.validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({ FIELD })
@Retention(RUNTIME)
@Constraint(validatedBy = MajorityValidator.class)
@Documented
public @interface MustBeMajor {

  String message() default "{La majorité est requise.}";

  Class<?>[] groups() default { };

  Class<? extends Payload>[] payload() default { };

}
