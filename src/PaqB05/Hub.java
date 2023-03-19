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





    public void calcularcontpais(String procedencia){

        int cont;

        cont = 0;

        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < 12; j++) {

                if(procedencia.equals(contenedores[i][j].getProcedencia())){

                    cont++;

                }

            }

        }

    }




    public String toString(){

        String s = new String();

        for (int i = 0; i < 12; i++) {

            for (int j = 0; j < 10; j++) {


                if(contenedores[i][j] != null){

                    s += "X";

                }

                else{

                    s += " ";

                }

            }

        }

        return s;

    }

    /*######################################################################################################*/
}
