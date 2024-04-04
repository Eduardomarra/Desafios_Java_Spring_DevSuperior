package com.emarra.desafioComponentes.services;

import com.emarra.desafioComponentes.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public double shipment(Order order) {
        double shipment;
        if(order.getBasic() < 100.0) {
            shipment = 20.0;
        }else if(order.getBasic() >= 100.0 && order.getBasic() < 200.0) {
            shipment = 12.0;
        }else {
            shipment = 0.0;
        }
        return shipment;
    }
}