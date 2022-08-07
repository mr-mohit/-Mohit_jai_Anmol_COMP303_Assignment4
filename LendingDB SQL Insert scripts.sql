CREATE DATABASE LendingDB;
USE LendingDB;
DROP TABLE IF EXISTS `Transaction`;

CREATE TABLE `Transaction` (
  `id` int unsigned NOT NULL auto_increment,
  `CustomerId` int,
  `BookId` int,
  `TrxnDate` varchar(255),
  `TrxnType` varchar(255) default NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT fk_Customer_id Foreign Key (id)
  References Customer(id),
  CONSTRAINT fk_Book_id Foreign Key (id)
  References Book(id)
) AUTO_INCREMENT=1;

INSERT INTO `Transaction` (`customerid`,`bookid`,`trxndate`,`trxntype`)
VALUES
  (1,1,"2022-01-20","Check_Out"),
  (2,2,"2023-05-14","Check_Out"),
  (3,3,"2023-06-28","Check_In"),
  (4,4,"2021-08-05","Check_Out"),
  (5,5,"2023-06-05","Check_In");
  
  DROP TABLE IF EXISTS `Book`;

CREATE TABLE `Book` (
  `id` int unsigned NOT NULL auto_increment,
  `Title` varchar(255) default NULL,
  `AuthorsFirstName` varchar(255) default NULL,
  `AuthorsLastName` varchar(255) default NULL,
  `Rating` varchar(255) default NULL,
  PRIMARY KEY (`id`)
) AUTO_INCREMENT=1;

INSERT INTO `Book` (`title`,`authorfirstname`,`authorlastname`,`rating`)
VALUES
  ("Hamlet","William","Shakespeare","5"),
  ("Macbeth","William ","Shakespeare","5"),
  ("In Search of Lost Time","Marcel","Holcomb","4"),
  ("The Great Gatsby","F. Scott","Fitzgerald","4"),
  ("The Merchant of Venice","William","Shakespeare","4");
  
  DROP TABLE IF EXISTS `Customer`;
  
  CREATE TABLE `Customer` (
  `id` int unsigned NOT NULL auto_increment,
  `FirstName` varchar(255) default NULL,
  `LastName` varchar(255) default NULL,
  `Address` varchar(255) default NULL,
  `Phone` varchar(100) default NULL,
  `email` varchar(255) default NULL,
  PRIMARY KEY (`id`)
) AUTO_INCREMENT=1;

INSERT INTO `Customer` (`firstname`,`lastname`,`address`,`phone`,`emailid`)
VALUES
  ("Lenore","Talley","Ap #914-8334 At, Ave","1-831-201-3093","ltalley7574@google.com"),
  ("Kyra","Clayton","961-9730 Nec, Avenue","1-380-189-0457","clayton_kyra@google.net"),
  ("Madonna","Lowery","Ap #238-276 Aliquam St.","1-267-601-6054","lowery_madonna6037@aol.edu"),
  ("Kyla","Lott","Ap #827-7900 In Avenue","1-701-359-7708","lott-kyla3764@google.ca"),
  ("Phelan","Buckner","Ap #373-5060 Gravida Street","1-467-625-7345","b-phelan9626@yahoo.com");