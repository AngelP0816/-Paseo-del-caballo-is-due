public class Caballo {
        
    private int[][] tablero=new int[8][8];     
    public Caballo() {
    }
    
    public boolean movValido(int i, int j){
        boolean result=false;
        if(i>=0 && j>=0 && i<tablero[0].length && j<tablero[0].length){
            if(tablero[i][j]==0){
                result=true;        
            }                      
        }
        return result;
    }
    
    public boolean recorre(int i, int j, int cont){
        boolean result=false;
        tablero[i][j]=cont;                             
        if(cont==64){                                  
            result=true;                                
        }                                              
        if(movValido(i-1, j+2)){                       
            if(recorre(i-1, j+2, cont+1)){             
                result=true;                            
            }                                           
        }                                             
        if(movValido(i-2, j+1)){                        
            if(recorre(i-2, j+1, cont+1)){             
                result=true;                           
            }                                         
        }                                              
        if(movValido(i-2, j-1)){                        
            if(recorre(i-2, j-1, cont+1)){             
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
        for(int i=0;i<tablero.length;i++){                  
            for(int j=0;j<tablero[0].length;j++){          
                System.out.print(tablero[i][j]+"\t");       
                if(j==7){                                   
                    System.out.println("\n");               
                }                                           
            }                                              
        }
    }
    
}
