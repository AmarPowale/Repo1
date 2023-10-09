package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.nt.service.IMovieMgmtService;
import com.nt.entity.*;

@Component
public class CrudRepTestRunner implements CommandLineRunner{
	
	@Autowired
	private IMovieMgmtService service;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Movie movie=new Movie();
		movie.setMname("RRR");
		movie.setRating(4.5f);
		movie.setYear(2022);
		
		try {
				System.out.println(service.registerMovie(movie));
		
		}
		catch(Exception e){
			e.printStackTrace();	
		}
	}
		
	}


	
	
