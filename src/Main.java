import java.sql.Date;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	@SuppressWarnings("deprecation")
	public static void main(String[] args)  throws Exception {
		BaseCustomerManager customerManager=new StarbucksCustomerManager(new MernisServiceAdapter());
			
		customerManager.save(new Customer(1,"Kadir","Kara",new Date(1990,4,22),"12345678900"));
	}

	
}
