CREATE TYPE room_type AS ENUM ('SINGLE','DOUBLE','SUITE');
CREATE TYPE bed AS ENUM ('SINGLE_BED','DOUBLE_BED');
CREATE TYPE status AS ENUM ('CONFIRMED','PENDING','CANCELLED','FINISHED','CHANGED');

CREATE TABLE room
(
    id   SERIAL PRIMARY KEY,
    name room_type NOT NULL,
    number_of_max_guests SMALLINT NOT NULL,
    bed_type bed NOT NULL

);

CREATE TABLE customer
(
    id   SERIAL PRIMARY KEY,
    full_name VARCHAR(255) NOT NULL,
    phone_number VARCHAR(255) NOT NULL,
    email  VARCHAR(255) NOT NULL
);

CREATE TABLE reservations
(
    id   SERIAL PRIMARY KEY,
    reservation_date DATE NOT NULL DEFAULT NOW(),
    reservation_status VARCHAR(20) NOT NULL ,
    number_of_guests SMALLINT NOT NULL ,
    breakfast BOOLEAN DEFAULT FALSE,
    customer_id INTEGER  NOT NULL,
    room_id INTEGER  NOT NULL,
    CONSTRAINT  fk_customer_id FOREIGN KEY (customer_id) REFERENCES customer (id) ON DELETE CASCADE,
    CONSTRAINT  fk_room_id FOREIGN KEY (customer_id) REFERENCES customer (id) ON DELETE CASCADE
);

CREATE TABLE blocklist
(
    id   SERIAL PRIMARY KEY,
    reason VARCHAR(255),
    customer_id INTEGER  NOT NULL,
    CONSTRAINT  fk_customer_id FOREIGN KEY (customer_id) REFERENCES customer (id) ON DELETE CASCADE
);