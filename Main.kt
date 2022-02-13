import javax.print.attribute.standard.PrinterLocation

fun main() {

    println("Trabalho Loja de  Varejo: Cristina Machado Dutra e Moacir Carvalho")

    val encomendasLtda = Loja()

    encomendasLtda.nome = "EncomendasLtda"
    encomendasLtda.endereco = "Josué de castro"
    encomendasLtda.telefoneComercial = "984676241"
    encomendasLtda.emailComercial = "encomendas@gmail.com"

    println("DADOS DA LOJA")

    println("Nome: ${encomendasLtda.nome}")
    println("Endereço: ${encomendasLtda.endereco}")
    println("Telefone comercial: ${encomendasLtda.telefoneComercial}")
    println("Email comercial: ${encomendasLtda.emailComercial}")



     val anderson = Vendedor()

    anderson.nome = "Anderson"
    anderson.idade = 27
    anderson.comissao = 3.889f
    anderson.meta = 1.899f

    println("DADOS DO VENDEDOR")

    println("Nome: ${anderson.nome}")
    println("Idade: ${anderson.idade}")
    println("Comissao: ${anderson.comissao}")
    println("Meta: ${anderson.meta}")

    val  perfumaria= Produto()
    perfumaria.nomeDaMarca = "Natura"
    perfumaria.embalagem = "Pequena"
    perfumaria.dataDeValidade = "janeiro /2039"
    perfumaria.valorDoProduto = "R$23,59"

    println("DADOS DO PEODUTO")
    println("Nome da Marca: ${perfumaria.nomeDaMarca}")
    println("Embalagem: ${perfumaria.embalagem}")
    println("Data de validade: ${perfumaria.dataDeValidade}")
    println("Valor do produto: ${perfumaria.valorDoProduto}")

    val  henrique = Cliente()
    henrique.nome = "Henrique"
    henrique.cpf  = "98746123456"
    henrique.idade = "28"
    henrique.telefone = "985905505"
    henrique.enderecoDeEntrega = " Avenida dos Gaúchos"

    println("DADOS DO CLIENTE")
    println("Nome do cliente: ${henrique.nome}")
    println("Cpf: ${henrique.cpf}")
    println("Idade: ${henrique.idade}")
    println("Telefone: ${henrique.telefone}")
    println("Endereço de entrega: ${henrique.enderecoDeEntrega}")

    val distribuidoraFarmais = Fornecedor()
    distribuidoraFarmais.nome = "Distribuidora Farmais"
    distribuidoraFarmais.endereco = "Rua São Paulo"
    distribuidoraFarmais.cnpj = "975426547/00001"
    distribuidoraFarmais.produto = "Cosmeticos"
    distribuidoraFarmais.numeroDefuncionarios = "520"

    println("DADOS DO FORNECEDOR")
    println("Nome do fornecedor: ${distribuidoraFarmais.nome}")
    println("Endereço: ${distribuidoraFarmais.endereco}")
    println("Cnpj: ${distribuidoraFarmais.cnpj}")
    println("Produto: ${distribuidoraFarmais.produto}")
    println("Numero de funcionarios: ${distribuidoraFarmais.numeroDefuncionarios}")

    val promocao = Vendas()
    promocao.produto = "Creme para cabelo"
    promocao.localDaVenda = "Encomendas Ltda"
    promocao.valorDoProduto = "R$23,80"

    println("DADOS DA VENDA")
    println("Produto em promoçao: ${promocao.produto}")
    println("Localde Venda: ${promocao.localDaVenda}")
    println("valor do Produto: ${promocao.valorDoProduto}")

    val  controle = Estoque()
    controle.materiaPrima = "5 caixas em estoque"
    controle.produtoInacabado = "23 Caixas inacabadas"
    controle.produtosFinal = "85 pronto para entrega"
    controle.numeroDefuncionarios = "150 Funcionarios na produçao"

    println("DADOS DO ESTOQUE")
    println("Materia prima: ${controle.materiaPrima}")
    println("Produto inacabado: ${controle.produtoInacabado}")
    println("Produro final: ${controle.produtosFinal}")
    println("Numero de funcionarios: ${controle.numeroDefuncionarios}")

    val entrega = Transportadora()
    entrega.motorista = "Fabricio"
    entrega.veiculoParaEntrega = "Splinter"
    entrega.rotaDeEntrega = "Rio Grande do Sul e São Paulo"
    entrega.prazoDeEntrega = "15 dias"
    entrega.cliente = "Encomendas Ltda"

    println("DADOS DA TRANSPORTADORA")
    println("Motorista: ${entrega.motorista}")
    println("Veiculo Para Entrega: ${entrega.veiculoParaEntrega}")
    println("Rota De Entrega: ${entrega.rotaDeEntrega}")
    println("Prazo De Entrega: ${entrega.prazoDeEntrega}")
    println("Cliente: ${entrega.cliente}")

    val filialCentro = Filial()
    filialCentro.nomeDaFilial = "Encomendas Ltda RS"
    filialCentro.endereco = "Rio Grande do Sul / Porto Alegre"
    filialCentro.gerente = "Guilherme"
    filialCentro.vendedor = "Felipe"

    println("DADOS DA FILIAL")
    println("Nome da Filial: ${filialCentro.nomeDaFilial}")
    println("Endereço: ${filialCentro.endereco}")
    println("Gerente: ${filialCentro.gerente}")
    println("Vendedor: ${filialCentro.vendedor}")
    


















}