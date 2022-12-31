package com.rak.teslaprototype.exceptions;

import com.rak.teslaprototype.constants.ErrorMessage;

public class InteriorNotFoundException extends RuntimeException {
    public InteriorNotFoundException(ErrorMessage errorMessage) {
        super(errorMessage.message);
    }
}


