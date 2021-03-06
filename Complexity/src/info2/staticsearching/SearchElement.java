package info2.staticsearching;

public class SearchElement<T> {
	/**
	 * 
	 * @param x - Element to Search for
	 * @param a - an Array of Comparable elements
	 * @return any index of element x in a, -1 if not found 
	 */
	public int bruteForce(T x,Comparable<T>[] a) {
		for (int i=0;i<a.length;i++){
			if (a[i].compareTo(x) == 0)
				return i;
		}
		return -1;
	}

	/**
	 * 
	 * @param x - Element to Search for
	 * @param a - an Array of Comparable elements
	 * @return any index of element x in a, -1 if not found 
	 */
	public int binarySearch(T x,Comparable<T>[] a) {
		int low = 0;
		int high = a.length - 1;
		int mid;
		while (low <= high) {
			mid = (low + high) / 2;
			if (a[mid].compareTo(x) < 0) {
				low = mid + 1;
			} else if (a[mid].compareTo(x) > 0) {
				high = mid - 1;
			} else {
				return mid;
			}
		}
		
		//throw new ItemNotFound("BinSearch fails");
		// rather return -1 than throw an Exception for a common case - this is not an error condition!
		return -1;
	}
}
