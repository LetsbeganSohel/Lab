package SpringJDBC.Com;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ac= new ClassPathXmlApplicationContext ("configure.xml");
        Dao dao=  ac.getBean("DaoImplement",Dao.class);
        Student st= new Student();
        st.setId(111);
        st.setName("Sobhojeet");
        st.setAge(23);
        st.setAddress("Kolkata");
        st.setEmail("jeet123@gmail.com");
        int rs=dao.insert(st);
        System.out.println(rs);
        
    }
}
