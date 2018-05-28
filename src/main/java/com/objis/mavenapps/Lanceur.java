package com.objis.mavenapps;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;

public class Lanceur {

	public static void main(String[] args) throws IOException {
		ObjectMapper mapper = new ObjectMapper();
		
		Employe employe2 = mapper.readValue(new File("employe2.json"),Employe.class);
		System.out.println(employe2.getNom()+" "+employe2.getPrenom());
	}

}
