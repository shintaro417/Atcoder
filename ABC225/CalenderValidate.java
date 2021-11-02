import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;

public class Main {
	public static void main(String[] args) {
		FastScanner fs = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);

		//数列Aはカレンダーのように並んでいる()
		int n = fs.nextInt();
		int m = fs.nextInt();

		int[][] b = new int[n][m];

		for(int i = 0;i < n;i++) {
			for(int j = 0;j < m;j++) {
				b[i][j] = fs.nextInt();
			}
		}

		//列の共通の値
		int[][] x = new int[n][m];
		//行の共通の値
		int[][] y = new int[n][m];

		//行と列で共通の値を格納する
		for(int i = 0;i < n;i++) {
			for(int j = 0;j < m;j++) {
				//各列の共通の値を格納する
				x[i][j] = (b[i][j] + 6) / 7;
				//各行の共通の値を格納する
				y[i][j] = (b[i][j] - 1) % 7 + 1;
			}
		}


		String ansString = "Yes";
		//数列Bが数列Aと同じカーテンの性質を持っているのか判定する必要がある。
		for(int i = 0;i < n;i++) {
			for(int j = 0;j < m;j++) {
				//前行の列との値の差が +1でない場合
				if(0 < i && x[i][j]!= x[i - 1][j]+ 1) {
					ansString = "No";
				}
				//前列の行との値の差が+1でない場合
				if(0 < j && y[i][j]!= y[i][j - 1] + 1 ) {
					ansString = "No";
				}

				//前列と値が違う場合
				if(0 < j && x[i][j]!= x[i][j - 1] ) {
					ansString = "No";
				}

				//前行と値が違う場合
				if(0 < i && y[i][j] != y[i - 1][j]) {
					ansString = "No";
				}
			}
		}

		out.println(ansString);

		out.flush();
		fs.close();
	}

}

class FastScanner{
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;
    private boolean hasNextByte() {
        if (ptr < buflen) {
            return true;
        }else{
            ptr = 0;
            try {
                buflen = in.read(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (buflen <= 0) {
                return false;
            }
        }
        return true;
    }
    private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
    private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
    public boolean hasNext() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++; return hasNextByte();}
    public String next() {
        if (!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while(isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }
    public long nextLong() {
        if (!hasNext()) throw new NoSuchElementException();
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {
            minus = true;
            b = readByte();
        }
        if (b < '0' || '9' < b) {
            throw new NumberFormatException();
        }
        while(true){
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            }else if(b == -1 || !isPrintableChar(b)){
                return minus ? -n : n;
            }else{
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }
    public int nextInt() {
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
        return (int) nl;
    }
    public double nextDouble() { return Double.parseDouble(next());}

    public void close() {
    	try {
			in.close();
		} catch (IOException e) {
			// TODO: handle exception
		}
    }
}


