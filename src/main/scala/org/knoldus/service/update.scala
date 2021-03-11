package org.knoldus.service

import org.knoldus.Dao.dao
import org.knoldus.models.User
import java.util.UUID

class update(userDatabase: dao[User]) {

  def getUser(user: User): User => Unit = userDatabase.Create_newUser

  def getList(): List[User] = userDatabase.read()

  def Delete(Address: String) = userDatabase.deleteUser(Address)

  def doUpdate_User(id: UUID, Name: name) = userDatabase.updateUser(id, name)
}
