package Cuenta;


class Cuenta{
    double saldo;
    private int agencia;
    private int numero;
    private Clienta titular = new Clienta();

    
    public static int total=0;

    public Cuenta( int agencia){
        if (agencia<=0){
            System.out.println("No se permite 0");
            this.agencia=1;

        } else{
            this.agencia=agencia;
        }
        total++;

        System.out.println("Se van creando: "+ total + "cuentas ");
    }
    
    public void depositar (double valor){
        this.saldo=this.saldo+valor;

    }

    public boolean retirar(double valor){
        if(this.saldo >= valor){
            this.saldo-=this.saldo-valor;
            return true;
        } 
        return false;
        }
    

    public boolean transferir (double valor,Cuenta Cuenta){
        if (this.saldo>=valor){
            this.saldo=this.saldo-valor;
            Cuenta.depositar(valor);
            return true;

        }else{
            return false;

        }

    }
    public double getSaldo(){
        return this.saldo;


    }

    public void setAgencia(int agencia) {
        if (agencia>0){
            this.agencia=agencia;


        } else{
            System.out.println("No esta Permitido Negativos");
        }
    }

    public int getAgencia() {
        return agencia;
    }
    
    public void setTitular(Clienta titular) {
        this.titular = titular;
    }

    public Clienta getTitular(){
        return titular;

    }

    public static int getTotal(){
        return Cuenta.total;

    }
}


// Recuerda que con CTRL puede ir a la raiz de la declaracion de variable
