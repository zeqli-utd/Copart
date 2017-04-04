import java.util.Scanner;

/**
 * Created by Xin Yang.
 */
public class DruleFacility 
{
    public static final void main(String[] args) 
    {
        ZipCodeLookup lookup = new ZipCodeLookup();
        System.out.println("Please input zipcode:");
        Scanner sc = new Scanner(System.in);
        String zipCode = sc.nextLine();
        System.out.println("Please input custimerId:");
        String customerId = sc.nextLine();
        try {
            // load up the knowledge base
            KieServices ks = KieServices.Factory.get();
            KieContainer kContainer = ks.getKieClasspathContainer();
            KieSession kSession = kContainer.newKieSession("rule");
            Message message = new Message();
            message.setMessage("Hello World");
            message.setStatus(Message.HELLO);
            kSession.insert(message);
            kSession.fireAllRules();
        } catch (Throwable t) 
        {
            t.printStackTrace();
        }
    }
}