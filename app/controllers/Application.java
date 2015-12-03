package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    public Result index() {
        return ok(index.render("E Test Your new application is ready. TEST Test Modification !!"));
    }

}
