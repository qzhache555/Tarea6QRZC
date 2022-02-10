package tarea8;

/**
 * 
 * @author Administrator
 *
 */

public class ordenacion {

/**
 * ordena un array con max value
 * @param array matriz de entrada
 */
	public void Ordenacion(int[] array) {
		for (int i = array.length - 1; i > 0; i--) {
			int maxValue = 0;
			for (int j = 0; j < i; j++) {
				if (array[j + 1] > array[maxValue]) {
					maxValue = j + 1;
				}
			}
			swap(array, i, maxValue);
			printArray(array);
		}
	}
	/**
	 * Está ordenando un array con un auxiliar
	 * @param numbers parametro de entrada
	 * @return devuelve el parametro numbers
	 */
	
	public int[] Ordenacion2(int[] numbers) {
		for (int i=0; i < numbers.length - 1;i++) {
			for (int j=i+1;j<numbers.length;j++) {
				if (numbers[i]>numbers[j]) {
					int auxiliar=numbers[i];
					numbers[i]=numbers[j];
					numbers[j]=auxiliar;
				}
			}
		}
		return numbers;
	}
	/**
	 * Recorre el array y lo muesta
	 * @param array de entrada
	 */

	public void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.printf("%d \t", array[i]);
		}
		System.out.println();
	}
	
	/**
	 * array b se guarda en value
	 * array a se guarda en array b 
	 * value sse guarda en array a
	 * (se intraercambia los valores (swap))
	 * 
	 * 
	 * @param array de entrada
	 * @param a entero de entrada
	 * @param b entero de entrada
	 */

	public void swap(int[] array, int a, int b) {
		int value = array[b];
		array[b] = array[a];
		array[a] = value;
	}
}
