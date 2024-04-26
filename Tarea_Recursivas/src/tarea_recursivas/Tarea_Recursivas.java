package tarea_recursivas;

import java.util.Scanner;


public class Tarea_Recursivas {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("\n-------------------------------------------------------------");
        System.out.print("Ingrese dos numeros para calcular una potencia\nBase: ");
        int base = leer.nextInt();
        System.out.print("Exponente: ");
        int exponente = leer.nextInt();
        System.out.println("\nRECURSIVA 1 POTENCIA:\nBase = " + base + "   Exponente = " + exponente + "\nResultado = " + potencia(base,exponente));
        
        System.out.println("\n-------------------------------------------------------------");
        System.out.print("Ingrese un numero para calcular la sucecion de Fibonacci: ");
        int num = leer.nextInt();
        System.out.println("\nRECURSIVA 2 FIBONACCI:\nNumero = " + num + "\nResultado = " + fib_suc(num));
        
        
        System.out.println("\n-------------------------------------------------------------");
        System.out.print("Ingrese dos numeros para calcular una multiplicacion\nNumero 1: ");
        int num1 = leer.nextInt();
        System.out.print("Numero 2: ");
        int num2 = leer.nextInt();
        System.out.println("\nRECURSIVA 3 MULTIPLICACION:\nFactor 1 = " + num1 + "    Factor 2 = " + num2 + "\nResultado = " + multiplicacion(num1,num2));
        
        
        System.out.println("\n-------------------------------------------------------------");
        System.out.print("Ingrese dos numeros para calcular una division\nNumero 1: ");
        num1 = leer.nextInt();
        System.out.print("Numero 2: ");
        num2 = leer.nextInt();
        System.out.print("\nRECURSIVA 4 DIVISION:\nDividendo = " + num1 + " Divisor = " + num2 + "\nResiduo = ");
        System.out.println("Resultado = " + resdiv(num1,num2));
        
        
        System.out.println("\n-------------------------------------------------------------");
        System.out.println("Para hacerlo rapido el arreglo sera de 4 elementos\nIngreselos a continuacion.");
        int [] arr = new int [4];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Posicion [" + i + "]: ");
            int x = leer.nextInt();
            arr[i] = x;
        }
        System.out.print("Ingrese un indice desde el cual comenzar: ");
        int ind = leer.nextInt();
        System.out.print("\nRECURSIVA 5 LISTADO DE ARREGLO:\nArreglo = ");
        print_arr(arr);
        System.out.print("  Indice = " + ind);
        System.out.println("\nLista de numeros = ");
        listado_array(arr,ind);
        
        
        System.out.println("\n-------------------------------------------------------------");
        System.out.println("El arreglo utilizado es el que lleno y el indice el que ingreso anteriormente.\n(Para hacerlo mas rapido)");
        System.out.print("\nRECURSIVA 6 SUMA DE ARREGLO:\nArreglo = ");
        print_arr(arr);
        System.out.print("  Indice = " + ind + "\nResultado de la suma de elementos = " + suma_array(arr,ind));
        
        
        System.out.println("\n\n-------------------------------------------------------------");
        System.out.println("El arreglo utilizado es el que lleno y el indice el que ingreso anteriormente.\n(Para hacerlo mas rapido");
        System.out.print("\nRECURSIVA 7 NUMERO MAYOR DE ARREGLO:\nArreglo = ");
        print_arr(arr);
        System.out.print("  Indice = " + ind + "\nNumero mayor del arreglo = " + num_mayor_array(arr,ind));
        
        System.out.println("\n\n-------------------------------------------------------------");
        System.out.println("Para hacerlo simple la matriz sera de 3x3 elementos\nIngrese los elementos a continuacion.");
        int [][] mat = new int [3][3];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                System.out.print("Posicion[" + i + "][" + j +"]: ");
                int x = leer.nextInt();
                mat[i][j] = x;
            }
        }
        System.out.print("\nAhora ingrese una fila y columna de la cual empezar.\nFila = ");
        int fila = leer.nextInt();
        System.out.print("Columna = ");
        int columna = leer.nextInt();
        System.out.println("\nRECURSIVA 8 LISTADO DE MATRIZ:\nMATRIZ = ");
        print_mat(mat);
        System.out.println("Fila = " + fila + " Columna = " + columna);
        System.out.println("Lista de numeros = ");
        listado_matriz(mat,fila,columna);
        
        
        System.out.println("\n-------------------------------------------------------------");
        System.out.println("Para hacerlo mas rapido la matriz, la fila y la columna son los mismo datos ya ingresados");
        System.out.println("\nRECURSIVA 9 SUMA DE MATRIZ:\nMATRIZ = ");
        print_mat(mat);
        System.out.println("Fila = " + fila + " Columna = " + columna);
        System.out.print("Resultado = " + suma_matriz(mat,fila,columna));
        
        System.out.println("\n\n-------------------------------------------------------------");
        System.out.println("Para hacerlo mas rapido la matriz, la fila y la columna son los mismo datos ya ingresados");
        System.out.println("\nRECURSIVA 10 SUMA DE NUMEROS PARES EN UNA MATRIZ:\nMATRIZ = ");
        print_mat(mat);
        System.out.println("Fila = " + fila + " Columna = " + columna);
        System.out.print("Resultado = " + suma_matriz_pares(mat,fila,columna));
        System.out.println();
        
    }
    
    /*
    Este metodo sirve para calcular una potencia,
    recibe 2 enteros el primero es la base y el segundo es el exponente
    */
    public static int potencia(int base, int exponente){
        if (exponente == 0) {
            return 1;
        }else{
            return base * potencia(base,exponente - 1);
        }
    }
    /*
    Este metodo sirve para calcular un valor de acuerdo a l sucesión de fibonacci, recibe 1 entero 
    y la recursiva lo reduce hasta que sea 1 o 0, luego suma todos los valores
    he imprime el resultado, por ejemplo: 2 -> (2-1) + (2-2) == 1 + 0 == 1 + 1 == 2;
    */
    public static int fib_suc(int num){
        if (num == 0 || num == 1) {
            return 1;
        }else{
            return fib_suc(num - 1) + fib_suc(num - 2);
        }
    }
    /*
    Este metodo sirve para calcular una multiplicacion,recibe 2 eneteros el primero es 
    el numero a multiplicar y el segundo es el factor.
    */
    public static int multiplicacion(int numero, int factor){
        if (factor == 1) {
            return numero;
        }else{
            return numero + multiplicacion(numero, factor - 1);
        }
    }
    /*
    Este metodo basicamente es una calculadora para dividir, recibe 2 enteros(dividendo, divisor)
    se va reduciendo el divisor con la recurvisa hasta que finalmente es menor al divisor,
    es entonces que retorna el residuo y el cociente.
    */
    public static int resdiv(int dividendo, int divisor){
        if (dividendo < divisor) {
            System.out.println(dividendo);
            return 0;
        }else{
            return 1 + resdiv(dividendo - divisor, divisor);
        }
    }
    /*
    Lista los numeros de un arreglo(lista_nums) a partir 
    de un numero(index), si el numero es 3 y el arreglo tiene 5 elementos
    solo listara los ultimos 2 elementos, sin tomar en cuanta el elemento 1, 2 y 3.
    */
    public static void listado_array(int [] lista_nums, int index){
        if (index == lista_nums.length - 1) {
            System.out.println(lista_nums[index]);
        }else{
            System.out.println(lista_nums[index]);
            listado_array(lista_nums, index + 1);
        }
    }
    /*
    Suma los elemntos de un arreglo(lista_nums) a partir deuna posicion
    (index), si la posicion inicial es 2 y el arreglo tiene 4 elementos, 
    solo sumara los elementos 3 y 4, sin tomar en cuenta el elemento 1 y 2.
    */
    public static int suma_array(int [] lista_nums, int index){
        if (index == lista_nums.length -1) {
            return lista_nums[index];
        }else{
            return lista_nums[index] + suma_array(lista_nums, index + 1);
        }
    }
    /*
    Recorre un arreglo(lista_nums) hasta encontrar el elemento de mayor valor 
    en el arreglo, empezando a partir de una posicion en especifico(index), esto 
    quiere decir que si empieza en la posicion 3 pero en la posicion 1 esta el 
    elemento de mayor valor en el arreglo, este no sera tomado en cuenta y otro 
    elemento sera retornado.
    */
    public static int num_mayor_array(int [] lista_nums, int index){
        int mayor;
        if (index == lista_nums.length -1) {
            return lista_nums[index];
        }else{
            mayor = num_mayor_array(lista_nums, index + 1);
            if (lista_nums[index] > mayor) {
                return lista_nums[index];
            }else{
                return mayor;
            }
        }
    }
    /*
    Recibe una matriz de tamaño indeterminado(matriz), y dos numeros
    (fila y columna), el metodo recorre la matriz empezando en 
    la coordenada(fila, columna)imprimiendo los elementos de la matriz.
    */
    public static void listado_matriz(int matriz[][], int fila, int columna){
        if (fila == matriz.length - 1 && columna == matriz[0].length - 1) {
            System.out.println(matriz[fila][columna] + "   ");
        }else{
            if (columna == matriz[0].length - 1) {
                System.out.println(matriz[fila][columna]);
                listado_matriz(matriz, fila + 1, 0);
            }else{
                System.out.println(matriz[fila][columna] + "   ");
                listado_matriz(matriz, fila, columna + 1);
            }
        }
    }
    /*
    Recibe una matriz de tamaño indeterminado(matriz), y dos numeros
    (fila y columna), el metodo recorre la matriz sumando cada elemento 
    que esta a partir de la coordenada(fila, columna), finalmente retorna
    un entero el cual es la suma de los elementos.
    */
    public static int suma_matriz(int matriz[][], int fila, int columna){
        if (fila == matriz.length - 1 && columna == matriz[0].length - 1) {
            return matriz[fila][columna];
        }else{
            if (columna == matriz[0].length - 1) {
                return matriz[fila][columna] + suma_matriz(matriz, fila + 1, 0);
            }else{
                return matriz[fila][columna] + suma_matriz(matriz, fila, columna + 1);
            }
        }
    }
    /*
    Recibe una matriz de tamaño indeterminado(matriz), y dos numeros
    (fila y columna), el metodo recorre la matriz sumando cada elemento 
    que esta a partir de la coordenada(fila, columna) y que sea PAR, finalmente 
    retorna un entero el cual es la suma de los elementos pares.
    */
    public static int suma_matriz_pares(int matriz[][], int fila, int columna){
        if (fila == matriz.length - 1 && columna == matriz[0].length -1) {
            return matriz[fila][columna] % 2 == 0 ? matriz[fila][columna]:0;
        }else{
            if (columna == matriz[0].length - 1) {
                return (matriz[fila][columna] % 2 == 0 ? matriz[fila][columna] : 0) + suma_matriz_pares(matriz, fila + 1, 0);
            }else{
                return (matriz[fila][columna] % 2 == 0 ? matriz[fila][columna] : 0) + suma_matriz_pares(matriz, fila, columna + 1);
            }
        }
    }
    /*
    Estos dos metodos de abajo los hice solo para mostrar el arreglo y la 
    matriz a la hora de usar los metodos.
    */
    public static void print_arr(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print("[" + arr[i] + "]");
        }
    }
    
    public static void print_mat(int [][] mat){
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print("[" + mat[i][j] + "]");
            }
            System.out.println("");
        }
    }
    
}
