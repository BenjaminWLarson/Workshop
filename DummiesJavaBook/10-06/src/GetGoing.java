import static java.lang.System.out;

class GetGoing {
   
    public static void main(String args[]) {
   	
        out.println("main is running:");
      
        EnglishSpeakingWorld e = 
                         new EnglishSpeakingWorld();
      
        //out.println(mars);   cannot resolve symbol
        out.println(e.mars);
        e.visitPennsylvania();
   }
}
