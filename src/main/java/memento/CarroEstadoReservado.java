package memento;

public class CarroEstadoReservado implements CarroEstado{
	private CarroEstadoReservado() {};
    
	private static CarroEstadoReservado instance = new CarroEstadoReservado();
  
    public static CarroEstadoReservado getInstance() {
        return instance;
    }
    
    public String getNomeEstado() {
        return "Reservado";
    }
}
