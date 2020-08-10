package testeTOTVS.page;

import org.junit.Assert;
import org.openqa.selenium.By;
import testeTOTVS.core.BasePage;

import java.awt.*;

import static testeTOTVS.core.BasePage.*;
import static testeTOTVS.core.DriverFactory.getNavegador;

public class TestePage extends BasePage {


    public static void acessarTela() {
        abrirLink("http://automationpractice.com/");
    }

    private void escreverCampos(String id_campo, String texto) {
        escrever(By.xpath("//input[contains(@id,'".concat(id_campo).concat("') and @type='text']")), texto);
    }


    /* CAMPOS PRINCIPAIS - TEXT FIELD E TEXT AREA */
    public void setPesquisar(String texto) {
        escreverCampos("search_query_top", texto);
    }

    /*##### CLIQUE #####*/
    public void btPesquisar() {
        clicar(By.xpath("//form[@id='searchbox']//button[@name='submit_search']"), 5);
    }
    public void dadosItem() {
        mouseOver(By.xpath("//div[@id='center_column']/ul/li/div/div[2]/div[3]/ul"), 10);
        clicar(By.xpath("//span[contains(.,'More')]"), 5);
    }

    public void alterarCorItem() {
        clicar(By.id("color_14"), 5);
    }

    public void addItemCarrinho() {
        clicar(By.xpath("//button[@type='submit'][@class='exclusive']"), 10);
        clicar(By.cssSelector(".button-medium > span"), 10);
    }

    public void checkout() {
        aguardarElementoVisivel(By.cssSelector(".button-medium > span"), 20);
        clicar(By.cssSelector(".button-medium > span"), 15);
    }

    public void clicarBuscar() {
        aguardarElementoClicavel(By.xpath("//*//div//header/a[.='Buscar']"), 10);
        clicar(By.xpath("//*//div//header/a[.='Buscar']"), 10);
    }

    public void clicarHome() {
        aguardarElementoClicavel(By.xpath("//div[@id='columns']/div/a/i"), 10);
        clicar(By.xpath("//div[@id='columns']/div/a/i"), 10);
    }



    /*##### VERIFICAÇÕES #####*/
    public void validarItemCarrinho() {
        String validacaoNome = obterTexto(By.cssSelector(".cart_description > .product-name"));
        String validacaoQuantidade = obterValor();
        String validacaoPreco = obterTexto(By.cssSelector("#product_price_1_2_0 > .price"));
        Assert.assertEquals("Faded Short Sleeve T-shirts", validacaoNome);
        Assert.assertEquals("1", validacaoQuantidade);
        Assert.assertEquals("$16.51", validacaoPreco);
    }

    public void validarItens01Carrinho() {
        String validacaoNome = obterTexto(By.xpath("//td/p[@class=\"product-name\"]//a[contains(text(),'Faded')]"));
        String validacaoQuantidade = obterValor();
        String validacaoPreco = obterTexto(By.cssSelector("#product_price_1_2_0 > .price"));
        Assert.assertEquals("Faded Short Sleeve T-shirts", validacaoNome);
        Assert.assertEquals("1", validacaoQuantidade);
        Assert.assertEquals("$16.51", validacaoPreco);
    }

    public void validarItens02Carrinho() {
        String validacaoNome = obterTexto(By.xpath("//td/p[@class=\"product-name\"]//a[contains(text(),'Blouse')]"));
        System.out.println(validacaoNome);
        String validacaoQuantidade = obterValor();
        String validacaoPreco = obterTexto(By.cssSelector("#product_price_2_7_0 > .price"));
        Assert.assertEquals("Blouse", validacaoNome);
        Assert.assertEquals("1", validacaoQuantidade);
        Assert.assertEquals("$27.00", validacaoPreco);
    }

    public void validarValorBuscaShirt() {
        aguardarElementoVisivel(By.xpath("//span[@class='lighter']"), 10);
        String validacao = obterTexto(By.xpath("//span[@class='lighter']"));
        Assert.assertEquals("\"T-SHIRT\"", validacao);
    }

    public void validarValorBuscaBlouse() {
        aguardarElementoVisivel(By.xpath("//span[@class='lighter']"), 10);
        String validacao = obterTexto(By.xpath("//span[@class='lighter']"));
        Assert.assertEquals("\"BLOUSE\"", validacao);
    }
}