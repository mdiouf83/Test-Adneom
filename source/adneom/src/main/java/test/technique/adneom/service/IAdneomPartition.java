package test.technique.adneom.service;

import java.util.List;

/**
 * @author Malick DIOUF
 *
 */
public interface IAdneomPartition {

	/**
	 * This method allows to return a sublist of a list of elements according to the
	 * size provided in argument </br>
	 * 
	 * @param inputList : the list of a elements
	 * @param taille    : the number of elements of a sublist
	 * @return
	 */
	<T> List<List<T>> partition(List<T> inputList, int taille);
}
