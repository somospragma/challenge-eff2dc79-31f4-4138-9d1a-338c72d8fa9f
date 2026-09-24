# AGENTS.md

Instrucciones para el agente de IA que abra este repositorio (Claude Code, Cursor, Codex, Copilot, Gemini). Se cargan solas: no hay que pegar nada en ningun chat.

## Que es este repositorio

Es el codigo base de un reto de aprendizaje de Pragma: **Aplicación de Patrones GRASP en un Sistema de Gestión de Cuentas Bancarias**.

| | |
|---|---|
| Tema | Aplicación de Patrones GRASP en el Desarrollo de Sistemas |
| Nivel | junior-l1 |
| Chapter | Backend |
| Especialidad | Java |
| Stack | Java / Spring Boot 3.5 |
| Patron arquitectonico | capas estándar |
| Tiempo estimado | 8 horas |

## Receta del stack

Esqueleto obligatorio:

- `pom.xml en la raiz`
- `clase con @SpringBootApplication`
- `application.yml en src/main/resources`
- `capa de dominio con entidades y puertos`
- `capa de aplicacion con casos de uso`
- `capa de infraestructura con adaptadores y @RestController`

Trampas conocidas:

- TODA `<version>` del pom va con tres segmentos: la del parent (ej. `3.5.6`) y la de cada dependencia que la lleve (ej. Resilience4j `2.2.0`). `3.4` y `2.0` no existen como artefacto y el build muere resolviendo dependencias.
- Las dependencias que el parent POM gestiona van SIN `<version>`: `spring-boot-starter-web`, `-data-jpa`, `-validation`, `-test`, etc.
- Resilience4j publica un artefacto por linea de Spring Boot. Con Spring Boot 3 va `resilience4j-spring-boot3` con version de tres segmentos (ej. `2.2.0`, no `2.0`). `resilience4j-spring-boot2` es de Spring Boot 2 y rompe el arranque.
- Si usas anotaciones de validacion (`@NotNull`, `@Size`, `@Positive`) declara `spring-boot-starter-validation`: el starter web no las trae.
- El `spring-boot-maven-plugin` tiene que estar en `<build><plugins>` o no se empaqueta ejecutable.
- Spring Boot 3 usa `jakarta.*`, nunca `javax.*`.
- Cada archivo empieza con su `package` y con un `import` por cada clase del proyecto que viva en otro paquete. Usar `PaymentService` desde `infrastructure` sin `import com.x.application.PaymentService` no compila.

Dependencias:

- org.springframework.boot:spring-boot-starter-web n/a
- org.springframework.boot:spring-boot-starter-data-jpa n/a
- org.springframework.boot:spring-boot-starter-validation n/a
- org.springframework.boot:spring-boot-starter-test n/a
- org.projectlombok:lombok 1.18.30
- com.h2database:h2 2.2.224
- org.springdoc:springdoc-openapi-starter-webmvc-ui 2.5.0

## Tu tarea

Dejar este proyecto en estado **verificable**: que el comando de verificacion corra sin errores. Escribi los archivos en disco, en este repositorio. No generes ZIPs ni archivos adjuntos.

En orden:

1. Corre `mvn clean compile` y mira que falla.
2. Completa lo que falte de la lista de abajo: manifiesto de dependencias, punto de entrada, capa de interfaz y las capas del patron declarado.
3. Arregla SOLO los errores que impiden compilar o arrancar.
4. Volve a correr `mvn clean compile` hasta que pase.
5. Pará ahí.

## Regla dura: las fases son trabajo del humano

**PROHIBIDO implementar los entregables de las fases.** El valor del reto esta en que la persona los resuelva. Tu trabajo es que tenga un proyecto que arranca; el hueco pedagogico se queda como esta.

No resuelvas nada de esto:

- **Fase 1 — Definición de Responsabilidades**: Diagrama de componentes con responsabilidades asignadas.
- **Fase 2 — Implementación del Patrón Creador**: Código que implementa el patrón Creador para la creación de cuentas.
- **Fase 3 — Aplicación del Patrón Controlador**: Código que aplica el patrón Controlador para manejar las solicitudes de los clientes.

Distincion operativa:

- **Arreglar** (si): import faltante, tipo que no existe, dependencia sin declarar, error de sintaxis, archivo referenciado que no existe.
- **No tocar** (no): logica de negocio incompleta, validaciones ausentes, secretos hardcodeados, APIs deprecadas que funcionan, concurrencia insegura, patrones mejorables. Eso es lo que la persona tiene que encontrar.

## Lo que falta y tenes que completar

### 1. Referencias colgando (13)

Salieron de un analisis estatico del codigo que SI esta en el repo. Cada una rompe la compilacion:

