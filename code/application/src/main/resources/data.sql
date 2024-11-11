-- SCHEMA

CREATE SCHEMA if not exists BCNC_TEST;

SET SCHEMA BCNC_TEST;

CREATE TABLE if not exists PRICES (
    id integer GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    brand_id integer NOT NULL,
    start_date timestamp,
    end_date timestamp,
    price_list integer,
    product_id integer,
    priority integer,
    price decimal(10,2),
    curr varchar(50)
);

CREATE TABLE if not exists CHAIN (
    id integer GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    name varchar(50)
);

ALTER TABLE PRICES
    ADD FOREIGN KEY (brand_id) REFERENCES CHAIN(id);


-- DATA

INSERT INTO CHAIN (name) VALUES ('ZARA');

INSERT INTO PRICES (brand_id, start_date, end_date, price_list, product_id, priority, price, curr) VALUES
    (1, '2020-06-14 00.00.00', '2020-12-31 23.59.59', 1, 35455, 0, 35.50, 'EUR'),
    (1, '2020-06-14 15.00.00', '2020-06-14 18.30.00', 2, 35455, 1, 25.45, 'EUR'),
    (1, '2020-06-15 00.00.00', '2020-06-15 11.00.00', 3, 35455, 1, 30.50, 'EUR'),
    (1, '2020-06-15 16.00.00', '2020-12-31 23.59.59', 4, 35455, 1, 38.95, 'EUR');

-- EOF