package org.knoldus.models

import java.util.UUID

class User {

  case class User(ID: UUID, name: String, age: Int, sex: String, userType: Type)
}
