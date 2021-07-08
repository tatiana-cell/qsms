package simplon.com.mcq.validations;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Retention(RUNTIME)
@Target(FIELD)
@Constraint(validatedBy = { UniqueUsernameValidator.class })
public @interface UniqueUsername {
    String message() default "Le Nom d'un Utilisateur Doit être unique";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
