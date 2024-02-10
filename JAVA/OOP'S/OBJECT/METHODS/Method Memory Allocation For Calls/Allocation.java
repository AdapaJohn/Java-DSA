//package METHODS.Method Memory Allocation For Calls;

class Allocation{
    public static void main(String[] args){
        Memory me = new Memory();
        me.setNumber(910);
        me.setName("Sus");
        me.printDetails();
    }
}

class Memory{

    private int number;
    private String name;

    public int getNumber(){
        return number;
    }

    public String getName(){
        return name;
    }

    public void setNumber(int number){
        this.number = number;
    }

    public void setName(String name){
        this.name = name;
    }

    public void printDetails(){
        System.out.println("Memory Number: " + number);
        System.out.println("Memory Holder Name: " + name);
    }
}


//OUTPUT:
//Memory Number: 91009 
//Memory Holder Name: Sus