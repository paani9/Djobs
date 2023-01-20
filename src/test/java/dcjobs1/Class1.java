package dcjobs1;



import java.util.ResourceBundle;



import org.testng.annotations.Test;







public class Class1 {
	@Test
	public void t1()
	{
		
		
		
		ResourceBundle r=ResourceBundle.getBundle("test");
		System.out.println(r.getString("username"));
		
		
		
		
		
	}

}
