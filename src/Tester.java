import java.io.IOException;

public class Tester {

	public static void main(String[] args) throws IOException {

		LexicalAnalyzer lexicalAnalyzer = new LexicalAnalyzer();
		String filePath = "inputFile.txt";
		
		if (lexicalAnalyzer.initialize(filePath)) {

			Token token;
			try {
				while ((token = lexicalAnalyzer.nextToken()) != null) {
					System.out.print(token.toString());
				}
				lexicalAnalyzer.printHashMap();
			} catch (Exception e) {
				e.printStackTrace();
			}

		} else
			System.out.println("File not found!!");
	
	}

}
