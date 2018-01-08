package latihan.bin;

public class Mobil extends Kendaraan{
	private String nama;

	public void setNama(String nama){
	System.out.println(jumlahRoda);
	this.nama=nama;
}
public String nama(){
	return this.nama;
}

public void namaPabrik(){
	System.out.println( String.format("nama pabrik %s",super.getNamaPabrik() ));
}



public static void main(String[] args){
	Mobil honda = new Mobil();
	honda.setNama("Honda civic");
	// honda.setNamaPabrik("Selow");
	System.out.println(honda.nama());
	honda.setNama("Honda Civic");
	System.out.println(honda.nama());
	honda.setNamaPabrik("Astra Honda Dalam");
	honda.namaPabrik();
	
}



}