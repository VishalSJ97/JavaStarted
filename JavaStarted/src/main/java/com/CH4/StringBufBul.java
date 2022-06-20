package com.CH4;

/**
 * No.	StringBuffer	                                    StringBuilder
 * 1)	StringBuffer is synchronized i.e. thread safe.      StringBuilder is non-synchronized i.e. not thread safe.
 *      It means two threads can't call the methods of      It means two threads can call the methods of
 *      StringBuffer simultaneously.	                    StringBuilder simultaneously.
 * 2)	StringBuffer is less efficient than StringBuilder.	StringBuilder is more efficient than StringBuffer.
 * 3)	StringBuffer was introduced in Java 1.0	            StringBuilder was introduced in Java 1.5
 *
 *
 * No.	String	                                            StringBuffer
 * 1)	The String class is immutable.	                    The StringBuffer class is mutable.
 * 2)	String is slow and consumes more memory when we     StringBuffer is fast and consumes less memory when we
 *      concatenate too many strings because every time     concatenate the strings.
 *      it creates new instance.
 * 3)	String class overrides the equals() method of       StringBuffer class doesn't override the equals()
 *      Object class. So you can compare the contents of    method of Object class.
 *      two strings by equals() method.
 * 4)	String class is slower while performing             StringBuffer class is faster while performing
 *      concatenation operation.	                        concatenation operation.
 * 5)	String class uses String constant pool.	            StringBuffer uses Heap memory
 * */

public class StringBufBul {
    public static void main(String[] args){
        StringBuffer buffer=new StringBuffer("hello");
        buffer.append("java");
        System.out.println(buffer);

        StringBuilder builder=new StringBuilder("hello");
        builder.append("java");
        System.out.println(builder);

        long startTime = System.currentTimeMillis();
        StringBuffer sb = new StringBuffer("Java");
        for (int i=0; i<10000; i++){
            sb.append("Tpoint");
        }
        System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");
        startTime = System.currentTimeMillis();
        StringBuilder sb2 = new StringBuilder("Java");
        for (int i=0; i<10000; i++){
            sb2.append("Tpoint");
        }
        System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms");
    }
}
