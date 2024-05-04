# GIT

- Herramienta para facilitar el trabajo colaborativo.

## Comandos

- **Git commit**: Permite guardar los cambios realizados en el repositorio localmente.

- **Git clone**: Clona un repositorio remoto en el repositorio local.

- **Git status**: Muestra el estado actual del repositorio, incluyendo los cambios pendientes de commit y archivos no rastreados.

- **Git branch**: Lista, crea o elimina ramas. También permite cambiar entre ramas.

- **Git init**: Inicializa un nuevo repositorio Git en el directorio actual.

- **Git push**: Sube los cambios locales a un repositorio remoto.

- **Git pull**: Descarga los cambios del repositorio remoto y los fusiona con el repositorio local.

- **Git add**: Agrega archivos al área de preparación para ser incluidos en el próximo commit.

- **Git merge**: Fusiona una rama específica con la rama actual.

## Trabajo Local y Colaborativo

Git es una herramienta de control de versiones distribuido, lo que significa que cada colaborador tiene una copia local del repositorio completo. Esto facilita el trabajo tanto individual como colaborativo.

### Trabajo Local

- **Inicio del Proyecto**: Con `git init`, se inicia un nuevo repositorio Git en el directorio local del proyecto.
- **Desarrollo de Funcionalidades**: Se crean nuevas ramas (`git branch`) para desarrollar nuevas funcionalidades sin afectar la rama principal (generalmente `master` o `main`).
- **Guardar Cambios**: Con `git add` y `git commit`, se guardan los cambios en el repositorio local a medida que se avanza en el desarrollo.
- **Revisión de Historial**: Utilizando `git log` y `git diff`, se revisa el historial de cambios y se comparan las diferencias entre versiones.
- **Revertir Cambios**: Se pueden revertir cambios utilizando `git reset` o `git checkout`.

### Trabajo Colaborativo

- **Clonar el Repositorio**: Los colaboradores clonan el repositorio remoto con `git clone`.
- **Desarrollar en Ramas**: Cada colaborador puede trabajar en su propia rama y luego fusionar los cambios con `git merge`.
- **Comunicación**: Los cambios se comparten a través del repositorio remoto y se pueden revisar con `git pull`.
- **Resolución de Conflictos**: Si hay conflictos entre los cambios de diferentes colaboradores, se resuelven manualmente antes de fusionar las ramas.
- **Subir Cambios**: Los cambios se suben al repositorio remoto con `git push`, lo que permite que otros colaboradores vean y revisen los cambios.
## hola soy jairo
