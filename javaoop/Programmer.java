package javaoop;
class Programmer extends Employee {

    public Programmer(){

    }

    public Programmer(String id, String name, double salary){
        super(id, name, salary);
    }

    public void ShowId(){
        setId("0001");
    }
}
