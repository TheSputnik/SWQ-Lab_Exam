package at.fhj.itm.swd;

import java.util.logging.Logger;

/**
 * Stack Implementation of <code>Stack</code> Interface. supports Strings and
 * must be initialized with max. number of of items.
 * 
 * @see Stack
 */
public class StringStack implements Stack {

	/**
	 * stores the string values of this stack
	 */
	// hint: change visibility!
	private String[] elementData;

	public String[] getElementData() {
		return elementData;
	}

	public void setElementData(String[] elementData) {
		this.elementData = elementData;
	}

	/**
	 * is the position counter of the top item
	 */
	private int elementIndex;

	/**
	 * Constructor that initializes the stack with the given size.
	 *
	 * @param capacity
	 *            the size of the initialized stack. If the size is lower than
	 *            0, the Constructor will throw an exception
	 */
	public StringStack(int capacity) {
		if (capacity <= 0)
			throw new IllegalArgumentException("size must be <= 0");

		elementData = new String[capacity];
		elementIndex = 0;
	}

	@Override
	public boolean isEmpty() {
		if (elementData.length==0) return true;
		else return false;
	}

	@Override
	public void push(String item) {
		if (elementIndex == elementData.length)
			throw new IllegalStateException();

		// add element to array and increment the counter
		elementData[elementIndex++] = item;
	}

	@Override
	public String pop() {
		if (elementIndex != 0)
			throw new IllegalStateException();

		// returns the element and decrement the counter
		// hint: change below
		return elementData[--elementIndex];

	}
}
