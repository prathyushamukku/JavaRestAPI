

CREATE TABLE Cars (
    VIN varchar(100),
    MYear YEAR,
    Model varchar(100),
    PRIMARY KEY (VIN)
);


CREATE TABLE Customers (
    PersonID int NOT NULL AUTO_INCREMENT,
    Name varchar(100),
    Age varchar(100),
    Occupation varchar(100),
    Salary varchar(100),
    PRIMARY KEY (PersonID)
);

CREATE TABLE Transactions (
    TransactionID int NOT NULL AUTO_INCREMENT,
    PersonID varchar(100),
    Price int(100),
    Dateofpurchase date,
    PRIMARY KEY (TransactionID),
    FOREIGN KEY (PersonID)
);