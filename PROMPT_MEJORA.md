# Prompt para Mejorar el Codigo Base

Copia y pega el contenido del bloque de abajo en un asistente de IA (Claude, ChatGPT)
para obtener un ZIP con el proyecto completo y arrancable.

Si preferis trabajar en tu editor con un agente local (Claude Code, Cursor, Copilot), usa `AGENTS.md` en vez de este archivo: dice lo mismo pero para que escriba los archivos en disco.

## Las dos reglas que no se negocian

1. **Completa el boilerplate.** Todo lo que el proyecto necesita para compilar y arrancar: manifiesto de dependencias, punto de entrada, configuracion, capa de interfaz, y las capas del patron arquitectonico declarado. Eso es andamiaje y es tu trabajo.
2. **NO resuelvas el reto.** Los entregables de las fases son el trabajo de la persona. El hueco pedagogico se deja como esta: el proyecto arranca, pero lo que el reto pide implementar NO esta implementado.

Dicho de otra forma: si algo impide compilar, arreglalo. Si algo es logica de negocio incompleta, validaciones ausentes, un secreto hardcodeado o un patron mejorable, dejalo exactamente como esta — es lo que la persona tiene que encontrar.

## Lo que le falta a este proyecto

Esto NO lo tenes que adivinar: salio de comparar el proyecto contra la arquitectura declarada del reto y de un analisis estatico del codigo. Completalo TODO.

### Referencias colgando en el codigo que si esta

Cada una rompe la compilacion:

- `src/main/java/com/bank/system/infrastructure/dto/AccountResponse.java` — `Account.getId`: Se invoca `getId` sobre `Account`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/bank/system/infrastructure/dto/AccountResponse.java` — `Account.getAccountNumber`: Se invoca `getAccountNumber` sobre `Account`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/bank/system/infrastructure/dto/AccountResponse.java` — `Account.getCustomerId`: Se invoca `getCustomerId` sobre `Account`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/bank/system/infrastructure/dto/AccountResponse.java` — `Account.getBalance`: Se invoca `getBalance` sobre `Account`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/bank/system/infrastructure/dto/AccountResponse.java` — `Account.getStatus`: Se invoca `getStatus` sobre `Account`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/bank/system/infrastructure/dto/AccountResponse.java` — `Account.getCreatedAt`: Se invoca `getCreatedAt` sobre `Account`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/bank/system/infrastructure/dto/AccountResponse.java` — `Account.getUpdatedAt`: Se invoca `getUpdatedAt` sobre `Account`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/bank/system/infrastructure/controller/AccountController.java` — `Account.getId`: Se invoca `getId` sobre `Account`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/bank/system/infrastructure/controller/AccountController.java` — `Account.getAccountNumber`: Se invoca `getAccountNumber` sobre `Account`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/bank/system/infrastructure/controller/AccountController.java` — `Account.getCustomerId`: Se invoca `getCustomerId` sobre `Account`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/bank/system/infrastructure/controller/AccountController.java` — `Account.getBalance`: Se invoca `getBalance` sobre `Account`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/test/java/com/bank/system/domain/service/AccountServiceTest.java` — `Account.getBalance`: Se invoca `getBalance` sobre `Account`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/test/java/com/bank/system/domain/service/AccountServiceTest.java` — `Account.getStatus`: Se invoca `getStatus` sobre `Account`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.

## Como saber que terminaste

```bash
mvn clean compile
```

Ese comando corriendo sin errores es la definicion de "listo".

---

