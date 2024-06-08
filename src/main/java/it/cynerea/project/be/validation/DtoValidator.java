package it.cynerea.project.be.validation;

import it.cynerea.project.be.error.BadRequestException;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
public class DtoValidator {

    ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
    Validator validator = factory.getValidator();
    Set<ConstraintViolation<Object>> violations;

    public void validate(Object object) {
        violations = validator.validate(object);
        if (!violations.isEmpty()) {
            StringBuilder message = new StringBuilder();
            for (ConstraintViolation<Object> violation : violations) {
                message.append(violation.getPropertyPath()).append(" ").append(violation.getMessage()).append("\n");
            }
            throw new BadRequestException(message.toString());
        }
    }

}
