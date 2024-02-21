//Nama file : Mtitik.java
//Nama/NIM: Miriam Stefani Abigail Hutapea/24060122130051
//Hari/Tanggal: Rabu, 21 Februari 2024
//Deskripsi: main dari titik.java

class Mtitik
{
	public static void main(String[] args)
	{
		Titik t1, t2,t3; 
		t1= new Titik();
		t2= new Titik();
		t3= new Titik(5,6);

		t1.setAbsis(1);
		t1.setOrdinat(2);

		t2.setAbsis(3);
		t2.setOrdinat(4);

		System.out.println("Jumlah objek titik: "+Titik.getCounterTitik());
		System.out.println("t1(" + t1.getAbsis()+","+t1.getOrdinat()+")");
		System.out.println("t2(" + t2.getAbsis()+","+t2.getOrdinat()+")");
		System.out.println("t3(" + t3.getAbsis()+","+t3.getOrdinat()+")");
			
	}
}	