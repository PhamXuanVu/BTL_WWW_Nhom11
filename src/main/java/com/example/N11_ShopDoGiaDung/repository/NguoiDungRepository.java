package com.example.N11_ShopDoGiaDung.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.N11_ShopDoGiaDung.entity.NguoiDung;
import com.example.N11_ShopDoGiaDung.entity.User;

public interface NguoiDungRepository extends CrudRepository<NguoiDung, Integer>{
	 NguoiDung findByUser(User user);
}
