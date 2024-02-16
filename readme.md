## Descripción

Desarrollo de diagrama de clases UML para 6 ejemplos en concreto los cuales  se detallan más adelante 

## Fraccionario
La clase Fraccionario: debemos poder almacenar el numerador y el denominador del
Fraccionario.
- Cuenta con los metodos necesarios para obtener el númerador, Denominador, cambiar los  valores de estos y mostrar los resultados en pantalla.

## Reloj
Un Reloj es una clase que almacena la hora, los minutos y los segundos.
- Los metodos  setHoras(), setMinutos() y setSegundos() permiten asignar los valores a las horas, minutos y segundos respectivamente. Muestra en pantalla  los resultados.
- Aún se pueden mejorar aspectos como agregar un cero antes de cada minuto o segundo que sea menor a 10 para obtener un formato limpio como por ejemplo "10:05:03" y controlar que la variable Horas solo reciba enteros de 1 hasta 24, pero como se trata de un ejercicio simple de clases no se profundizara  en este tema por ahora.

## Fecha
La clase Fecha permite almacenar año, mes y día.
- Se crearon los  metodos necesarios para obtener y cambiar dia, mes y año, el atributo "año" en la  clase se maneja como "anio" ya que no se puede hacer uso de la Ñ.
- al igual que en la clase Reloj se pueden mejorar aspectos como agregar un cero antes de cada digito menor a 10.

## Proyectil
Un proyectil es una clase que permite trabajar la velocidad a la que es disparado el elemento, así como el ángulo con el que sale disparado.

- En los metodos simplemente se trabaja con la salida de un texto que indica la veloicidad y angulo del disparo.
- tambien cuenta con los metodos getters y setters respectivos 

## Tienda
Una tienda (de la que guardamos el nombre, la dirección y el teléfono) ofrece 4 productos. De cada uno de estos productos queremos almacenar un código numérico, el nombre, el tipo del producto (que puede ser LACTEO, CÁRNICO, FRUTA o ENLATADO), la fecha de expiración, el nombre del fabricante, la cantidad en inventario y el precio unitario.
- Para este ejemplo se creó la  clase Tienda, la clase Producto y la clase TipoProducto.
- La relación entre la clase Tienda y la clase Producto es una asociación. La clase Tienda tiene una relación de composición con la clase Producto, lo que significa que la existencia de un objeto de tipo Producto depende de la existencia de un objeto de tipo Tienda, esto se debe a que los "Productos" están "contenidos" dentro de una "Tienda" y son ofrecidos por esa tienda
- La relación entre la clase Producto y la enumeración TipoProducto es una relación de dependencia. La clase Producto depende de la enumeración TipoProducto para definir el tipo de producto que es. Esto se muestra mediante el atributo tipo en la clase Producto, que utiliza la enumeración TipoProducto para especificar el tipo de producto.
- Entre la clase Tienda y la enumeración TipoProducto no hay relación directa, ya que el tipo de producto está asociado directamente con cada instancia de la clase Producto.

## Universidad
Una Universidad (de la que nos interesa su nombre, nombre del rector y nombre de la ciudad donde funciona) guarda información de sus facultades. Una facultad tiene un nombre y un código numérico. Un profesor es una persona de la que tenemos que guardar también la profesión, la nacionalidad, y el sueldo. Un profesor pertenece a una sola facultad, pero una facultad tiene muchos profesores. Hay también carreras, y de una carrera necesitamos guardar el nombre, el número de créditos totales, el número de semestres que dura la carrera y el nivel de la carrera (PREGRADO o POSTGRADO). Una carrera pertenece a una sola facultad, pero una facultad tiene cero o más carreras. Los estudiantes son personas de las que tenemos que almacenar la siguiente información adicional: el colegio del cual se graduó del bachillerato y la fecha en que ingresó a la universidad. Un estudiante pertenece a 1 o más carreras, y claro, una carrera posee muchos estudiantes. Hay que guardar información de los cursos, y de cada curso hay que almacenar el código (un número), el nombre del curso, el número de créditos, el número del salón donde se imparte y el nombre del edificio donde se dicta. Un curso tiene 1 o más profesores que lo dictan, y un profesor puede dictar muchos cursos también. En un curso pueden estar inscritos muchos estudiantes y un estudiante puede estar inscrito en muchos cursos. Los cursos pertenecen a una sola carrera, y la carrera tiene muchos cursos. Una persona tiene cédula, nombre, fecha de nacimiento y lugar de nacimiento (ciudad, departamento, país).

- Universidad → Facultad: La relación entre la clase Universidad y la clase Facultad: La clase Universidad contiene una lista de facultades.

- Facultad → Profesor: La relación entre la clase Facultad y la clase Profesor es  bidireccional (1 a varios). Una facultad puede tener muchos profesores y un profesor pertenece a una sola facultad.

- Facultad → Carrera: La relación entre la clase Facultad y la clase Carrera es  bidireccional (1 a varios). Una facultad puede ofrecer varias carreras, mientras que una carrera pertenece a una sola facultad.

- Profesor → Curso: La relación entre la clase Profesor y la clase Curso es bidireccional (muchos a muchos). Un profesor puede dictar varios cursos y un curso puede ser dictado por varios profesores.

- Carrera → Curso: La relación entre la clase Carrera y la clase Curso es una asociación. Una carrera puede tener varios cursos, mientras que un curso pertenece a una sola carrera.

- Carrera - Estudiante: La relación entre la clase Carrera y la clase Estudiante es  bidireccional (muchos a muchos). Un estudiante puede estar inscrito en una o varias carreras, y una carrera puede tener varios estudiantes.

- Estudiante → Curso: La relación entre la clase Estudiante y la clase Curso es una asociación de muchos a muchos. Un estudiante puede estar inscrito en varios cursos y un curso puede tener varios estudiantes inscritos.

- Persona → Lugar: La relación entre la clase Persona y la clase Lugar es una asociación. Una persona tiene un lugar de nacimiento representado por la clase Lugar.

- Carrera → Persona: La relación entre la clase Carrera y la clase Persona es una asociación indirecta a través de la clase Estudiante. Esto se refleja en el hecho de que un estudiante pertenece a una carrera.