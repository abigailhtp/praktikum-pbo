//Nama file : Titik.java
//Nama/NIM: Miriam Stefani Abigail Hutapea/24060122130051
//Hari/Tanggal: Rabu, 21 Februari 2024
//Deskripsi: Konstruktor untuk Mtitik

class Titik
{
	double absis, ordinat;
	static double counterTitik;

	Titik()
	{
		absis=0;
		ordinat=0;
		counterTitik ++;	
	}

	Titik(double a, double o)
	{
		absis=a;
		ordinat=o;
		counterTitik ++;	
	}


	void setAbsis(double a)
	{
		absis=a; 
	}

	double getAbsis()
	{
		return absis; 
	}	

	void setOrdinat (double o)
	{
		ordinat=o;
	}

	double getOrdinat()
	{
		return ordinat;
	}
	
	static double getCounterTitik()
	{	
		return counterTitik;		
	}
}