- [ ] `src/main/java/com/bank/system/infrastructure/dto/AccountResponse.java` — `Account.getId`
      Se invoca `getId` sobre `Account`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/bank/system/infrastructure/dto/AccountResponse.java` — `Account.getAccountNumber`
      Se invoca `getAccountNumber` sobre `Account`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/bank/system/infrastructure/dto/AccountResponse.java` — `Account.getCustomerId`
      Se invoca `getCustomerId` sobre `Account`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/bank/system/infrastructure/dto/AccountResponse.java` — `Account.getBalance`
      Se invoca `getBalance` sobre `Account`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/bank/system/infrastructure/dto/AccountResponse.java` — `Account.getStatus`
      Se invoca `getStatus` sobre `Account`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/bank/system/infrastructure/dto/AccountResponse.java` — `Account.getCreatedAt`
      Se invoca `getCreatedAt` sobre `Account`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/bank/system/infrastructure/dto/AccountResponse.java` — `Account.getUpdatedAt`
      Se invoca `getUpdatedAt` sobre `Account`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/bank/system/infrastructure/controller/AccountController.java` — `Account.getId`
      Se invoca `getId` sobre `Account`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/bank/system/infrastructure/controller/AccountController.java` — `Account.getAccountNumber`
      Se invoca `getAccountNumber` sobre `Account`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/bank/system/infrastructure/controller/AccountController.java` — `Account.getCustomerId`
      Se invoca `getCustomerId` sobre `Account`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/bank/system/infrastructure/controller/AccountController.java` — `Account.getBalance`
      Se invoca `getBalance` sobre `Account`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/test/java/com/bank/system/domain/service/AccountServiceTest.java` — `Account.getBalance`
      Se invoca `getBalance` sobre `Account`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/test/java/com/bank/system/domain/service/AccountServiceTest.java` — `Account.getStatus`
      Se invoca `getStatus` sobre `Account`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.

### Presentes (17)

- `pom.xml`
- `src/main/java/com/bank/system/Application.java`
- `src/main/resources/application.yml`
- `src/main/java/com/bank/system/domain/model/Account.java`
- `src/main/java/com/bank/system/domain/port/AccountRepository.java`
- `src/main/java/com/bank/system/domain/service/AccountService.java`
- `src/main/java/com/bank/system/infrastructure/repository/JpaAccountRepository.java`
- `src/main/java/com/bank/system/infrastructure/dto/AccountRequest.java`
- `src/main/java/com/bank/system/infrastructure/dto/AccountResponse.java`
- `src/main/java/com/bank/system/application/AccountCreator.java`
- `src/main/java/com/bank/system/infrastructure/controller/AccountController.java`
- `src/main/java/com/bank/system/infrastructure/exception/GlobalExceptionHandler.java`
- `src/main/java/com/bank/system/infrastructure/exception/AccountNotFoundException.java`
- `src/main/java/com/bank/system/infrastructure/exception/AccountCreationException.java`
- `src/test/java/com/bank/system/domain/service/AccountServiceTest.java`
- `src/test/java/com/bank/system/application/AccountCreatorTest.java`
- `src/test/java/com/bank/system/infrastructure/controller/AccountControllerTest.java`

### Capas del patron declarado

Cada una tiene que existir como directorio real con al menos un archivo. Codigo plano en la raiz no satisface el patron.

- `src/main/java/com/bank/system`
- `src/main/java/com/bank/system/domain`
- `src/main/java/com/bank/system/application`
- `src/main/java/com/bank/system/infrastructure`
- `src/main/resources`
- `src/test/java/com/bank/system`

## Verificacion

```bash
mvn clean compile
```

Ese comando pasando es la definicion de "terminado" para vos.

## Convenciones que tenes que respetar

- Un solo ecosistema: no declares librerias de otro lenguaje ni mezcles gestores de paquetes.
- Toda libreria que uses tiene que estar declarada en el manifiesto de dependencias.
- Todo import declarado tiene que usarse; todo tipo usado tiene que existir o venir de una dependencia declarada.
- El patron es **capas estándar**: los contratos (interfaces, puertos) los define la capa interna y los implementa la externa, nunca al revés.
- Los archivos que crees llevan implementacion real, no stubs: sin `TODO`, sin cuerpos vacios, sin `// getters y setters`.

## Contexto del candidato

Sirve para calibrar el nivel del codigo, no para resolver las fases.

- Perfil: Chapter Backend, Especialidad Desarrollador, Tecnología Java, Junior
- Brecha que el reto ataca: Aplica al menos dos patrones GRASP (Patrones de Software para la Asignación de Responsabilidades Generales) en el diseño y desarrollo de un sistema. Entre ellos: Experto en Información, Creador, Controlador, Alta Cohesión y Bajo Acoplamiento, Polimorfismo, Fabricación Pura, Indirección y Variaciones Protegidas.
- Mision: Candidato Junior con experiencia inicial en desarrollo Backend con Java.

---

*Generado por Challenge Generator — Pragma. `README.md` tiene el enunciado completo del reto para la persona. `PROMPT_MEJORA.md` es la variante para pegar en un chat, si se prefiere ese flujo.*
