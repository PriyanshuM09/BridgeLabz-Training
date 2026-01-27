package com.annotations.deprecated;

public class TestLegacyAPI {

    public static void main(String[] args) {
        LegacyAPI api = new LegacyAPI();
        // Deprecated method call 
        api.oldFeature();

        api.newFeature();
    }
}

