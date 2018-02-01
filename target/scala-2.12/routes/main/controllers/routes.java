
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/harrisonbaxter/Applications/ovo/bootcamp-circle-cloudformation/conf/routes
// @DATE:Thu Feb 01 16:37:13 GMT 2018

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseTodoController TodoController = new controllers.ReverseTodoController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseTodoController TodoController = new controllers.javascript.ReverseTodoController(RoutesPrefix.byNamePrefix());
  }

}
