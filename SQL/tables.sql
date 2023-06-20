-- Table for cars

CREATE TABLE Cars (
    --VIN for the vehicle
    VIN varchar(100),
    --manufacture year
    MYear YEAR,
    --Model for the car
    Model varchar(100),
    --The vin is the primary key
    PRIMARY KEY (VIN)
);

--Table for customer

CREATE TABLE Customer (
    --ID for the customer
    PersonID int NOT NULL AUTO_INCREMENT,
    --name of customer
    Name varchar(100),
    --age of customer
    Age varchar(100),
    --Occupation of customer
    Occupation varchar(100),
    --salary
    Salary varchar(100),
    --the person ID is this tables  primary key
    PRIMARY KEY (PersonID)
);

--Table for transactions

CREATE TABLE Transactions (
    --Transaction increment ID
    TransactionID int NOT NULL AUTO_INCREMENT,
    --Customer ID
    PersonID varchar(100),
    --Price for the vehicle
    Price int(100),
    --The day that they purchased the vehicle
    Dateofpurchase date,
    --Auto increment transaction ID
    PRIMARY KEY (TransactionID),
    --PersonID is our secondary key
    FOREIGN KEY (PersonID)
);