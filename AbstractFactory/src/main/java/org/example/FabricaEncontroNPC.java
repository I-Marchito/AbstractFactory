package org.example;

public class FabricaEncontroNPC implements FabricaAbstrata{
    @Override
    public Inimigo geraInimigo() {
        return new InimigoNPC();
    }

    @Override
    public Loot geraLoot() {
        return new LootNPC();
    }
}
