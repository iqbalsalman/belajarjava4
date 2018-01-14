package latihan.bin;

public class Mobil extends Kendaraan{
	private String nama;

	public void setNama(String nama){
	System.out.println(super.getJumlahRoda());
	this.nama=nama;
}

public Mobil(){
        super(4);
         System.out.println("ini contruktur di pangil ketika di inisialiasi");
     }
 
     public Mobil(String nama){
         super(30);
         this.nama = nama;
         System.out.println(
             String.format("variable nama berisi %s", this.nama)
         );
     }
public String getPabrik(){
	return super.getPabrik();
}


public void setNama(){
	System.out.println(super.getJumlahRoda());
	this.nama="Mitshubishi";
}

public String nama(){
	return this.nama;
}
// public void namaPabrik(){
// 	System.out.println( String.format("nama pabrik %s",super.getPabrik() ));
// }



public static void main(String[] args){
	Mobil honda = new Mobil("Lambogin");
	honda.setNama("Honda civic");
	// honda.setNamaPabrik("Selow");
	System.out.println(honda.nama());
	honda.setNama("Honda Civic");
	System.out.println(honda.nama());
	honda.setPabrik("Astra Honda Dalam");
	// honda.namaPabrik();
	
}



}