package PaqB05;

/**
 * Clase que define un contenedor marítimo. La información relativa a un contenedor viene dada por:</br><ul>
 * <li>Número de identificación.</li>
 * <li>Peso.</li>
 * <li>País de procedencia.</li>
 * <li>Si se ha inspeccionado en aduanas.</li>
 * <li>Prioridad (entre 1 y 3).</li>
 * <li>Descripción del contenido (máx. 100 caracteres).</li>
 * <li>Nombre de la empresa remitente (máx. 20 caracteres).</li>
 * <li>Nombre de la empresa receptora (máx. 20 caracteres).</li>
 * </ul>
 */
public class Contenedor{
    private int identificador;
    private int peso;
    private String procedencia;
    private boolean aduanas;
    private int prioridad;      // entre 1 y 3, aplicar restricción en constructores, setters y otros métodos.
    private String descripcion; // máximo 100 caracteres, aplicar también la restricción.
    private String remitente;   // máximo 20 caracteres.
    private String receptor;    // máximo 20 caracteres.

    public Contenedor(int identificador, int peso, String procedencia, boolean aduanas, int prioridad, String descripcion, String remitente, String receptor) {
        this.identificador = identificador;
        this.peso = peso;
        this.procedencia = procedencia;
        this.aduanas = aduanas;
        setPrioridad(prioridad);
        setDescripcion(descripcion);
        setRemitente(remitente);
        setReceptor(receptor);

    }



    /*####################################### Getters y setters ############################################*/
    public int getIdentificador() { return identificador;}
    public int getPeso() { return peso;}
    public String getProcedencia() { return procedencia; }
    public boolean isAduanas() { return aduanas; }
    public int getPrioridad() { return prioridad; }
    public String getDescripcion() {return descripcion; }
    public String getRemitente() { return remitente; }
    public String getReceptor() { return receptor; }

    public void setIdentificador(int identificador) { this.identificador = identificador; }
    public void setPeso(int peso) { this.peso = peso; }
    public void setProcedencia(String procedencia) { this.procedencia = procedencia; }
    public void setAduanas(boolean aduanas) { this.aduanas = aduanas; }
    public void setPrioridad(int prioridad) { this.prioridad = prioridad; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    public void setRemitente(String remitente) { this.remitente = remitente; }
    public void setReceptor(String receptor) { this.receptor = receptor; }
    /*######################################################################################################*/



    /*####################################### Métodos generales ############################################*/


    /*######################################################################################################*/
}
