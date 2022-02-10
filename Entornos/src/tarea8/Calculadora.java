package tarea8;
/**
 * 
 * @author Administrator
 *
 */
public class Calculadora {
	/**
	 * 
	 */

	/**
	 * @author Juan Simón
	 *
	 */
		
		public Calculadora(){
	        
	    }
	    /**
	     * Suma de dos numeros
	     * @param num1 entero
	     * @param num2 entero
	     * @return suma de num 1 y 2
	     */
	    public int suma(int num1,int num2){
	        return num1+num2;
	    }
	    /**
	     resta de dos numeros 
	     * @param num1 entero
	     * @param num2 entero
	     * @return resta entre num 1 y 2
	     */
	    
	    public int resta(int num1,int num2){
	        return num1-num2;
	    }
	    /**
	     multiplicación de dos numeros 
	     * @param num1 entero
	     * @param num2 entero
	     * @return multiplicación entre num 1 y 2
	     */
	    
	    public int multiplica(int num1,int num2){
	        return num1*num2;
	    }
	    /**
	     * division de dos numeros 
	     * @param num1 entero
	     * @param num2 entero que no puede ser 0
	     * @return division entre num 1 y 2
	     */
	    public int divide(int num1,int num2){
	        if (num2==0) throw new ArithmeticException("NO PUEDES DIVIDIR POR CERO, MELON");
	        return num1/num2;
	    } 
	  

		private int valor1;
		private int valor2;
	}


