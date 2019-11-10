import java.util.*;
public class calificacion{
    public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	String[] estudiantes = {"PEDRO", "LUIS", "JUAN", "RAUL", "LULU"};
	double[] puntuacion = new double[5];
	double[] promedio = new double[5];
	int t=0;
	while (t < estudiantes.length){
	    for (int i=0; i<=puntuacion.length; i++){
		if (puntuacion[4] != 0){
		    promedio[t] = (puntuacion[0] + puntuacion[1] + puntuacion[2] + puntuacion[3] + puntuacion[4])/5;
		    puntuacion[0] = 0;
		    puntuacion[1] = 0;
		    puntuacion[2] = 0;
		    puntuacion[3] = 0;
		    puntuacion[4] = 0;
		    t++;
		}
		else{
		    System.out.print("Introduzca la calificación de " + estudiantes[t] + " del examen " + (i+1) + ": ");
		    puntuacion[i]=input.nextDouble();
		}
	    }
	}
	for (int r=0; r<estudiantes.length; r++){
	    System.out.println("El promedio final de " + estudiantes[r] + " es: " + promedio[r]);
	}
    }
}