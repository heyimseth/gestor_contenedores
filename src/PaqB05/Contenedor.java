package PaqB05;

/**
 * Clase que define un contenedor marítimo. La información relativa a un contenedor viene dada por:</br><ul>
 *     <li>Número de identificación.</li>
 *     <li>Peso.</li>
 *     <li>País de procedencia.</li>
 *     <li>Si se ha inspeccionado en aduanas.</li>
 *     <li>Prioridad (entre 1 y 3).</li>
 *     <li>Descripción del contenido (máx. 100 caracteres).</li>
 *     <li>Nombre de la empresa remitente (máx. 20 caracteres).</li>
 *     <li>Nombre de la empresa receptora (máx. 20 caracteres).</li>
 * </ul>
 */
public class Contenedor {
    private int identificador;
    private int peso;
    private String procedencia;
    private boolean aduanas;
    private int prioridad;      // entre 1 y 3, aplicar restricción en constructores, setters y otros métodos.
    private String descripcion; // máximo 100 caracteres, aplicar también la restricción.
    private String e_remitente;   // máximo 20 caracteres.
    private String e_receptora;    // máximo 20 caracteres.



    /*######################################### Constructores ##############################################*/

    /*######################################################################################################*/



    /*####################################### Getters y setters ############################################*/

    /*######################################################################################################*/



    /*####################################### Métodos generales ############################################*/

    /*######################################################################################################*/
}
