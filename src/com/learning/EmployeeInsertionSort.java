package com.learning;

public class EmployeeInsertionSort {
    private int empNo;
    private String firstName, lastName, email;

    public int getEmpNo() {
        return empNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    private static EmployeeInsertionSort[] empList;

    public EmployeeInsertionSort(int empNo, String fName, String lName, String eMail) {
        this.empNo = empNo;
        this.firstName = fName;
        this.lastName = lName;
        this.email = eMail;
    }

    public static void main(String[] args) {
	    createEmpObjects();
        sortAndPrint();

    }
    // 2, 3, 1, 4, 5
    private static void sortAndPrint() {
        if (null == empList || empList.length == 0) {
            System.out.println("Invalid input array");
        }
        int i = 0, j = 0;
        EmployeeInsertionSort temp = null;
        for (i = 1; i < empList.length; i++) {
            j = i-1;
            temp = empList[i];
            while (j >= 0 && temp.getEmpNo() < empList[j].getEmpNo()) {
                empList[j+1] = empList[j];
                j--;
            }
            empList[j+1] = temp;
        }


        //print Array
        for (i = 0; i<empList.length; i++) {
            System.out.println(empList[i].getEmpNo());
        }
    }

    private static void createEmpObjects() {
        EmployeeInsertionSort emp1 = new EmployeeInsertionSort(234567, "John", "Snow", "ed@gmail.com");
        EmployeeInsertionSort emp2 = new EmployeeInsertionSort(456789, "Bohn", "Snow", "ed@gmail.com");
        EmployeeInsertionSort emp3 = new EmployeeInsertionSort(567890, "Aohn", "Snow", "ed@gmail.com");
        EmployeeInsertionSort emp4 = new EmployeeInsertionSort(123456, "Dohn", "Snow", "ed@gmail.com");
        EmployeeInsertionSort emp5 = new EmployeeInsertionSort(345678, "Mohn", "Snow", "ed@gmail.com");
        empList = new EmployeeInsertionSort[5];
        empList[0] = emp1;
        empList[1] = emp2;
        empList[2] = emp3;
        empList[3] = emp4;
        empList[4] = emp5;
    }
}
