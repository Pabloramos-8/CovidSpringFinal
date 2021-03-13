package com.example.demo.modelo.user;

import java.util.Set;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class JwtUserResponse extends UserEntity {
	
	private String token;
	
  //indicaremos otro nombre al builder 
	@Builder(builderMethodName="jwtUserResponseBuilder")
  //los parametros dependeran de lo que contenga el UserEntity
	public JwtUserResponse(String username, String email, Set<UserRole> roles, String token) {
		super(username,roles);
		this.token = token;
	}

	public static JwtUserResponse jwtUserResponseBuilder() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object username(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	

	

	
}
