package com.guilherme.javahibernatews.entities.enums;

public enum OrderStatus {

	WAITING_PAYMENT(1),
	PAID(2),
	SHIPPED(3),
	DELIVERED(4),
	CANCELED(5);
	
	private int code;
	
	// Construtor de Enum eh private
	private OrderStatus(int code) {
		this.code = code;
	}
	
	// Metodo GET
	public int getCode() {
		return code;
	}
	
	// Converter valor numerico para o tipo Enum
	// Metodo estatico funciona sem precisar instanciar
	public static OrderStatus valueOf(int code) {
		for (OrderStatus value : OrderStatus.values()) {
			if (value.getCode() == code) {
				return value;
			}
		}
		throw new IllegalArgumentException("Invalid OrderStatus Code");
	}
	
}
