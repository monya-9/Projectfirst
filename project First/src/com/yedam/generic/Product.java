package com.yedam.generic;

public class Product<T, M> {
	T Kind;
	M model;
	
	public void setKind(T Kind) {
		this.Kind = Kind;
	}
	
	public T getKind() {
		return this.Kind;
	}
	
	public void setModel(M model) {
		this.model = model;
	}
	
	public M getmodel() {
		return this.model;
	}
}
