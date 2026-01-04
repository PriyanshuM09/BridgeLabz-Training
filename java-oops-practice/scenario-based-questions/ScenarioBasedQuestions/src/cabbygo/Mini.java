package cabbygo;

class Mini extends Vehicle {
    Mini(String vehicleNumber) {
        super(vehicleNumber, 4, "Mini", 10);
    }
}

class Sedan extends Vehicle {
    Sedan(String vehicleNumber) {
        super(vehicleNumber, 4, "Sedan", 15);
    }
}

class SUV extends Vehicle {
    SUV(String vehicleNumber) {
        super(vehicleNumber, 6, "SUV", 20);
    }
}
