package com.example.colleges;

import java.util.ArrayList;
import java.util.List;
public class Universities {

	private List<Uni> uniList;
	public List<Uni> getUniList()
	{

		if (uniList == null) {

			uniList
				= new ArrayList<>();

			   
		}

		return uniList;

		 
	}

	public void
	setUniList(
		List<Uni> uniList)
	{
		this.uniList
			= uniList;
	}
}


