//My name is Xyz
//Xyz is name My

//one two three four five
//five four three two one

class StringSequenceChange {
	static public void main(String[] args) {
		String str = "one two three four five";
		String output = changeWordSequence(str);
		System.out.println(output);
	}
	static String changeWordSequence(String input) {
		//one two three four five
		String[] w = input.split(" ");//["one", "two", "three", "four","five"]

		for(int i=0, j=w.length-1; i<j; i++,j--) {
			String t = w[i];
			w[i] = w[j];
			w[j] = t;
		}
		//["five","four","three","two","one"]
		return String.join(" ",w);//"five four three two one"
	}	
}







