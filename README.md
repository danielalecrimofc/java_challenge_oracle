# Java Oracle Foundations - Estudo de Caso
**Repositório referente ao exercício desafio do curso _Java Oracle Foundations_.**
## Assuntos abordados no desafio Employee ↔ Department
### Definição de classes e atributos

* Criação das entidades Employee e Department.

* Uso de atributos privados (int ID, String name, double salary, etc.) para respeitar encapsulamento.

### Construtores

* Employee(int ID, String name, double salary) para inicialização obrigatória dos objetos.

* Department(String name) para criar departamentos já com nome definido.

### Encapsulamento com getters e setters

* Métodos getters e setters em ambas as classes para acesso controlado dos atributos.

* Demonstração prática de como ocultar os campos internos e expor apenas o necessário.

### Relacionamento entre classes

* Associação entre objetos:

* Um Department mantém um conjunto de Employees.

* Cada Employee está vinculado a um único departamento (por referência no array do Department).

### Uso de Arrays

* Implementação de um array fixo de Employee (Employee[] employees = new Employee[10]).

* Gerenciamento manual do índice (lastAddedEmployeeIndex) para controlar inserções.

* Cópia parcial dos elementos válidos em getEmployees().

### Laços de repetição

* Uso de for tradicional para copiar arrays.

* Uso de enhanced for (for (Employee employee : employees)) para percorrer os empregados.

### Métodos de consulta e manipulação (Query/Utility Methods)

* addEmployee(Employee) → adiciona novo funcionário.

* getEmployees() → retorna apenas empregados válidos.

* getEmployeeCount() → número de funcionários.

* getEmployeeByID(int) → busca por ID.

* getTotalSalary() → soma total de salários.

* getAverageSalary() → cálculo de média salarial.

### Validações básicas

* Prevenção de NullPointerException ao checar se employee != null.

* Tratamento de casos sem funcionários em getAverageSalary() (retorna 0.0).

### Sobrescrita de métodos

* toString() em Employee para exibir dados formatados (ID, nome e salário).

### Conceitos de Orientação a Objetos

* Abstração: representar entidades do mundo real (Employee, Department).

* Encapsulamento: atributos privados + acesso controlado.

* Associação um-para-muitos: um Department tem vários Employees.

* Coesão: cada classe com responsabilidades bem definidas.
