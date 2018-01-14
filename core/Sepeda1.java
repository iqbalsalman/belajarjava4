public class Sepeda1{
	// protected Integer roda =2;
	// protected String rangka ="Besi"

	 Integer motor;

       Integer getMotor(){ 
      return motor;

      }
      protected void setMotor(Integer motor){
         this.motor=motor;
      }
      public void rangka(){
      	System.out.println("Saya kamu");
      }
     

       	

}

class Motor extends Sepeda1{
	// public Motor{
	// 	super.rangka ="Tralis";
	// }
	// private String mesin = "4 Tak, 2 Cylinder";
	public void motor() {
        super.rangka();
    }

	public static void main(String[] args){
		Motor sc = new Motor();
		sc.setMotor(30);
		sc.motor();
;		System.out.println("Umur saya adalah"+sc.getMotor());
	}

}
