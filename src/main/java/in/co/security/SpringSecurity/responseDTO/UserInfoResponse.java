package in.co.security.SpringSecurity.responseDTO;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class UserInfoResponse {
	private Long id;
	private String username;
	private String email;
	private List<String> roles;


}
