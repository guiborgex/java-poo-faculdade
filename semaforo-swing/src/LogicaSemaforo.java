public class LogicaSemaforo {
    private final String[] estados = {"VERMELHO", "AMARELO", "VERDE"};
    private int indiceAtual = 0;

    public String estadoAtual() {
        return estados[indiceAtual];
    }

    public void avancar() {
        indiceAtual = (indiceAtual + 1) % estados.length;
    }

    public static void main(String[] args) {
        LogicaSemaforo semaforo = new LogicaSemaforo();

        System.out.println(semaforo.estadoAtual());
        semaforo.avancar();
        System.out.println(semaforo.estadoAtual());
        semaforo.avancar();
        System.out.println(semaforo.estadoAtual());
        semaforo.avancar();
        System.out.println(semaforo.estadoAtual());
    }
}
