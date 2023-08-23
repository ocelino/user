package com.celino.user.model.response;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Oliver Celino <celinoo@ph.ibm.com>
 * Date: 8/22/23
 */
@Data
@AllArgsConstructor
public class LoginRes {
    private String email;
    private String token;
}
