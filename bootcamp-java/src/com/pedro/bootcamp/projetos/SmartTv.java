package com.pedro.bootcamp.projetos;

public class SmartTv {
  
  public boolean ligada;
  public int canal;
  public int volume ;
  
  
  public SmartTv() {
    this.ligada = false;
    this.canal = 1;
    this.volume = 25;
  }

public void mudarCanal(int canal){
  this.canal = canal;
 }

 public void ligar (){
    this.ligada = true;
  }
  
  void desligar(){
    this.ligada = false;
  }

  public void aumentarVolume(){
    this.volume ++ ;
}
}
