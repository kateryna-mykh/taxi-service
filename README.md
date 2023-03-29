# taxi-service

This is a small taxi-web application, my training project, build with Java, Servlets, and MySQL DB. 
The "Driver" behaves as a user and can rule data in the database. This app implemented base CRUD functionalities for project models.
It has been written to learn the technologies above and to memorize the material from the course better.

## Technologies

* Java 11
* Servlets 4.0.1
* Apache Tomcat 9.0
* MySQL 8.0.22
* log4j 2.14.1

## Installation and Launch

1. Fork this repository.
2. Clone your forked repository.
3. Go to **resources** folder and copy code from **init_db** file. Execute it in your database.
 * Copy and execute all before 63 line - If you want to fill all data by hand.
 * Copy and execute all - If your want to fill base with **Proposed set of data**
4. In 'ConnectionUtil' specify `USERNAME` and `PASSWORD`.
5. Launch project with Server.

##Usage Example

![login](src/main/resources/img/login_example.png)

![allCars](src/main/resources/img/allCarsDisplaying_example.png)

##Sources

Project was based on a tutorial by ['Mate Academy'](https://mate.academy).
