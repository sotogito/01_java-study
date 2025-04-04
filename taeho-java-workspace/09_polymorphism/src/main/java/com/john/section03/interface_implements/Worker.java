package com.john.section03.interface_implements;

public class Worker extends Person implements Behavior {
    private String company;
    private String position;

    public Worker() {
    }

    public Worker(String name, int age, String company, String position) {
        super(name, age);
        this.company = company;
        this.position = position;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "company='" + company + '\'' +
                ", position='" + position + '\'' +
                '}';
    }

    @Override
    public void eat(){
        System.out.println("구식");
    }
    
    @Override
    public void die(){
        System.out.println("사망");
    }
    
    @Override
    public void work(){
        System.out.println(Behavior.OPENING_TIME + " 시부터 " + Behavior.CLOSING_TIME + " 까지 근무");
    }
    
}
