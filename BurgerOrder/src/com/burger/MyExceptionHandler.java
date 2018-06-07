package com.burger;

import ilog.rules.engine.IlrExceptionHandler;
import ilog.rules.engine.IlrUserRuntimeException;
public class MyExceptionHandler implements IlrExceptionHandler {

      private static final long serialVersionUID = 1L;
      MyExceptionHandler()
      {
    	  System.out.println("exception occured due to invalid details");
      }

      public boolean handleException(IlrUserRuntimeException runtimeException) {
            if(runtimeException.isInConditions()){
                  System.out.println("name not found");
            }
            
            return false;
      }
}