```
## Briefing del reto (autoridad)
Este bloque manda sobre los archivos adjuntos. El stack y el rol salen de AQUÍ, no de un topic genérico ni de markdown placeholder.

### Perfil
Chapter Backend, Especialidad Desarrollador, Tecnología Java, Junior

### Brecha de conocimiento
Aplica al menos dos patrones GRASP (Patrones de Software para la Asignación de Responsabilidades Generales) en el diseño y desarrollo de un sistema. Entre ellos: Experto en Información, Creador, Controlador, Alta Cohesión y Bajo Acoplamiento, Polimorfismo, Fabricación Pura, Indirección y Variaciones Protegidas.

### Misión / candidato
Candidato Junior con experiencia inicial en desarrollo Backend con Java.

### Reto
- Tema: Aplicación de Patrones GRASP en el Desarrollo de Sistemas
- Seniority: junior-l1
- Tipo: practical
- Título: Aplicación de Patrones GRASP en un Sistema de Gestión de Cuentas Bancarias
- Tiempo estimado: 8 horas

### Fases (trabajo del HUMANO — PROHIBIDO completarlas)
No implementes estos entregables. Dejalos como hueco pedagógico. El asistente solo materializa el proyecto arrancable para que el participante pueda trabajar.
- Fase 1: Definición de Responsabilidades — objetivo: Identificar y asignar responsabilidades a los componentes del sistema utilizando el patrón Experto en Información. — entregable (NO resolver): Diagrama de componentes con responsabilidades asignadas.
- Fase 2: Implementación del Patrón Creador — objetivo: Implementar el patrón Creador para manejar la creación de nuevas cuentas. — entregable (NO resolver): Código que implementa el patrón Creador para la creación de cuentas.
- Fase 3: Aplicación del Patrón Controlador — objetivo: Aplicar el patrón Controlador para manejar las solicitudes de los clientes. — entregable (NO resolver): Código que aplica el patrón Controlador para manejar las solicitudes de los clientes.

Eres un asistente experto en análisis, corrección y generación de archivos de cualquier tipo:
código fuente, documentación, hojas de cálculo, documentos Word, configuraciones, entre otros.
Voy a enviarte una cadena de texto que contiene uno o más archivos. Cada archivo está delimitado por un marcador con el siguiente formato:
// === ARCHIVO: ruta/del/archivo.extension ===
o también puede aparecer como:
## === ARCHIVO: ruta/del/archivo.extension ===
Lo que sigue al marcador puede ser:

El contenido real del archivo (código, texto, YAML, etc.)
Una descripción en lenguaje natural de lo que debe contener el archivo


TU TAREA
PASO 0 — ¿Esto es un proyecto o una carcasa?
Antes de extraer archivos, leé el Briefing (si está) y diagnosticá el adjunto.

Es CARCASA si ocurre CUALQUIERA de estas:
- No hay manifiesto de dependencias del stack del briefing (manifest.json de VTEX IO / package.json / pom.xml / build.gradle / requirements.txt / go.mod / *.tf / *.csproj, según corresponda)
- Hay un "binario" que en realidad es un comentario ("no puede ser mostrado como texto plano", placeholder .fig/.docx vacío)
- Los markdowns ya completan entregables de fases posteriores ("se implementó fade-in", lista de áreas ya resuelta)

Si es CARCASA:
- MATERIALIZÁ un proyecto que arranca en el stack del briefing (VTEX IO Store Framework, Angular, Terraform, pytest, Nest, etc.). Incluí manifiesto, punto de entrada y capa de interfaz reales.
- NO copies los markdowns de "solución" como si fueran el producto. Son ruido de generación.
- NO resuelvas las fases del briefing (están marcadas PROHIBIDO). Dejá el hueco pedagógico: el flujo existe, las microinteracciones/calidad/infra que el reto pide NO están hechas.
- Después seguí al PASO 5 (ZIP).

Si es un proyecto REAL (manifiesto + código que compila o arranca):
- Seguí PASO 1 en adelante. 🔴 compilación sí. 🟡 pedagógico no.

PASO 1 — Detección y extracción
Identifica todos los archivos presentes en la cadena. Para cada archivo extrae:

Su ruta completa (ej: src/main/java/com/pragma/Service.java)
Su contenido o descripción

PASO 2 — Clasificación por tipo
Clasifica cada archivo en una de estas categorías:
A) Código fuente (Java, Python, TypeScript, JavaScript, Kotlin, etc.)
B) Configuración / documentación (YAML, properties, Markdown, JSON, txt, etc.)
C) Excel (.xlsx, .xls, .csv)
D) Word (.docx, .doc)
E) Otro tipo de archivo binario o especial
PASO 3 — Clasificación de errores en código fuente

Objetivo prioritario: que el proyecto compile. No corrijas flujo de negocio ni lógica funcional.

Antes de modificar cualquier archivo de código fuente, clasifica cada problema encontrado en una de estas dos categorías:
🔴 ERROR DE COMPILACIÓN — corregir siempre
Son errores que impiden que el proyecto arranque, sin valor pedagógico:

Import faltante o incorrecto
Clase, método o variable referenciada que no existe en ningún archivo del proyecto
Error de sintaxis
Anotación con atributos inválidos
Dependencia ausente en pom.xml, package.json, etc.
Archivo referenciado que no existe y debe ser creado con implementación mínima

→ CORREGIR estos errores.
🟡 PROBLEMA FUNCIONAL O DE CALIDAD — preservar siempre
Son problemas que no impiden compilar. Pueden ser intencionales para el aprendizaje:

Clave secreta hardcodeada ("secret", "password123")
API deprecada que funciona pero tiene reemplazo moderno
Lógica de negocio incorrecta o incompleta
Código redundante o de baja legibilidad
Falta de validaciones en flujo de negocio
Patrones de diseño incorrectos pero funcionales
Concurrencia no segura
Configuración funcional pero no óptima

→ PRESERVAR tal cual. No corregir, no mejorar, no comentar.
PASO 4 — Procesamiento según tipo de archivo
Tipo A — Código fuente
Aplica únicamente las correcciones clasificadas como 🔴 ERROR DE COMPILACIÓN.
No alteres ningún elemento clasificado como 🟡 PROBLEMA FUNCIONAL O DE CALIDAD.
Si falta un archivo referenciado, créalo con la implementación mínima necesaria para compilar.
Tipo B — Configuración / documentación
Extrae el contenido tal cual, sin modificaciones salvo errores evidentes de sintaxis
(ej: YAML mal indentado).
Tipo C — Excel (.xlsx)
Si viene con contenido real, genera el archivo respetando ese contenido.
Si viene con descripción en lenguaje natural, genera un archivo Excel funcional con:

Fila de encabezados en negrita con color de fondo distintivo
Columnas con ancho ajustado al contenido
Tipos de dato correctos por columna
Validaciones si la descripción lo indica
Hojas nombradas descriptivamente si hay más de una
Filas de ejemplo si no hay datos reales

Tipo D — Word (.docx)
Si viene con contenido real, genera el archivo respetando ese contenido.
Si viene con descripción en lenguaje natural, genera un documento Word funcional con:

Estilos de título (Título 1, Título 2) para jerarquía de secciones
Fuente legible (Calibri o equivalente), tamaño 11-12pt para cuerpo
Márgenes estándar
Tabla de contenido si tiene múltiples secciones
Tablas con encabezados en negrita si aplica

Tipo E — Otro
Genera el archivo con el contenido o estructura más apropiada según la descripción.
PASO 5 — Exportación en ZIP
Empaqueta todos los archivos en un único archivo ZIP descargable respetando exactamente
la estructura de rutas indicada por los marcadores.
El ZIP debe incluir:

Archivos de código con únicamente los errores de compilación corregidos
Archivos de configuración y documentación sin cambios
Archivos nuevos creados para resolver dependencias de compilación faltantes
Archivos Excel y Word generados desde descripción

IMPORTANTE: El ZIP debe estar listo para descargar al finalizar. No preguntes si el usuario
quiere generarlo. Simplemente genera el archivo y proporciona el enlace de descarga; No debes desplegar en el chat el resumen de lo que arreglaste al Zip, solo entregalo.

REGLAS IMPORTANTES

No omitas ningún archivo aunque no tenga errores ni modificaciones
Respeta los nombres y rutas exactas indicadas por los marcadores
Si un archivo no tiene marcador claro, infiere el nombre desde su contenido
Si la cadena contiene solo documentación, placeholders o binarios fake, NO la reproduzcas:
aplicá PASO 0 (materializar el proyecto del briefing). Reproducir la carcasa es un fallo.
No agregues texto después del enlace de descarga del ZIP
No preguntes si el usuario quiere el ZIP: simplemente generalo siempre
Si detectas que falta un archivo de configuración necesario para compilar
(pom.xml, package.json, requirements.txt, build.gradle, etc.), créalo e inclúyelo
inferiendo su contenido desde los imports y frameworks detectados en el código
Nunca corrijas problemas 🟡 aunque parezcan obvios o fáciles de mejorar.
El participante que recibirá este proyecto los debe encontrar y resolver él mismo.


INPUT
Aquí está la cadena con los archivos:

// === ARCHIVO: pom.xml ===
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>3.5.6</version>
        <relativePath/>
    </parent>

    <groupId>com.bank.system</groupId>
    <artifactId>bank-account-system</artifactId>
    <version>0.0.1-SNAPSHOT</version>
    <name>bank-account-system</name>
    <description>Sistema de gestión de cuentas bancarias aplicando patrones GRASP</description>

    <properties>
        <java.version>21</java.version>
    </properties>

    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-data-jpa</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-validation</artifactId>
        </dependency>
        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
            <version>1.18.30</version>
            <scope>compile</scope>
        </dependency>
        <dependency>
            <groupId>com.h2database</groupId>
            <artifactId>h2</artifactId>
            <version>2.2.224</version>
            <scope>runtime</scope>
        </dependency>
        <dependency>
            <groupId>org.springdoc</groupId>
            <artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
            <version>2.5.0</version>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
        </dependency>
    </dependencies>

    <build>
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
            </plugin>
        </plugins>
    </build>

</project>

// === ARCHIVO: src/main/java/com/bank/system/Application.java ===
package com.bank.system;


import com.bank.system.domain.model.Account;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.time.Clock;

@SpringBootApplication
public class Application {
    
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    
    @Bean
    public Clock clock() {
        return Clock.systemUTC();
    }
    
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
                        .allowedOrigins("*")
                        .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
                        .allowedHeaders("*");
            }
        };
    }
    
    // Configuración adicional para asegurar que el contexto de Spring
    // se inicializa correctamente con todas las dependencias necesarias
    @Bean
    public String applicationInfo() {
        System.out.println("Inicializando sistema de gestión de cuentas bancarias");
        System.out.println("Aplicando patrones GRASP: Experto en Información, Creador y Controlador");
        return "Bank Account System Initialized";
    }
}

// === ARCHIVO: src/main/resources/application.yml ===
spring:
  application:
    name: bank-account-system
  
  datasource:
    url: jdbc:h2:mem:bankdb
    driverClassName: org.h2.Driver
    username: sa
    password: password
  
  h2:
    console:
      enabled: true
      path: /h2-console
      settings:
        web-allow-others: true
  
  jpa:
    database-platform: org.hibernate.dialect.H2Dialect
    hibernate:
      ddl-auto: update
    show-sql: true
    properties:
      hibernate:
        format_sql: true

server:
  port: 8080
  servlet:
    context-path: /api

springdoc:
  api-docs:
    path: /v3/api-docs
  swagger-ui:
    path: /swagger-ui.html
    operationsSorter: method
    tagsSorter: alpha
    doc-expansion: none

logging:
  level:
    root: INFO
    com.bank.system: DEBUG
    org.hibernate.SQL: DEBUG
    org.hibernate.type.descriptor.sql.BasicBinder: TRACE

// === ARCHIVO: src/main/java/com/bank/system/domain/model/Account.java ===
package com.bank.system.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account {
    private UUID id;
    private String accountNumber;
    private String customerId;
    private BigDecimal balance;
    private AccountStatus status;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public enum AccountStatus {
        ACTIVE, 
        INACTIVE,
        CLOSED
    }

    public Account(String accountNumber, String customerId, BigDecimal initialBalance) {
        this.id = UUID.randomUUID();
        this.accountNumber = accountNumber;
        this.customerId = customerId;
        this.balance = initialBalance;
        this.status = AccountStatus.ACTIVE;
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }

    public void deposit(BigDecimal amount) {
        if (amount.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive");
        }
        this.balance = this.balance.add(amount);
        this.updatedAt = LocalDateTime.now();
    }

    public void withdraw(BigDecimal amount) {
        if (amount.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive");
        }
        if (this.balance.compareTo(amount) < 0) {
            throw new IllegalStateException("Insufficient funds");
        }
        this.balance = this.balance.subtract(amount);
        this.updatedAt = LocalDateTime.now();
    }

    public void close() {
        if (this.status == AccountStatus.CLOSED) {
            throw new IllegalStateException("Account is already closed");
        }
        this.status = AccountStatus.CLOSED;
        this.updatedAt = LocalDateTime.now();
    }
}

// === ARCHIVO: src/main/java/com/bank/system/domain/port/AccountRepository.java ===
package com.bank.system.domain.port;

import com.bank.system.domain.model.Account;
import java.util.Optional;
import java.util.UUID;

public interface AccountRepository {
    Account save(Account account);
    Optional<Account> findById(UUID id);
    Optional<Account> findByAccountNumber(String accountNumber);
    void deleteById(UUID id);
}

// === ARCHIVO: src/main/java/com/bank/system/domain/service/AccountService.java ===
package com.bank.system.domain.service;

import com.bank.system.domain.model.Account;
import com.bank.system.domain.port.AccountRepository;
import lombok.RequiredArgsConstructor;
import java.math.BigDecimal;
import java.util.UUID;

@RequiredArgsConstructor
public class AccountService {
    private final AccountRepository accountRepository;

    public Account createAccount(String accountNumber, String customerId, BigDecimal initialBalance) {
        if (accountNumber == null || accountNumber.trim().isEmpty()) {
            throw new IllegalArgumentException("Account number cannot be empty");
        }
        if (customerId == null || customerId.trim().isEmpty()) {
            throw new IllegalArgumentException("Customer ID cannot be empty");
        }
        if (initialBalance == null || initialBalance.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("Initial balance must be positive");
        }

        return accountRepository.save(new Account(accountNumber, customerId, initialBalance));
    }

    public Account getAccount(UUID id) {
        return accountRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Account not found"));
    }

    public Account getAccountByNumber(String accountNumber) {
        return accountRepository.findByAccountNumber(accountNumber)
                .orElseThrow(() -> new IllegalArgumentException("Account not found"));
    }

    public Account deposit(UUID id, BigDecimal amount) {
        Account account = getAccount(id);
        account.deposit(amount);
        return accountRepository.save(account);
    }

    public Account withdraw(UUID id, BigDecimal amount) {
        Account account = getAccount(id);
        account.withdraw(amount);
        return accountRepository.save(account);
    }

    public void closeAccount(UUID id) {
        Account account = getAccount(id);
        account.close();
        accountRepository.save(account);
    }
}

// === ARCHIVO: src/main/java/com/bank/system/infrastructure/repository/JpaAccountRepository.java ===
package com.bank.system.infrastructure.repository;

import com.bank.system.domain.model.Account;
import com.bank.system.domain.port.AccountRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import java.util.Optional;
import java.util.UUID;

@Repository
public class JpaAccountRepository implements AccountRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public Account save(Account account) {
        entityManager.persist(account);
        return account;
    }

    @Override
    public Optional<Account> findById(UUID id) {
        return Optional.ofNullable(entityManager.find(Account.class, id));
    }

    @Override
    public Optional<Account> findByAccountNumber(String accountNumber) {
        var query = entityManager.createQuery("SELECT a FROM Account a WHERE a.accountNumber = :accountNumber", Account.class);
        query.setParameter("accountNumber", accountNumber);
        return query.getResultList().stream().findFirst();
    }

    @Override
    @Transactional
    public void deleteById(UUID id) {
        var account = findById(id).orElseThrow(() -> new RuntimeException("Account not found"));
        entityManager.remove(account);
    }
}

// === ARCHIVO: src/main/java/com/bank/system/infrastructure/dto/AccountRequest.java ===
package com.bank.system.infrastructure.dto;

import com.bank.system.domain.model.AccountStatus;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import java.math.BigDecimal;

public record AccountRequest(
    @NotNull String accountNumber,
    @NotNull String customerId,
    @Positive BigDecimal initialBalance,
    AccountStatus status
) {
}

// === ARCHIVO: src/main/java/com/bank/system/infrastructure/dto/AccountResponse.java ===
package com.bank.system.infrastructure.dto;

import com.bank.system.domain.model.Account;
import com.bank.system.domain.model.AccountStatus;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

public record AccountResponse(
    UUID id,
    String accountNumber,
    String customerId,
    BigDecimal balance,
    @Enumerated(EnumType.STRING) AccountStatus status,
    LocalDateTime createdAt,
    LocalDateTime updatedAt
) {
    public AccountResponse(Account account) {
        this(
            account.getId(),
            account.getAccountNumber(),
            account.getCustomerId(),
            account.getBalance(),
            account.getStatus(),
            account.getCreatedAt(),
            account.getUpdatedAt()
        );
    }
}

// === ARCHIVO: src/main/java/com/bank/system/application/AccountCreator.java ===
package com.bank.system.application;


import com.bank.system.infrastructure.exception.AccountCreationException;
import com.bank.system.domain.model.Account;
import com.bank.system.domain.port.AccountRepository;
import com.bank.system.domain.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.UUID;

@Service
public class AccountCreator {
    private final AccountService accountService;
    private final AccountRepository accountRepository;

    @Autowired
    public AccountCreator(AccountService accountService, AccountRepository accountRepository) {
        this.accountService = accountService;
        this.accountRepository = accountRepository;
    }

    public Account createAccount(String accountNumber, String customerId, BigDecimal initialBalance) {
        if (accountRepository.findByAccountNumber(accountNumber).isPresent()) {
            throw new AccountCreationException("Account with number " + accountNumber + " already exists");
        }
        return accountService.createAccount(accountNumber, customerId, initialBalance);
    }
}

// === ARCHIVO: src/main/java/com/bank/system/infrastructure/controller/AccountController.java ===
package com.bank.system.infrastructure.controller;

import com.bank.system.application.AccountCreator;
import com.bank.system.domain.model.Account;
import com.bank.system.infrastructure.dto.AccountRequest;
import com.bank.system.infrastructure.dto.AccountResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.UUID;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {
    private final AccountCreator accountCreator;

    @Autowired
    public AccountController(AccountCreator accountCreator) {
        this.accountCreator = accountCreator;
    }

    @PostMapping
    public ResponseEntity<AccountResponse> createAccount(@RequestBody AccountRequest accountRequest) {
        Account account = accountCreator.createAccount(accountRequest.getAccountNumber(), accountRequest.getCustomerId(), accountRequest.getInitialBalance());
        return new ResponseEntity<>(new AccountResponse(account.getId(), account.getAccountNumber(), account.getCustomerId(), account.getBalance()), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<AccountResponse> getAccountById(@PathVariable UUID id) {
        return new ResponseEntity<>(new AccountResponse(), HttpStatus.OK);
    }
}

// === ARCHIVO: src/main/java/com/bank/system/infrastructure/exception/GlobalExceptionHandler.java ===
package com.bank.system.infrastructure.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(AccountCreationException.class)
    public ResponseEntity<ErrorResponse> handleAccountCreationException(AccountCreationException ex) {
        ErrorResponse errorResponse = new ErrorResponse(HttpStatus.CONFLICT.value(), ex.getMessage());
        return new ResponseEntity<>(errorResponse, HttpStatus.CONFLICT);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResponse> handleGenericException(Exception ex) {
        ErrorResponse errorResponse = new ErrorResponse(HttpStatus.INTERNAL_SERVER_ERROR.value(), "An unexpected error occurred");
        return new ResponseEntity<>(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}

// === ARCHIVO: src/main/java/com/bank/system/infrastructure/exception/AccountNotFoundException.java ===
package com.bank.system.infrastructure.exception;


import com.bank.system.domain.model.Account;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class AccountNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 1L;
    private final UUID accountId;
    private final String accountNumber;

    public AccountNotFoundException(UUID accountId, String accountNumber) {
        super("Account not found for ID: " + accountId + " and account number: " + accountNumber);
        this.accountId = accountId;
        this.accountNumber = accountNumber;
    }

    public UUID getAccountId() {
        return accountId;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}

// === ARCHIVO: src/main/java/com/bank/system/infrastructure/exception/AccountCreationException.java ===
package com.bank.system.infrastructure.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class AccountCreationException extends RuntimeException {
    private static final long serialVersionUID = 1L;
    private final String accountNumber;
    private final String customerId;
    private final BigDecimal initialBalance;

    public AccountCreationException(String accountNumber, String customerId, BigDecimal initialBalance) {
        super("Failed to create account with number: " + accountNumber + ", customer ID: " + customerId + ", and initial balance: " + initialBalance);
        this.accountNumber = accountNumber;
        this.customerId = customerId;
        this.initialBalance = initialBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getCustomerId() {
        return customerId;
    }

    public BigDecimal getInitialBalance() {
        return initialBalance;
    }
}

// === ARCHIVO: src/test/java/com/bank/system/domain/service/AccountServiceTest.java ===
package com.bank.system.domain.service;


import com.bank.system.domain.model.AccountStatus;
import com.bank.system.domain.model.Account;
import com.bank.system.domain.port.AccountRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import java.math.BigDecimal;
import java.util.Optional;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

class AccountServiceTest {

    @Mock
    private AccountRepository accountRepository;

    @InjectMocks
    private AccountService accountService;

    private Account account;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        account = new Account("1234567890", "customer-1", BigDecimal.ZERO);
    }

    @Test
    void testCreateAccount() {
        UUID id = UUID.randomUUID();
        when(accountRepository.save(account)).thenReturn(account);
        accountService.createAccount("1234567890", "customer-1", BigDecimal.ZERO);
        when(accountRepository.findById(id)).thenReturn(Optional.of(account));
        assertEquals(account, accountService.getAccount(id));
    }

    @Test
    void testGetAccount() {
        UUID id = UUID.randomUUID();
        when(accountRepository.findById(id)).thenReturn(Optional.of(account));
        assertEquals(account, accountService.getAccount(id));
    }

    @Test
    void testDeposit() {
        UUID id = UUID.randomUUID();
        when(accountRepository.findById(id)).thenReturn(Optional.of(account));
        accountService.deposit(id, BigDecimal.TEN);
        assertEquals(BigDecimal.TEN, account.getBalance());
    }

    @Test
    void testWithdraw() {
        UUID id = UUID.randomUUID();
        when(accountRepository.findById(id)).thenReturn(Optional.of(account));
        accountService.deposit(id, BigDecimal.TEN);
        accountService.withdraw(id, BigDecimal.ONE);
        assertEquals(BigDecimal.valueOf(9), account.getBalance());
    }

    @Test
    void testCloseAccount() {
        UUID id = UUID.randomUUID();
        when(accountRepository.findById(id)).thenReturn(Optional.of(account));
        accountService.closeAccount(id);
        assertEquals(Account.AccountStatus.CLOSED, account.getStatus());
    }
}

// === ARCHIVO: src/test/java/com/bank/system/application/AccountCreatorTest.java ===
package com.bank.system.application;

import com.bank.system.domain.model.Account;
import com.bank.system.domain.service.AccountService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import java.math.BigDecimal;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

class AccountCreatorTest {

    @Mock
    private AccountService accountService;

    @InjectMocks
    private AccountCreator accountCreator;

    private Account account;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        account = new Account("1234567890", "customer-1", BigDecimal.ZERO);
    }

    @Test
    void testCreateAccount() {
        UUID id = UUID.randomUUID();
        when(accountService.createAccount("1234567890", "customer-1", BigDecimal.ZERO)).thenReturn(account);
        assertEquals(account, accountCreator.createAccount("1234567890", "customer-1", BigDecimal.ZERO));
    }
}

// === ARCHIVO: src/test/java/com/bank/system/infrastructure/controller/AccountControllerTest.java ===
package com.bank.system.infrastructure.controller;

import com.bank.system.application.AccountCreator;
import com.bank.system.domain.model.Account;
import com.bank.system.infrastructure.dto.AccountRequest;
import com.bank.system.infrastructure.dto.AccountResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import java.math.BigDecimal;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

class AccountControllerTest {

    @Mock
    private AccountCreator accountCreator;

    @InjectMocks
    private AccountController accountController;

    private Account account;
    private AccountRequest accountRequest;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        account = new Account("1234567890", "customer-1", BigDecimal.ZERO);
        accountRequest = new AccountRequest("1234567890", "customer-1", BigDecimal.ZERO);
    }

    @Test
    void testCreateAccount() {
        when(accountCreator.createAccount("1234567890", "customer-1", BigDecimal.ZERO)).thenReturn(account);
        ResponseEntity<AccountResponse> response = accountController.createAccount(accountRequest);
        assertEquals(HttpStatus.CREATED, response.getStatusCode());
        assertEquals(new AccountResponse(account), response.getBody());
    }
}
```
