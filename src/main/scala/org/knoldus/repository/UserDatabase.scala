package org.knoldus.repository

import org.knoldus.dao.Dao
import org.knoldus.model.User
import java.util.UUID
import scala.collection.mutable.ListBuffer

  /*
   Created UserDatabase to implement the CRUD (Create, Read, Update, Delete) operations.
   */
  class UserDatabase extends Dao[User] {

    /**
     * mutable ListBuffer created to implement input operations
     */
    private val inputList:ListBuffer[User]= ListBuffer.empty[User]

    /**
     * method to create a user and to store it in the usersList
     */
    override def createUser(user: User): Option[UUID] = {

      val UserID = UUID.randomUUID()
      user match {

      case User(None, _,_,_,_,_) =>
        inputList.append(user.copy(id=Some(UserID)));
        inputList.last.id

      case User(Some(_),_,_,_,_,_) =>
        null
      }
    }

    /*
     method to get the user based on its id
     */
    override def readbyID (id : Option[UUID]) : User = {

      val newList = inputList.filter(user => {user.id == id})
      if (newList.isEmpty)
      {
        throw new NoSuchElementException
        {"User ID invalid! /n User does not exist"}
      }
      else
      {
        newList.head
      }

    }

    /*
     method to update an user based on its id
     */
    override def updateUser (id : Option[UUID], updatedUser: User) : Unit = {

      val indexOfUser = inputList.indexOf(readbyID(id))

      inputList.update(indexOfUser,updatedUser)

    }

    /*
     method to delete an user based on its id
     */
    override def deleteUser (id : Option[UUID]) : Unit = {

      val indexOfUser = inputList.indexOf(readbyID(id))

      inputList.remove(indexOfUser)
    }

    /*
     method to get all the users
     */
    override def read:List[User] = inputList.toList

}

