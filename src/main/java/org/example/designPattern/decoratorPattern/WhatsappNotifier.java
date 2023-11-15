package org.example.designPattern.decoratorPattern;

public class WhatsappNotifier extends Notifier{
    public WhatsappNotifier(String userName){
        super(userName);
    }

    @Override
    public void send(String message) {
        String phoneNbr = databaseService.getPhoneNbrFromUserName(getUserName());
        System.out.println("Sending " + message + " in whatsapp on " + phoneNbr);
    }
}