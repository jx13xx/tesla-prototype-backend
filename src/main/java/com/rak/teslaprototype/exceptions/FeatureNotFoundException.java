package com.rak.teslaprototype.exceptions;

import com.rak.teslaprototype.constants.ErrorMessage;

public class FeatureNotFoundException extends RuntimeException {
    public FeatureNotFoundException(ErrorMessage errorMessage) {
        super(errorMessage.message);
    }
}
