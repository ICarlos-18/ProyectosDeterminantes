El determinante de una matriz cuadrada es una cantidad escalar asociada a la matriz. Para una matriz 3x3, 
el determinante se puede calcular utilizando la regla de Sarrus, que se expresa como:

det(A) = aei + bfg + cdh - ceg - bdi - afh

donde A es la matriz:

   | a  b  c |
   | d  e  f |
   | g  h  i |

El resultado det(A) es un número que proporciona información sobre las propiedades lineales y geométricas de la matriz.
Si det(A) es distinto de cero, la matriz es invertible (no singular), y si det(A) es igual a cero, la matriz es singular
y no tiene inversa.

calcularDeterminante realiza la suma de los productos de los elementos de la primera fila con sus cofactores respectivos, alternando los signos.
cofactor se utiliza para calcular los cofactores de cada elemento, creando submatrices y calculando sus determinantes recursivamente hasta llegar a matrices de tamaño

.............................................................................................................................................

.............................................................................................................................................

Este código en Java implementa una calculadora de determinantes para matrices cuadradas. Aquí tienes una explicación detallada:

Entrada de Datos:

El programa comienza importando la clase Scanner para la entrada de datos.
Solicita al usuario que ingrese el tamaño de la matriz cuadrada (por ejemplo, 3 para una matriz 
3×3).
Luego, se crea una matriz con el tamaño ingresado por el usuario y se le pide al usuario que ingrese los elementos de la matriz.
Cálculo del Determinante:

Después de ingresar la matriz, se calcula el determinante llamando a la función calcularDeterminante y se muestra el resultado.
Función calcularDeterminante:

Esta función toma una matriz como entrada y calcula su determinante.
Si la matriz es de tamaño 1 (un escalar), el determinante es simplemente el valor de ese elemento.
Si la matriz es de tamaño mayor que 1, se utiliza la expansión por cofactores para calcular el determinante. Para cada elemento de la primera fila, se suma el producto de ese elemento, el cofactor correspondiente y el factor de alternancia 
((−1)columna)(−1) columna.
El cofactor se calcula llamando a la función cofactor, que a su vez utiliza la función submatriz para obtener la submatriz excluyendo la fila y columna del elemento actual.
Funciones submatriz y cofactor:

La función submatriz toma una matriz y dos índices (fila y columna) y devuelve la submatriz excluyendo la fila y columna correspondientes.
La función cofactor utiliza la función submatriz para calcular el determinante de la submatriz correspondiente.
Cierre del Scanner:

Finalmente, se cierra el objeto Scanner para liberar recursos.
En resumen, este programa permite al usuario ingresar una matriz cuadrada de cualquier tamaño y calcula su determinante utilizando la expansión por cofactores. Las funciones están modularizadas para facilitar la comprensión y el mantenimiento del código.