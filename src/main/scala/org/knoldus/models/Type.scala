package org.knoldus.models

sealed trait Type

object Type {

  case object ADMIN extends Type

  case object CUSTOMER extends Type

}
