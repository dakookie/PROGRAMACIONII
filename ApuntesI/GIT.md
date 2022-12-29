# GIT
---
Fecha: 17/11/2022
+ Control de versiones

> ## GitHub
GitHub es un servicio basado en la nube que aloja un sistema de control de versiones (VCS) llamado Git. Éste permite a los desarrolladores colaborar y realizar cambios en proyectos compartidos, a la vez que mantienen un seguimiento detallado de su progreso.

* Link para más información de GitHub

[buscador_git] (https://www.hostinger.es/tutoriales/que-es-github)

***

> ### Comandos
+ ***git version*** --> Ayuda a verificar que el git esté funcionando y esté activo en mi directorio

+ #### Para la identidad
  + git config --global user.name "dakookie"
  + git config --global user.email damaris.suquillo@epn.edu.ec"

+ #### Para verificar el paso anterior
  + ***git config user name***
  + ***git config user email***

+ #### Inicio de control de versiones
  + ***git init*** --> Carpeta donde el git utiliza unos documentos donde guarda todos los cambios que se vayan a realizar, crea particularidades en el directorio que son:
    + [x] U --> Untraking(no está anexado), crea la rama master.
    + [x] A --> Actualizado
    + [x] M --> Modificado
    + [x] . --> Hacer archivos que pueden tener seguimiento(indicador).
  + ***pwd*** --> Me dice en donde estoy ubicado
  + ***git status*** --> Me informa como están los archivos en mi directorio.
  + ***git add .*** --> Ligar archivos
  + ***git add NombreCarpeta/NombreArchivo***
  + ***git commit -m 'mensaje : initial project version'*** --> Guardar los cambios realizados

+ #### Quitar archivos de control
  Permite que archivos no requeridos no se carguen en el git

  (*) --> Todos los archivos de una extensión van a ser ignorados

  echo nombreArchivo.ext >> .gitignore
  + ***echo *.txt >> .gitignore***
