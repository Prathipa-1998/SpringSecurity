package in.co.security.SpringSecurity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;



import in.co.security.SpringSecurity.entity.User;
import in.co.security.SpringSecurity.repository.UserRepository;

public class UserDetailsServiceImpl implements UserDetailsService {
	@Autowired
	 UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		 User user = userRepository.findByUsername(username)
		        .orElseThrow(() -> new UsernameNotFoundException("User Not Found with username: " + username));

	    return UserDetailsImpl.build(user);
	}

}
