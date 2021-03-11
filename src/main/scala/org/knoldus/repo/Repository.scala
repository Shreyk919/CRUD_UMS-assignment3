package org.knoldus.repo

import org.knoldus.dao.DAO
import org.knoldus.models.{User, UserType}

import java.util.UUID

class Repository extends DAO [User]{
  var dataRepository : Map[UUID , User] = Map()

  override def createUser(user: User): Unit = dataRepository += (user.UUID -> user )

  override def listUser(): List[UUID] = dataRepository.keys.toList

  override def updateUser(id: UUID, new_name: String) = {
    val user = User(id , new_name , dataRepository(id).usertype)
    dataRepository(id) == user
  }

  override def deleteUser(id : UUID) = dataRepository -= id
