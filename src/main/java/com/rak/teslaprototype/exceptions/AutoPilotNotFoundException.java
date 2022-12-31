package com.rak.teslaprototype.exceptions;

import com.rak.teslaprototype.constants.ErrorMessage;

public class AutoPilotNotFoundException extends RuntimeException {
    public AutoPilotNotFoundException(ErrorMessage errorMessage) {
        super(errorMessage.message);
    }
}


