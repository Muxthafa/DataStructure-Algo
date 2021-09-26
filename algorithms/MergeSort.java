package com.bridgelabz.algorithms;
import java.util.*;

public class MergeSort {

	public static void mergeSort(String[] nameGo) {
		if (nameGo.length > 1) {
			String[] leftGo = new String[nameGo.length / 2];
			String[] rightGo = new String[nameGo.length - nameGo.length / 2];
			for (int so = 0; so < leftGo.length; so++) {
				leftGo[so] = nameGo[so];
			}
			for (int ki = 0; ki < rightGo.length; ki++) {
				rightGo[ki] = nameGo[ki + nameGo.length / 2];
			}
			mergeSort(leftGo);
			mergeSort(rightGo);
			merge(nameGo, leftGo, rightGo);
		}
	}

	public static void merge(String[] nameH, String[] leftH, String[] rightH) {
		int as = 0;
		int bs = 0;
		for (int i = 0; i < nameH.length; i++) {
			if (bs >= rightH.length || (as < leftH.length && leftH[as].compareToIgnoreCase(rightH[bs]) < 0)) {
				nameH[i] = leftH[as];
				as++;
			} else {
				nameH[i] = rightH[bs];
				bs++;
			}
		}
	}
	
	public static void main(String[] args) {
		String[] OneGo = {"Interstellar", "Gravity", "Martian", "Apollo", "Contact", "Musthafa", "Predator", "Alien"};
		String[] TwoGo = {"Minnie", "Kitty", "Madonna", "Miley", "Zoom-zoom", "Cristine", "Bubbles", "Ara", "Rose", "Maria"};
		String[] nameGo = new String[OneGo.length + TwoGo.length];
		mergeSort(OneGo);
		mergeSort(TwoGo);
		merge(nameGo, OneGo, TwoGo);
		mergeSort(nameGo);
		// Arrays.sort(names);
		for (String ClassThree : nameGo) {
			System.out.println(ClassThree);
		}
	}

}
