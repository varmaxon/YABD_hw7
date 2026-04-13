package ru.bmstu.yabd.producer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import ru.bmstu.yabd.model.OrderEvent;

@Service
@RequiredArgsConstructor
@Slf4j
public class OrderProducer {

    private final KafkaTemplate<String, OrderEvent> kafkaTemplate;

    public void send(OrderEvent event) {
        // TODO 3: Отправьте событие в топик "orders" с ключом orderId
        // Подсказка: kafkaTemplate.send("orders", event.getOrderId(), event)
        throw new UnsupportedOperationException("TODO 3: реализуйте отправку события в Kafka");
    }
}
