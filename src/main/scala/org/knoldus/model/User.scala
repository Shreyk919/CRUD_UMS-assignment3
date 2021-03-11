package org.knoldus.model

import java.util.UUID

  /*
   Creating User class that contains various user input parameters
   */
  case class User(id:Option[UUID], name:String, password:String, gender:String, age: Int, _type:User_Type)