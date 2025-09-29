package br.edu.insper.desagil.pi.tocha;

public class Filtro {
    private String tipo;
    private Imagem imagem;


    public Filtro(String tipo, Imagem imagem) {
        this.tipo = tipo;
        this.imagem = imagem;
    }

    public void inicializaSaida(){
        int[][] entrada = imagem.getPixels();

        int altura = entrada.length;
        if (altura < 3) {
            throw new IllegalStateException("altura pequena");
        }

        int largura = entrada[0].length;
        if (largura < 3) {
            throw new IllegalStateException("largura pequena");
        }

    }

    public Imagem processa(Imagem imagem) {
        this.imagem = imagem;
        return processa(null, 0, 0, null);
    }

    public Imagem processa(int[][] saida, int largura, int altura, double[][] entrada) {

        if (tipo.equals("media")) {
            // inicializa saída
            inicializaSaida();
            // inicializa kernel

            double[][] kernel = new double[3][3];
            kernel[0][0] = 0.111111;
            kernel[0][1] = 0.111111;
            kernel[0][2] = 0.111111;
            kernel[1][0] = 0.111111;
            kernel[1][1] = 0.111111;
            kernel[1][2] = 0.111111;
            kernel[2][0] = 0.111111;
            kernel[2][1] = 0.111111;
            kernel[2][2] = 0.111111;

            // calcula saída

            for (int y = 1; y < altura - 1; y++) {
                for (int x = 1; x < largura - 1; x++) {
                    double s = 0;
                    for (int dy = -1; dy < 2; dy++) {
                        for (int dx = -1; dx < 2; dx++) {
                            s += entrada[y + dy][x + dx] * kernel[dy + 1][dx + 1];
                        }
                    }
                    saida[y - 1][x - 1] = (int) s;
                }
            }

            return new Imagem(saida);
        } else if (tipo.equals("sobel_x")) {
            // inicializa saída

            inicializaSaida();

            // inicializa kernel

            double[][] kernel = new double[3][3];
            kernel[0][0] = -1;
            kernel[0][1] = 0;
            kernel[0][2] = 1;
            kernel[1][0] = -2;
            kernel[1][1] = 0;
            kernel[1][2] = 2;
            kernel[2][0] = -1;
            kernel[2][1] = 0;
            kernel[2][2] = 1;

            // calcula saída

            for (int y = 1; y < altura - 1; y++) {
                for (int x = 1; x < largura - 1; x++) {
                    double s = 0;
                    for (int dy = -1; dy < 2; dy++) {
                        for (int dx = -1; dx < 2; dx++) {
                            s += entrada[y + dy][x + dx] * kernel[dy + 1][dx + 1];
                        }
                    }
                    saida[y - 1][x - 1] = (int) s;
                }
            }

            return new Imagem(saida);
        } else if (tipo.equals("sobel_y")) {
            // inicializa saída

            inicializaSaida();

            // inicializa kernel

            double[][] kernel = new double[3][3];
            kernel[0][0] = -1;
            kernel[0][1] = -2;
            kernel[0][2] = -1;
            kernel[1][0] = 0;
            kernel[1][1] = 0;
            kernel[1][2] = 0;
            kernel[2][0] = 1;
            kernel[2][1] = 2;
            kernel[2][2] = 1;

            // calcula saída

            for (int y = 1; y < altura - 1; y++) {
                for (int x = 1; x < largura - 1; x++) {
                    double s = 0;
                    for (int dy = -1; dy < 2; dy++) {
                        for (int dx = -1; dx < 2; dx++) {
                            s += entrada[y + dy][x + dx] * kernel[dy + 1][dx + 1];
                        }
                    }
                    saida[y - 1][x - 1] = (int) s;
                }
            }

            return new Imagem(saida);
        } else if (tipo.equals("laplace")) {
            // inicializa saída
            inicializaSaida();

            // inicializa kernel

            double[][] kernel = new double[3][3];
            kernel[0][0] = 0;
            kernel[0][1] = -1;
            kernel[0][2] = 0;
            kernel[1][0] = -1;
            kernel[1][1] = 4;
            kernel[1][2] = -1;
            kernel[2][0] = 0;
            kernel[2][1] = -1;
            kernel[2][2] = 0;

            // calcula saída

            for (int y = 1; y < altura - 1; y++) {
                for (int x = 1; x < largura - 1; x++) {
                    double s = 0;
                    for (int dy = -1; dy < 2; dy++) {
                        for (int dx = -1; dx < 2; dx++) {
                            s += entrada[y + dy][x + dx] * kernel[dy + 1][dx + 1];
                        }
                    }
                    saida[y - 1][x - 1] = (int) s;
                }
            }

            return new Imagem(saida);
        } else {
            throw new IllegalStateException("tipo inválido");
        }
    }
}
