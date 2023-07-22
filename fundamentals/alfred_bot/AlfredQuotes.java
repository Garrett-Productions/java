import java.util.Date;
public class AlfredQuotes {
    public String basicGreeting() {
        //no code goes here, example method
        return "Hello, wonderful to see you. How are you?";
    }

    public String guestGreeting(String name, String dayPeriod) { //this now returns a type string
        return String.format("Good %s, %s, Welcome!",dayPeriod, name);
    }

    public String dateAnnouncement() {
        return String.format("Our current date and time is %s", new Date());
    }

    public String respondBeforeAlexis(String conversation) {
        if(conversation.indexOf("Alexis") > -1 ) {
            // error: incompatible types: int cannot be converted to boolean.. 
            //shoutout Geeksforgeeks for the documentation
            return "Right away sir, idk what Alexis is doing, perdoname, request Alfred next time";
        }
        if(conversation.indexOf("Alfred")> -1) {
            // error: incompatible types: int cannot be converted to boolean
            return "At your swervice promptly, como siempre";
        }
        return "for snarky response return string";
    }

    //Sensei bonus, write your own alfredquote method using any of the string methods you have learned
}