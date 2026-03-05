Projeto API de Clientes
1️⃣ Importação do Projeto

O professor deverá ser capaz de:

Fazer um clone simples do repositório no GitHub

Importar o projeto na IDE

Executar a aplicação sem necessidade de configuração adicional, além daquelas utilizadas nas aulas.

Exemplo de clone do projeto:

git clone https://github.com/seu-usuario/seu-repositorio.git

Após isso, basta importar o projeto na IDE e executar a aplicação.

🧪 2️⃣ Testes Manuais no Postman

O professor já terá preparado em seu computador as seguintes requisições no Postman.
Todas devem funcionar corretamente.

🔍 Buscar cliente por ID
GET /clients/1
📄 Busca paginada de clientes
GET /clients?page=0&size=6&sort=name
➕ Inserção de novo cliente
POST /clients
{
  "name": "Maria Silva",
  "cpf": "12345678901",
  "income": 6500.0,
  "birthDate": "1994-07-20",
  "children": 2
}
✏️ Atualização de cliente
PUT /clients/1
{
  "name": "Maria Silvaaa",
  "cpf": "12345678901",
  "income": 6500.0,
  "birthDate": "1994-07-20",
  "children": 2
}
🗑️ Deleção de cliente
DELETE /clients/1
✅ Checklist de Testes

Os seguintes cenários devem funcionar corretamente:

 Busca por ID retorna cliente existente

 Busca por ID retorna 404 para cliente inexistente

 Busca paginada retorna listagem paginada corretamente

 Inserção de cliente insere cliente com dados válidos

 Inserção de cliente retorna 422 e mensagens customizadas com dados inválidos

 Atualização de cliente atualiza cliente com dados válidos

 Atualização de cliente retorna 404 para cliente inexistente

 Atualização de cliente retorna 422 e mensagens customizadas com dados inválidos

 Deleção de cliente deleta cliente existente

 Deleção de cliente retorna 404 para cliente inexistente

Se quiser, também posso te entregar uma versão ainda mais profissional para README, com:

📊 tabela de endpoints

🧱 arquitetura do projeto

🚀 como rodar com Maven/Gradle

🐳 Docker (caso queira impressionar no GitHub).
