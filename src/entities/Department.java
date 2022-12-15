package entities;

import java.util.ArrayList;
import java.util.List;

public class Department {
	private String name;
	private int payDay;
	
	private Address address;
	private List<Employee> employee = new ArrayList<>();
	
	public Department() {
		
	}

	public Department(String name, int payDay, Address address) {
		this.name = name;
		this.payDay = payDay;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPayDay() {
		return payDay;
	}

	public void setPayDay(int payDay) {
		this.payDay = payDay;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Employee> getEmployee() {
		return employee;
	}

	public void addEmployee(Employee employee) {
		this.employee.add(employee);
	}
	
	public void removeEmployee(Employee employee) {
		this.employee.add(employee);
	}
	
	public double payroll() {
		double aux = 0.0;
		for(Employee c : employee) {
			aux += c.getSalary();
		}
		return aux;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\nFOLHA DE PAGAMENTO:\n");
		sb.append("Departamento Vendas = R$ " + String.format("%.2f",payroll()) + "\n");
		sb.append("Pagamento realizado no dia "+getPayDay()+"\n");
		sb.append("Funcionários: ");
		for(Employee c : employee) {
			sb.append(c);
		}
		sb.append("\nPara dúvidas favor entrar em contato: "+address);
		return sb.toString();
	}
	
}
