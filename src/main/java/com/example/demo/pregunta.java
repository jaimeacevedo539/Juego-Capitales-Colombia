package com.example.demo;

public class pregunta {
    //constructor
    public pregunta(){}
    //listado departamentos
    String[][] matriz = new String[][]{
            {"Colombia","Bogota","Colombia tierra querida"},
            {"Amazonas", "Leticia","El departamento del Amazonas está ubicado en el extremo sur del país, en la región Amazonía. Es el departamento con mayor superficie de Colombia, aunque en su mayoría es territorio selvático."},
            {"Antioquia", "Medellín","El departamento de Antioquia  posee la segunda ciudad más poblada del país, la ciudad de Medellín, su capital. Está ubicado al noroeste del país, en las regiones Andina y Caribe. Es uno de los departamentos más grandes del país con 63 600 km² y está considerado como el departamento más poblado de toda Colombia."},
            {"Arauca", "Arauca","El departamento de Arauca cuya capital lleva el mismo nombre: Arauca, está ubicado al oriente del país, en la región Orinoquía, en límites con Venezuela, al sur con Vichada y Casanare, y al occidente con Boyacá."},
            {"Atlántico", "Barranquilla","El Atlántico debe su nombre al mar que lo baña y se encuentra ubicado en la región Caribe, limita al norte con el Océano Atlántico, al oriente con el río Magdalena y al sur con el departamento de Bolívar y por el occidente con el mar caribe y el departamento de Bolivar. Su posición astronómica está entre los 10° 16′ y los 11°06′ de latitud norte y los 74° 42′ y 75°15′ de longitud occidental."},
            {"Bolívar ", " Cartagena","El departamento de Bolívar está ubicado en la región Caribe o Costa Atlántica. Su capital es Cartagena de Indias, principal destino turístico de Colombia."},
            {"Boyacá", "Tunja","El departamento de Boyacá está ubicado en la región Andina, en el centro del país, su capital es la ciudad de Tunja."},
            {"Caldas", "Manizales","El departamento de Caldas está en la región andina y su capital es la ciudad de Manizales. Limita al norte con Antioquia, al oriente con Boyacá y Cundinamarca, al sur con Tolima y Risaralda y al occidente con Risaralda."},
            {"Caquetá", "Florencia","El departamento del Caquetá está ubicado en la Amazonía colombiana. Su capital es Florencia y se puede encontrar al sur del país."},
            {"Casanare", "Yopal","El departamento del Caquetá está ubicado en la Amazonía colombiana. Su capital es Florencia y se puede encontrar al sur del país."},
            {"Cauca", "Popayán","El departamento del Cauca cuya capital es Popayán, está ubicado al suroccidente del país en las regiones Andina y Pacífica."},
            {"Cesar", "Valledupar","El departamento del Cesar está ubicado al nororiente del país. Su capital es Valledupar y hace parte de las regiones Andina y Caribe."},
            {"Chocó", "Quibdó","El departamento de Chocó es el único departamento de Colombia que limita con Panamá. Su capital es Quibdó y se encuentra ubicado al occidente del país, en el Pacífico colombiano."},
            {"Córdoba", "Montería","El departamento de Córdoba está ubicado al norte de Colombia, en la región Caribe. Su capital es Montería que inicialmente se llamó San Jerónimo de Buenavista."},
            {"Cundinamarca", "Bogotá","El departamento de Cundinamarca está ubicado en el centro del país, en la región Andina. Posee en total 116 municipios, distribuidos en 15 provincias. Su capital es Bogotá, que también es la capital de Colombia."},
            {"Guainía", "Puerto Inírida","El departamento del Guainía tiene como capital a Inírida y se encuentra ubicado al oriente de Colombia, en la región Amazonía."},
            {"Guaviare", "San José del Guaviare","El departamento del Guaviare está ubicado en la región Amazonia y su capital es San José del Guaviare."},
            {"Huila", "Neiva","El departamento del Huila es un departamento ubicado al suroeste del país, en la región Andina."},
            {"La Guajira", "Riohacha","El departamento de La Guajira (en wayuunaiki: Wajiira) es un departamento de Colombia ubicado en la Región Caribe y su capital es Riohacha."},
            {"Magdalena", "Santa Marta","El departamento del Magdalena es un departamento de Colombia. Su capital es Santa Marta y se encuentra ubicado en la región Caribe."},
            {"Meta", "Villavicencio","El departamento del Meta está ubicado en los llanos orientales de Colombia, en la región Orinoquía. Su capital es Villavicencio."},
            {"Nariño", "Pasto","El departamento de Nariño está ubicado en las regiones Andina y Pacífica. Su capital es San Juan de Pasto."},
            {"Norte de Santander", "Cúcuta","El departamento de Norte de Santander cuya capital es Cúcuta, está ubicado al nororiente del país, en la región Andina"},
            {"Putumayo", "Mocoa","El departamento del Putumayo está ubicado al suroccidente del país, en la región Amazonía. Su capital es Mocoa."},
            {"Quindío", "Armenia","El departamento del Quindío está ubicado en el centro-occidente del país, en la región Andina. Su capital es Armenia. Pertenece al eje cafetero y a la región paisa."},
            {"Risaralda", "Pereira","El departamento de Risaralda está ubicado en el centro-occidente del país, en la región andina. Su capital es Pereira."},
            {"San Andrés y Providencia", "San Andrés","San Andrés y Providencia también conocido como El Archipiélago de San Andrés, Providencia y Santa Catalina cuya capital es San Andrés, se encuentra ubicado al occidente del Océano Atlántico, a 775 km (480 millas náuticas) al noroccidente de la costa atlántica del territorio continental del país y a 220 km (140 millas náuticas) de las costas orientales de Nicaragua."},
            {"Santander", "Bucaramanga","El departamento de Santander cuya capital es Bucaramanga fundada el 22 de diciembre de 1622 por Andrés Páez de Sotomayor , se encuentra ubicado al nororiente del país, en la región andina."},
            {"Sucre", "Sincelejo","El departamento de Sucre está ubicado al norte del país, en la región Caribe. Su capital es Sincelejo el nombre de esta ciudad fue tomada del cacique que comandaba la tribu de allí, el Cacique Chinchelejo."},
            {"Tolima", "Ibagué","El departamento del Tolima está ubicado en el centro – occidente de Colombia, en la región andina. Su capital es Ibagué."},
            {"Valle del Cauca", "Cali","El departamento del Valle del Cauca es uno de los departamentos más importantes del país y se encuentra ubicado entre la región Andina y Pacífica."},
            {"Vaupés", "Mitú","El departamento del Vaupés está ubicado en la región Amazónica, su capital es Mitú."},
            {"Vichada", "Puerto Carreño","El departamento del Vichada está ubicado al oriente del país, entre las regiones Orinoquía y Amazónica, Su capital es Puerto Carreño."},

    };


    int aleatorio = (int) (Math.random() * 30 + 1);

    public int getCodigo(){
        return aleatorio;
    }
    public String getDepartamento(){
        String Departamento;
        Departamento = matriz[aleatorio][0];
        return Departamento;
    }
    public String getCapital(){
        String Capital;
        Capital = matriz[aleatorio][1];
        return Capital;
    }
    public String getDescripcion(){
        String Descripcion;
        Descripcion = matriz[aleatorio][2];
        return Descripcion;
    }
    public String[][] generarOpciones(){
        int r1 = (int) (Math.random() * 30 + 1);
        int r2 = (int) (Math.random() * 30 + 1);
        int r3 = (int) (Math.random() * 30 + 1);

        String [][] respuestas = {
                {matriz[aleatorio][1],String.valueOf(aleatorio)},
                {matriz[r1][1],String.valueOf(r1)},
                {matriz[r2][1],String.valueOf(r2)},
                {matriz[r3][1],String.valueOf(r3)},




        };
        //String cadenaRespuestas = matriz[aleatorio][1]+" - " +matriz[opcion1][1]+" - " +matriz[opcion2][1]+" - " +matriz[opcion3][1];
        return respuestas;
    }


}
