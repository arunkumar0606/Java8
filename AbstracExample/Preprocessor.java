package AbstracExample;

public abstract class Preprocessor implements LetterGeneration {
    
    protected void findLetter(){
        System.out.println("Found the letter");


    }

    protected void complete(){
        System.out.println("Completed letter");
    }

    @Override
    public String process(String input) {
    findLetter();

   System.out.println("Processing letter");

   complete();
   return "Success";
}
}
