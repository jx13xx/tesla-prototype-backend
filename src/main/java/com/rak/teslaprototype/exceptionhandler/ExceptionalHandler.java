package com.rak.teslaprototype.exceptionhandler;

import com.rak.teslaprototype.exceptions.AutoPilotNotFoundException;
import com.rak.teslaprototype.exceptions.ExertiorNotFoundException;
import com.rak.teslaprototype.exceptions.FeatureNotFoundException;
import com.rak.teslaprototype.exceptions.InteriorNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.HashMap;

@ControllerAdvice
@Slf4j
public class ExceptionalHandler {
    @ExceptionHandler(FeatureNotFoundException.class)
    public ResponseEntity<HashMap<String, Object>> handleFeatureNotFoundException(FeatureNotFoundException ex) {

        log.error("Exception FeatureNotFoundException caught : {} ", ex.getMessage(), ex);
        return generateErrorResponse(ex.getMessage(), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(InteriorNotFoundException.class)
    public ResponseEntity<HashMap<String, Object>> handleInteriorNotFoundException(InteriorNotFoundException ex) {

        log.error("Exception FeatureNotFoundException caught : {} ", ex.getMessage(), ex);
        return generateErrorResponse(ex.getMessage(), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(ExertiorNotFoundException.class)
    public ResponseEntity<HashMap<String, Object>> handleExteriorExceptionNotFound(ExertiorNotFoundException ex) {

        log.error("Exception FeatureNotFoundException caught : {} ", ex.getMessage(), ex);
        return generateErrorResponse(ex.getMessage(), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(AutoPilotNotFoundException.class)
    public ResponseEntity<HashMap<String, Object>> handleAutoPilotExceptionNotFound(AutoPilotNotFoundException ex) {

        log.error("Exception FeatureNotFoundException caught : {} ", ex.getMessage(), ex);
        return generateErrorResponse(ex.getMessage(), HttpStatus.NOT_FOUND);
    }

    private ResponseEntity<HashMap<String, Object>> generateErrorResponse(String error, HttpStatus status) {
        HashMap<String, Object> errorMessage = new HashMap<>();
        errorMessage.put("message", error);

        return ResponseEntity.status(status).body(errorMessage);
    }
}
