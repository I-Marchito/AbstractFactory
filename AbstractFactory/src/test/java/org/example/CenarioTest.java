package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CenarioTest {

    @Test
    void deveRetornarZeDaManga() {
        FabricaAbstrata fabrica = new FabricaEncontroNPC();
        Cenario rota10 = new Cenario(fabrica);
        assertEquals("Treinador Zé da Manga te desafiou para uma batalha", rota10.gerarEncontroComInimigo());
    }

    @Test
    void deveRetornarFeijaoComBroto() {
        FabricaAbstrata fabrica = new FabricaEncontroSelvagem();
        Cenario rota10 = new Cenario(fabrica);
        assertEquals("Le wild Feijão com Broto appears", rota10.gerarEncontroComInimigo());
    }

    @Test
    void deveRetornarDinheiroBicicleta() {
        FabricaAbstrata fabrica = new FabricaEncontroNPC();
        Cenario rota10 = new Cenario(fabrica);
        assertEquals("Treinador Zé da Manga te entregou 210 mangos e uma bicicleta", rota10.adquirirLoot());
    }

    @Test
    void deveRetornarCasacoDeMetal() {
        FabricaAbstrata fabrica = new FabricaEncontroSelvagem();
        Cenario rota10 = new Cenario(fabrica);
        assertEquals("Feijão com broto deixou cair um casaco de metal", rota10.adquirirLoot());
    }
}