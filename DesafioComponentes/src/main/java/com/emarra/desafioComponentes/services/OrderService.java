package com.emarra.desafioComponentes.services;

import com.emarra.desafioComponentes.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private ShippingService shippingService;

    public double total(Order order){
        double shipment = shippingService.shipment(order);
        return order.getBasic() * (1 - order.getDiscount()/100) + shipment;
    }
}
