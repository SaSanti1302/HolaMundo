public class HolaMundo implements Educada{
	public void saludar(){
		System.out.println("Hola Mundo!");
	}
	public static void main(String[] args){

		HolaMundo hm = new HolaMundo();
		hm.saludar();
		System.out.println("");
		System.out.println("Ajustamos este mensaje en hot fix");

	}
}