package io.turbo.prostudios.platform.core.persistence

import org.checkerframework.checker.units.qual.t
import sun.net.www.content.text.Generic
import java.util.UUID

class Query<T> private constructor(
    var data: T,
    var id: UUID
){
      val generic: T = data

      companion object {

          fun <T> data(t: T) {
              
          }
      }
}