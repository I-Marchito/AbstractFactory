package org.example;

public class FabricaEncontroSelvagem implements FabricaAbstrata{

    @Override
    public Inimigo geraInimigo() {
        return new InimigoSelvagem();
    }

    @Override
    public Loot geraLoot() {
        return new LootSelvagem();
    }
}
