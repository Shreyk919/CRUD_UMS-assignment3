package org.knoldus.model

sealed trait User_Type

  /*
   to define the two user types
   */
  object User_Type{

    case object customer extends User_Type
    case object admin extends User_Type

  }


