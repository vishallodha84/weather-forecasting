package com.vishal.weather.res;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Weather {
	 private int id;
	    private String main;
	    private String description;
	    private String icon;
	    
	    
	    
}
