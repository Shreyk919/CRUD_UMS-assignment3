package org.knoldus.dao

import java.util.UUID

  /*
   DAO [Data Access Object] created with abstract methods to perform the CRUD operations on the User Management System
   */
  trait Dao[T] {

    def createUser(t:T):Option[UUID]

    def readbyID(id:Option[UUID]): T

    def updateUser(id:Option[UUID], t:T)

    def deleteUser(id:Option[UUID])

    /*
     to list all users
     */
    def read: List[T]

  }
