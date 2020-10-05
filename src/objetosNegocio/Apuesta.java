package objetosNegocio;

public class Apuesta {

    private TipoApuesta tipo;
    private int monto;
    private Jugador[] participantes;

    public Apuesta(TipoApuesta tipo, int monto, int numParticipantes) {
        this.tipo = tipo;
        this.monto = monto;
        participantes = new Jugador[numParticipantes];
    }

    public TipoApuesta getTipo() {
        return tipo;
    }

    public void setTipo(TipoApuesta tipo) {
        this.tipo = tipo;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public Jugador[] getParticipantes() {
        return participantes;
    }

    public void setParticipantes(Jugador[] participantes) {
        this.participantes = participantes;
    }

}
