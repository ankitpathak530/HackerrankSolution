package HackerRank;

public class StackQueueExample {

	private String stack="";
	private String queue="";

	public void pushCharacter(char ch){
	  stack+=ch;
	}
	public char popCharacter(){
	  return stack.charAt(stack.length()-1);
	}
	public void enqueueCharacter(char ch) {
		queue=ch+queue;
	}
	public char dequeueCharacter() {
		return queue.charAt(0);
	}
	public static void main(String... args) {
		StackQueueExample sq = new StackQueueExample();
		sq.pushCharacter('a');
		sq.pushCharacter('n');
		sq.pushCharacter('k');
		sq.pushCharacter('i');
		sq.pushCharacter('t');
		
		System.out.println(sq.stack);
		
		System.out.println(sq.popCharacter());
	}
}
