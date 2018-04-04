package pages;

import org.junit.rules.TestName;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import suporte.Generator;
import suporte.Screenshot;

public class PaginaInicial {

    //cria variavel de acesso ao navegador
    private WebDriver navegador;

    //variavel de teste usada para os screenshots
    public TestName test = new TestName();

    //classe construtora do tipo navegador
    public PaginaInicial(WebDriver navegador) {
        this.navegador = navegador;
    }

    public ListaProdutosPage clickLupa(){
        //digitar no campo com o valueid "search_input" o valor "Batman"
        navegador.findElement(By.id("search_input")).sendKeys("Batman");

        //cria variável para o armazendo do screenshot utiliza data e hora no nome do arquivo
        String screenshotArquivo = "C:\\Users\\salda\\test-report\\demoloja\\" + Generator.dataHoraParaArquivo() + test.getMethodName() +  ".png";
        Screenshot.Tirar(navegador, screenshotArquivo);

        //clica no botão da lupa para a busca do produto
        navegador.findElement(By.className("ty-search-magnifier")).click();
        String screenshotArquivo2 = "C:\\Users\\salda\\test-report\\demoloja\\" + Generator.dataHoraParaArquivo() + test.getMethodName() +  ".png";
        Screenshot.Tirar(navegador, screenshotArquivo2);

        //retorna uma nova página que é a lista de produtos buscados pela palavra "batman"
        return new ListaProdutosPage(navegador);
    }

}
