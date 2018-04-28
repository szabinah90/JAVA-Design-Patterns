package org.flow.designpatterns.composit;

public class Worker extends CompanyMember implements Employee {

    public Worker(String name, int salary, int money) {
        super(name, salary, money);
    }

    @Override
    public void getPaid(Boss boss) {
        setMoney(getMoney() + getSalary());
    }

    @Override
    public void goOnVacation(CompanyMember superior) {
        if (superior instanceof Manager) {
            System.out.println("You aint go anywhere.");
        } else if (superior instanceof Boss) {
            setOnVacation(true);
        }
    }
}
