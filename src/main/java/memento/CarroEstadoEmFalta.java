package memento;

public class CarroEstadoEmFalta implements CarroEstado{
	private CarroEstadoEmFalta() {};
    
	private static CarroEstadoEmFalta instance = new CarroEstadoEmFalta();
    
	public static CarroEstadoEmFalta getInstance() {
        return instance;
    }
    
    public String getNomeEstado() {
        return "Em Falta";
    }
}
