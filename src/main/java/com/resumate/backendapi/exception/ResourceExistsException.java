package com.resumate.backendapi.exception;

public class ResourceExistsException extends RuntimeException {
   public ResourceExistsException(String message) {
       super(message);
   }
}
