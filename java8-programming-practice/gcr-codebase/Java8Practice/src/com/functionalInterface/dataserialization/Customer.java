package com.functionalInterface.dataserialization;

import java.io.Serializable;

class Customer implements BackupSerializable, Serializable {

    private int id;
    private String name;

    Customer(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
