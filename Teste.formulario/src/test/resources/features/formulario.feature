#Author: your.email@your.domain.com

@Cadastrar
Feature: como usuario quero validar o site
  como usuario quero acessar o site para validar o formulario

  @Cadastrar
  Scenario: formulario valido
    Given que eu esteja no site "https://www.grocerycrud.com/v1.x/demo/bootstrap_theme"
    When eu preencher os campos obrigatorios
    Then valido se o formulario foi enviado
    

  
