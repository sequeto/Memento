package memento;

import static org.junit.Assert.*;

import org.junit.Test;

public class CarroTest {
	
	@Test
	public void deveArmazenarEstados() {
        Carro carro = new Carro();
        carro.setEstado(CarroEstadoAlugado.getInstance());
        carro.setEstado(CarroEstadoReservado.getInstance());
        assertEquals(2, carro.getEstados().size());
    }

    @Test
    public void deveRetornarEstadoInicial() {
    	Carro carro = new Carro();
    	carro.setEstado(CarroEstadoAlugado.getInstance());
        carro.setEstado(CarroEstadoReservado.getInstance());
        carro.restauraEstado(0);
        assertEquals(CarroEstadoAlugado.getInstance(), carro.getEstado());
    }

    @Test
    public void deveRetornarEstadoAnterior() {
    	Carro carro = new Carro();
    	carro.setEstado(CarroEstadoAlugado.getInstance());
    	carro.setEstado(CarroEstadoReservado.getInstance());
    	carro.setEstado(CarroEstadoEmFalta.getInstance());
    	carro.setEstado(CarroEstadoVendido.getInstance());
    	carro.restauraEstado(2);
        assertEquals(CarroEstadoEmFalta.getInstance(), carro.getEstado());
    }

    @Test
    public void deveRetornarExcecaoIndiceInvalido() {
        try {
        	Carro carro = new Carro();
        	carro.restauraEstado(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Índice inválido", e.getMessage());
        }
    }

}
