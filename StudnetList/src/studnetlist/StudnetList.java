
package studnetlist;

/**
 *
 * @author Nadia
 */
import java.util.Scanner;
public class StudnetList {

    public static void main(String[] args) {
        Student [] student=new Student[4];
        
        Scanner k = new Scanner(System.in);
        
        
        for(int i=0;i<student.length;i++){
            System.out.println("Enter your student ID");
            student[i].setId(k.nextInt());
            System.out.println("Enter your Name");
            student[i].setName(k.next());
            System.out.println("Enter your age.");
            student[i].setAge(k.nextInt());
        }
       
        

             
        
      
        
    }
    
}
