# pcf-demo

This is a sample spring boot web services application exposing get API. 
Service endpoints : 
http://localhost:8080/user
http://localhost:8080/user/1

In default profile, application creates an in memory database and gets data from this database as JSON. 
In cloud profile, app connects to a mysql database on cloud with service name mysqldb. 
This project uses Spring cloud service connector to connect to cloud mysql service
http://cloud.spring.io/spring-cloud-connectors/spring-cloud-spring-service-connector.html#_relational_database_db2_mysql_oracle_postgresql_sql_server.



