package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import domain.squares.actionsquares.BirthdayGift;
import domain.squares.actionsquares.BonusSquare;

public class BonusSquareTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		assertTrue(BonusSquare.repOK());
	}

}
