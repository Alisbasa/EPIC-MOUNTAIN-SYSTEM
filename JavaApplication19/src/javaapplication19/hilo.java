/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication19;

/**
 *
 * @author Alex
 */
class hilo extends Thread {
  public void run () {
    try {
	Carga pantallaC = new Carga();
        
        pantallaC.setVisible(true);
	    sleep(3000);
	pantallaC.setVisible(false);   
    } catch (InterruptedException e) {}
  }
}