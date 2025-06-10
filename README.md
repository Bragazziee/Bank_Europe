# Bank_Europe - Sistema Bancario en Java

Este proyecto fue desarrollado como parte de una evaluación sumativa de la asignatura **Desarrollo Orientado a Objetos I (PRY2202)**, semana 3. El objetivo fue aplicar los principios de la Programación Orientada a Objetos mediante la creación de una estructura jerárquica de clases, subclases, interfaces y paquetes.

---

## Objetivos del Proyecto

- Aplicar encapsulamiento, herencia y polimorfismo
- Usar clases abstractas e interfaces
- Implementar jerarquía de paquetes y subpaquetes
- Organizar el código siguiendo buenas prácticas en Java
- Simular la gestión de cuentas bancarias y clientes

---

## Estructura del Proyecto

com.bankeurope
├── cuentas
│ ├── CuentaBancaria.java # Clase abstracta base
│ ├── CuentaAhorros.java # Subclase con interés 3%
│ ├── CuentaCorriente.java # Subclase con interés 1%
│ └── CuentaDigital.java # Subclase con interés 1.5%
├── clientes
│ ├── InfoCliente.java # Interfaz funcional
│ └── Cliente.java # Clase que implementa InfoCliente
└── app
└── Main.java # Clase principal con ejecución de prueba

---

## Descripción del Caso

Bank Europe se encuentra en expansión y requiere organizar su sistema de gestión bancaria:

- Cada cliente posee una cuenta única.
- Se pueden consultar saldos y calcular intereses.
- Cada tipo de cuenta aplica un interés diferente.

---

## Cómo Ejecutar el Proyecto

1. Abre el proyecto en **Apache NetBeans**.
2. Asegúrate de tener configurado el **JDK 17 o superior**.
3. Ejecuta la clase `Main.java` desde el paquete `com.bankeurope.app`.
4. Observa en consola la información del cliente y el cálculo de interés según el tipo de cuenta.

---

## Requisitos Evaluados

- ✔ Clase abstracta con encapsulamiento
- ✔ Subclases bien implementadas
- ✔ Método abstracto sobrescrito
- ✔ Interfaz implementada
- ✔ Estructura de paquetes con dominios y subpaquetes
- ✔ Comentarios y organización del código

---

## 👨‍💻 Autor

**Edgar Bragazzi**  
Estudiante PRY2202 - Desarrollo Orientado a Objetos I  
Duoc UC - 2025

---

