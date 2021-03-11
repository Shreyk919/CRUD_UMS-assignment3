package org.knoldus.bootstrap

import org.knoldus.Dao.dao
import org.knoldus.db.repo
import org.knoldus.models.{User, Type}
import org.knoldus.service.update
import java.util.UUID.randomUUID

object main {

  def main(args: Array[String]): Unit = {
    val userDatabase:dao[User] = new repo()

    val updateRepo = new update(userDatabase)

    val primaryUser = new User(randomUUID, "Shreyash", 20, "Male",  Type.ADMIN)

    val input2 = new User(randomUUID(), "Saksham", 19, "Male", Type.CUSTOMER)

    userDatabase.Create_newUser(primaryUser)

    println(userDatabase.read())

  }

}
