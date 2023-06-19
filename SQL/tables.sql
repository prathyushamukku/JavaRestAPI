CREATE TABLE Cars (
    VIN varchar(100),
    ManufactureYear YEAR,
    Model varchar(100),
    PRIMARY KEY VIN
);

CREATE TABLE Customer (
    PersonID int NOT NULL AUTO_INCREMENT,
    ID,
    Name,
    Age,
    Occupation,
    Salary
    PRIMARY KEY (PersonID);
    FOREIGN KEY ();
);

CREATE TABLE Transactions (
    TransactionID int NOT NULL AUTO_INCREMENT, 
    CustomerID varchar(100),
    carID,
    Price,
    Date
    PRIMARY KEY (TransactionID),
    FOREIGN KEY (CustomerID),
);