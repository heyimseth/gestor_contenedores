package PaqB05;

/**
 * Clase que define un hub de contenedores marítimos. Cada hub almacena hasta un total de 120 contenedores,
 * apilados en 10 filas y 12 columnas.</br></br>
 * La primera columna está destinada a contenedores con prioridad 1, la segunda columna a contenedores con
 * prioridad 2, y el resto de columnas, a los contenedores con prioridad 3.
 * @see Contenedor
 */
public class Hub {
    private Contenedor[][] contenedores;    // debe inicializarse con 10 filas y 12 columnas.

    public Hub(Contenedor[][] contenedores) {
        this.contenedores = contenedores;
    }

    public void setContenedores(Contenedor[][] contenedores) {
        this.contenedores = contenedores;
    }

    public Contenedor[][] getContenedores() {
        return contenedores;
    }

    public String mostrarDatos(int identificador) {
        Contenedor[][] contenedores = getContenedores();
        Contenedor encontrado=null;
            for (int i = 0; i < contenedores.length; i++) {
                for (int j = 0; j < contenedores[0].length; j++) {
                    if (contenedores[i][j].getIdentificador()==identificador){
                        encontrado=contenedores[i][j];
                    }
                }
            }

            if (encontrado!=null){
                return encontrado.toString();
            }else{
                return "El contenedor facilitado no se encuentra en nuestro almacen";
            }

    }



    /*####################################### Métodos generales ############################################*/

    /*######################################################################################################*/
}
