package com.kmh.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Stock implements Serializable {

	private static final long serialVersionUID = 1L;

	private String stockId;
	private String name;
	private int quantity;
}
