/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamesapp;

/**
 *
 * @author Erick Cástulo Cóporo
 */
public interface Entregable {
    public void entregar();
    public void devolver();
    public boolean isEntregado();
    public int compareTo(Object a);
}
