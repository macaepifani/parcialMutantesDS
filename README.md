# PARCIAL 1 - DESARROLLO DE SOFTWARE

Link para ver el diagrama de secuencia: https://drive.google.com/drive/folders/1Z_MP2FXLhO2q0rQijFGEyVGTiux6JBuK?usp=sharing

El repositorio tiene como fin la entrega del parcial 1 de la materia Desarrollo de Software, correspondiente al 3° año de la carrera Ingenieria en Sistemas de Información.

Mutantes - Con este código ayudamos a Magneto a reclutar la mayor cantidad de mutantes para poder luchar contra los X-Mens. El objetivo es a través del mismo determinar si es mutante o no con su ADN.

INSTALACIÓN
1. Clonar el repositorio:
   ```bash
   git clone https://github.com/usuario/proyecto-x.git
     
## CÓMO PROBAR 
### **1. EN RENDER**

Desde Render, solo se podrá verificar el endpoint "/stats".

Para esto, ingresar a la URL: https://parcialmutantesDSonrender.com/mutantapi/api/v1/stats

### **2. EN POSTMAN**

Desde la aplicación Postman, se podrán probar los endpoints "/mutant" y "/stats".

* `2.1. Endpoint "/stats"`

Crear una request de tipo "GET" y colocar como URL: https://parcialmutantesDS.onrender.com/mutantapi/api/v1/stats . Presionar "SEND".

* `2.2. Endpoint "/mutant"`

Crear una request de tipo "POST" y colocar como URL: https://parcialmutantesDS.onrender.com/mutantapi/api/v1/mutant . En el apartado de "Body", ir a la opción RAW y colocar un JSON. Presionar "SEND".


 ### **3. EN SWAGGER UI (OpenAPI)**
 
 Desde la interfaz interactiva SwaggerUI, también se podrán probar ambos endpoints. Para esto, ingresar a la URL: https://parcialmutantesDS.onrender.com/mutantapi/api/v1/swagger-ui/index.html

 * `2.1. Endpoint "/stats"`

Seleccionar el endpoint "GET /stats". Presionar "Try it out". Presionar "Execute".

* `2.2. Endpoint "/mutant"`

Seleccionar el endpoint "POST /mutant". Presionar "Try it out". Colocar un JSON. Presionar "Execute".

___
## JSONs DE PRUEBA

* `Filas:`

  ```json
  {
      "dna": [
          "CCCCTA",
          "TGCAGT",
          "GCTTCC",
          "CCCCTG",
          "GTAGTC",
          "AGTCAC"
      ]
  }

* `Columnas:`

  ```json
  {
      "dna": [
          "AGAATG",
          "TGCAGT",
          "GCTTCC",
          "GTCCTC",
          "GTAGTC",
          "GGTCAC"
      ]
  }

* `Diagonales principales:`

  ```json
  {
      "dna": [
          "AGAATG",
          "TACAGT",
          "GCAGCC",
          "TTGATG",
          "GTAGTC",
          "AGTCAA"
      ]
  }

* `Diagonal derecha ↘:`

  ```json
  {
    "dna": [
        "ATAATG",
        "GTTAGT",
        "GGCTCG",
        "TTGATG",
        "GTAGTC",
        "AGTCAA"
    ]
  }

* `Diagonal izquierda ↙:`

  ```json
  {
    "dna": [
        "ATAATG",
        "GTATGA",
        "GCTTAG",
        "TTTAGG",
        "GTAGTC",
        "AGTCAA"
    ]
  }

* `Filas y columnas:`

  ```json
  {
    "dna": [
        "CGATCA",
        "GATGCT",
        "TCCCCT",
        "TACAGT",
        "GTAACT",
        "ACCGTA"
    ]
  }

* `Todas las direcciones:`

  ```json
  {
    "dna": [
        "GGTGTG",
        "TCGCCG",
        "CCAAAA",
        "ACTGAT",
        "GCCAGC",
        "CTACTA"
    ]
  }

* `No mutante:`

  ```json
  {
    "dna": [
        "ATCGAT",
        "CTCTTG",
        "CAAGGC",
        "GGTATT",
        "ATCGAT",
        "AAGTCC"
    ]
  }


Esperamos ser de ayuda a Magneto para cumplir con su deseo.

By Macarena Epifani.
