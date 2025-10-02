public class HolaMundo {
    public static void main(String[] args) {
        System.out.println("¡Hola, mundo! Estoy aprendiendo Java.");
    }
}


/**
 * 🧾 Historia de Java y sus usos
🔹 Origen e Historia

Java fue creado por James Gosling y su equipo en Sun Microsystems en 1995.

Inicialmente, Java fue diseñado para dispositivos electrónicos, pero luego se adaptó para desarrollo web y empresarial debido a su portabilidad.

En 2010, Oracle Corporation adquirió Sun Microsystems y se convirtió en el propietario de Java.

🔹 Principios de Java

Portabilidad: "Escribe una vez, ejecuta en cualquier lugar" (gracias a la JVM).

Orientado a objetos: Todo se basa en clases y objetos.

Robusto y seguro: Manejo de errores, recolección de basura, y control de acceso.

Multihilo: Soporte para programación concurrente.

Independiente del sistema operativo.

🔹 Usos de Java hoy en día

Aplicaciones empresariales (especialmente con Spring, Hibernate, Jakarta EE).

Desarrollo web backend.

Aplicaciones móviles Android (usando Android SDK).

Software de escritorio (como aplicaciones Swing o JavaFX).

Sistemas embebidos y dispositivos IoT.

Juegos (aunque no es lo más común).

Big Data (herramientas como Hadoop están escritas en Java).

🧱 ¿Qué es la JVM, JRE y JDK?
Componente	Significado	Función
JVM	Java Virtual Machine	Ejecuta programas Java convirtiendo bytecode en instrucciones del sistema operativo. Hace posible que Java sea multiplataforma.
JRE	Java Runtime Environment	Incluye la JVM + bibliotecas de clases estándar para ejecutar programas Java. No se puede compilar código con solo el JRE.
JDK	Java Development Kit	Incluye el JRE + herramientas de desarrollo como javac (compilador), java (ejecutor), javadoc, etc. Necesario para desarrollar en Java.

🔁 Relación entre ellos:

JDK = JRE + herramientas de desarrollo
JRE = JVM + bibliotecas de clases

💻 Instalación del JDK (Java Development Kit)
🔸 Paso 1: Descargar el JDK

Ve al sitio oficial de Oracle o adopta una alternativa libre como Adoptium (Eclipse Temurin)
.

Oracle JDK: https://www.oracle.com/java/technologies/javase-downloads.html

Adoptium (recomendado para muchos desarrolladores): https://adoptium.net/

🔸 Paso 2: Instalar el JDK
🔹 En Windows:

Ejecuta el instalador .exe.

Sigue los pasos del asistente.

Por defecto, se instalará en algo como: C:\Program Files\Java\jdk-XX.

🔹 En macOS:

Descarga el .dmg y ejecútalo.

El JDK se instalará automáticamente.

🔹 En Linux:
sudo apt update
sudo apt install openjdk-17-jdk


(Sustituye 17 por la versión que necesites)

🔸 Paso 3: Configurar las variables de entorno (Windows)

Abre "Configuración avanzada del sistema" → Variables de entorno.

Añade o edita:

JAVA_HOME → Ruta donde está instalado el JDK.

Añade %JAVA_HOME%\bin al PATH.

🔸 Paso 4: Verificar la instalación

Abre una terminal o consola y escribe:

java -version
javac -version


Deberías ver la versión instalada del JDK y del compilador.
 */
