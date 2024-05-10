JSON (JavaScript Object Notation) é um formato leve de troca de dados, fácil de ler e escrever para humanos, e simples de ser analisado e gerado por máquinas. É completamente independente de linguagem, baseando-se em convenções familiares para programadores das famílias das linguagens C, incluindo C, C++, C#, Java, JavaScript, Perl, Python, entre outras. 

### Características Principais do JSON:

1. **Texto Baseado**:
   - JSON é um formato baseado em texto e pode ser usado em qualquer sistema que possa manipular strings.

2. **Altamente Interoperável**:
   - Pode ser utilizado com uma grande variedade de linguagens de programação; portanto, é ideal para dados que serão consumidos em diferentes plataformas.

3. **Estrutura Simples**:
   - JSON é construído em duas estruturas:
     - Uma coleção de pares de chave/valor (frequentemente chamado de objeto em JSON).
     - Uma lista ordenada de valores (frequentemente chamada de array em JSON).

4. **Chaves e Valores**:
   - Dados em JSON são apresentados em pares de chave/valor onde a chave deve ser uma string entre aspas e o valor pode ser um objeto JSON, array, número, string, booleano (true ou false), ou 'null'.

### Exemplo de JSON:

```json
{
  "nome": "Fulano de Tal",
  "idade": 30,
  "profissao": "Engenheiro de Software",
  "habilidades": ["Java", "Python", "JavaScript"],
  "ativo": true
}
```

Neste exemplo, você pode ver um objeto JSON que contém várias chaves ("nome", "idade", "profissao", etc.) e seus respectivos valores, que incluem strings, um número, um array, e um booleano.

### Uso de JSON:

JSON é frequentemente usado para:
- Transmitir dados entre um servidor e uma aplicação web ou móvel.
- Armazenar dados de configuração e preferências dentro de aplicações.
- Comunicação entre diferentes serviços de software através de APIs, especialmente em formatos web e baseados em nuvem.

Dada sua simplicidade e eficiência em representar estruturas de dados hierárquicas, JSON tornou-se um dos formatos padrão para o intercâmbio de dados na web e outras redes. É comumente usado em APIs da Web e serviços baseados na internet, substituindo formatos mais antigos como o XML em muitos usos.