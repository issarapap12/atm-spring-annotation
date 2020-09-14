package atm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public static void main(String[] args) {
//        DataSourceDB dataSourceDB = new DataSourceDB();
//        DataSourceFile dataSourceFile = new DataSourceFile("bean.xml");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
//        Bank bank = new Bank("My Bank", dataSourceFile);
//        ATM atm = new ATM(bank);
        AtmUI atmUI = applicationContext.getBean(AtmUI.class);
        atmUI.run();
    }
}
