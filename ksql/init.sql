-- ===== Seminar 7: KSQL на практике =====

-- TODO 10: Создайте STREAM orders поверх топика 'orders'
-- Поля: orderId VARCHAR KEY, product VARCHAR, quantity INT, price DOUBLE
-- Формат: JSON
-- Подсказка:
-- CREATE STREAM orders (...) WITH (kafka_topic = 'orders', value_format = 'JSON');


-- TODO 11: Создайте TABLE product_stats с агрегацией по продуктам
-- Поля: product, COUNT(*) AS order_count, SUM(price * quantity) AS total_revenue
-- Подсказка:
-- CREATE TABLE product_stats AS SELECT ... FROM orders GROUP BY product EMIT CHANGES;


-- TODO 12: Создайте TABLE hourly_orders с оконной агрегацией (Tumbling Window 1 час)
-- Поля: product, COUNT(*) AS cnt, SUM(price * quantity) AS revenue
-- Подсказка:
-- CREATE TABLE hourly_orders AS SELECT ... WINDOW TUMBLING (SIZE 1 HOUR) ...;
