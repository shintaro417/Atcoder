//文字列
		String s = sc.nextLine();

		int[] check = new int[10];

		//0 -> 含まれていない 1 -> 含まれているか分からない 2 -> 含まれている。
		Arrays.fill(check, 0);

		for(int i = 0; i < s.length();i++) {
			if(s.charAt(i) == 'o') {
				check[i] = 2;
			}else if(s.charAt(i) == '?') {
				check[i] = 1;
			}
		}

		//不定
		int count1 = 0;
		//確定
		int count2 = 0;

		for(int i = 0;i < check.length;i++) {
			if(check[i] == 2) {
				count2++;
			}else if(check[i] == 1) {
				count1++;
			}

			if(count2 > 4) {
				System.out.println(0);
				return;
			}
		}


		//合計数
		int permutation = 1;

		for(int i = 0;i < count2;i++) {
			permutation = permutation * (4 - i);
			System.out.println(permutation);
		}

		int ans = permutation * (count1 + count2) - permutation / 2 * count2;

		System.out.println(ans);
