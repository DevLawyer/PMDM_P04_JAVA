# PMDM_P04_JAVA
Fourth practice of PMDM - 2ºDAM

# MIGUEL NOTES

MODELO //////////////////////////////
Empleado (Sueldo, Sueldo Máximo, nºEmpleado)
	-> H1 Analista (Plus Anual %)
	-> H2 Programador (Extra Mensual)

Lanzar excepciones 

Interfaz (Implementar en ambas hijas)
	Usar las constantes de Gregorian Calendar para los cálculos.
	-> Cumple mes (Compara la fecha de alta con la del sistema y devuelte true) Habilita botón subir sueldo y aplica la subida.
	-> Cumple año (Compara la fecha de alta con la del sistema y devuelte true) Habilita botón subir sueldo y aplica la subida.


Clase Excepciones que hereda de exception con excepciones para cuando el sueldo es mayor al máximo.

Variable común que indique cuántos incrementos de sueldo tiene y sume a la fecha de inicio un mes o un año según corresponda.

CONTROLADOR //////////////////////////////
Lista (debe ser genérica sin object)
Nodo
-> Int Índice que es igual al int nºEmpleado.

Fichero
-> Guardar Lista en fichero o cargar de fichero
-> File jfilechooser

VISTA //////////////////////////////
JFrame con menú.
Mostrar 1 -> JList.
Mostrar 2 -> Visualizar como en P03. (<Retroceder, Subir sueldo, Avanzar>)

Tener lista propia y collection.
Ambas tiene que tener el mismo número de empleados precargados + 25000 nuevos
Crear un método para ordenar mi lista que intercambie el número del nodo y el objeto empleado.
Ordenar Lista y collection(con sort).
Sacar tiempo antes y después de ordenar y mostrar el tiempo que tarda cada uno.
Mostrar en consola los tiempos y unos cuantos registros ordenados.