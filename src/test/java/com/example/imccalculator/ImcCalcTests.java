package com.example.imccalculator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ImcCalcTests {
	private ImcCalc manager;

	@BeforeEach
	public void setup() {
		manager = new ImcCalc();
	}

	@Test
	void extremeSkinny() {
		assertEquals("Delgadez Severa", manager.calculaImc(40, 1.68));
	}

	@Test
	void moderateSkinny() {
		assertEquals("Delgadez Moderada", manager.calculaImc(44, 1.65));
	}

	@Test
	void littleSkinny() {
		assertEquals("Delgadez Leve", manager.calculaImc(50, 1.70));
	}

	@Test
	void normalWeight() {
		assertEquals("Peso Normal", manager.calculaImc(60, 1.70));
	}

	@Test
	void overWeight() {
		assertEquals("Sobrepeso", manager.calculaImc(80, 1.72));
	}

	@Test
	void litleoverWeight() {
		assertEquals("Obesidad leve", manager.calculaImc(88, 1.70));
	}

	@Test
	void moderatedoverWeight() {
		assertEquals("Obesidad Moderada", manager.calculaImc(105, 1.70));
	}

	@Test
	void morbiddoverWeight() {
		assertEquals("Obesidad Morbida", manager.calculaImc(120, 1.65));
		
	}
}
