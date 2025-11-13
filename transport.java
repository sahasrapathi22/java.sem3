class Transport {
    void move() {
        System.out.println("Transport is moving");
    }
}

class Bus extends Transport {
    void carryPassengers() {
        System.out.println("Bus is carrying passengers");
    }
}

class Truck extends Transport {
    void carryGoods() {
        System.out.println("Truck is carrying goods");
    }
}

public class transport {
    public static void main(String[] args) {
        Bus bus = new Bus();
        Truck truck = new Truck();

        // Demonstrate hierarchical inheritance
        bus.move();
        bus.carryPassengers();

        truck.move();
        truck.carryGoods();
    }
}
   