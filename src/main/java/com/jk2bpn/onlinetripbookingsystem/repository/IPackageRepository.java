package com.jk2bpn.onlinetripbookingsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jk2bpn.onlinetripbookingsystem.entities.TravelPackage;

public interface IPackageRepository extends JpaRepository<TravelPackage ,Long>{

}
