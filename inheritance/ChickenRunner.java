package com.xworkz.inheritance;

import com.xworkz.inheritance.elements.Chicken;
import com.xworkz.inheritance.elements.Hen;

public class ChickenRunner {

	public static void main(String[] args) {
		Hen hen = new Hen();
		hen.name = "Fluffy";
		hen.breed = "Leghorn";
		hen.age = 3;
		hen.color="White";
		hen.isLayingEggs=true;
		hen.weight = 10.5;
		hen.noOfEggs = 2;
		hen.temperature=40;
		hen.ownerName="Jeevitha";
		hen.isVaccinated = true;
		hen.lay();
		hen.warm();
		hen.steps();
		hen.hunt();
		hen.print();
		
		Chicken chicken = new Hen();
		chicken.name = "Bubble";
		chicken.breed = "Cochin";
		chicken.age = 1;
		chicken.color="Black";
		chicken.isLayingEggs=true;
		chicken.weight = 8.5;
		chicken.noOfEggs = 2;
		chicken.temperature=40;
		chicken.ownerName="Sanvi";
		chicken.isVaccinated = true;
		chicken.lay();
		chicken.warm();
		chicken.steps();
		chicken.hunt();
		chicken.print();


	}

}
