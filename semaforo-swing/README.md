# Semáforo Interativo em Java Swing

Atividade simples feita com Java Swing. O botão **Avançar** troca o semáforo na ordem:

`VERMELHO -> AMARELO -> VERDE -> VERMELHO`

## Como executar

É necessário ter o Java instalado. No terminal, entre na pasta `src` e execute:

```bash
javac *.java
java TelaSemaforo
```

## Arquivos

- `LogicaSemaforo.java`: guarda os estados e faz a troca entre eles.
- `PainelSemaforo.java`: desenha os círculos do semáforo.
- `TelaSemaforo.java`: cria a janela, o botão e o texto do estado atual.
