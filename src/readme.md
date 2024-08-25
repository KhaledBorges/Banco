# Banco Simulado em Java

Este é um projeto em Java que simula um banco simples. Possui funcionalidades básicas como depósito, transferência e investimento. 
O projeto é um desafio do curso de Java da Alura. Fiz sem olhar respostas e 100% sozinho.

## O que o Programa Faz

- **Saldo Inicial:** Você começa com R$1000 na sua conta como um presente.
- **Depósito:** Adicione dinheiro à sua conta (mínimo de R$100).
- **Transferência:** Transfira dinheiro para outra conta (mínimo de R$100 e não pode ser maior que o saldo disponível).
- **Investimento:** Invista um valor, com um rendimento fixo (Tem uma pequena piada, do qual você sempre vai sair com 0 reais na conta por causa das "taxas do investimento".)

## Como Funciona

1. **Início:**
    - O programa começa com um saldo de R$1000 e pede seu nome completo.

2. **Menu Principal:**
    - Terá um menu com as opções:
        - Depositar dinheiro
        - Transferir dinheiro
        - Investir
        - Sair

3. **O que Cada Opção Faz:**
    - **Depositar:** Você pode depositar um valor de pelo menos R$100 na sua conta. O saldo será atualizado e mostrado.
    - **Transferir:** Você pode transferir um valor (mínimo de R$100 e não maior que o saldo). O saldo será atualizado e mostrado.
    - **Investir:** Invista uma quantia de dinheiro (mínimo de R$1). O valor investido será descontado e o novo saldo (que sempre vai terminar como 0 reais) irá aparecer

4. **Encerramento:**
    - Você pode sair do programa a qualquer momento, e o programa volta ao menu principal quando necessário.

## Exemplo de Uso

Quando você inicia o programa, ele mostra algo assim:

```plaintext
Para iniciar no seu novo banco, você começará com um saldo de R$1000! É um presente <3

Digite seu nome completo:
Khaled Borges

-----------------------------------------------------------
Bem-vindo ao seu incrível banco!
Dados iniciais do cliente:

Nome:                      Khaled Borges
Tipo conta:                Corrente
Saldo:                     R$1000
-----------------------------------------------------------

Digite a opção que deseja:

1- Depositar valor em conta corrente
2- Transferir valor
3- Investir
4- Sair
