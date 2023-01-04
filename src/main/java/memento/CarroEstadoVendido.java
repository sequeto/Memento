package memento;

public class CarroEstadoVendido implements CarroEstado{
	private CarroEstadoVendido() {};
    
	private static CarroEstadoVendido instance = new CarroEstadoVendido();
    
	public static CarroEstadoVendido getInstance() {
        return instance;
    }
    
    public String getNomeEstado() {
        return "Vendido";
    }
}
