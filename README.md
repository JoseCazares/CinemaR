# Cinemar crud en java

## Es un sistema backend de servicios REST para un módulo de administración de películas(CRUD) en una cartelera de cine.


### ¿Que nos encontramos?

- Peliculas
  - Insertar
  - Editar
  - Eliminar
  - Mostrar todas las peliculas
  - Mostrar una pelicula en especifico
  
 - Horarios
    - Mostrar todos los horarios
    - Mostrar los horarios disponibles para una **película**
    
  ### **Peticiones** 
  
  ![Todas las peticiones para las **peliculas**](/assets/img/peticiones_peliculas.png)
  
  -- Listar todas las peliculas **Method:** get
  ```
  localhost:8080/peliculas/all
  ```
  
  -- Ingresar una nueva pelicula **Method:** post
  ```
  localhost:8080/peliculas
  ```
  
  Ejemplo del **json** en el body de la peticion
  
  ```
  {
    "nombrepelicula": "The social dilema",
    "imagen": "2.jpeg",
    "duracion": "120",
    "clasificacion": "pg13"
  }
  ```
  
  -- Listar una pelicula en especifico **Method:** get
  ```
  localhost:8080/peliculas/{id}
  ```
  
   -- Eliminar una pelicula **Method:** delete
  ```
  localhost:8080/peliculas/delete/{id}
  ```
  
   -- Actualizar una pelicula **Method:** put
  ```
  localhost:8080/peliculas/update
  ```
  Ejemplo del **json** en el body de la peticion
  
  ```
  {
    "nombrepelicula": "The social dilema",
    "imagen": "2.jpeg",
    "duracion": "120",
    "clasificacion": "pg13",
    "id": 5
}
  ```
  
  
  
  
  
  ### Base de datos
  ![Diagrama de la base de datos](/assets/img/diagrama.png)
