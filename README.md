# USER MANAGEMENT SYSTEM

## Scala OOPs Assignment 

A basic User Management System that follows SOLID principles and uses mutable data structure.
All files are packed in org.knoldus package 

## The System performs the following CRUD operations

* Create User and define its type -> **createUser**
* Read User using the Random ID generated -> **readbyId** and **read**
* Update User details -> **updateUser**
* Delete User from database -> **deleteUser**


## The above operations are performed by multiple classes. They are- 

* Bootstrap -> main
* dao -> Dao
* model -> User and User_Type
* repositiry -> UserDatabase
* UserService -> UserFunctions

## Test cases added. 

* To test code 

```
  $ sbt test
```

* To check coverage

```
$ sbt clean coverage test
```

* To get coverage report

```
$ sbt coverageReport
```


