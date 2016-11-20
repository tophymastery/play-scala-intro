package models

import play.api.libs.json.Json

/**
  * Created by akadet on 11/21/2016 AD.
  */
case class Persion(name: String)

object Persion {
  implicit val personFormat = Json.format[Persion]
}
