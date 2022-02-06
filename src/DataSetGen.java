/**
 * 
 * @author vanessa
 *
 * @param <T>
 */

public class DataSetGen <T> {
	
		private double sum;
		private T maximum;
		private int count;
		
		/**
		 * constructs am empty data set
		 */
		
		public DataSetGen() {
			
			sum = 0;
			count = 0;
			maximum = null;
		}
		
		/**
		 * 
		 * @param x
		 */
		public void add(T x) {
			
			if(!(x instanceof Measurable))
				  return;
		     sum = sum + ((Measurable) x).getMeasure();
		     if (count == 0 ||((Measurable) maximum).getMeasure() <((Measurable) x).getMeasure())
		        maximum = x;
		     count++;
		}
		
		/**
		 * 
		 * @return the average
		 */
		public double getAverage() {
			if (count == 0)
				return 0;
			else
				return sum/count;
		}
		
		/**
		 * 
		 * @return the maximum
		 */
		
		public T getMaximum() {
			return maximum;
		}
}
