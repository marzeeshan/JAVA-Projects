package email.administration.application;

public class EmailApp {
    
    public static void main(String[] args){
        Email em1 = new Email("Mohammed","Zeeshan");
        System.out.println(em1.showInfo());
        em1.setAlternateEmail("mz@gmail.com");
        System.out.println("ALTERNATE EMAIL: " + em1.getAlternateEmail());
        
    }
    
}
