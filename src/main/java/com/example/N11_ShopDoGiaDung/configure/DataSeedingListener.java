package com.example.N11_ShopDoGiaDung.configure;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.example.N11_ShopDoGiaDung.entity.Role;
import com.example.N11_ShopDoGiaDung.entity.User;
import com.example.N11_ShopDoGiaDung.repository.RoleRepository;
import com.example.N11_ShopDoGiaDung.repository.UserRepository;

@Component
public class DataSeedingListener implements ApplicationListener<ContextRefreshedEvent> {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RoleRepository roleRepository;
	
	@Autowired
    private PasswordEncoder passwordEncoder;

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		// TODO Auto-generated method stub
		
		System.out.println("hello world");
		
		if (roleRepository.findByName("ROLE_ADMIN") == null) {
			Role role = new Role();
			role.setName("ROLE_ADMIN");
		}
		
		if (roleRepository.findByName("ROLE_MEMBER") == null) {
			Role role = new Role();
			role.setName("ROLE_MEMBER");
		}
		
		if (userRepository.findByEmail("admin@gmail.com") == null) {
			User user = new User();
			user.setEmail("admin@gmail.com");
			user.setPassword(passwordEncoder.encode("123456"));
			Set<Role> roles = new HashSet<Role>();
			roles.add(roleRepository.findByName("ROLE_ADMIN"));
			user.setRoles(roles);
			
			userRepository.save(user);
		}
		
		if (userRepository.findByEmail("member@gmail.com") == null) {
			User user = new User();
			user.setEmail("member@gmail.com");
			user.setPassword(passwordEncoder.encode("123456"));
			Set<Role> roles = new HashSet<Role>();
			roles.add(roleRepository.findByName("ROLE_MEMBER"));
			user.setRoles(roles);
			
			userRepository.save(user);
		}
		
	}

}
