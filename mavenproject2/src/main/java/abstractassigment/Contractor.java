package abstractassigment;

class Contractor extends Employee {
    int paymentPerHour;
    int workingHours;
    Contractor(int paymentPerHour,int workingHours){
    	this.paymentPerHour=paymentPerHour;
    	this.workingHours=workingHours;
    }
    void calculateSalary() {
    	int salary=paymentPerHour * workingHours;
    	System.out.println("Salary of contracter: "+salary);
    }

}
