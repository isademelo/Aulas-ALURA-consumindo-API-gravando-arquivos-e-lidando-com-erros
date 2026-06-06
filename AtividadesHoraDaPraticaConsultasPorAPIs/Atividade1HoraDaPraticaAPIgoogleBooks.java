package AtividadesHoraDaPraticaConsultasPorAPIs;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

// Atividade 1
// Crie um programa em Java que utilize as classes HttpClient, HttpRequest e HttpResponse para fazer uma consulta à API do Google Books.
// Solicite ao usuário que insira o título de um livro, e exiba as informações disponíveis sobre o livro retornado pela API.

public class Atividade1HoraDaPraticaAPIgoogleBooks {
    public static void main (String[] args) throws Exception{
        System.out.println("Bem Vindo ao buscador de livros\n\nDigite o nome do livro que você quer buscar: ");
        Scanner entrada = new Scanner (System.in);
        String tituloBuscado = entrada.nextLine();
        devolverDadosDoLivro(tituloBuscado);
    }

    public static void devolverDadosDoLivro (String nomeDoLivro) throws IOException, InterruptedException {
        // na variavel API_KEY é colocado a chave do google
        String API_KEY= "conteudo da chave aqui";

        // cria o cliente, codifica o nome do livro e cria a url da busca
        HttpClient cliente = HttpClient.newHttpClient();
        String livroComNomeCodificado = URLEncoder.encode(nomeDoLivro, StandardCharsets.UTF_8);
        String busca = "https://www.googleapis.com/books/v1/volumes?q=" + livroComNomeCodificado + "&key=" + API_KEY;

        // realiza a requisição e da a resposta
        HttpRequest requisicao = HttpRequest.newBuilder().uri(URI.create(busca)).GET().build();
        HttpResponse <String> resposta = cliente.send(requisicao, HttpResponse.BodyHandlers.ofString());

        System.out.println(resposta.body());
    }
}
