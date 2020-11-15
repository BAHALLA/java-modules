package main;

import delivery.DeliveryService;


public class Main {

    public static void main(String[] args) throws Exception {
        DeliveryService deliveryService = new DeliveryService();

        //deliveryService.deliver();
        deliveryService.showProduct("TV");
    }
}
