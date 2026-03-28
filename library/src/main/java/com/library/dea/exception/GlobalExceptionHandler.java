package com.library.dea.exception;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
//    @ExceptionHandler(RuntimeException.class)
//    public String handleRuntime(RuntimeException ex, Model model){
//        model.addAttribute("errorMessage", ex.getMessage());
//
//        return "error/error";
//    }

    @ExceptionHandler(BookNotFoundException.class)
    public String handleRuntime(BookNotFoundException ex, Model model){
        model.addAttribute("errorMessage", ex.getMessage());

        return "error/error";
    }
    @ExceptionHandler(UserAlreadyExistsException.class)
    public String handleRuntime(UserAlreadyExistsException ex, Model model){
        model.addAttribute("errorMessage", ex.getMessage());

        return "error/username-error";
    }

    @ExceptionHandler(AuthorNotFoundException.class)
    public String handleRuntime(AuthorNotFoundException ex, Model model){
        model.addAttribute("errorMessage", ex.getMessage());

        return "error/author-error";
    }

    @ExceptionHandler(AuthorAlreadyExistsException.class)
    public String handleRuntime(AuthorAlreadyExistsException ex, Model model){
        model.addAttribute("errorMessage", ex.getMessage());

        return "error/author-exists-error";
    }

    @ExceptionHandler(PasswordMismatchException.class)
    public String handleRuntime(PasswordMismatchException ex, Model model){
        model.addAttribute("errorMessage", ex.getMessage());

        return "error/password-mismatch-error";
    }

}
