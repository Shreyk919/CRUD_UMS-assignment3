package org.knoldus.bootstrap

import org.knoldus.dao.Dao
import org.knoldus.repository.UserDatabase
import org.knoldus.model.User
import org.knoldus.UserService.UserFunctions
import org.knoldus.model.User_Type

  /*
   Main object
   */
  object main {

  /*
   Created main method to check the CRUD operations
   */
    def main(args: Array[String]): Unit = {

      val userDataBase:Dao[User] = new UserDatabase()
      val userOperations = new UserFunctions(userDataBase)

      /**
       * Input Users :- Admin and Customer
       */
      val Admin = User(None, "Shreyash", "sk123", "Male", 20, User_Type.admin)

      val user1 = User(None, "Saksham", "Password1#", "Male", 19, User_Type.customer)

      val user2 = User(None, "Dhruv", "dv123", "Male", 21, User_Type.customer)

      val user3 = User(None, "Shivani", "sv2354", "Female", 21, User_Type.customer)

      /*
        read the inputs from above
       */
      val Admin_id = userOperations.getUser(Admin)
      val user1_id = userOperations.getUser(user1)
      val user2_id = userOperations.getUser(user2)
      val user3_id = userOperations.getUser(user3)


      /**
       * List all users together at once
       */
      println(userOperations.getAllUsers)

      /**
       * check the update operation by updating admin
       */
      val updated_user2= userOperations.getUserByID(user1_id).copy(name = "ashu")
      userOperations.updateUser(user1_id, updated_user2)

      /**
       * TO Delete any entry
       */
      userOperations.deleteUser(user3_id)

  }

}