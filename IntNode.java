package lab4;

/**
 * @author Brianna Moffett
 */
import java.io.*;
import java.util.LinkedList;

public class IntNode {

	private int data; 
	private IntNode link; 
	
	public static void main(String[] args) {
		
	}
	/**
	 * @param none
	 */
	public IntNode(){ 
		this.data = 0;
		this.link = null;
	}
	/**
	 * 
	 * @param _data
	 * @param _link
	 */
	public IntNode(int _data, IntNode _link) { 
		this.data = _data;
	    this.link = _link;
	}
	/**
	 * 
	 * @param data
	 */
	public void setNodeValue (int data) { 
		this.data = data;
	}
	/**
	 * 
	 * @return data
	 */
	public int getNodeValue () { 
		return data;
	}
	/**
	 * 
	 * @param link
	 */
	public void setLink (IntNode link) { 
		this.link = link;
	}
	/**
	 * 
	 * @return link
	 */
	public IntNode getLink () { 
		return link;
	}
	/**
	 * @return string
	 */
	public String toString() { 
		return data + "->" + link;
	}
	/**
	 * 
	 * @param newdata
	 */
	public void addNodeAfterThis(int newdata) { 
		this.setLink(new IntNode(newdata, this.link));
	}
	/**
	 * @param none
	 * @return none
	 */
	public void removeNodeAfterThis () { 
		this.link = this.link.link;
	}
	/**
	 * 
	 * @return int
	 */
	public int ListLength() { 
		int count = 0;
		IntNode cursor = this;
		while (cursor != null) {
			if (cursor == null) {
				return count;
			}
			cursor = cursor.link;
			count++;
		}
		return count;
	}
	/**
	 * 
	 * @param head
	 * @param data
	 * @return boolean
	 * @precondition head is not null
	 */
	public static boolean search (IntNode head, int data) {
		IntNode cursor = head;
		while (cursor != null) {
			if (cursor.data == data) {
				return true;
			}
			data++;
			cursor = cursor.getLink();
		}
		return false;
	}
}
