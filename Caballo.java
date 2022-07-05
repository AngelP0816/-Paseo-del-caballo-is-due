public class Caballo {
        
    private int[][] tablero=new int[8][8];      //tablero en el que se llevara el registro del recorrido del caballo

    public Caballo() {
    }
    
    public boolean movValido(int i, int j){
        boolean result=false;
        if(i>=0 && j>=0 && i<tablero[0].length && j<tablero[0].length){
            if(tablero[i][j]==0){
                result=true;        //metodo que valida la posición a la
            }                       //que intenta moverse el caballo
        }
        return result;
    }
    
    public boolean recorre(int i, int j, int cont){
        boolean result=false;
        tablero[i][j]=cont;                             //metodo que lleva a
        if(cont==64){                                   //cabo el recorrido
            result=true;                                //del caballo por el
        }                                               //tablero y revisando
        if(movValido(i-1, j+2)){                        //la posición a la
            if(recorre(i-1, j+2, cont+1)){              //cual es mas factible
                result=true;                            //moverse revisando
            }                                           //las posibles posiciones
        }                                               //a la cuales puede
        if(movValido(i-2, j+1)){                        //moverse el caballo
            if(recorre(i-2, j+1, cont+1)){              //de la siguiente manera
                result=true;                            //  3   2
            }                                           //4       1
        }                                               //    X
        if(movValido(i-2, j-1)){                        //5       8
            if(recorre(i-2, j-1, cont+1)){              //  6   7
                result=true;
            }
        }
        if(movValido(i-1, j-2)){
            if(recorre(i-1, j-2, cont+1)){
                result=true;
            }
        }
        if(movValido(i+1, j-2)){
            if(recorre(i+1, j-2, cont+1)){
                result=true;
            }
        }
        if(movValido(i+2, j-1)){
            if(recorre(i+2, j-1, cont+1)){
                result=true;
            }
        }
        if(movValido(i+2, j+1)){
            if(recorre(i+2, j+1, cont+1)){
                result=true;
            }
        }
        if(movValido(i+1, j+2)){
            if(recorre(i+1, j+2, cont+1)){
                result=true;
            }
        }
        if(!result){
            tablero[i][j]=0;
        }
        return result;
    }
    
    public void imprimir(){
        for(int i=0;i<tablero.length;i++){                  //metodo que imprime
            for(int j=0;j<tablero[0].length;j++){           //el tablero para
                System.out.print(tablero[i][j]+"\t");       //mostrar el recorrido
                if(j==7){                                   //que llevo a cabo el
                    System.out.println("\n");               //caballo una vez que
                }                                           //este a finalizado su
            }                                               //recorrido por el tablero
        }
    }
    
}
