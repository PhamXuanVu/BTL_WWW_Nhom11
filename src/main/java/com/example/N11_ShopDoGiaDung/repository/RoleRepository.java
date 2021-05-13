package com.example.N11_ShopDoGiaDung.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.N11_ShopDoGiaDung.entity.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, Integer> {
	Role findByName(String name);
}
