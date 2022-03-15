package com.example.hrms.handler;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class JobTitleIsAlreadyException extends Exception {
  public JobTitleIsAlreadyException(String s) {
    super(s);
  }
}
