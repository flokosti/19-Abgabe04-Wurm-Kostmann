package at.fhj.iit;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

// write Test-Cases (read Queue Interface for understanding methods) and use Debugging possibilies of your IDE

public class StringQueue implements Queue {

	/**
	 * StringQueue based on an ArrayList but with a maximum size.
	 * There are several methods for adding and removing elements from the Queue.
	 */

	private List<String> elements = new ArrayList<String>();
	private int maxSize;

	/**
	 * Constructor initializes StringQueue with
	 *
	 * @param maxSize --> maximum number of elements
	 */
	public StringQueue(int maxSize){
		this.maxSize = maxSize;
	}

	/**
	 * Adds elements to the Queue
	 * @param obj --> String object
	 * @return true if addition is successful.
	 */
	@Override
	public boolean offer(String obj) {
		if(elements.size()!= maxSize) {
			elements.add(obj);
			return true;
		}else {
			return false;
		}
	}

	/**
	 * Returns peek elements and deletes it.
	 * @return --> peek element.
	 */
	@Override
	public String poll() {
		String element = peek();
		
		if(elements.size() != 0){
			elements.remove(0);
		}
		
		return element;
	}

	/**
	 * Returns peek element and deletes it.
	 * Also throws NoSuchElementException if Queue is empty.
	 * @return --> peek element.
	 */
	@Override
	public String remove() {
		String element = poll();

		if(element == null)
			throw new NoSuchElementException("there's no element any more");
		
		return element;
	}

	/**
	 * Returns peek element.
	 * @return --> peek element or null.
	 */
	@Override
	public String peek() {
		String element;
		if(elements.size() > 0)
			element = elements.get(0);
		else
			element = null;
		
		return element;
	}

	/**
	 * Returns peek element.
	 * Also throws NoSuchElementException if Queue is empty.
	 * @return --> peek element.
	 */
	@Override
	public String element() {
		String element = peek();
		if(element == null)
			throw new NoSuchElementException("there's no element any more");
		
		return element;
	}

}