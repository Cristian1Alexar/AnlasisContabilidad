/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.analisis2.programa.controlador;

import static com.analisis2.clases.tipos.TiposCuenta.ACTIVO;
import static com.analisis2.clases.tipos.TiposCuenta.PASIVO;
import java.util.ArrayList;

/**
 *
 * @author crist
 */
public class ClasificadorCuenta {
    private float valorActivo; 
    private float valorPasivo; 
    private ArrayList<Cuentas> cuentasActivo;
    private ArrayList<Cuentas> cuentasPasivo;

    public ClasificadorCuenta() {
        cuentasActivo = new ArrayList<Cuentas>();
        cuentasPasivo = new ArrayList<Cuentas>(); 
    }

    public float getValorActivo() {
        for (int i = 0; i < cuentasActivo.size(); i++) {
            valorActivo = valorActivo + cuentasActivo.get(i).getValor(); 
        }
        return valorActivo;
    }
    public float getValorPasivo() {
        for (int i = 0; i < cuentasPasivo.size(); i++) {
            valorPasivo = valorPasivo + cuentasPasivo.get(i).getValor(); 
        }
        return valorPasivo;
    }

    public ArrayList<Cuentas> getCuentasActivo() {
        return cuentasActivo;
    }

    public ArrayList<Cuentas> getCuentasPasivo() {
        return cuentasPasivo;
    }
    

    public void clasificarCuenta(Cuentas cuenta) {
        if (cuenta.getTipo() == ACTIVO)
        {
            cuentasActivo.add(cuenta);
        }
        if (cuenta.getTipo() == PASIVO)
        {
            cuentasPasivo.add(cuenta);
        }
    }
    
    
}
