package com.burger;
import ilog.rules.engine.IlrContext;
import ilog.rules.engine.IlrExceptionHandler;



public class ContextHelper {

      public static void setExceptionHandler(IlrContext context){
           IlrExceptionHandler handler = new MyExceptionHandler() ;
    	  
            context.setExceptionHandler(handler);
            context.setRuleflowExceptionHandler(handler);
            
            
      }  
}
    
