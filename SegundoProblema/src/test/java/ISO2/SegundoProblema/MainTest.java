package ISO2.SegundoProblema;

import static org.junit.Assert.*;

import org.junit.Test;

public class MainTest {

	@Test
	public void test() {
		Main main = new Main();
		int resultado = main.calcularPrecio(100,20,0) ;
				assertEquals(resultado,0);
		
			}

	}


