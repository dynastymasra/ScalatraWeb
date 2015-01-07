package com.squarecode.app

class ScalatraWebServlet extends ScalatrawebStack {

  get("/") {
    contentType = "text/html"
    ssp("/pages/home", "menu" -> "/views/menu/menu-home.ssp", "body" -> "/views/pages/home", "footer" -> "/views/pages/footer.ssp")
  }
  
  get("/create") {
    contentType = "text/html"
    ssp("/pages/create", "menu" -> "/views/menu/menu-create.ssp", "body" -> "/views/pages/create", "footer" -> "/views/pages/footer.ssp")
  }
  
  post("/read") {
    contentType = "text/html"
    val data = Data(params("username"), params("email"))
    ssp("/pages/read", "menu" -> "/views/menu/menu-read.ssp", "data" -> data, "footer" -> "/views/pages/footer.ssp")
  }
  
  get("/read") {
    contentType = "text/html"
    ssp("/pages/view", "menu" -> "/views/menu/menu-read.ssp", "body" -> "/views/pages/view", "footer" -> "/views/pages/footer.ssp")
  }
  
  get("/update") {
    contentType = "text/html"
    ssp("/pages/update", "menu" -> "/views/menu/menu-update.ssp", "body" -> "/views/pages/update", "footer" -> "/views/pages/footer.ssp")
  }

  get("/delete") {
    contentType = "text/html"
    ssp("/pages/delete", "menu" -> "/views/menu/menu-delete.ssp", "body" -> "/views/pages/delete", "footer" -> "/views/pages/footer.ssp")
  }
  
  get("/tes/:name") {
    val name = params.getOrElse("name", "world")
    "Hello" + name
  }
}

case class Data(username: String, email: String)
