import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;

public class Main {
	public static void main(String[] args) {
		FastScanner fs = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);

		int k = fs.nextInt();

		String a = String.valueOf(fs.nextLong());
		String b = String.valueOf(fs.nextLong());

		out.println(baseK(k, a, b));

	    out.flush();
		fs.close();
	}

	public static long baseK(int k, String a,String b) {
		long a10 = 0;
		long b10 = 0;

		for(int i = a.length() - 1;i >= 0;i--) {
			if('0' != a.charAt(i)) {
				a10 += (long)Math.pow(k, a.length() - 1 - i) * Integer.parseInt(String.valueOf(a.charAt(i)));
			}
		}

		for(int i = b.length() - 1;i >= 0;i--) {
			if('0' != b.charAt(i)) {
				b10 += (long)Math.pow(k, b.length() - 1 - i) * Integer.parseInt(String.valueOf(b.charAt(i)));
			}

		}

		return a10 * b10;
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


