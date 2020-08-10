package testeTOTVS.steps;

import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import org.openqa.selenium.By;
import testeTOTVS.page.TestePage;

import java.awt.*;

import static testeTOTVS.core.BasePage.pause;
import static testeTOTVS.core.DriverFactory.getNavegador;

public class TesteStep extends TestePage {

    @Quando("usuario acessa o site Automation Practice")
    public void usuario_acessa_o_site_automation_practice() {
        acessarTela();
    }

    @Quando("preenche o campo pesquisar (.*)")
    public void preenche_o_campo_pesquisar(String camisa) {
        setPesquisar(camisa);
    }

    @Quando("clica no botão Pesquisar")
    public void clica_no_botão_Buscar() {
        btPesquisar();
    }

    @Quando("verificar se a pesquisa retornou o esperado")
    public void verificar_se_a_pesquisa_retornou_o_esperado() {
        validarValorBuscaShirt();
    }

    @Quando("verificar se a pesquisa retornou campo esperado")
    public void verificar_se_a_pesquisa_retornou_campo_esperado() {
        validarValorBuscaBlouse();
    }


    @Quando("Acessar página com dados do item")
    public void Acessar_pagina_com_dados_do_item() {
        dadosItem();
    }

    @Quando("Alterar a cor do item")
    public void Alterar_a_cor_do_item() {
        alterarCorItem();
    }

    @Quando("Adicionar item no carrinho")
    public void adicionar_item_no_carrinho() {
        addItemCarrinho();
    }

    @Quando("Validar dados do item no carrinho")
    public void Validar_dados_do_item_no_carrinho() {
        validarItemCarrinho();
    }

    @Quando("Validar dados dos itens no carrinho2")
    public void Validar_dados_dos_itens_no_carrinho2() {
        validarItens02Carrinho();
    }

    @Quando("usuario volta a tela inicial")
    public void usuario_volta_a_tela_inicial() {
        clicarHome();
    }
}



