class HospitalRunner
{
	public static void main(String[] args)
	{
		System.out.println("Running main in HospitalRunner");
		double name=Hospital.price("Dolo650");
		System.out.println("Medicine name:"+name);
		double name1=Hospital.price("Paracetamol");
		System.out.println("Medicine name:"+name1);
		double name2=Hospital.price("Dopamine");
		System.out.println("Medicine name:"+name2);
		double name3=Hospital.price("Dolo");
		System.out.println("Medicine name:"+name3);
		
		String symptom1=Hospital.medicineName("Headache");
		System.out.println("Symptoms:"+symptom1);
		String symptom2=Hospital.medicineName("Fever");
		System.out.println("Symptoms:"+symptom2);
		String symptom3=Hospital.medicineName("Cold");
		System.out.println("Symptoms:"+symptom3);
		String symptom4=Hospital.medicineName("Cough");
		System.out.println("Symptoms:"+symptom4);
		
		boolean presence=Hospital.availability("Lakshmish");
		System.out.println("Available:"+presence);
		boolean presence1=Hospital.availability("Jayashree");
		System.out.println("Available:"+presence1);
		boolean presence2=Hospital.availability("Jeevitha");
		System.out.println("Available:"+presence2);
		boolean presence3=Hospital.availability("Harshh");
		System.out.println("Available:"+presence3);
	}
}