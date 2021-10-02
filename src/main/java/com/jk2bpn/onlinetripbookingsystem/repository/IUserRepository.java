package com.jk2bpn.onlinetripbookingsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jk2bpn.onlinetripbookingsystem.entities.User;

public interface IUserRepository extends JpaRepository<User ,Long>{
	User findByUserName(String userName);
}
