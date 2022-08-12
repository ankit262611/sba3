package com.example.colleges;

import org.springframework
	.stereotype
	.Repository;
import com.example.colleges.Universities;

@Repository

public class UniDao {

	private static Universities list
		= new Universities();
	static
	{
		list.getUniList().add(
			new Uni(
				1,
				"Prem University",
				105));

		list.getUniList().add(
			new Uni(
				2, "Amity University",
				197));

		list.getUniList().add(
			new Uni(
				3, "MMU",
				228));
		list.getUniList().add(
				new Uni(
					4, "MMU1",
					227));
		list.getUniList().add(
				new Uni(
					5, "MMU2",
					226));
		list.getUniList().add(
				new Uni(
					6, "MMU3",
					225));
		list.getUniList().add(
				new Uni(
					7, "MMU4",
					224));
		list.getUniList().add(
				new Uni(
					8, "MMU5",
					223));
		list.getUniList().add(
				new Uni(
					9, "MMU6",
					222));
		list.getUniList().add(
				new Uni(
					10, "MMU7",
					221));

		 
	}

	public Universities getAllUnis()
	{

		return list;
	}
		public void
		addUni(Uni uni)
	{
		list.getUniList()
			.add(uni);
		 
	}
}
