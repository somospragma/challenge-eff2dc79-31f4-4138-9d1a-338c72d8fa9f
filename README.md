# Aplicación de Patrones GRASP en un Sistema de Gestión de Cuentas Bancarias

Diseña y desarrolla un sistema de gestión de cuentas bancarias que aplique al menos dos patrones GRASP. El sistema debe manejar operaciones de apertura, cierre y consulta de cuentas. Los actores involucrados son el cliente, el gestor de cuentas y el sistema de auditoría. El sistema debe garantizar la consistencia de los datos y manejar errores de manera idempotente. La latencia máxima permitida para las operaciones es de 200ms.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | Aplicación de Patrones GRASP en el Desarrollo de Sistemas |
| **Nivel** | junior-l1 |
| **Tipo** | practical |
| **Tiempo estimado** | 8 horas |

## Fases del Reto

### Fase 0: Configuración del Proyecto

**Objetivo:** Obtener el proyecto base funcional enviando el Código Base a un asistente de IA, que lo analizará, corregirá errores y generará un ZIP listo para usar.

**Tiempo estimado:** 15-30 minutos

**Instrucciones:**

- Asegúrate de tener instalado para ejecutar el proyecto: JDK 17+, Maven 3.9+, IDE con soporte Java.
- Copia todo el contenido del campo **Código Base** de este reto — incluyendo el texto de instrucciones que aparece al inicio.
- Abre un asistente de IA (Claude en claude.ai, ChatGPT o Gemini — se recomienda Claude), pega el contenido copiado en el chat y envíalo.
- El asistente analizará los archivos, corregirá errores y generará un archivo ZIP descargable. Descárgalo y extráelo en la carpeta donde quieras trabajar.
- Ejecuta `mvn compile` en la raíz. Si no hay errores, estás listo.

**Entregable:** El proyecto compila/arranca sin errores.

<details>
<summary>Pistas de conocimiento</summary>

- Copia el Código Base completo incluyendo el texto de instrucciones al inicio — esas instrucciones le indican al asistente exactamente qué hacer con los archivos.
- Si el asistente no genera el ZIP automáticamente al terminar el análisis, escríbele: "genera el ZIP ahora".
- Si el proyecto tiene errores al arrancar, comparte el mensaje de error con el mismo asistente para que lo corrija.

</details>

### Fase 1: Definición de Responsabilidades

**Objetivo:** Identificar y asignar responsabilidades a los componentes del sistema utilizando el patrón Experto en Información.

**Tiempo estimado:** 2 horas

**Instrucciones:**

- Identifica los componentes del sistema y asigna responsabilidades según el patrón Experto en Información.
- Define las operaciones que cada componente debe realizar.
- Especifica los criterios de aceptación para esta fase.

**Entregable:** Diagrama de componentes con responsabilidades asignadas.

<details>
<summary>Pistas de conocimiento</summary>

- Recuerda que el patrón Experto en Información sugiere que la responsabilidad de manipular una información debe estar encapsulada en el objeto que contiene esa información.

</details>

### Fase 2: Implementación del Patrón Creador

**Objetivo:** Implementar el patrón Creador para manejar la creación de nuevas cuentas.

**Tiempo estimado:** 3 horas

**Instrucciones:**

- Implementa el patrón Creador para la creación de nuevas cuentas.
- Define los criterios de aceptación para esta fase.
- Asegura que el patrón Creador se aplica correctamente y que las cuentas se crean de manera idempotente.

**Entregable:** Código que implementa el patrón Creador para la creación de cuentas.

<details>
<summary>Pistas de conocimiento</summary>

- El patrón Creador sugiere que la responsabilidad de crear un objeto debería estar en una clase separada que se encarga exclusivamente de esa tarea.

</details>

### Fase 3: Aplicación del Patrón Controlador

**Objetivo:** Aplicar el patrón Controlador para manejar las solicitudes de los clientes.

**Tiempo estimado:** 3 horas

**Instrucciones:**

- Aplica el patrón Controlador para manejar las solicitudes de los clientes.
- Define los criterios de aceptación para esta fase.
- Asegura que el patrón Controlador se aplica correctamente y que las solicitudes se manejan de manera eficiente.

**Entregable:** Código que aplica el patrón Controlador para manejar las solicitudes de los clientes.

<details>
<summary>Pistas de conocimiento</summary>

- El patrón Controlador sugiere que la responsabilidad de manejar las solicitudes de los clientes debería estar en una clase separada que se encarga exclusivamente de esa tarea.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué es el patrón Experto en Información y cómo se aplica en esta fase?
- **paraQueSirve**: ¿Para qué sirve el patrón Creador en el contexto de este reto?
- **comoSeUsa**: ¿Cómo se usa el patrón Controlador para manejar las solicitudes de los clientes?
- **erroresComunes**: ¿Cuáles son los errores comunes al implementar los patrones GRASP?
- **queDecisionesImplica**: ¿Qué decisiones implica la aplicación del patrón Controlador en este sistema?

## Criterios de Evaluacion

- Implementación correcta del patrón Experto en Información.
- Aplicación efectiva del patrón Creador para la creación de cuentas.
- Uso adecuado del patrón Controlador para manejar las solicitudes de los clientes.
- Manejo idempotente de las operaciones.
- Eficiencia en el manejo de las solicitudes de los clientes.

## Como trabajar con un asistente de IA

Hay dos caminos, elegi uno:

- **AGENTS.md** (recomendado) — instrucciones nativas del repo. Abri esta carpeta con tu agente local (Claude Code, Cursor, Codex, Copilot, Gemini) y las carga solo. Sabe que archivos faltan y con que comando se verifica, y completa el scaffold escribiendo en disco.
- **PROMPT_MEJORA.md** — para copiar y pegar en un chat (claude.ai, ChatGPT). Devuelve un ZIP con el proyecto. Sirve si no tenes un agente en el IDE.

Ninguno de los dos resuelve las fases del reto: eso es tu trabajo.

## Verificacion

El proyecto esta listo para trabajar cuando este comando corre sin errores:

```bash
mvn clean compile
```

---

*Reto generado automaticamente por Challenge Generator - Pragma*
