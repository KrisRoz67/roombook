--Insert data into room
INSERT INTO room (name,bed_type, number_of_max_guests)
VALUES ('SINGLE', 'SINGLE_BED', 1),
       ('SINGLE', 'SINGLE_BED', 1),
       ('SINGLE', 'SINGLE_BED', 1),
       ('DOUBLE', 'DOUBLE_BED', 2),
       ('DOUBLE', 'DOUBLE_BED', 2),
       ('DOUBLE', 'DOUBLE_BED', 2),
       ('SUITE', 'QUEEN_BED', 2),
       ('SUITE', 'QUEEN_BED', 2),
       ('SUITE', 'QUEEN_BED', 2);

--Insert data into room
INSERT INTO customer (full_name, phone_number, email)
VALUES ('John Smith', '55665566', 'john@smith.com'),
       ('Joe Black', '55665599', 'joe@black.com'),
       ('Ben Old', '55225566', 'ben@old.com'),
       ('Kate Omg', '55115566', 'kate@omg.com'),
       ('Julia White', '55664466', 'julia@white.com'),
       ('Marta Red', '5512366', 'marta@red.com'),
       ('Rosie Blackwood', '55665566', 'rosieh@blackwood.com');

--Insert data into blocklist
INSERT INTO blocklist (reason, customer_id)
VALUES ('Late cancellations',3 ),
       ('Payment was declined',5),
       ('No-show',6);

--Insert data into room
INSERT INTO reservations (reservation_date, reservation_status,number_of_guests, breakfast, customer_id,room_id)
VALUES ('2024-01-24','PENDING', 1,TRUE,1,1),
       ('2024-01-25','PENDING',1, TRUE,1,1),
       ('2024-01-26','CONFIRMED',2,FALSE,2,4),
       ('2024-01-27','PENDING',1,TRUE,2,5),
       ('2024-01-28','PENDING',2,FALSE,4,8);
