package mttechne.challenge.api.cashflow.infra;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.List;

@RestControllerAdvice
public class ErrorHandler
{
    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity Error404()
    {
        return ResponseEntity.notFound().build();
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity Error400(MethodArgumentNotValidException ex)
    {
        List<FieldError> error = ex.getFieldErrors();
        return ResponseEntity.badRequest().body(error.stream().map(ValidationErrorData::new).toList());
    }

    private record ValidationErrorData(String Field, String Message)
    {
        public ValidationErrorData(FieldError error)
        {
            this(error.getField(), error.getDefaultMessage());
        }
    }

}
