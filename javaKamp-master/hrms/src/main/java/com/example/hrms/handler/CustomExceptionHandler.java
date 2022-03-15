package com.example.hrms.handler;

import com.example.hrms.core.utilities.results.concretes.ErrorResult;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class CustomExceptionHandler extends ResponseEntityExceptionHandler {

  ErrorResult result;

  @ExceptionHandler(EmailIsAlreadyException.class)
  public ResponseEntity<Object> handleEmailIsAlreadyException(
      EmailIsAlreadyException ex, WebRequest request) {
    result = new ErrorResult(false, ex.getMessage());
    return new ResponseEntity<>(result, HttpStatus.BAD_REQUEST);
  }

  @ExceptionHandler(IdentityNoIsAlreadyException.class)
  public ResponseEntity<Object> handleIdentityNoIsAlreadyException(
      IdentityNoIsAlreadyException ex, WebRequest request) {
    result = new ErrorResult(false, ex.getMessage());
    return new ResponseEntity<>(result, HttpStatus.BAD_REQUEST);
  }

  @ExceptionHandler(JobTitleIsAlreadyException.class)
  public ResponseEntity<Object> handleJobTitleIsAlreadyException(
      JobTitleIsAlreadyException ex, WebRequest request) {
    result = new ErrorResult(false, ex.getMessage());
    return new ResponseEntity<>(result, HttpStatus.BAD_REQUEST);
  }

  @ExceptionHandler(EmailIsNotCompatibleWebSiteException.class)
  public ResponseEntity<Object> handleEmailIsNotCompatibleWebSiteException(
      EmailIsNotCompatibleWebSiteException ex, WebRequest request) {
    result = new ErrorResult(false, ex.getMessage());
    return new ResponseEntity<>(result, HttpStatus.BAD_REQUEST);
  }

  @ExceptionHandler(EmailCheckException.class)
  public ResponseEntity<Object> handleEmailCheckException(
      EmailCheckException ex, WebRequest request) {
    result = new ErrorResult(false, ex.getMessage());
    return new ResponseEntity<>(result, HttpStatus.BAD_REQUEST);
  }

  @ExceptionHandler(HrmsCheckException.class)
  public ResponseEntity<Object> handleHrmsCheckException(
      HrmsCheckException ex, WebRequest request) {
    result = new ErrorResult(false, ex.getMessage());
    return new ResponseEntity<>(result, HttpStatus.BAD_REQUEST);
  }

  @ExceptionHandler(MernisCheckException.class)
  public ResponseEntity<Object> handleMernisCheckException(
      MernisCheckException ex, WebRequest request) {
    result = new ErrorResult(false, ex.getMessage());
    return new ResponseEntity<>(result, HttpStatus.BAD_REQUEST);
  }

  @ExceptionHandler(NoDataFoundException.class)
  public ResponseEntity<Object> handleNoDataFoundException(
      NoDataFoundException ex, WebRequest request) {
    result = new ErrorResult(false, ex.getMessage());
    return new ResponseEntity<>(result, HttpStatus.BAD_REQUEST);
  }

  @Override
  public ResponseEntity<Object> handleMethodArgumentNotValid(
      MethodArgumentNotValidException ex,
      HttpHeaders headers,
      HttpStatus status,
      WebRequest request) {
    result =
        new ErrorResult(false, ex.getBindingResult().getAllErrors().get(0).getDefaultMessage());
    return new ResponseEntity<>(result, HttpStatus.BAD_REQUEST);
  }
}
