// package HangMan;
import java.util.Scanner;
import java.util.Arrays;
public class HangMan {
    private String word = "";
    
    private int count = 0;
    void title(){
        System.out.println("H A N G M A N");
    }

    String getterMethod(){
        System.out.println("Enter the word that you want other to guess: ");
		Scanner sc = new Scanner(System.in);
		word = sc.nextLine();
        return word;
    }

    void setterMethod(HangMan hm){
        System.out.println("Guess the word: " + hm.getterMethod());
    }

    void userInput(HangMan hm){
        this.word=this.word.toLowerCase();
        int size = this.word.length();
        char words;
		char[] usrInput = new char[size];
		Arrays.fill(usrInput, '_');
		int defaultSize = usrInput.length;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character and the total size is : "+ size);
        for(int i = 0; i<size; i++){
            System.out.print("_ ");
        }
        System.out.println();
        System.out.println();
		int usrInputSize = 0;
        while(count<7 && (usrInputSize)<(size)){
			boolean flag = true;
			words=sc.next().charAt(0);
			words=Character.toLowerCase(words);
            for(int j = 0; j < word.length(); j++){
				
				if(words == word.charAt(j)){
					usrInput[j] = word.charAt(j);
					usrInputSize++;	// there is one problem ! if the word is "saksham" and I enter the same correct alphabet 'a' many time, this will give an error.
					flag = false;			
				}
				System.out.print(usrInput[j]+" ");
			}
			if(flag){
				count++;
				System.out.println();
				System.out.println();
				hangmanImage();
				
			}
            System.out.println();
        }
        sc.close();
    }


    void hangmanImage() {
		if (count == 1) {
			System.out.println("Wrong guess "+ this.count+", try again");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("___|___");
			
		}else if (count == 2) {
			System.out.println("Wrong guess "+ this.count+", try again");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("___|___");
		}else if (count == 3) {
			System.out.println("Wrong guess "+ this.count+", try again");
			System.out.println("   ____________");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   | ");
			System.out.println("___|___");
		}else if (count == 4) {
			System.out.println("Wrong guess "+ this.count+", try again");
			System.out.println("   ____________");
			System.out.println("   |          _|_");
			System.out.println("   |         /   \\");
			System.out.println("   |        |     |");
			System.out.println("   |         \\_ _/");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("___|___");
			System.out.println();
		}else if (count == 5) {
			System.out.println("Wrong guess "+ this.count+", try again");
			System.out.println("   ____________");
			System.out.println("   |          _|_");
			System.out.println("   |         /   \\");
			System.out.println("   |        |     |");
			System.out.println("   |         \\_ _/");
			System.out.println("   |           |");
			System.out.println("   |           |");
			System.out.println("   |");
			System.out.println("___|___");
			System.out.println();
		}else if (count == 6) {
			System.out.println("Wrong guess "+ this.count+", try again");
			System.out.println("   ____________");
			System.out.println("   |          _|_");
			System.out.println("   |         /   \\");
			System.out.println("   |        |     |");
			System.out.println("   |         \\_ _/");
			System.out.println("   |           |");
			System.out.println("   |           |");
			System.out.println("   |          / \\ ");
			System.out.println("___|___      /   \\");
			System.out.println();
		}else if (count == 7) {
			System.out.println("GAME OVER! " + this.count);
			System.out.println("   ____________");
			System.out.println("   |          _|_");
			System.out.println("   |         /   \\");
			System.out.println("   |        |     |");
			System.out.println("   |         \\_ _/");
			System.out.println("   |          _|_");
			System.out.println("   |         / | \\");
			System.out.println("   |          / \\ ");
			System.out.println("___|___      /   \\");
			System.out.println("GAME OVER! The word was " + this.word);
			System.out.println();
		}
	}
}

class Main{
    public static void main(String[] args) {
        HangMan hm = new HangMan();
        hm.title();
        hm.setterMethod(hm);
        hm.userInput(hm);
    }
}