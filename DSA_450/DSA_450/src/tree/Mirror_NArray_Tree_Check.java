package tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Mirror_NArray_Tree_Check {

	static int checkMirrorTree(int k, int e, int[] a, int[] b) {
		// code here

		if (a.length != b.length)
			return 0;

		int n = a.length;

		Map<Integer, List<Integer>> fmap = new HashMap<>();
		Map<Integer, List<Integer>> smap = new HashMap<>();

		for (int i = 0; i < n; i = i + 2) {

			if (fmap.containsKey(a[i])) {
				List<Integer> list = fmap.get(a[i]);
				list.add(a[i + 1]);
				fmap.put(a[i], list);
			} else {
				List<Integer> list = new ArrayList<>();
				list.add(a[i + 1]);
				fmap.put(a[i], list);
			}

			if (smap.containsKey(b[i])) {
				List<Integer> list = smap.get(b[i]);
				list.add(b[i + 1]);
				smap.put(b[i], list);
			} else {
				List<Integer> list = new ArrayList<>();
				list.add(b[i + 1]);
				smap.put(b[i], list);
			}
		}

		for (Map.Entry<Integer, List<Integer>> m : fmap.entrySet()) {

			if (smap.containsKey(m.getKey())) {
				List<Integer> fl = m.getValue();
				List<Integer> sl = smap.get(m.getKey());
				if (fl.size() != sl.size()) {
					// System.out.println(m.getKey());
					return 0;
				}
				for (int i = 0; i < fl.size(); ++i) {
					if (fl.get(i) != sl.get(sl.size() - i - 1)) {
						// System.out.println(m.getKey());
						return 0;
					}
				}
			} else {
				return 0;
			}

		}
		return 1;

	}

}
