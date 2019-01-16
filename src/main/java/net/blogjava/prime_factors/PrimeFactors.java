package net.blogjava.prime_factors;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
	
	PrimeFactors() {
		throw new IllegalStateException( "Utility class" );
	}

	public static List<Integer> generate( int n ) {
		List<Integer> primes = new ArrayList<>();
		int candidate = 2;
		while ( n > 1 ) {
			while( n % candidate == 0 ) {
				primes.add( candidate );
				n /= candidate;
			}
			candidate++;
		}
		if( n > 1 )
			primes.add( n );
		return primes;
	}

}
