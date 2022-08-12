package com.example.colleges;

public class Uni {

	public Uni() {}
	public Uni(
		Integer id, String name,
		Integer collegecount)
	{

		super();

		this.id = id;

		this.name = name;

		this.collegecount = collegecount;

		 
	}

	 private Integer id;

	 private String name;

	 private Integer collegecount;

	@Override
 public String toString()
	{

		return "Uni [id="
			+ id + ", name="
			+ name + ", Total Count="
			+ collegecount + "]";

		 
	}

	public Integer getId()
	{

		return id;
	}

	public void setId(Integer id)
	{

		this.id = id;
	}

	public String getName()
	{

		return name;
	}

	public void setName(
		String name)
	{

		this.name = name;
	}

	public Integer getCollegecount()
	{

		return collegecount;
	}

	public void setCollegecount(Integer collegecount)
	{

		this.collegecount = collegecount;
	}
}
