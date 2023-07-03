# BLOGERIO

Bem-vindo à documentação da API REST para gerenciamento de um blog. Este documento fornece informações sobre os pontos 
de extremidade disponíveis, os parâmetros necessários, as respostas esperadas e exemplos de uso. 
Siga as instruções abaixo para começar a utilizar a API.

## Visão geral
A API REST para gerenciamento de blog permite a criação, leitura, atualização e exclusão de artigos, bem como a adição e remoção de comentários nos artigos.
Criado para gerenciar qualquer “blog” que voce queira montar ao seu ponto de vista.
Podendo ser tosco, mas está API pode criar as tabelas do seu banco de dados de forma com que não tenha que fazer isto. 
Lembrando que isto pode ser uma opção para seu projeto como tambem pode não ser. Tudo esta configurado!

### Database da API
Para quetões de estetica e convenção, todos os nomes de tabelas iniciam por **Bg_**. 
Isto faz com que sejá mais facil identificar e organizar as tabelas de forma mais simples e bonita. 
Se necessario as tabelas podem ser ajustadas ao seu gosto. A seguir lhe deixamos a estrutura de tabelas:

**Bg_User**

| Column Name  |  Datatype  |
|:-------------|:----------:|
| userID       |  Integer   |
| UserName     |  Varchar   |
| UserProfile  |  Varchar   |
| UserEmail    |  Varchar   |
| UserPassword |  Varchar   |

#### Configure database connection
Para configurar a conexão com o teu banco utilizando a API pode fazer isso por meio do arquivo de configuração do serviço
chamado: **application.properties**.

Neste arquivo podem ser inseridas varias opções de configuração e para o banco de dados temos configurações automaticas graças ao JPA.

> Importante
> 
> Criar o banco manualmente pois na criação podem ser necessarias algumas configurações adicionais. Apenas não e necessario criar as tebelas pois isso sim já e jerado pelo serviço. 



