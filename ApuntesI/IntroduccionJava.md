# Introducción JAVA
---
Fecha: 18/11/2022

Para crear un proyecto en java se utilizan los comandos:
+ ctrl+shift+P
  + Create Java Project > No build tools (sin herramientas, java en aspecto base).

> ### Consola

Para comenzar a trabajar en un java project se debe verificar el git:
1. git version
2. git config user.name
3. git config user.email
4. git init
5. pwd --> Donde estoy trabajando, qué archivos tengo
6. ls --> rama master
7. git status 
8. echo *.json >>. gitignore
9. git status
10. git add .
11. git commit -m "(Mensaje)"
12. Cuenta ligada a la nube en el visual
13. Subir a la nube con public
---
> ### Nuevos Comandos

+ ***git pull*** --> Me trae los cambios hechos en la nube
+ ***git push*** --> Envia los cambios a la nube.
+ ***ls - la*** --> Permite enlistar los directorios
+ ***cat . gitignore*** --> Permite saber lo que estoy ignorando
+ ***mkdir*** --> Permite crear una carpeta 

---
> #### Notas

+ Si hice algún cambio primero se debe poner un ***git status*** en consola
+ Todos los ***.class*** no se deben subir a la nube
+ git push y git pull son importantes para trabajar
+ Verificar que no existan errores
+ NO OLVIDARSE DE PONER EL ***COMMIT*** para que me guarde los cambios realizados antes de ejecutar el ***git pull/git push***.
+ Para compilar en JAVA se utiliza el comando en consola: ***java src/App.java***
---
> ### Código

```java
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, Dakookie");
    }
}
