CREATE TABLE prices (
    id   INTEGER      NOT NULL AUTO_INCREMENT,
    price DECIMAL NOT NULL,
    description VARCHAR(250),
    code_product VARCHAR(250),
    PRIMARY KEY (id)
);