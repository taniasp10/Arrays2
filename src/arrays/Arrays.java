/*
 * Conjunto de datos, numerico real
 */
package arrays;

/**
 *
 * @author 203p21
 */
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        float [] temperaturas;//para crear un conjunto de datos, primero pongo en tipo de dato y despues [] y su nombre
        temperaturas=new float[4];//instancio el array, digo el numero de elementos.
        //esto ya no se puede cambiar
        System.out.println(temperaturas[0]);//para acceder a un elemento se pone su posicion
        */
        int [] diasMes={31,0,31,30,31,30,31,31,30,31,30,31};//para inicializar los datos
        String [] nombresMes={"Enero","Febrero","Marzo","Abril","Mayo","Junio",
            "Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
        
        int numeroMes;
        numeroMes = 0;//inicializo, es como un contador
        /*
        while(numeroMes < diasMes.length)
        {//no se suele poner while(numeroMes<12)
            //la propiedad length te da todos los valores de ese array
            System.out.println("Mes " + (numeroMes+1) + " " + nombresMes[numeroMes] 
                    + " tiene " + diasMes[numeroMes] + " dias");//visualiza el valor de esa posicion
            numeroMes++;
        }*/
        
        for(numeroMes=0; numeroMes< nombresMes.length; numeroMes++)
        {
            System.out.println("Mes " + (numeroMes+1) + " " + nombresMes[numeroMes] 
                 + " tiene " + diasMes[numeroMes] + " dias");//visualiza el valor de esa posicion
        }
    }
    
}
