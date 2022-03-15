package com.example.hrms.handler;

import com.example.hrms.entity.Candidate;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class MernisCheckException extends Exception {
    public MernisCheckException(String s) {
      super(s);
    }
}
