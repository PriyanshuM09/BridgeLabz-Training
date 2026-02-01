package com.streamapi.expiringmemberships;
import java.time.LocalDate;

class GymMember {
    private String name;
    private LocalDate expiryDate;

    public GymMember(String name, LocalDate expiryDate) {
        this.name = name;
        this.expiryDate = expiryDate;
    }

    public String getName() {
        return name;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public String toString() {
        return name + "  Expiry Date: " + expiryDate;
    }
}
