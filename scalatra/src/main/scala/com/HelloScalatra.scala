package com

import org.scalatra._

class HelloScalatra extends ScalatraServlet {

  get("/") {
    "Hello"
  }

}
