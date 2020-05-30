package team.study.common.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<Object> handleRuntimeException(RuntimeException runtimeException, HttpServletRequest request, HttpServletResponse response, WebRequest webRequest) {
        return this.handleExceptionInternal(runtimeException, null, null, HttpStatus.INTERNAL_SERVER_ERROR, webRequest);
    }


    @Override
    protected ResponseEntity<Object> handleExceptionInternal(Exception ex, Object body, HttpHeaders headers, HttpStatus status, WebRequest request) {
        ex.printStackTrace();

        ErrorResponse errorResponse = ErrorResponse.builder()
                .type("type")
                .detail("detail message")
                .status(status.value())
                .title(ex.getMessage())
                .instance(request.getContextPath()) // uri 넣어야됨
                .build();

        return super.handleExceptionInternal(ex, errorResponse, headers, status, request);
    }
}
