<h1 align="center">Atividade Android: Exercícios 1 e 6</h1>

<h3 align="center">Integrantes: Gustavo Henrique da Silva Souza e Guilherme Sola Gárcia</h3>

<p align=justify>		
  Nesta atividade criamos um total de 3 telas, em cada tela possui um execício diferente, na primeira tela temos o início do aplicativo onde tem dois botões que te leva para tela de um dos exercícios. Na segunda tela temos um exercício que pede para darmos dois valores onde ele ira calcular se ele são múltiilos ou não. Já na terceira tela temos um exercício que pede para colocarmos um código de um produto e sua quantidade onde ele ira apresentar o valor para pagar cada produto conforme a quantidade informada. 
</p>

<details>
<summary><h1>Registro Semanal</h1></summary>

<p><strong>
12/8 - Montagem das Telas
<br>
13/8 - Montagem da Lógica
<br>
15/8 - Correção dos códigos
<br>  
16/8 - Revisão dos Códigos
<br>
17/8 - Criação da Descrição e Envio do trabalho pro Git
<br>
18/8 - Entrega</strong></p>

</details>

<details>
<summary><h1>Detalhes do Aplicativo</h1></summary>
<li><Strong>Versão do Android:</Strong>8.0 (Oreo);</li>
<li><strong>Número de Telas:</strong>3;</li>
 <li><strong>Linguagem de Programação:</strong> Java;</li>
<li><strong>IDE</strong> Android Studio;</li>
</details>

<details>
<summary><h1>Criação das Telas</h1></summary>
<p><strong>Tela 1:</strong> Na primeira tela (início) temos 3 tipos de elementos que são: 1 textView e 2 buttons. A textView ira apresentar a Seguinte mensagem: "Atividade de Fixação" e os dois button apresentariam as seguites mensagens: "Exercício 1 - Números Múltiplos" (Button Superior) e "Exercício 6 - Cardápio" (Button Inferior) e as suas funções são levar para as telas de um dos dois dos exercícios.</p>

![Captura de tela 2023-08-17 210220](https://github.com/GustavoHenrique444/ExercicioDeFixacao/assets/127442583/9f675fc0-92ce-4edc-88d9-67c1275f36aa)


<p><strong>Tela 2:</strong> Já na tela dois começamos a montar a tela do exercício 2 onde utilizamos 4 elementos que são: 2 Plain Text, 1 Text View e 1 button. As 2 Plain Text serve para que o usuário digite um número aleatório para que o button calcule esse dois números e apresente o resultado na TextView vázia que ira dizer se eles são múltiplos ou não.</p>

![Captura de tela 2023-08-17 210521](https://github.com/GustavoHenrique444/ExercicioDeFixacao/assets/127442583/a4aeaeb0-459f-4525-ae11-f1fbd902cc6b)

<p><strong>Tela 3:</strong> Por fim, temos o último exercício que possui apenas 5 elementos que são: 2 Plain View, 1 Text View, 1 Button e 1 Text View. Basicamente, nesse exercício o usuário ira digitar os códigos apresentado em uma text view com os seguintes códigos: "1 = Cachorro Quente, 2 = Refrigerante e 3 = Sobremesa". Depois do usuário dizer qual item ele ira querer, basta agora ele informa a quantidade dos itens em específico da lista e clicar no botão "calcular" para ele informa o total a pagar para o usuário.</p>

![Captura de tela 2023-08-17 210521](https://github.com/GustavoHenrique444/ExercicioDeFixacao/assets/127442583/0d222a1b-571b-4939-92af-dd0171e05719)
</details>

<details>
<summary><h1>Explicando a Lógica</h1></summary>
<p><strong>Lógica da Tela Inicial:</strong> Na tela inicial temos dois buttons e esses define dois métodos para a tela, btnmulti e btncarda, que são chamados quando botões são clicados na interface. Cada método cria um novo "Intent" para iniciar uma atividade diferente do aplicativo. O btnmulti inicia a MainActivity2 e o btncarda inicia a MainActivity3, permitindo a navegação entre diferentes telas do aplicativo e assim fazendo o usuário entrar nos exercícios.</p>

![Captura de tela 2023-08-17 210258](https://github.com/GustavoHenrique444/ExercicioDeFixacao/assets/127442583/cf31e901-3488-47aa-a085-99967a87b823)

<p><strong>Lógica do Exercício 1:</strong> Na tela do exercício 1 o código Android determina uma atividade que permite ao usuário inserir dois números em campos de texto. Quando um botão é clicado, ele verifica se os números são múltiplos um do outro (ou seja, um pode ser dividido pelo outro sem resto) e exibe o resultado ("São Múltiplos" ou "Não Múltiplos") em uma text view na tela. A interface é configurada no método onCreate, onde os elementos da interface são associados a variáveis e o layout é definido a partir de um arquivo XML.</p>

![Captura de tela 2023-08-17 210629](https://github.com/GustavoHenrique444/ExercicioDeFixacao/assets/127442583/a5411e81-192f-4096-aae4-553f1426de01)
![Captura de tela 2023-08-17 210700](https://github.com/GustavoHenrique444/ExercicioDeFixacao/assets/127442583/3c6fc4ff-3fa1-46bb-97f1-f4e89fc73809)

<p><strong>Lógica do Exercício 6:</strong> Por fim, temos a lógica da terceira tela. Bom esse código em Android representa uma atividade que oferece um cardápio de produtos para o usuário. Quando um botão é clicado, ele verifica o código do produto e a quantidade escolhida pelo usuário. Com base no código do produto, calcula o custo total e exibe o resultado na tela. O código lida com três produtos diferentes (Cachorro Quente, Refirgerante e Sobremesa), cada um com um preço fixo. Se o usuário colocar o código do produto errado, exibe uma mensagem de erro.</p>

![Captura de tela 2023-08-17 210822](https://github.com/GustavoHenrique444/ExercicioDeFixacao/assets/127442583/f1ebc9e0-4d4a-491f-8b64-6e9a061c0a2b)
![Captura de tela 2023-08-17 210916](https://github.com/GustavoHenrique444/ExercicioDeFixacao/assets/127442583/342c37fa-75ad-4f5a-b242-e530d1cf23d0)

</details>

<details>
  <summary><h1>Enviando pro Git</h1></summary>
<p><strong>Git Hint:</strong> Neste trecho de código do terminal, alguém está interagindo com um repositório Git recém-inicializado. Eles verificaram o status do repositório, que mostra que estão no ramo "master" e não fizeram nenhum commit ainda. Alguns arquivos e diretórios não rastreados são listados, incluindo configurações do projeto Android, arquivos Gradle e outros. O Git sugere usar "git add" para começar a rastrear esses arquivos antes de criar um commit.</p>
</details>
