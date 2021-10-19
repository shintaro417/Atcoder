import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.NoSuchElementException;

public class Main {
	public static void main(String[] args) {
		FastScanner fs = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
///Double型を整数部と小数部に分ける方法
		///String型にして分割する -> 算術計算はできない
		///浮動小数点形では計算の精度が落ちる
		///BigDecimalを使う -> 誤差を抑えることができる
		double xy = fs.nextDouble();

		//double型を引数にnewすると精度が変わる
	   BigDecimal bigDecimal = new BigDecimal(String.valueOf(xy));

	   //intValue() -> bigdecimalをint型に変換する = 整数部の取り出し
	   int intValue = bigDecimal.intValue();

	   //a.subtract(b) -> a - bを実行する どちらもbigDecimal型
	   BigDecimal decimalPart = bigDecimal.subtract(new BigDecimal(intValue));



	   if(0.0 <= decimalPart.doubleValue() * 10.0 && decimalPart.doubleValue() * 10.0 <= 2.0) {
		   out.println(intValue + "-");
	   }else if(3 <= decimalPart.doubleValue() * 10 && decimalPart.doubleValue() * 10 <= 6) {
		   out.println(intValue);
	   }else {
		   out.println(intValue + "+");
	   }



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


