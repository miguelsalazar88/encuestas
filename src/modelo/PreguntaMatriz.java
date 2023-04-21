package modelo;

public class PreguntaMatriz extends Pregunta{
    private String[] filas;
    private String[] columnas;

    public PreguntaMatriz(int idEncuesta, String tipo, String pregunta,
                          int tamanioFilas, int tamanioColumnas) {
        super(idEncuesta, tipo, pregunta);
        this.filas = new String[tamanioFilas];
        this.columnas = new String[tamanioColumnas];
    }

    public String[] getFilas() {
        return filas;
    }

    public void setFilas(String[] filas) {
        this.filas = filas;
    }

    public String[] getColumnas() {
        return columnas;
    }

    public void setColumnas(String[] columnas) {
        this.columnas = columnas;
    }

    @Override
    public void generarReporte() {
        System.out.println("Reporte");
    }
}
