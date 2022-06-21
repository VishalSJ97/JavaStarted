package com.CH4;

public class DaysEnumSample {
    public static void main(String[] args) {
        enum Days {SUNDAY(0), MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4), FRIDAY(5), SATURDAY(6);
            final int i;
            Days(int i) {
                this.i = i;
            }
        }

        for(Days d : Days.values()) {
            System.out.println(d+" "+d.ordinal());
        }
    }
}
