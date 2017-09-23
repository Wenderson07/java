/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprender;

class Conta {
    int numero;      //ATRIBUTOS    
    Pessoa titular;
    double saldo; 
    int agencia;
    
    void deposita(double valorASerDepositado){
        this.saldo += valorASerDepositado;
    }
    void saca(double valorASerSacado){
        if(this.saldo >= valorASerSacado){
            this.saldo -= valorASerSacado;
        }
        else{
            System.out.println("Saldo insuficiente");
        }
    }
    void transfere(double valor,Conta destino){  //MÉTODOS(COMPORTAMENTOS)
        this.saldo -= valor;
        destino.saldo += valor;
    }
}
class Pessoa{
    
    String nome;    //ATRIBUTOS 
    String cpf;
    String dataDeNascimento;
}
public class Aprender {

    /**
     *
     * @param args
     */
    public static void main(String[] args){
        Conta mauricio = new Conta();
        mauricio.numero = 123;
        mauricio.saldo = 800.0;
        mauricio.titular = new Pessoa();
        mauricio.titular.nome = "Mauricio Andrade";
        mauricio.titular.cpf = "1234567";
        mauricio.titular.dataDeNascimento = "10/10/1975";
        mauricio.agencia = 842;
        
        mauricio.deposita(100.0);
        mauricio.saca(5000.0);
        
        
        Conta guilherme = new Conta();
        guilherme.numero = 456;
        guilherme.deposita(100.0);
        
        mauricio.saca(100.0);
        guilherme.deposita(100.0);
        
        mauricio.transfere(100.0,guilherme);
        
   System.out.println(mauricio.saldo);
   System.out.println(guilherme.saldo);
    }

    
}
