package org.example.designPattern.decoratorPattern;

public class Notifier {
    private final String userName;
    protected final DatabaseService databaseService;

    public Notifier(String userName){
        this.userName = userName;
        databaseService = new DatabaseService();
    }
    public void send(String message){
        String mail = databaseService.getMailFromUsername(userName);
        System.out.println("Sending " + message + " in mail " + mail);
    }
    public String getUserName(){
        return userName;
    }
}
