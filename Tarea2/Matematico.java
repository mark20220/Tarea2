
/**
 * Dados tres números: El matemático sabe indicar cual es el numero mayor, cual el menor y
 * cual del medio.
 * Dados la base y altura de un cuadrado: El sabe indicar el área de dicha figura.
 * Dados las coordenadas de dos puntos: Sabe calcular distancia entre estos puntos.
 * Dado las coordenadas de un punto: Es capaz de indicar en que cuadrante se encuentra dicho
 * punto.
 * 
 * Mark 
 * 20/04/2021
 */
public class Matematico
{
    public Triple DarMayMedMen(int Num1, int Num2, int Num3){
        Triple Res;
        int Mayor;
        int Medio;
        int Menor;
        int Aux1;
        int Aux2;
        Aux1=Math.max(Num1, Num2);
        Mayor=Math.max(Aux1, Num3);
        Aux2=Math.min(Num1, Num2);
        Menor=Math.min(Aux2, Num3);
        if(Menor==Num1){
            if(Mayor==Num3){
                Medio=Num2;
            }else{
                Medio=Num3;
            }
        }else{
            if(Mayor==Num1){
                if(Menor==Num3){
                    Medio=Num2;
                }else{
                    Medio=Num3;
                }
            }else{
                Medio=Num1;
            }
        }
        Res=new Triple(Mayor, Medio, Menor);
        return Res;
    }
    
    public int DarArea(int Base, int Altura){
        int Res;
        Res=Base*Altura;
        return Res;
    }
    
    double DarDistancia(Punto P1, Punto P2){
        double Res;
        Res=Math.sqrt(Math.pow(P2.getX()-P1.getX(),2)+Math.pow(P2.getY()-P1.getY(),2));
        return Res;
    }
    
    String DarCuadrante(Punto P){
        String Res;
        if(P.getX()>0 && P.getY()>0){
            Res="Cuadrante I";
        }else{
            if(P.getX()<0 && P.getY()>0){
                Res="Cuadrante II";
            }else{
                if(P.getX()<0 && P.getY()<0){
                    Res="Cuadrante III";
                }else{
                    if(P.getX()>0 && P.getY()<0){
                        Res="Cuadrante IV";
                    }else{
                        Res="0.0";
                    }
                }
            }
        }
        return Res;
    }
    
}
