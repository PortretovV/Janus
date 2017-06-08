package projectpackages.janus.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import projectpackages.janus.entities.Passport;

/**
 * Created by VP on 04.06.2017.
 */
public class PassportValidator implements Validator {
    public boolean supports(Class<?> aClass) {
        return Passport.class.equals(aClass);
    }

    public void validate(Object o, Errors errors) {
        Passport passport = (Passport)o;
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username", "NotEmpty");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "NotEmpty");

    }
}
