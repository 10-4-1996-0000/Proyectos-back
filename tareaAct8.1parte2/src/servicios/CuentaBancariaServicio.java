/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;


import entidad.CuentaBancaria;
import java.util.Scanner;


public class CuentaBancariaServicio {
 private Scanner leer = new Scanner(System.in);
  public CuentaBancaria crearCuenta(){
      CuentaBancaria cuenta = new CuentaBancaria();
      System.out.println("Ingrese numero de cuenta");
      cuenta.numeroCuenta = leer.nextInt();
      System.out.println("Ingrese dni del cliente");
      cuenta.dniCliente = leer.nextLong();
      System.out.println("Ingrese saldo actual del cliente");
      cuenta.saldoActual = leer.nextDouble();
      
      return cuenta;
    }
  public void ingresar(CuentaBancaria cuenta){
      System.out.println("Digite cantidad de dinero a ingresar");
      double ingresar = leer.nextDouble();
      cuenta.setSaldoActual(ingresar + cuenta.getSaldoActual());
      System.out.println("Su saldo actual es: " + cuenta.getSaldoActual());
  }
  public void retirar(CuentaBancaria cuenta){
      System.out.println("Digite cantidad de dinero a retirar");
      double retirar = leer.nextDouble();
      cuenta.setSaldoActual(retirar - cuenta.getSaldoActual());
      System.out.println("Su saldo actual es: " + cuenta.getSaldoActual());
  }
  public void extRapida(CuentaBancaria cuenta){
      System.out.println("digite la siguiente extraccion rapida");
      double extRapida = leer.nextDouble();
      if (extRapida<(cuenta.getSaldoActual()*0.2)) {
          cuenta.setSaldoActual(extRapida - cuenta.getSaldoActual());
          System.out.println("Su sueldo actual es: " + cuenta.getSaldoActual());
      }else{
          System.out.println("Dinero insuficienta para la transaccion");
      }
  }
  public void consultarSaldo(CuentaBancaria cuenta){
      System.out.println("Desea consulta su sueldo?(n o y)");
      String pregunta = leer.next();
      if (pregunta == "y") {
          System.out.println("Su saldo actual es: " + cuenta.getSaldoActual());      
      }else{
          
      }
  }
}
