# Conversor de Monedas 💱

Este proyecto consiste en una aplicación desarrollada en **Java** que permite convertir cantidades entre diferentes monedas utilizando una **API externa de tipo de cambio en tiempo real**.

## 📌 Descripción

El conversor realiza el consumo de una API REST que proporciona las tasas de cambio actualizadas. A partir de estos datos, el programa permite al usuario ingresar una **moneda base**, una **moneda destino** y una **cantidad**, y devuelve el monto convertido.

### 🔧 Características principales:

* Uso de clases como `HttpURLConnection` para realizar peticiones HTTP.
* Manipulación de datos JSON para obtener las tasas de conversión.
* Conversión precisa entre múltiples tipos de moneda.

## 🚀 Ejemplo de uso:

1. El usuario ingresa la **moneda base** (por ejemplo: `USD`).
2. Ingresa la **moneda a convertir** (por ejemplo: `MXN`).
3. Ingresa la **cantidad a convertir**.
4. El sistema muestra el resultado en la moneda deseada.

