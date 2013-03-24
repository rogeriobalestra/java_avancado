package br.com.rogerio.hashmap;

import java.util.HashMap;

public class ExemploHashMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		HashMap<String, String> hash = new HashMap<>();
		
		hash.put("joao", "123");
		hash.put("maria", "222");
		hash.put("pedro", "444");
		
		System.out.println(hash.get("joao"));
			

		
		

	}

}
