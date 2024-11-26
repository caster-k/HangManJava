import java.util.Scanner;
import java.util.Arrays;
class HangMan {
    private String word="";
	private String uniqueCharacter="";
    
    private int count = 0;
    void title(){
        System.out.println("H A N G M A N");
    }

    String getterMethod(){
		System.out.println("Enter the word that you want other to guess: ");
		Scanner sc = new Scanner(System.in);
		word = sc.nextLine();
		// sc.close();//closes the scanner but does not close the scanner object??
        return word;
    }

    void setterMethod(HangMan hm){
        System.out.println("Guess the word: " + hm.getterMethod());
    }

    void userInput(HangMan hm){
        this.word=this.word.toLowerCase();
        int size = this.word.length();
        
		char[] usrInput = new char[size];
		Arrays.fill(usrInput, '_');//fills the array with '_'
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character and the total size is : "+ size);
        for(int i = 0; i<size; i++){//prints '_' up to the size of the word we have to guess
            System.out.print(usrInput[i]+" ");
        }
        System.out.println();
        System.out.println();
		
		hangMan(hm, usrInput, size, sc);
	}

	void hangMan(HangMan hm, char[] usrInput, int size, Scanner sc){
		char words='\0';
		int usrInputSize = 0;//

        while((count<7) && (usrInputSize)<(size)){
			boolean hangManImageFlag = true;
			boolean uniqueCharacterFlag = true;
			words=sc.next().charAt(0);
			words=Character.toLowerCase(words);
			for(int index = 0; index<uniqueCharacter.length(); index++){ // checks if the user has entered a unique character or not
				
				if(words == uniqueCharacter.charAt(index)){
					uniqueCharacterFlag = false; //if the user has entered a repeated character, the flag turns off!
					break;
				}
			}
            for(int j = 0; j < word.length(); j++){
				
				if((words == word.charAt(j))){
					usrInput[j] = word.charAt(j);
					uniqueCharacter += words;

					if(uniqueCharacterFlag){ //if the user has entered a unique character, then only the userInputSize will be incremented
						usrInputSize++;
					}
					hangManImageFlag = false;		//reset the flag to false
				}
				System.out.print(usrInput[j]+" ");
			}

			if(hangManImageFlag){
				count++;
				System.out.println();
				System.out.println();
				hangmanImage();
				
			}
            System.out.println();
        }
        sc.close();
		if (usrInputSize == size){
			System.out.println("You have guessed the word correctly!");
		}
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