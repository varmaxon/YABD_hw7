package ru.bmstu.yabd.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.bmstu.yabd.model.OrderEvent;
import ru.bmstu.yabd.producer.OrderProducer;

import java.util.Map;

// TODO 4: Добавьте аннотации @RestController и @RequestMapping("/api/orders")
@RestController
@RequestMapping("/api/orders")
@RequiredArgsConstructor
public class OrderController {

    private final OrderProducer producer;

    // TODO 5: Создайте метод POST для создания заказа
    // Метод принимает @RequestBody OrderEvent event
    // Вызывает producer.send(event)
    // Возвращает ResponseEntity.ok(Map.of("status", "sent", "orderId", event.getOrderId()))

    @PostMapping
    public ResponseEntity<Map<String, String>> create(@RequestBody OrderEvent event) {
        producer.send(event);
        
        return ResponseEntity.ok(Map.of("status", "sent", "orderId", event.orderId()));
    }

}
