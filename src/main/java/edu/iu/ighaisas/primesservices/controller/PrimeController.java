package edu.iu.ighaisas.primesservices.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.iu.ighaisas.primesservices.service.IPrimeService;

@RestController
@RequestMapping("/primes")
public class PrimeController {

	IPrimeService primesService;

	public PrimeController(IPrimeService primesService) {
		this.primesService = primesService;
	}
	
	@GetMapping("/{n}")
	public boolean isPrime(@PathVariable int n) {
		return primesService.isPrime(n);
	}
	
}
