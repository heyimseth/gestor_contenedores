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



    /*######################################### Constructores ##############################################*/

    /*######################################################################################################*/



    /*####################################### Getters y setters ############################################*/

    /*######################################################################################################*/



    /*####################################### Métodos generales ############################################*/
    public void apilarContenedor(Contenedor cont) {
        if (cont != null) {

            switch (cont.getPrioridad()) {
                case 1:

                case 2:
                    int col = cont.getPrioridad() - 1;

                    for (int i = contenedores.length - 1; i >= 0; i--) {

                        if (contenedores [i][col] == null) {
                            contenedores [i][col] = cont;
                            return;
                        }

                    }

                    break;

                case 3:
                    for (int j = 2; j < contenedores[0].length; j++) {
                        for (int i = contenedores.length - 1; i >= 0; i--) {

                            if (contenedores [i][j] == null) {
                                contenedores[i][j] = cont;
                                return;
                            }
                        }
                    }

                    break;

            }
        }
    }
    /*######################################################################################################*/
}
