package com.jk2bpn.onlinetripbookingsystem.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jk2bpn.onlinetripbookingsystem.entities.Route;
import com.jk2bpn.onlinetripbookingsystem.services.IRouteService;


@RestController
@RequestMapping("/api")
public class RouteController {
	@Autowired
	IRouteService roservice;
	@PostMapping("/aroute")
	public Route addRoute(@RequestBody Route route) {
		return roservice.addRoute(route);
	}
	@PutMapping("/uroute")
	public Route updateRoute(@RequestBody Route route) {
		return roservice.updateRoute(route);
	}
	@DeleteMapping("/rroute/{routeId}")
	public String removeRoute(@PathVariable Long routeId) {
		return roservice.removeRoute(routeId);
	}
	@GetMapping("/sroute/{routeId}")
	public Optional<Route> searchRoute(@PathVariable Long routeId) {
		return roservice.searchRoute(routeId);
	}
	@GetMapping("/vroute")
	public List<Route> viewRoute(){
		return roservice.viewRoute();}
}
