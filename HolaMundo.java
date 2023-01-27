public class HolaMundo implements Educada{
	public void saludar(){
		System.out.println("Hola Mundo!");
	}
	public static void main(String[] args){
		Presentador p = new Presentador();
		p.presentar();
		
		HolaMundo hm = new HolaMundo();
		hm.saludar();
		System.out.println("Este es mi primer clase en mi nuevo repositorio GIT :)");
		System.out.println("Este si es el texto CORRECTO que se debe mostrar aqui!");
		
		Cerrador c = new Cerrador();
		c.cerrar();
	}
}