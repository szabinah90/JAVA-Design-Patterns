package org.flow.designpatterns.composit;

public interface Employee {
    public void getPaid(Boss boss);
    public void goOnVacation(CompanyMember superior);
}
