package org.example;

@FunctionalInterface // <1>
public interface Printable<T>{

	void print(T t);
}
