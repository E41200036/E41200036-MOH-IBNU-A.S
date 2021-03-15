package tugas;

public class ManagingPeople {
    
    public static void main(String[] args) {
        
        person p1 = new person("Arial", 37);
        
        person p2 = new person("Joseph", 15);
        
        
        if(p1.getAge() == p2.getAge()) {
            System.out.println(p1.getName() + " is the same age as " + p2.getName());
        } else {
            System.out.println(p1.getName() + " is NOT the same age as " + p2.getName());
        }
        
    }
    
}
