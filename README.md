# Algoritmia e Programação (APROG) — ISEP 2022/2023

Repositório da Unidade Curricular de **Algoritmia e Programação** do 1º ano da Licenciatura em Engenharia Informática, lecionada no ano letivo de 2022/2023.

## Sobre a UC

O principal objetivo desta UC foi introduzir os fundamentos da **programação estruturada em Java**, sem recurso a Programação Orientada a Objetos. Os conceitos abordados incluíram:

- Estruturas de controlo: `if/else`, `switch`
- Ciclos: `for`, `while`, `do-while`
- Métodos e modularização
- Arrays unidimensionais e bidimensionais (de tamanho fixo)
- Leitura e escrita de ficheiros (I/O)

---

## Projetos

### 📂 Input_Output_Project

Projeto focado na leitura e escrita de ficheiros, com manipulação de dados em arrays.

O programa lê de um ficheiro CSV (`students_grades.csv`) as notas de até 20 alunos em 5 disciplinas e realiza as seguintes operações:

1. **Leitura** — importa os dados do ficheiro CSV para arrays de nomes e notas
2. **Média** — calcula a média de cada aluno
3. **Ordenação** — ordena os alunos por ordem decrescente de média (Selection Sort)
4. **Visualização** — apresenta no ecrã o nome e a média de cada aluno
5. **Escrita** — exporta os resultados ordenados para um novo ficheiro CSV (`sorted_students_grades.csv`)

**Estrutura do ficheiro de entrada:**
```
student_name,grade1,grade2,grade3,grade4,grade5
```

---

### 📂 Final_Project

Projeto final da UC, desenvolvido em grupo, centrado na análise meteorológica de uma área geográfica para apoio ao **combate a incêndios florestais**.

O programa lê de um ficheiro de texto uma matriz de temperaturas (em ºC) registadas por satélite e produz uma série de análises:

| Alínea | Funcionalidade |
|--------|----------------|
| a) | Leitura do ficheiro e construção da matriz de temperaturas |
| b) | Visualização do mapa de temperaturas |
| c) | Geração do mapa de alertas (M / H / E / C) |
| d) | Novo mapa de alertas com variação de -10ºC |
| e) | Percentagem de área por nível de alerta |
| f) | Graus necessários para todo o terreno atingir alerta CATASTROPHIC |
| g) | Percentagem de células que mudam de alerta com variação de +10ºC |
| h) | Propagação de alertas por efeito do vento (Norte → Sul) |
| i) | Coordenadas ideais para largada de água por helicóptero (área 3x3) |
| j) | Coluna mais a Este sem alertas CATASTROPHIC em nenhuma direção de vento |

**Níveis de alerta por temperatura:**

| Nível | Código | Temperatura |
|-------|--------|-------------|
| Moderate | M | < 20ºC |
| High | H | 20ºC – 29ºC |
| Extreme | E | 30ºC – 39ºC |
| Catastrophic | C | ≥ 40ºC |

**Estrutura do ficheiro de entrada:**
```
Porto; 2022/10/19; 12:00
3 5
18 40 -22 24 39
19 35 38 55 45
30 35 38 39 31
```
