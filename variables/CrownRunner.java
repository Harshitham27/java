class CrownRunner
{
	public static void main(String[] args)
	{
		System.out.println("Running main in State");
		String[] stateName={"Andra pradesh","Arunchal pradesh","Assam","Bihar","Chattisgarh","Goa","Gujarat","Haryana","Himachal pradesh","Jharkand","Karnataka","Kerala","Madhya pradesh",
		"Maharashtra","Manipur","Meghalya","Mizoram","Nagaland","Odisha","Punjab","Rajasthan","Sikkim","Tamil nadu","Telangana","Tripura","Uttar pradesh","Uttarkhand","West bengal"};
	    Crown.regions(stateName);
		
		System.out.println("Running main in Code");
		int[] codes={562123,560001,560002,560003,562125,560005,562130,563160,570075,570078};
		Crown.pinCode(codes);
		
		System.out.println("Running main in Prime");
		String[] names={"Pandit Jawaharlal Nehru","Lal Bahadur Shastri","Gulzarilal Nanda","Indira Gandhi","Moraji Desai","Charan singh","Rajiv Gandhi","Vishwa pratap singh",
		"ChandraShekar","P V Narasimha rao","Atal Bihari Vajpayee","H D Devegowda","Inder kumar Gujral","Dr Manmohan Singh","Narendra Modi"};
		Crown.minister(names);
		
		System.out.println("Running main in Cabinet");
		String[] name={"Shri Rajnath Singh","Shri Amit Shah","Shri Nitin Jairam","Smt NIrmal Sitharaman","Shri Shivraj Singh","Dr SubramanyamJaishankar","Shri Manohar Lal",
		"Shri H D Kumaraswamy","Shri Piyush Goyal","Shri Dharmendra Pradhan","Shri Jitan Ram Manjhi","Shri Rajiv Ranjan Singh","Shri Sarbananda Sonowal","Dr. Virendra Kumar",
		"Shri Kinjarapu Rammohan Naidu","Shri Pralhad Joshi","Shri Jual Oram","Shri Giriraj Singh","Shri Ashwini Vaishnaw","Shri Jyotiraditya M.Scindia","Shri Bhupender Yadav",
		"Shri Gajendra Singh Shekhawat","Smt.Annpurna Devi","Shri Kiren Rijiju","Shri Hardeep Singh Puri","Shri Mansukh L. Mandaviya","Shri G. Kishan Reddy","Shri Chirag Paswan",
		"Shri C R Patil"};
        Crown.cabinet(name);
		
		System.out.println("Running main in Party");
		String[] party={"BJP","INC","BSP","CPI","NCP"};
		Crown.political(party);
	}
}