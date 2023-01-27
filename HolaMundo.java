public class HolaMundo {
	public void saludar(){
		System.out.println("Hola Mundo!");
	}
	public static void main(String[] args){
		HolaMundo hm = new HolaMundo();
		hm.saludar()
		System.out.println("Cambio de mensaje desde la rama dev");
	}
}