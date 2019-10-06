package org.scalatra.example

import org.scalatra.test.specs2._

class TwirlExampleSpec extends ScalatraSpec { def is = s2"""
  GET / on ScalatraTwirlServlet
    should return status 200 & body text generated by template $root
"""

  addServlet(classOf[ScalatraTwirlServlet], "/*")

  def root = get("/") {
    {
      status must_== 200
    } and {
      body must contain("Twirl reporting for duty")
    }
  }
}