package com.scala.test02

import java.io.{InputStream, ObjectInputStream}
import java.net.{ServerSocket, Socket}

object ScalaServer {
  def main(args: Array[String]): Unit = {

    val server = new ServerSocket(9999)
    val client: Socket = server.accept()
    val in: InputStream = client.getInputStream
    val i = new ObjectInputStream(in)
     val unit: AnyRef = i.readObject()
   val intToInt: Int => Int = unit.asInstanceOf[(Int) => Int]
    println(intToInt(5))



  }
}
