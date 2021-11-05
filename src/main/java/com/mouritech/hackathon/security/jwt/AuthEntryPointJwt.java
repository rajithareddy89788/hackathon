package com.mouritech.hackathon.security.jwt;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;



@Component
public class AuthEntryPointJwt implements AuthenticationEntryPoint {

	private static final Logger logger = LoggerFactory.getLogger(AuthEntryPointJwt.class);

	@Override
	public void commence(HttpServletRequest request, HttpServletResponse response,
			AuthenticationException authException) throws IOException, ServletException {
		//logger.error("Unauthorized error: {}", authException.getMessage());
		//response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Error: Credentials dont match");
		response.sendError(HttpServletResponse.SC_UNAUTHORIZED,  "Credentials dont match");
		/* ResponseEntity
				.badRequest()
				.body(new MessageResponse2(HttpServletResponse.SC_UNAUTHORIZED,"Credentials do not match"));*/
	}

}
