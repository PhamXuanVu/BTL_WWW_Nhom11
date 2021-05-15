package com.example.N11_ShopDoGiaDung.controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import com.example.N11_ShopDoGiaDung.entity.NguoiDung;
import com.example.N11_ShopDoGiaDung.entity.Role;
import com.example.N11_ShopDoGiaDung.entity.User;
import com.example.N11_ShopDoGiaDung.formClass.FormRegister;
import com.example.N11_ShopDoGiaDung.repository.NguoiDungRepository;
import com.example.N11_ShopDoGiaDung.repository.RoleRepository;
import com.example.N11_ShopDoGiaDung.repository.UserRepository;

import groovyjarjarpicocli.CommandLine.Model;

@Controller
public class MainController {
	@Autowired
	private NguoiDungRepository nguoiDungRepository;
	@Autowired
	private UserRepository userRepository;
	@Autowired
	RoleRepository roleRepository;
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@GetMapping("/")
	public String getHomePage() {
		return "index";
	}
	
	@GetMapping("/login")
	public String getLogin() {
		return "login";
	}
	
	@GetMapping("/admin")
	public String getAdmin() {
		return "admin";
	}
	@GetMapping("/register")
    public String getRegister() {
        return "register";
	}
	
	@PostMapping(value = "/register", consumes = "application/x-www-form-urlencoded")
	public RedirectView postRegister(FormRegister formRegister, Model model, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			System.out.println("Co loi xay ra " + bindingResult);

			return new RedirectView("/login");
		} else {
			if (userRepository.findByEmail(formRegister.getEmail()) == null) {
				Role role = roleRepository.findByName("ROLE_MEMBER");

				User user = new User();
				Set<Role> roles = new HashSet<>();
				roles.add(role);
				user.setRoles(roles);
				user.setEmail(formRegister.getEmail());
				user.setPassword(passwordEncoder.encode(formRegister.getMatKhau()));
				userRepository.save(user);

				NguoiDung nguoiDung = new NguoiDung();
				nguoiDung.setUser(user);
				nguoiDung.setHoTenDem(formRegister.getHoTenDem());
				nguoiDung.setTen(formRegister.getTen());
				nguoiDung.setSdt(formRegister.getSoDienThoai());
				nguoiDungRepository.save(nguoiDung);

				return new RedirectView("/login?success");
			}

			return new RedirectView("/register?failure");
		}
	}
}
