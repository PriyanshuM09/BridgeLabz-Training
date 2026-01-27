package com.annotations.AdvancedLevel.AccessControl;

@RoleAllowed("ADMIN")
public class AdminService {
    public void deleteUser() {
        System.out.println("User deleted successfully!");
    }
}

