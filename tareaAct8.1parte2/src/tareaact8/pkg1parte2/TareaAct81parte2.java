/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareaact8.pkg1parte2;

import entidad.CuentaBancaria;
import servicios.CuentaBancariaServicio;

/**
 *
 * @author HP
 */
public class TareaAct81parte2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CuentaBancariaServicio ct = new CuentaBancariaServicio();
        CuentaBancaria cl = ct.crearCuenta();
        ct.ingresar(cl);
        ct.retirar(cl);
        ct.extRapida(cl);
        
        
        System.out.println(cl.toString());
    }
    
    
}
