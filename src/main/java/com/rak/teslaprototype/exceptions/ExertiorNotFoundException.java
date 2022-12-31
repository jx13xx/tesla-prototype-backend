package com.rak.teslaprototype.exceptions;

import com.rak.teslaprototype.constants.ErrorMessage;

public class ExertiorNotFoundException extends RuntimeException {
    public ExertiorNotFoundException(ErrorMessage errorMessage) {
        super(errorMessage.message);
    }
}


