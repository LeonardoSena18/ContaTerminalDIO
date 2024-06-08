/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contaterminal;

/**
 *
 * @author DEV
 */
import java.util.Scanner;
public class ContaTerminal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;
        
        
        System.out.print("Diogite o número da conta bancária: ");
        numero = sc.nextInt();
        
        System.out.print("Numero da agência: ");
        agencia = sc.next();
        
        System.out.print("Nome completo: ");
        nomeCliente = sc.next();
        
        System.out.print("Saldo: ");
        saldo = sc.nextDouble();
        
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, "
                + "sua agência é %s, conta %d e seu saldo %.2f já está disponível "
                + "para saque.", nomeCliente, agencia, numero, saldo);

    }
    
}
