package padroes.observer;

public class AniversarioSurpresa {
	
	public static void main(String[] args) {
		
		Namorada namorada = new Namorada();
		Porteiro porteiro = new Porteiro();
		
		porteiro.registrarObservador(namorada);
		porteiro.registrarObservador(evento -> {
			System.out.println("Surpresa via lambda");
			System.out.println("Ocorreu em: " + evento.getMomento());
		});
		porteiro.monitorar();
	}
}