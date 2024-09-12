package org.animal.model;

public interface Worker {
	public default void bar() {
		System.out.println("default method in Worker interface");
	}
}
