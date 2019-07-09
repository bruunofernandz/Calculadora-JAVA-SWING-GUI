package Principal;

public class Calcular {
    private float valor1;
    private float valor2;
    
    public float somar()
    {
        return (float)getValor1()+getValor2();
    }
    
    public float subtrair()
    {
        return (float)getValor1()-getValor2();
    }
    
    public float multiplicar()
    {
        return (float)getValor1()*getValor2();
    }
    
    public float dividir()
    {
        return (float)getValor1()/getValor2();
    }
    

    public float getValor1() {
        return valor1;
    }

    public void setValor1(float valor1) {
        this.valor1 = valor1;
    }

    public float getValor2() {
        return valor2;
    }

    public void setValor2(float valor2) {
        this.valor2 = valor2;
    }
    
    
}
