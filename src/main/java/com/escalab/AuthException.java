package com.escalab;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class AuthException implements AuthenticationEntryPoint {

    @Override
    public void commence(HttpServletRequest req, HttpServletResponse res, AuthenticationException arg2) throws IOException, ServletException {
        final Map<String, Object> mapException = new HashMap<>();
        mapException.put("error","401");
        mapException.put("message","No estas autorizado para ecceder a este recurso");
        mapException.put("exception", "No Autorizado");
        mapException.put("path",req.getServletPath());
        mapException.put("timestamp", LocalDateTime.now());

        res.setContentType("application/json");
        res.setStatus(HttpServletResponse.SC_UNAUTHORIZED);

        final ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(res.getOutputStream(),mapException);
    }
}
