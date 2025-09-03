package lab5.task3;

public class Operation implements Minus, Plus, Mult, Div{

    private float number;

    public Operation(float value) {
        this.number = value;
    }

    public float getNumber() {
        return number;
    }

    public void setNumber(float number) {
        this.number = number;
    }

    @Override
    public void minus(float value){
        this.number = this.number - value;
    }

    @Override
    public void plus(float value){
        this.number = this.number + value;
    }

    @Override
    public void div(float value){
        if(value == 0)
            System.out.println("Division by 0 is not possible");
        else this.number = this.number / value;
    }

    @Override
    public void mult(float value){
        this.number = this.number * value;
    }

}
