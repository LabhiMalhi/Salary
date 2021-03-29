package com.Malhi;

public class Run {
    public static void main(String[] args) {
        Employee emp = new Employee(12,"Lovepreet",77,"Malhi");
        Employee man1 = new Manager(15,"Raman",79,"Rajan",500);
        Employee cx = new CXO(19,"Rubi",66,"Mithoon", 450,100);
        emp.display();
        System.out.println("--------------------------");
        man1.display();
        System.out.println("--------------------------");
        cx.display();



    }
}
