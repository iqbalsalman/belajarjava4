package latihan.bin;

public class Kendaraan{

	private  Integer jumlahRoda=4;
	private String pabrik;

	public Kendaraan(Integer jumlahRoda){
       this.jumlahRoda = jumlahRoda;
    }
 
      // private Integer jumlahRoda = 4;
      // private String pabrik;

	public Integer getJumlahRoda(){
		return this.jumlahRoda;
	}

	public void setJumlahRoda(Integer jumlahRoda){
	this.jumlahRoda = jumlahRoda;
}

	public String getPabrik(){
		return this.pabrik;
	}

	public void setPabrik(String pabrik){
	this.pabrik = pabrik;
  }
}