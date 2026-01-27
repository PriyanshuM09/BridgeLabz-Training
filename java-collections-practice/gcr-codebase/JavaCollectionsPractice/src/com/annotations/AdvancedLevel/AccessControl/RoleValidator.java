package com.annotations.AdvancedLevel.AccessControl;

public class RoleValidator {
    public static boolean hasAccess(Class cls) {
        if (cls.isAnnotationPresent(RoleAllowed.class)) {
            RoleAllowed roleAllowed =
                    (RoleAllowed) cls.getAnnotation(RoleAllowed.class);
            return roleAllowed.value()
                    .equals(UserContext.getRole());
        }
        return true; 
    }
}

