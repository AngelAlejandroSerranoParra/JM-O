package Cuenta;


class Cuenta{
    double saldo;
    int agencia;
    int numero;
    Clienta titular;
    
    
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
    
}


// Recuerda que con CTRL puede ir a la raiz de la declaracion de variable
