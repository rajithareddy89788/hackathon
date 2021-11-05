package com.mouritech.hackathon.controller;





import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mouritech.hackathon.models.User;
import com.mouritech.hackathon.payload.request.LoginRequest;
import com.mouritech.hackathon.payload.request.SignupRequest;
import com.mouritech.hackathon.payload.response.JwtResponse;
import com.mouritech.hackathon.payload.response.MessageResponse;
import com.mouritech.hackathon.payload.response.MessageResponse2;
import com.mouritech.hackathon.repository.UserRepository;
import com.mouritech.hackathon.security.jwt.JwtUtils;
import com.mouritech.hackathon.services.UserDetailsImpl;

import io.swagger.annotations.Api;

//@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/auth")
@Api(value = "")
public class AuthController {
	@Autowired
	AuthenticationManager authenticationManager;

	@Autowired
	UserRepository userRepository;

	
	@Autowired
	PasswordEncoder encoder;

	@Autowired
	JwtUtils jwtUtils;

	@PostMapping("/signin")
	public ResponseEntity<?> authenticateUser(@Valid @RequestBody LoginRequest loginRequest) {
		

		Authentication authentication = authenticationManager.authenticate(
				new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword()));


		SecurityContextHolder.getContext().setAuthentication(authentication);
		String jwt = jwtUtils.generateJwtToken(authentication);
		
		UserDetailsImpl userDetails = (UserDetailsImpl) authentication.getPrincipal();		
		
		return ResponseEntity.ok(new JwtResponse(jwt, HttpStatus.OK.toString(),"Logged in success"));
}


	@PostMapping("/signup1")
	public ResponseEntity<?> registerUser(@Valid @RequestBody SignupRequest signUpRequest) {
		if (userRepository.existsByUsername(signUpRequest.getUsername())) {
			return ResponseEntity
					.badRequest()
					.body(new MessageResponse2(HttpServletResponse.SC_UNAUTHORIZED,"Username  already in use"));
		}

		

		// Create new user's account
		User user = new User(signUpRequest.getUsername(), 
							 signUpRequest.getEmail(),
							 //encoder.encode(signUpRequest.getPassword()));
							 signUpRequest.getPassword(),
							 signUpRequest.getName(),
							 signUpRequest.getMobile());
		

		
			
		userRepository.save(user);

		return ResponseEntity.ok(new MessageResponse(HttpStatus.OK.toString(),"registered successfully!"));
	}
	
}
