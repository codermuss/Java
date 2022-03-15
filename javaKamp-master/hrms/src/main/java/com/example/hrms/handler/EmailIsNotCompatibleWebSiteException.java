package com.example.hrms.handler;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class EmailIsNotCompatibleWebSiteException extends Exception {
  public EmailIsNotCompatibleWebSiteException(String s) {
    super(s);
  }
}
