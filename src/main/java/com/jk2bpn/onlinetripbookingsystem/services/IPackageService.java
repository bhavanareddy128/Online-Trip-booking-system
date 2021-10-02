package com.jk2bpn.onlinetripbookingsystem.services;
import java.util.List;
import java.util.Optional;

import com.jk2bpn.onlinetripbookingsystem.entities.TravelPackage;


public interface IPackageService {
		public TravelPackage addPackage(TravelPackage travelpackage);
		public TravelPackage deletePackage(Long packageId);
		public List<TravelPackage> viewAllPackages();
		Optional<TravelPackage> searchPackage(Long packageId);
}
