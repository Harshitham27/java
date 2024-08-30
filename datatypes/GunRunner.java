package com.xworkz.datatypes;

import com.xworkz.datatypes.things.Dboss;
import com.xworkz.datatypes.things.Godse;
import com.xworkz.datatypes.things.Gun;
import com.xworkz.datatypes.things.Police;
import com.xworkz.datatypes.things.Soldier;

public class GunRunner {

	public static void main(String[] args) {
		
		Soldier soldier=new Soldier();
		soldier.kill();
		Police police=new Police();
		Gun gun=new Gun("Pistol", "USA", "Handheld");
		police.fire(gun);
		Dboss dboss=new Dboss();
		dboss.gun=new Gun("Revolver", "India", "Semi-automatic");
		dboss.threat();
		Godse godse=new Godse();
		if(godse!=null) {
			godse.fire();
		}
	}

}
