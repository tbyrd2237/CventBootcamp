package org.cventbootcamp;

public class Employee {
    package org.cventbootcamp;

    public class Employee {
        private int employeeId;
        private String name;
        private String department;
        private double payRate;
        private double hoursWorked;

        public Employee(int employeeId, String name, String department, double payRate, double hoursWorked) {
            this.employeeId = employeeId;
            this.name = name;
            this.department = department;
            this.payRate = payRate;
            this.hoursWorked = hoursWorked;
        }

        //Overload the constructor
        //Parameterless Constructor
        public Employee() {
            this.name = "Not Set";
        }

        //Constructor with some of the properties
        public Employee(int employeeId, String name, String department) {
            this.employeeId = employeeId;
            this.name = name;
            this.department = department;
        }

        public int getEmployeeId() {
            return employeeId;
        }

        public String getName() {
            return name;
        }

        public String getDepartment() {
            return department;
        }

        public double getPayRate() {
            return payRate;
        }

        public double getHoursWorked() {
            return hoursWorked;
        }

        public double getTotalPay() {
            return hoursWorked;
        }

        public void setEmployeeId(int employeeId) {
            this.employeeId = employeeId;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setDepartment(String department) {
            this.department = department;
        }

        public void setPayRate(double payRate) {
            this.payRate = payRate;
        }

        public void setHoursWorked(double hoursWorked) {
            this.hoursWorked = hoursWorked;
        }
    }
}
