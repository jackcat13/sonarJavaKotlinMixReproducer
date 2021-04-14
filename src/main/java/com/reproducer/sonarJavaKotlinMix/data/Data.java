package com.reproducer.sonarJavaKotlinMix.data;

import java.util.Objects;

public class Data {

    private String a;
    private String b;
    private String c;

    public Data(String a, String b, String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String toBeTested(String input){
        return "Hello " + input;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Data data = (Data) o;
        return Objects.equals(a, data.a) && Objects.equals(b, data.b) && Objects.equals(c, data.c);
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, c);
    }

    @Override
    public String toString() {
        return "Data{" +
                "a='" + a + '\'' +
                ", b='" + b + '\'' +
                ", c='" + c + '\'' +
                '}';
    }
}
