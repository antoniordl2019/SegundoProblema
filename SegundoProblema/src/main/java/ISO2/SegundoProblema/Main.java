package ISO2.SegundoProblema;


public class Main {
	
	
	 
	public static void main(String[] args) {
	
		boolean enferma = false, contactoCovid = true, pasCovid = true, sintomasCovid = true, plazaDisponible = true;
		
		int años = 40, contagios =300, nivel = 0, descuento = 0, incremento = 0;
		
		if(enferma || contactoCovid || sintomasCovid) {
			System.out.println("no viaja");
		}else if(pasCovid && (enferma = false) && plazaDisponible ) {
			System.out.println("viaja");
		}
		
		if(contagios < 100 ) {
			nivel = 0;
			if(años<23) {
				descuento = 60;
			}
			if(años>65) {
				descuento = 80;
			}
		}
		if (contagios > 100 && contagios <= 200) {
			nivel = 1;
			if(años<23) {
				descuento = 30;
			}
			if(años>65) {
				descuento = 50;
			}
		}
		if (contagios > 200 && contagios <= 300) {
			nivel = 2;
			if(años<23) {
				descuento = 0;
			}
			if(años>65) {
				incremento = 20;
			}
		}
		if (contagios > 300 && contagios <= 500) {
			nivel = 3;
			if(años<23) {
				incremento = 20;
			}
			if(años>65) {
				incremento = 50;
			}
		}
		if (contagios > 500) {
			nivel = 4;
			incremento = 50;
		}
		
		
	}
	
	public int calcularPrecio( int precio, int descuento, int incremento) {
		 precio = precio*(descuento/100)*(1+(incremento/100));
		 
		 return precio;
			
	  }

}