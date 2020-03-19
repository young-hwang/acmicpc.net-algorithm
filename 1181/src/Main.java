import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static String[] sorted;
	
	public static void main(String[] args) {
//		문제
//		알파벳 소문자로 이루어진 N개의 단어가 들어오면 아래와 같은 조건에 따라 정렬하는 프로그램을 작성하시오.
//
//		길이가 짧은 것부터
//		길이가 같으면 사전 순으로
//
//		입력
//		첫째 줄에 단어의 개수 N이 주어진다. (1≤N≤20,000) 둘째 줄부터 N개의 줄에 걸쳐 알파벳 소문자로 이루어진 단어가 한 줄에 하나씩 주어진다. 
//		주어지는 문자열의 길이는 50을 넘지 않는다.
//
//		출력
//		조건에 따라 정렬하여 단어들을 출력한다. 단, 같은 단어가 여러 번 입력된 경우에는 한 번씩만 출력한다.
//		
//		예제 입력 1 
//		13
//		but
//		i
//		wont
//		hesitate
//		no
//		more
//		no
//		more
//		it
//		cannot
//		wait
//		im
//		yours
//
//		예제 출력 1 
//		i
//		im
//		it
//		no
//		but
//		more
//		wait
//		wont
//		yours
//		cannot
//		hesitate
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			int N = Integer.parseInt(br.readLine());
			String[] words = new String[N];
			String word = "";

			for (int i = 0; i < N; i++) {
				words[i] = br.readLine();
			}
			
			sorted = new String[N];
			mergeSort(words, 0, N - 1);
			
			for (int i = 0; i < N; i++) {
				if (word.equals(words[i])) continue;
				word = words[i];
				bw.write(words[i]);
				bw.newLine();
			}
			bw.flush();
		} catch (Exception e) {
		}
	}

	private static void mergeSort(String[] words, int left, int right) {
		int mid; 
		if (left < right) {
			mid = (left + right) / 2;
			mergeSort(words, left, mid);
			mergeSort(words, mid + 1, right);
			merge(words, left, mid, right);
		}
	}

	private static void merge(String[] words, int left, int mid, int right) {
		int i = left;
		int j = mid + 1;
		int k = left;
		
		while (i <= mid && j <= right) {
			if (words[i].length() < words[j].length() 
					|| (words[i].length() == words[j].length() && words[i].compareTo(words[j]) <= 0)) {
				sorted[k++] = words[i++];
			} else {
				sorted[k++] = words[j++];
			}
		}
		
		if (i > mid) {
			for (int l = j; l <= right; l++)
				sorted[k++] = words[l];
		} else {
			for (int l = i; l <= mid; l++) 
				sorted[k++] = words[l];
		}
		
		for (int m = left; m <= right; m++) {
			words[m] = sorted[m];
		}
	}

}