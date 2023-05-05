package modelo;// modelo.Respuesta para las preguntas de Si/No/ No Sabe

public class RespuestaSiNo extends Respuesta{
    // 0 para sí, 1 para no, 2 para no sabe/no responde
    private int siNoNs = -1;

    public RespuestaSiNo(Usuario usuario, Encuesta encuesta, Pregunta pregunta) {
        super(usuario, encuesta, pregunta);
    }

    public int getSiNoNs() {
        return siNoNs;
    }

    public void setSiNoNs(int siNoNs) {
        this.siNoNs = siNoNs;
    }

    @Override
    public Usuario getUsuario() {
        return super.getUsuario();
    }

    @Override
    public Encuesta getEncuesta() {
        return super.getEncuesta();
    }

    @Override
    public Pregunta getPregunta() {
        return super.getPregunta();
    }
}
