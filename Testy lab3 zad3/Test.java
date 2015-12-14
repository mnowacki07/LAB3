package dad;

import static org.junit.Assert.*;

import java.util.InputMismatchException;

import org.junit.FixMethodOrder;

import org.junit.runners.MethodSorters;

@org.junit.FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Test {

	ReceiveFIFO fifo = new ReceiveFIFO();
	Sending sending = new Sending();
	ReceiveLIFO lifo = new ReceiveLIFO();

	@org.junit.Test
	public void test1Size() {

		assertEquals(0, this.fifo.sending.messageList.size());   
	}

	@org.junit.Test(timeout = 55)
	public void test2TimeTest() {

		sending.sendMessage();
		sending.messageList.clear();
	}

	@org.junit.Test(expected = InputMismatchException.class)
	public void test3Mismatch() {
		sending.sendMessage();
		sending.messageList.clear();
	}

	@org.junit.Test(expected = IllegalArgumentException.class)
	public void test4IllegalArgument() {
		sending.sendMessage();

	}

	@org.junit.Test
	public void test5AfterAdd() {

		assertEquals(6, this.sending.messageList.size());
	}

	@org.junit.Test(expected = IndexOutOfBoundsException.class)
	public void test6OutOfBounds() {
		lifo.takingMessage();
	}

	@org.junit.Test(timeout = 70)
	public void test7TimeTest() {
		sending.sendMessage();
		lifo.takingMessage();
	}

	@org.junit.Test(timeout = 70)
	public void test8TimeTest() {
		sending.sendMessage();
		fifo.takingMessage();
	}

	@org.junit.Test
	public void test9AfterAdd() {
		assertEquals(0, this.lifo.sending.messageList.size());
	}

	@org.junit.Test
	public void test10AfterAdd() {
		assertEquals(0, this.fifo.sending.messageList.size());
	}

}
