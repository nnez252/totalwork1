public class Employee {
    String fio;
    int unite;
    float salary;
    static int counter;
    int id;

    public Employee(String fio, int unite, int salary) {
        this.fio = fio;
        this.unite = unite;
        this.salary = salary;
        this.id = counter++;


    }

    public String getFio() {
        return fio;
    }

    public int getUnite() {
        return unite;
    }

    public float getSalary() {
        return salary;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public void setUnite(int unite) {
        this.unite = unite;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Имя " + fio + " Отдел " + unite + " Зарплата " + salary + " Id " + id;
    }

    static void Sum(Employee[] employees, int num) {
        int SumSalary = 0;
        for (Employee employee : employees) {
            if (employee.getSalary() == num) {
                if (SumSalary == SumSalary + employee.getSalary()) {
                    System.out.println("Сумма зарплат за  месяц" + num + SumSalary);
                }
            }


        }
    }

    public static int getMin(Employee[] employees) {
        int minValue = (int) employees[0].getSalary();
        for (int i = 1; i < employees.length; i++) {
            if (employees[i].getSalary() < minValue) {
                minValue = (int) employees[i].getSalary();
            }
        }
        return minValue;
    }

    public static int getMax(Employee[] employees) {
        int maxValue = (int) employees[0].getSalary();
        for (int i = 1; i < employees.length; i++) {
            if (employees[i].getSalary() > maxValue) {
                maxValue = (int) employees[i].getSalary();
            }
        }
        return maxValue;
    }

    static void Middel(Employee[] employees, int num) {
        int SumSalary = 0;
        for (Employee employee : employees) {
            if (employee.getSalary() == num) {
                if (SumSalary == ((SumSalary + employee.getSalary())/employees.length)) {
                    System.out.println("Сумма зарплат за месяц" + num + SumSalary);
                }
            }


        }
    }
    static void Personal(Employee[] employees) {
        for (int i = 1; i < employees.length; i++) {
            System.out.println(employees[i].getFio());
        }
    }
}


