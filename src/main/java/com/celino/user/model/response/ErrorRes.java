package com.celino.user.model.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

/**
 * @author Oliver Celino <celinoo@ph.ibm.com>
 * Date: 8/22/23
 */
@Data
@AllArgsConstructor
public class ErrorRes {
    HttpStatus httpStatus;
    String message;
}
