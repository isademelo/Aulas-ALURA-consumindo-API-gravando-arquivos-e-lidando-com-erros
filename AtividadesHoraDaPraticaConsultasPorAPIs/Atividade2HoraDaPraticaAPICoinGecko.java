package AtividadesHoraDaPraticaConsultasPorAPIs;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

// atividade 2
// Crie um programa Java que utiliza as classes HttpClient, HttpRequest e HttpResponse para fazer uma consulta à
// API CoinGecko e exiba a cotação atual de uma criptomoeda escolhida pelo usuário.

public class Atividade2HoraDaPraticaAPICoinGecko {

    static Scanner entrada = new Scanner(System.in);

    // metodo principal do código

    public static void main (String [] Args) throws IOException, InterruptedException {
        digitarNomeDaMoeda();
    }

    // metodo para dar o input do nome da moeda
    public static void digitarNomeDaMoeda () throws IOException, InterruptedException {
        System.out.println("Digite o nome da moeda desejada e buscaremos as informações mais recentes para você:");
        String nomeDaMoeda = entrada.next();
        consultarMoeda(nomeDaMoeda);
        fazerOutraConsulta();
    }

    // metodo de consulta da moeda
    public static void consultarMoeda (String nomeDaMoeda) throws IOException, InterruptedException {

        HttpClient cliente = HttpClient.newHttpClient();
        String nomeDaMoedaCodificado = URLEncoder.encode(nomeDaMoeda, StandardCharsets.UTF_8);

        String API_KEY = "chave api";
        String querry = "https://api.coingecko.com/api/v3/simple/price?vs_currencies=usd&ids="+ nomeDaMoedaCodificado + "&x_cg_demo_api_key=" + API_KEY;
        HttpRequest requisicao = HttpRequest.newBuilder().uri(URI.create(querry)).GET().build();
        HttpResponse <String> resposta = cliente.send(requisicao, HttpResponse.BodyHandlers.ofString());
        System.out.println(resposta.body());

    }

    //metodo para perguntar se o usuario quer fazer outra consulta
    public static void fazerOutraConsulta() throws IOException, InterruptedException {
        System.out.println("Você deseja fazer outra consulta? (S/N)");
        char confirmar = entrada.next().toUpperCase().charAt(0);
        confirmarRepeticao(confirmar);
    }

    // repetição para quando o usuario confirmar a outra consulta
    public static void confirmarRepeticao(char confirmar) throws IOException, InterruptedException {

        while (confirmar != 'N' && confirmar != 'S'){
            System.out.println("Digite novamente...");
            confirmar = entrada.next().toUpperCase().charAt(0);
        }

        do {
            digitarNomeDaMoeda();
        } while (confirmar == 'S');

    }
}
