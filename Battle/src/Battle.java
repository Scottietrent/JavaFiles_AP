
	import java.util.Scanner;


public class Battle

{

static String sentence;
static int startIndex;
static String newSentence;
public static void main(String[] args)

{

Scanner in = new Scanner(System.in);


System.out.print("What word or sentence would you like to translate to Pig Latin?: ");
sentence = in.nextLine();

int startIndex = 0;

String newSentence = "";

translate();

}
public static void translate()
{
for(int i = 1; i < sentence.length(); i++)

{

if(sentence.charAt(i) == ' ')

{

String word = sentence.substring(startIndex, i);

newSentence += solve(word) + " ";

startIndex = i +1;

}
}


newSentence += solve(sentence.substring(startIndex));

System.out.println("Original: "+ sentence);

System.out.println("Translation: "+ newSentence);

}



public static String solve (String word)

{

String temp = word.toLowerCase();

char[] vowels = {'a', 'e', 'i', 'o', 'u'};

char first = temp.charAt(0);



for (int i = 0; i < vowels.length; i++) 
{

if (first == vowels[i]) 
{

return word + "-way";

}

}


word = word.substring(1);

word += "-"+first + "ay";


return word;

}

}
