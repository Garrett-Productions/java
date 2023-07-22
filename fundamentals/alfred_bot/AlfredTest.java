public class AlfredTest {
    public static void main(String[] dragonfruits) { // arguement name is unimportant 

        AlfredQuotes alfredbot = new AlfredQuotes();

        String testGreeting = alfredbot.basicGreeting();
        String testGuestGreeting = alfredbot.guestGreeting("Garrett", "morning");
        String testDateAnnouncement = alfredbot.dateAnnouncement();
        String alexisTest = alfredbot.respondBeforeAlexis(" Alfred Im responding before your bot that's suppose to respond first, lolz");
        String alfredTest = alfredbot.respondBeforeAlexis(" Alexis, whats up girl?");

        System.out.println(testGreeting);
        System.out.println(testGuestGreeting);
        System.out.println(testDateAnnouncement);
        System.out.println(alexisTest);
        System.out.println(alfredTest);
    }
}