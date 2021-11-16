package com.qijianguo.design.pattern.decorator.javaio;

import java.io.*;

public class LowerCaseInputStream extends FilterInputStream {

    /**
     * Creates a <code>FilterInputStream</code>
     * by assigning the  argument <code>in</code>
     * to the field <code>this.in</code> so as
     * to remember it for later use.
     *
     * @param in the underlying input stream, or <code>null</code> if
     *           this instance is to be created without an underlying stream.
     */
    protected LowerCaseInputStream(InputStream in) {

        super(in);
    }

    @Override
    public int read() throws IOException {
        int result = super.read();
        return (result == -1 ? result : Character.toLowerCase((char)result));
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        int result = super.read(b, off, len);
        for (int i = off; i < off + result; i++) {
            b[i] = (byte) Character.toLowerCase((char)b[i]);
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        //LowerCaseInputStream in = new LowerCaseInputStream(new FileInputStream(new File("/Users/qijianguo/IdeaProjects/practice-design-pattern/decorator-pattern/src/main/resources/test.txt")));
        try(LowerCaseInputStream in = new LowerCaseInputStream(new FileInputStream(new File("/Users/qijianguo/IdeaProjects/practice-design-pattern/decorator-pattern/src/main/resources/test.txt")));) {
            int c;
            while ((c = in.read()) >= 0) {
                System.out.print((char) c);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
