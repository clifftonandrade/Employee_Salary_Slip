import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Salary_TestCase {
	Salary s = new Salary(12000);
	@Test
	public void testBasicSalary() {
		s.displayInfo();
		assertEquals(12000,(int)s.getBasicSalary());
	}
	@Test
	public void testDa() {
		assertEquals(8760,(int)s.getDa());
	}
	@Test
	public void testGrossSalary() {
		assertEquals(21960,(int)s.getGrossSalary());
	}
	@Test
	public void testIncomeTax() {
		assertEquals(6588,(int)s.getIncomeTax());
	}
	@Test
	public void testNetSalary() {
		assertEquals(15372,(int)s.getNetSalary());
	}
}