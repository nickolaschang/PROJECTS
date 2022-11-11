import com.sun.source.tree.Tree;

import java.nio.charset.CharacterCodingException;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		//using TreeSet to maintain the ordinal positions for better understanding
		Set<Integer> a = new TreeSet<>(Arrays.asList(0,2,4,5,6,8,10));
		Set<Integer> b = new TreeSet<>(Arrays.asList(5,6,7,8,9,10));
		
		//union
		Set<Integer> c = new TreeSet<>(a);
		c.addAll(b);
		System.out.print("Add All Result: " + c);
		System.out.println();
		
		//intersection
		Set<Integer> d = new TreeSet<>(b);
		d.retainAll(b);
		System.out.print("Retain All Result: " + d);
		System.out.println();
		
		//difference
		Set<Integer> e = new TreeSet<>(a);
		e.removeAll(b);
		System.out.print("Remove All Result: " + e);
		System.out.println();
		
		System.out.println();
		System.out.println("HashSet Result: ");
		Set<String> hashSet = new HashSet<>();
		
		hashSet.add("blue - 1 ");
		hashSet.add("yellow - 2");
		hashSet.add("green - 3");
		hashSet.add("rose - 4");
		hashSet.add("pink - 5");
		hashSet.add("black - 6");
		hashSet.add("white - 7");
		
		//hashSet.removeIf(x -> x.length() >= 3);
		//hashSet.removeIf(x -> x.charAt(1) == 'a');
		
		for (String list : hashSet) {
			System.out.println(list);
			
		}
		
		System.out.println();
		System.out.println("LinkedHashSet Result: ");
		Set<String> linkedHashSet = new LinkedHashSet<>();
		
		linkedHashSet.add("blue - 1 ");
		linkedHashSet.add("yellow - 2");
		linkedHashSet.add("green - 3");
		linkedHashSet.add("rose - 4");
		linkedHashSet.add("pink - 5");
		linkedHashSet.add("black - 6");
		linkedHashSet.add("white - 7");
		
		for (String list : linkedHashSet) {
			System.out.println(list);
		}
		System.out.println();
		System.out.println("TreeSet Result: ");
		Set<String> treeSet = new TreeSet<>();
		
		treeSet.add("blue - 1 ");
		treeSet.add("yellow - 2");
		treeSet.add("green - 3");
		treeSet.add("rose - 4");
		treeSet.add("pink - 5");
		treeSet.add("black - 6");
		treeSet.add("white - 7");
		
		for (String list : treeSet) {
			System.out.println(list);
		}
		
	}
}