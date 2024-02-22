package edu.iu.ighaisas.primesservices.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PrimeServiceTest {
	
	PrimeService primeService = new PrimeService();
	
	@Test
	void _45IsNotPrime() {
		int n = 45;
		boolean expected = false;
		boolean actual = primeService.isPrime(n);
		assertEquals(expected, actual);
	}
	
	@Test
	void _539828945930573IsNotPrime() {
		long n = 539828945930573L;
		boolean expected = false;
		boolean actual = primeService.isPrime(n);
		assertEquals(expected, actual);
	}
	
	@Test
	void _285191IsPrime() {
		long n = 285191;
		boolean expected = true;
		boolean actual = primeService.isPrime(n);
		assertEquals(expected, actual);
	}
}
