package com.jk2bpn.onlinetripbookingsystem.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jk2bpn.onlinetripbookingsystem.entities.Route;
import com.jk2bpn.onlinetripbookingsystem.repository.IRouteRepository;
@Service
public class RouteServiceImpl implements IRouteService{

	@Autowired
    IRouteRepository repo;
	@Override
	public Route addRoute(Route route) {
		// TODO Auto-generated method stub
		System.out.println("Successfully saved");
		  return repo.save(route);
		
	}

	@Override
	public Route updateRoute(Route route) {
		// TODO Auto-generated method stub
		System.out.println("Successfully updated");
		  return repo.save(route);
		
	}

	@Override
	
	public String removeRoute(Long routeId) {
		// TODO Auto-generated method stub
		 repo.deleteById(routeId);
		 return "Deleted successfully";
	}

	@Override
	public Optional<Route> searchRoute(Long routeId) {
		// TODO Auto-generated method stub
		return repo.findById(routeId);
	}

	@Override
	public List<Route> viewRoute() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
