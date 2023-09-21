package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Cenario {

    private Inimigo inimigo;
    private Loot loot;

    public Cenario (FabricaAbstrata fabrica){
        this.inimigo = fabrica.geraInimigo();
        this.loot = fabrica.geraLoot();
    }

    public String gerarEncontroComInimigo(){
        return this.inimigo.batalha();
    }

    public String adquirirLoot(){
        return this.loot.pegarLoot();
    }
}