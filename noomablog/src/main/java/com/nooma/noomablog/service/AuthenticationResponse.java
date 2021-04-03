package com.nooma.noomablog.service;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AuthenticationResponse {

    public AuthenticationResponse(String authenticationToken2, String userName2) {
    }

    private String authenticationToken;
    private String username;
}
