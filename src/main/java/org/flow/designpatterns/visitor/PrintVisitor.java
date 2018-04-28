package org.flow.designpatterns.visitor;

public class PrintVisitor extends BaseVisitor {

    @Override
    public void visit(CompanyMember companyMember) {
        super.visit(companyMember);
        System.out.println(companyMember.getName());
    }
}
