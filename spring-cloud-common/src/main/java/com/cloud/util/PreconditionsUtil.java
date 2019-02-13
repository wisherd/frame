package com.cloud.util;

import com.cloud.exception.ParameterException;
import com.google.common.base.Preconditions;


public class PreconditionsUtil {

    public static void checkArgument(int errorCode, boolean expression,  String errorMessageTemplate,  Object... errorMessageArgs) throws ParameterException {
        try {
            Preconditions.checkArgument(expression, errorMessageTemplate,errorMessageArgs);
        } catch (Exception e) {
            throw new ParameterException(errorCode, e.getMessage());
        }
    }

    public static void checkNotNull(int errorCode, Object obj,  String errorMessageTemplate,  Object... errorMessageArgs) throws ParameterException {
        try {
            Preconditions.checkNotNull(obj, errorMessageTemplate,errorMessageArgs);
        } catch (Exception e) {
            throw new ParameterException(errorCode, e.getMessage());
        }
    }
}
