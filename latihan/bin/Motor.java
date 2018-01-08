package latihan.bin;

import latihan.model.Kendaraan;

public class Motor extends Kendaraan {
	public String getNamaPabrik(){
	return "Yamaha";
}

public void setNamaPabrik(String pabrik){
	super.setNamaPabrik("Kendaraan belum di isi");

       System.out.println( String.format("dari kelas motor %s",super.getNamaPabrik() ));
       System.out.println( String.format("dari kelas mobil",super.getNamaPabrik() ));
    }

    public static void main(String[] args){
    	Motor sc = new Motor();
    	sc.setNamaPabrik(sc.getNamaPabrik());
    }

}
