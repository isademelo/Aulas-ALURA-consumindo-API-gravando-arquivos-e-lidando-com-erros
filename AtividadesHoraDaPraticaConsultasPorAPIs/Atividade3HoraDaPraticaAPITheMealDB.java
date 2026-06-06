package AtividadesHoraDaPraticaConsultasPorAPIs;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;


//Atividade 3
// Crie um programa Java que faça uma consulta à API do TheMealDB utilizando as classes HttpClient, HttpRequest e HttpResponse.
// Solicite ao usuário que insira o nome de uma receita e exiba as informações disponíveis sobre essa receita.

public class Atividade3HoraDaPraticaAPITheMealDB {
    public static void main (String[] args) throws Exception{
        System.out.println("Bem Vindo ao buscador de receitas\n\nDigite o nome da receita que você quer buscar: ");
        Scanner entrada = new Scanner (System.in);
        String receitaBuscada = entrada.nextLine();
        devolverDadosDaReceita(receitaBuscada);
    }

    public static void devolverDadosDaReceita(String nomeDoReceita) throws IOException, InterruptedException {

        HttpClient cliente = HttpClient.newHttpClient();
        String receitaComEncoder = URLEncoder.encode(nomeDoReceita, StandardCharsets.UTF_8);

        String busca = "https://www.themealdb.com/api/json/v1/1/search.php?s=" + receitaComEncoder;

        HttpRequest requisicao = HttpRequest.newBuilder().uri(URI.create(busca)).GET().build();
        HttpResponse<String> resposta = cliente.send(requisicao, HttpResponse.BodyHandlers.ofString());

        System.out.println(resposta.body());
    }
}
