package in.co.security.SpringSecurity.requestDTO;

import java.util.Set;

import jakarta.validation.constraints.Email;
import lombok.Data;

@Data
public class SignupRequest {
	private String username;
	@Email
	private String email;

	private Set<String> role;
	
	private String password;
}
