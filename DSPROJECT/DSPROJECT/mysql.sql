Create database carhirebooking;
use carhirebooking;

CREATE TABLE CarHire (
  Car_id int(11) NOT NULL AUTO_INCREMENT,
  TypeOfCar varchar(128) NOT NULL,
  RegNo varchar(25) NOT NULL,
  Price float (20)NOT NULL,
  NoOfDays int(7) NOT NULL,
  Customer_id int(11) NOT NULL,
  Booking_id int(11) NOT NULL ,
  PRIMARY KEY (car_id),
  FOREIGN KEY (Customer_id) REFERENCES Customer(Customer_id),
  FOREIGN KEY (Booking_id) REFERENCES Booking(Booking_id) 
);

CREATE TABLE Customer (
  Customer_id int(11) NOT NULL AUTO_INCREMENT,
  Name varchar(28) NOT NULL,
  Email Varchar(25) NOT NULL,
  PRIMARY KEY (Customer_id),
  UNIQUE KEY Customer_id_UNIQUE (Customer_id),
  UNIQUE KEY `Email_UNIQUE` (Email)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;

CREATE TABLE Booking (
  Booking_id int(11) NOT NULL AUTO_INCREMENT,
  NameOfCar varchar(28) NOT NULL,
  NoOfDays int(11) NOT NULL,
  PRIMARY KEY (Booking_id),
  UNIQUE KEY Booking_id_UNIQUE (Booking_id)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;


INSERT INTO Customer (Name, Email)
VALUES ('Laura','LauraOgba@gmail.com'),
       ('Ellyson','EllysonO@yahoo.com'),
       ('Aliona','AlionaB@gmail.com');
 
       
   
INSERT INTO Booking (NameOfCar, NoOfDays)
VALUES ('Toyota Yaris','7'),
       ('Mercedees Benz CLA','5 '),
       ('Mazda Sport','6');
       
 
 
INSERT INTO CarHire (Customer_id, Booking_id,TypeOfCar, RegNo, Price,NoOfDays)
VALUES (1,1,'Toyota Yaris','09-G-1769','109','7'),
       (2,2,'Mercedees Benz','131-D-8867','500','10'),
       (3,3,'Mazda Sport','181-MH-9966','200','5');
