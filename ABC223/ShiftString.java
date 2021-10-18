package aoj.itp1;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;

public class Main {
	public static void main(String[] args) {
		FastScanner fs = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);

		String str = fs.next();
		String s1 = str;
		String s2 = str;

		//右シフトを 1 回行うことは、左シフト を N−1 回行うことと同じです。そのため、左シフトのみを行う
		//得られる文字列（高々 N 通り）を列挙し、その中で辞書順最小 / 最大のものを求めればよい
		for(int i = 0;i < str.length();i++) {
			//先頭の文字を末尾に持っていく(左シフト)
			str = str.substring(1) + str.substring(0,1);
			out.println(str + " " + s1 + " " + s2);
			//左シフトした文字列と入力値の比較(CompareToは一文字ずつ調べる)
			if(str.compareTo(s1) < 0) {
				//引数の文字列を起点にstrが辞書的に前にある場合(負の数を返すから)
				s1 = str;
			}else if(str.compareTo(s2) > 0) {
				//引数の文字列を起点にstrが辞書的に後にある場合(正の数を返すから)
				s2 = str;
			}
		}

		out.println(s1);
		out.println(s2);

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


