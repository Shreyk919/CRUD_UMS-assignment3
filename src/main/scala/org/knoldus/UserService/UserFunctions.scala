package org.knoldus.UserService

import org.knoldus.dao.Dao
import org.knoldus.model.User
import java.util.UUID

  /**
   * Created the UserFunctions to support the operations from the other classes
   * This method does not consider how the values are input or implemented
   */
  class UserFunctions(userDBRepo: Dao[User]) {

    /*
     method to read the user inputs
     */
    def getUser(user: User):Option[UUID]={

      userDBRepo.createUser(user)

    }

    /*
     method tp check the inputs by their ID
     */
    def getUserByID(id:Option[UUID]):User = {

      userDBRepo.readbyID(id)

    }

    /*
     method to update the user without bothering about how the user is actually updated
     */
    def updateUser(id:Option[UUID], updatedUser: User):Unit = {

      userDBRepo.updateUser(id,updatedUser)

    }

    /*
     method to delete a user based on its id without bothering about how the user is actually deleted
     */
    def deleteUser(id:Option[UUID]):Unit = {

      userDBRepo.deleteUser(id)

  }

    /*
     method to get all the users without bothering about how they are actually fetched
     */
    def getAllUsers:List[User] = userDBRepo.read

}
