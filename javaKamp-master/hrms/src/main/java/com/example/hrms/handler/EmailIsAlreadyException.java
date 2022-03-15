package com.example.hrms.handler;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class EmailIsAlreadyException extends Exception {
  public EmailIsAlreadyException(String s) {
    super(s);
  }
}
