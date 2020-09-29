package test.technique.adneom.service.impl;

import java.util.ArrayList;
import java.util.List;

import test.technique.adneom.service.IAdneomPartition;

/**
 * @author Malick DIOUF
 *
 */
public class AdneomPartition implements IAdneomPartition {

	@Override
	public <T> List<List<T>> partition(List<T> inputList, int taille) {
		List<List<T>> outPutList = new ArrayList<List<T>>();
		final int sizeOfTheInputList = inputList.size();
		for (int i = 0; i < sizeOfTheInputList; i += taille) {
			outPutList.add(new ArrayList<T>(inputList.subList(i, Math.min(sizeOfTheInputList, i + taille))));
		}
		return outPutList;
	}

}
