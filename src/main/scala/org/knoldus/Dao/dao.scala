package org.knoldus.Dao

import java.util.UUID

trait dao[T] {

  def Create_newUser(t:T)

  def read(): List[T]

  def updateUser(id: UUID, name: String)

  def deleteUser(address: String)

}
