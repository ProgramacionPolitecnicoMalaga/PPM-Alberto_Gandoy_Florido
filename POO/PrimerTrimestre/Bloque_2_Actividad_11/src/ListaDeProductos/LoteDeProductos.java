package ListaDeProductos;

import java.util.Arrays;

public class LoteDeProductos implements SelectorDeMejoresProductos {

    Producto[] productos;
    private final int TAMAÑO_OPCIONES = 1;


    public LoteDeProductos(Producto[] productos){// paso el array, este array está lleno de productos

        this.productos = productos;
    }

    public LoteDeProductos(int tamañoProductos){// creo el array.

        productos = new Producto[tamañoProductos];
    }
    public LoteDeProductos(){// creo el array.

    }

    public Producto[] getProductos() {
        return productos;
    }

    public void setProductos(Producto[] productos) {
        this.productos = productos;
    }

    public int getTotalProductos(){
        return productos.length;
    }

    public Producto getProductoEnPosicion(int i){// i -1 porq la posición 1 es 0
        return productos[i -1];

    }


    public void addProducto(Producto producto){
        if (productos[productos.length] == null) {// esto mira la útima posición para ver si está lleno
            productos = Arrays.copyOf(productos,(productos.length * 2) - 1);//mira las posiciones y si está lleno, hace el doble de huecos.
        }
        for (int i = 0; i < productos.length; i++){
           if (productos[i] == null ){
               productos[i] = producto;
           }
        }

    }


    public void imprimir() {
        for(int i = 0; i < productos.length;i++){
            System.out.println(productos[i].toString());
        }
    }


    public LoteDeProductos mejorValorado(){
        Producto[] LoteMejorOpcion = new Producto[TAMAÑO_OPCIONES];
        LoteMejorOpcion[0] = productos[0]; // esto es para que no se compare con el mismo
        for (int i = 1; i < productos.length; i++){

            if (productos[i].getValoracionProducto() > LoteMejorOpcion[0].getValoracionProducto()){
                if (LoteMejorOpcion.length > 1){// esto ocurre antes había 2 mejores valorados y ahora solo hay 1, por lo que el tamaño vuelve a ser 1.
                    LoteMejorOpcion = new Producto[TAMAÑO_OPCIONES];
                }
                LoteMejorOpcion[0] = productos[i];

            }else if(productos[i].getValoracionProducto() == LoteMejorOpcion[0].getValoracionProducto()){
                LoteMejorOpcion = Arrays.copyOf(LoteMejorOpcion,LoteMejorOpcion.length + 1);//nuevo producto con la misma valoracion, añadimos un nuevo hueco
                LoteMejorOpcion[LoteMejorOpcion.length-1] = productos[i];
            }
        }
        return new LoteDeProductos(LoteMejorOpcion);
    }
    public LoteDeProductos mejorPrecio(){
        Producto[] LoteMejorOpcion = new Producto[TAMAÑO_OPCIONES];
        LoteMejorOpcion[0] = productos[0]; // esto es para que no se compare con el mismo
        for (int i = 1; i < productos.length; i++){

            if (productos[i].getPrecioProducto() > LoteMejorOpcion[0].getPrecioProducto()){
                if (LoteMejorOpcion.length > 1){// esto ocurre antes había 2 mejores valorados y ahora solo hay 1, por lo que el tamaño vuelve a ser 1.
                    LoteMejorOpcion = new Producto[TAMAÑO_OPCIONES];
                }
                LoteMejorOpcion[0] = productos[i];

            }else if(productos[i].getPrecioProducto() == LoteMejorOpcion[0].getPrecioProducto()){
                LoteMejorOpcion = Arrays.copyOf(LoteMejorOpcion,LoteMejorOpcion.length + 1);//nuevo producto con la misma valoracion, añadimos un nuevo hueco
                LoteMejorOpcion[LoteMejorOpcion.length-1] = productos[i];
            }
        }
        return new LoteDeProductos(LoteMejorOpcion);
    }

    public LoteDeProductos mejorRatio(){
        Producto[] LoteMejorOpcion = new Producto[TAMAÑO_OPCIONES];
        LoteMejorOpcion[0] = productos[0]; // esto es para que no se compare con el mismo
        for (int i = 1; i < productos.length; i++){
            int precio = productos[i].getPrecioProducto();
            double valoracion = productos[i].getValoracionProducto();
            int precioMejor = LoteMejorOpcion[0].getPrecioProducto();
            double valoracionMejor = LoteMejorOpcion[0].getValoracionProducto();
            if (valoracion/precio > valoracionMejor/precioMejor){
                if (LoteMejorOpcion.length > 1){// esto ocurre antes había 2 mejores valorados y ahora solo hay 1, por lo que el tamaño vuelve a ser 1.
                    LoteMejorOpcion = new Producto[TAMAÑO_OPCIONES];
                }
                LoteMejorOpcion[0] = productos[i];

            }else if(valoracion/precio == valoracionMejor/precioMejor){
                LoteMejorOpcion = Arrays.copyOf(LoteMejorOpcion,LoteMejorOpcion.length + 1);//nuevo producto con la misma valoracion, añadimos un nuevo hueco
                LoteMejorOpcion[LoteMejorOpcion.length-1] = productos[i];
            }
        }
        return new LoteDeProductos(LoteMejorOpcion);
    }

    @Override
    public LoteDeProductos elegirMejoresProductos(int opcion) {
        LoteDeProductos mejoresOpciones = new LoteDeProductos();
        if(opcion == 1){
            mejoresOpciones = mejorValorado();
        }else if(opcion == 2){
            mejoresOpciones = mejorPrecio();
        }else if(opcion == 3){
            mejoresOpciones = mejorRatio();
        }else{
            System.out.println("ERROR");
        }
        return mejoresOpciones;
    }
}
