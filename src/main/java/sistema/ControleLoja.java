package sistema;

import entidades.Jogo;
import java.util.ArrayList;
import java.util.List;

public class ControleLoja {
    
    private List<Jogo> jogos = new ArrayList<>();
    
    public ControleLoja() {
        this.jogos = carregarJogosDefault();
    }
    
    public List<Jogo> getJogos() {
        return jogos;
    }
    
    public List<Jogo> carregarJogosDefault(){
        List<Jogo> jogos = new ArrayList<>();
        
        jogos.add(new Jogo(
            "League of Legends (LoL)",
            "MOBA",
            "Um jogo MOBA onde duas equipes de cinco jogadores escolhem campeões"
            + " com habilidades únicas e competem para destruir o Nexus inimigo.",
            0.00
        ));
        
        jogos.add(new Jogo(
            "Minecraft",
            "Sandbox / Sobrevivência",
            "Um sandbox em 3D onde os jogadores exploram, coletam recursos, "
            +"constroem estruturas e sobrevivem em um mundo de blocos.",
            99.90
        ));
        
        jogos.add(new Jogo(
            "Grand Theft Auto V (GTA V)",
            "Ação / Mundo Aberto",
            "Acompanhamos três protagonistas em assaltos, conflitos e histórias "
            +"no mundo aberto de Los Santos.",
            79.90
        ));
        
        jogos.add(new Jogo(
            "Free Fire",
            "Battle Royale",
            "Um battle royale mobile onde dezenas de jogadores lutam para serem"
             + " os últimos sobreviventes.",
            0.00
        ));
        
        jogos.add(new Jogo(
            "Fortnite",
            "Battle Royale",
            "Um jogo que combina tiro, construção e ação frenética em partidas"
            + " multiplayer.",
            0.00
         ));
        
        jogos.add(new Jogo(
            "VALORANT",
            "FPS Tático",
            "Tiro tático em primeira pessoa com agentes que possuem habilidades"
            + " especiais.",
            0.00
        ));
        
        jogos.add(new Jogo(
            "Roblox",
            "Plataforma / Criação",
            "Plataforma onde jogadores podem jogar, criar e compartilhar seus"
            + " próprios jogos.",
            0.00
        ));
        
        jogos.add(new Jogo(
            "FIFA 23",
            "Esportes (Futebol)",
            "Simulação de futebol com clubes, seleções, modos carreira e"
            + " partidas online.",
            249.90
        ));
        
        jogos.add(new Jogo(
            "Dota 2",
            "MOBA",
            "Estratégia intensa entre duas equipes de cinco jogadores tentando "
            + "destruir o Ancient inimigo.",
            0.00
        ));
        
        jogos.add(new Jogo(
            "Call of Duty: Modern Warfare",
            "FPS Militar",
            "Um shooter de guerra moderna com campanha cinematográfica e"
            + " multiplayer competitivo.",
            199.90
        ));
        
        jogos.add(new Jogo(
            "Clash Royale",
            "Estratégia / Cartas",
            "Jogo de estratégia em tempo real baseado em cartas para derrotar as"
            + " torres inimigas.",
            0.00
        ));
        
        jogos.add(new Jogo(
            "Stumble Guys",
            "Party Game / Corrida",
            "Corrida com obstáculos em partidas caóticas multiplayer.",
            0.00
        ));
        
        jogos.add(new Jogo(
            "Candy Crush Saga",
            "Puzzle",
            "Jogo de combinar três com centenas de fases e progressão casual.",
            0.00
        ));
        
        jogos.add(new Jogo(
            "Mobile Legends: Bang Bang",
            "MOBA Mobile",
            "Combates rápidos entre equipes com heróis e objetivos táticos.",
            0.00
        ));
        
        jogos.add(new Jogo(
            "Counter-Strike: Global Offensive (CS:GO)",
            "FPS Tático",
            "FPS competitivo entre terroristas e contra-terroristas com foco em"
            + " estratégia.",
            0.00
        ));
        
        jogos.add(new Jogo(
            "Need for Speed: Most Wanted",
            "Corrida / Ação",
            "Corridas ilegais, perseguições policiais intensas e personalização"
            + " de carros.",
            59.90
        ));
        
        jogos.add(new Jogo(
            "The Last of Us Part II",
            "Ação / Aventura / Drama",
            "Uma história emocional em mundo pós-apocalíptico com foco em"
            + " narrativa e sobrevivência.",
            199.90
        ));
        
        jogos.add(new Jogo(
            "The Witcher 3: Wild Hunt",
            "RPG / Mundo Aberto",
            "Geralt explora um vasto mundo, caça monstros e toma decisões que"
            + " afetam toda a história.",
            99.90
        ));
        
        jogos.add(new Jogo(
            "Super Smash Bros. Ultimate",
            "Luta",
            "Personagens icônicos se enfrentam em batalhas rápidas e divertidas.",
            299.90
        ));
        
        jogos.add(new Jogo(
            "Apex Legends",
            "Battle Royale / FPS",
            "Jogo em equipes com personagens únicos e jogabilidade ágil.",
            0.00
        ));

        return jogos;
    }
}
