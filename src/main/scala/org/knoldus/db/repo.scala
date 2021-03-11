package org.knoldus.db

import org.knoldus.Dao.dao
import org.knoldus.models.{User, Type}
import java.util.UUID
import scala.collection.mutable.ListBuffer

class repo extends dao[User] {

   private val inputList = ListBuffer.empty[User]

   override def Create_newUser(user: User)= {

    inputList.addOne(user)

  }

  override def read(): List[User] = {
    inputList.toList
  }

  override def updateUser(id: UUID, name: String) = {
    val name = inputList(inputList.indexOf(id))
    val age = inputList(inputList.indexOf(id)).age
    val TypeOfUser = inputList(inputList.indexOf(id)).Type

  }

  override def deleteUser(address: String): Unit = {

    val Userindex = inputList.indexOf(address)
    inputList.remove(Userindex)
  }
}
