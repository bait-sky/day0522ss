package com.scala.test02

import java.io.{ObjectOutputStream, OutputStream}
import java.net.Socket



object ScalaClient extends Serializable {
  def main(args: Array[String]): Unit = {


     def t1( i : Int):Any = {
        i * 2
     }

        val function : (Int) => Any = t1



        val socket = new Socket("localhost",9999)
        val out: OutputStream = socket.getOutputStream
        val o = new ObjectOutputStream(out)
        o.writeObject(function)


  }


}
