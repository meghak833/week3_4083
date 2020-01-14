
package studnetlist;

/**
 *
 * @author Nadia
 */
import java.util.Scanner;
public class StudnetList {

    public static void main(String[] args) {
        Student [] stu=new Student[4];
        
        Scanner k = new Scanner(System.in);
        
        
        for(int i=0;i<stu.length;i++){
            System.out.println("Enter your student ID");
            stu[i].setId(k.nextInt());
            System.out.println("Enter your Name");
            stu[i].setName(k.next());
        }
       
        for(Student item: stu){
            System.out.println("id: "+ item.getId()+"\nName: " + item.getName());
        }

             
        
      
        
    }
    
}
