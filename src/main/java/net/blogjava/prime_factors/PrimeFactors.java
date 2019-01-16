package net.blogjava.prime_factors;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
	
	PrimeFactors() {
		throw new IllegalStateException( "Utility class" );
	}

	public static List<Integer> generate( int n ) {
		List<Integer> primes = new ArrayList<>();
		for( int candidate = 2; n > 1; candidate++ ) {
			for( ; n % candidate == 0; n /= candidate )
				primes.add( candidate );
		}
		return primes;
	}

}
