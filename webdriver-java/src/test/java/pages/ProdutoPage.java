package pages;

import org.junit.rules.TestName;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import suporte.Generator;
import suporte.Screenshot;

import static org.junit.Assert.assertEquals;

public class ProdutoPage {

    //variavel do tipo webdriver
    private WebDriver navegador;

    //criacao de variavel tipo teste para os screenshots
    public TestName test = new TestName();

    //construtor da clase
    public ProdutoPage(WebDriver navegador) {
        this.navegador = navegador;
    }

    //método que adiciona ao carrinho um produto
    public ProdutoPage adicionaraoCarrinho(){
        //comando que adiciona ao carrinho o produto
        navegador.findElement(By.id("button_cart_94")).click();

        //criação da variavel para nomear o arquivo
        String screenshotArquivo4 = "C:\\Users\\salda\\test-report\\demoloja\\" + Generator.dataHoraParaArquivo() + test.getMethodName() +  ".png";

        //comando que tira o screenshot da tela com o nome do arquivo
        Screenshot.Tirar(navegador, screenshotArquivo4);

        //criacao da variavel aguardar do tipo webdriver wait
        WebDriverWait aguardar = new WebDriverWait(navegador, 10);

        //variavel que espera até que a janela de adicionar o carrinho desapareça
        aguardar.until(ExpectedConditions.invisibilityOfElementLocated(By.className("ui-widget-overlay")));

        //digitar no campo com o valueid "search_input" o valor "PS3"
        navegador.findElement(By.id("search_input")).sendKeys("PS3");

        //criacao de variavel que nomeia o screenshot
        String screenshotArquivo5 = "C:\\Users\\salda\\test-report\\demoloja\\" + Generator.dataHoraParaArquivo() + test.getMethodName() +  ".png";

        //comando que tira o screenshot com a variavel nomeada
        Screenshot.Tirar(navegador, screenshotArquivo5);

        //comando que clica no icone da lupa para realizar a busca pelo produto
        navegador.findElement(By.className("ty-search-magnifier")).click();

        //nomeação da variavel para o arquivo de screenshot
        String screenshotArquivo6 = "C:\\Users\\salda\\test-report\\demoloja\\" + Generator.dataHoraParaArquivo() + test.getMethodName() +  ".png";

        //comando que tira um screenshot da tela
        Screenshot.Tirar(navegador, screenshotArquivo6);

        //comando que clica em um produto apresentado
        navegador.findElement(By.className("ty-grid-list__image")).click();

        //criação da variavel com o nome para o arquivo de screenshot
        String screenshotArquivo7 = "C:\\Users\\salda\\test-report\\demoloja\\" + Generator.dataHoraParaArquivo() + test.getMethodName() +  ".png";

        //comando que tira o screenshot da tela
        Screenshot.Tirar(navegador, screenshotArquivo7);

        //comando que adiciona o produto ao carrinho de compras
        navegador.findElement(By.id("button_cart_90")).click();

        //criação da variavel para nomeaçao do arquivo
        String screenshotArquivo8 = "C:\\Users\\salda\\test-report\\demoloja\\" + Generator.dataHoraParaArquivo() + test.getMethodName() +  ".png";

        //comando que tira um screenshot da tela
        Screenshot.Tirar(navegador, screenshotArquivo8);

        //comando que aguarda até que janela de adicionar ao carrinho suma
        aguardar.until(ExpectedConditions.invisibilityOfElementLocated(By.className("ui-widget-overlay")));

        //comando que realiza um click no elemento do carrinho para conferir se os produtos foram adicionados
        navegador.findElement(By.id("sw_dropdown_8")).click();

        //criaçao de variavel para nomear arquivo que ira ser salvo com o screenshot do carrinho de compras
        String screenshotArquivo9 = "C:\\Users\\salda\\test-report\\demoloja\\" + Generator.dataHoraParaArquivo() + test.getMethodName() +  ".png";

        //comando que tira o screenshot da tela do carrinho
        Screenshot.Tirar(navegador, screenshotArquivo9);

        // validacoes sobre os produtos adicionados ao carrinho
        assertEquals("F.E.A.R. 3 (PS3) MX", navegador.findElement(By.xpath("//*[@id=\"dropdown_8\"]/div/div[1]/ul/li[1]/div[2]/a")).getText());
        assertEquals("Batman: Arkham City (X360)", navegador.findElement(By.xpath("//*[@id=\"dropdown_8\"]/div/div[1]/ul/li[2]/div[2]/a")).getText());

        //comando que teste para a falha do teste de produtos no carrinho
        //assertEquals("Batman:", navegador.findElement(By.xpath("//*[@id=\"dropdown_8\"]/div/div[1]/ul/li[1]/div[2]/a")).getText());

        return this;
    }
}
