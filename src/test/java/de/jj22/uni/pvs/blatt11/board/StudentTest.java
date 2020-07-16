package de.jj22.uni.pvs.blatt11.board;

import org.junit.Test;

import de.jj22.uni.pvs.blatt11.board.Board;
import de.jj22.uni.pvs.blatt11.board.Student;

public class StudentTest {

	@SuppressWarnings("deprecation")
	@Test
	public void test() {
		final var board = new Board();
		
		final var hans = new Student("Hans");
		final var erika = new Student("Erika");
		final var harald = new Student("Harald");

		hans.observeBoard(board);
		erika.observeBoard(board);
		harald.observeBoard(board);

		board.changeMessage("Go Home");
		board.changeMessage("Live Cheap");
		board.changeMessage("Be The Best");
		
		System.out.printf("There are %d students registered\n",board.countObservers());
		erika.stopObservingBoard(board);
		System.out.printf("There are %d students registered\n",board.countObservers());
	}

}