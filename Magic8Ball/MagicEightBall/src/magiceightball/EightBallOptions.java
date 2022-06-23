
package magiceightball;
import java.util.Random;

public class EightBallOptions {
    
   private String[] fortunes;
   private String ChosenFortune;
    
   public void EightBallOptions(){
       this.fortunes = new String[] {"It is Certain ",
           "It is decidedly so" ,"With out a doubt","Yes- Definitely", "You may rely on it"," As i see it, yes", "Most likely", "Outlook good",
           "Yes", "Signs point to yes","Reply hazy try again", "Ask again later","Better not tell you now", "Cannot predict now", "Concentrate and ask again",
           "Dont count on it", "My reply is no","My sources say no", "Outlook not so good","Very doubtful"
       };
        
    }
    public String FortuneSelection(){
       
       Random randomSelect = new Random();        
       int ln = randomSelect.nextInt(this.fortunes.length);      
       this.ChosenFortune = this.fortunes[ln];
       return this.ChosenFortune;
       
       
    }
    
}


// while user keeps pressing button // run the function again to select a saying 