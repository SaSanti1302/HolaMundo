public class HolaMundo {
	public void saludar(){
		System.out.println("Hola Mundo!");
	}
	public static void main(String[] args){
		HolaMundo hm = new HolaMundo();
		hm.saludar();
		System.out.println("");
		System.out.println("Primero: Ajustamos este mensaje en hot fix");
		System.out.println("Segundo: Cambio de mensaje desde la rama dev");
		System.out.println("Hubo un conflicto porque se cambio lo mismo en ambas ramas");
		System.out.println("Lo solucionamos para subirlo al repositorio");
		System.out.println("Esta linea fue modificada desde Git Hub");
		System.out.println("Se modifica la linea en el local para llevar a remoto");
		System.out.println("Esta es una nueva impresion desde GitHub");
		System.out.println("Esta es una nueva impresion desde repositorio local");
	}
}
