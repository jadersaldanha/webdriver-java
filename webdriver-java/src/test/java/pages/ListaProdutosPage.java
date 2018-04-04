package pages;

import org.junit.rules.TestName;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import suporte.Generator;
import suporte.Screenshot;

public class ListaProdutosPage {

    //variavel privada do tipo navegador
    private WebDriver navegador;

    //variavel do tipo teste para os screenshots
    public TestName test = new TestName();

    //construtor da classe
    public ListaProdutosPage(WebDriver navegador) {
        this.navegador = navegador;
    }

    //metodo para clicar num produto realizado pela busca retorna a página do produto
    public ProdutoPage clicarProduto (){

        //clicar em um dos produtos apresentados
        navegador.findElement(By.className("ty-grid-list__image")).click();

        //tira um screenshot da tela utilizando a data e a hora
        String screenshotArquivo3 = "C:\\Users\\salda\\test-report\\demoloja\\" + Generator.dataHoraParaArquivo() + test.getMethodName() +  ".png";
        Screenshot.Tirar(navegador, screenshotArquivo3);

        //retorna a propria pagina do produto para efetuar uma nova busca
        return new ProdutoPage(navegador);
    }
}
