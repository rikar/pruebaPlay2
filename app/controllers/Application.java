package controllers;

import models.Usuario;
import play.data.*;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;
import views.html.registro;;

public class Application extends Controller {
  
    public static Result index() {
        return ok("Hello World");
    }
    
    static Form<Usuario> usuarioForm = Form.form(Usuario.class);
    
    public static Result salir() {
        return ok(index.render("Application Prueba 2 is go out."));
    }
    public static Result registro() {
        return ok(registro.render(usuarioForm));
    }
  
}
