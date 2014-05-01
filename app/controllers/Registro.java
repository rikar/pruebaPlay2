package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;

public class Registro extends Controller {
    
    public static Result salir() {
        return ok(index.render("Application Prueba 2 is go out."));
    }
    public static Result create() {
        return TODO;
    }
  
}

