class Transport {
    void move() {
        System.out.println("Transport is moving");
    }
}

class Bus extends Transport {
    void carryPassengers() {
        System.out.println("Bus carries passengers");
    }
}

class Truck extends Transport {
    void carryGoods() {
        System.out.println("Truck carries goods");
    }
}

public class bus {
    public static void main(String[] args) {
        Bus bus = new Bus();
        bus.move();
        bus.carryPassengers();

        Truck truck = new Truck();
        truck.move();
        truck.carryGoods();
    }
}
