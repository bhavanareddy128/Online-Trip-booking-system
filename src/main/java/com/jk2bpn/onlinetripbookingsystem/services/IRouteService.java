package com.jk2bpn.onlinetripbookingsystem.services;
import java.util.List;
import java.util.Optional;

import com.jk2bpn.onlinetripbookingsystem.entities.Route;

public interface IRouteService {
	public Route addRoute(Route route);
	public Route updateRoute(Route route);
	
	public Optional<Route> searchRoute(Long routeId);
	public List<Route> viewRoute();
	String removeRoute(Long routeId);
}
