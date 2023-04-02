# taxi-service

This is a taxi-web application, my training project, build with Java, Servlets, and MySQL DB. 
The "Driver" behaves as a user and can rule data in the database. 
This app implemented base CRUD functionalities for project models.

* Implemented authentication to Driver.

Operations by models Driver/Manufacturer/Car:
* You can add a new record.
* Displaying all active records by model.
* Delete record.
* Add new driver to car.
* Display cars by current driver.

## Technologies

* Servlets 4.0.1
* Apache Tomcat 9.0
* MySQL 8.0.22
* log4j 2.14.1

## Installation and Launch
You need to install [JDK](https://www.oracle.com/cis/java/technologies/downloads/), [MySQL](https://dev.mysql.com/downloads/installer/), [Tomcat](https://tomcat.apache.org/download-90.cgi), IDE with Java support.

1. Fork this repository.
2. Clone your forked repository.
3. Go to **resources** folder and copy code from **init_db** file. Execute it in your database.
  * Copy and execute all before 63 line - If you want to fill all data by hand.
  * Copy and execute all - If your want to fill base with **Proposed set of data**.
4. In 'ConnectionUtil' specify `USERNAME` and `PASSWORD`.
5. Launch project with Server.

## Usage Example

![login](https://github.com/kateryna-mykh/taxi-service/blob/main/src/main/resources/img/login_example.PNG)

![allCars](https://github.com/kateryna-mykh/taxi-service/blob/main/src/main/resources/img/allCarsDisplaying_example.PNG)

