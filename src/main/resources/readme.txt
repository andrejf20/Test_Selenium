Ejecución E2E proceso de compra

- El proyecto se ejecutará en el navegador Chrome
- Utilizamos Selenium WebDriver con Java
- Ingesamos los valores requeridos para el inicio de sesión
- Obtenemos un tiempo mínimo de espera de carga
- Obtenemos dinámicamente a través de un arreglo los productos a agregar en el carro de compras
- Guardamos en una lista los productos existentes en la página
- Ejecutamos un ciclo (for) para recorrer el total de los productos existentes en la página hasta 
- Obtenemos el valor de cada iteración a través del indice "i"
- Convertimos nuestro arreglo en una lista para así realizar la comparación de lo obtenido de las iteraciones
- En un condicional preguntamos si lo obtenido en la iteración se encuentra el item descrito en nuestro arreglo 
- De ser así clickeamos el botón agregar al carro, de lo contrario continua el ciclo
- Ejecutamos un "break" dentro de otro condicional para detener el ciclo una vez completados todos los items del arreglo
-Luego visualizamos el carro de compras y llenamos el formulario de checkout
-Al finalizar compramos el texto de éxito obtenido con lo esperado a través de un Assert
