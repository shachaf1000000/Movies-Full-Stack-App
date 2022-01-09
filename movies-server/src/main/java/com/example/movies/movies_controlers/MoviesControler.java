package com.example.movies.movies_controlers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MoviesControler {

	@GetMapping("all")
	public ArrayList<Map<String, String>> all(){
		
		System.out.println("Got a request from client!");
		ArrayList<Map<String, String>> movies = new ArrayList<Map<String,String>>();
		Map<String, String> m1 = new HashMap<String, String>();
		Map<String, String> m2 = new HashMap<String, String>();
		m1.put("imdbID","tt0096895");
		m1.put("Title","Batman");
		m1.put("Year","1989");
		m1.put("Poster","https://images-na.ssl-images-amazon.com/images/M/MV5BMTYwNjAyODIyMF5BMl5BanBnXkFtZTYwNDMwMDk2._V1_.jpg");

		m2.put("imdbID","tt0468569");
		m2.put("Title","The Dark Knight");
		m2.put("Year","2008");
		m2.put("Poster","https://ia.media-imdb.com/images/M/MV5BMTMxNTMwODM0NF5BMl5BanBnXkFtZTcwODAyMTk2Mw@@._V1_UX182_CR0,0,182,268_AL_.jpg");
		
		movies.add(m1);
		movies.add(m2);
		return movies;
	}
	
}
