package com.company.recyclerview;

import java.util.ArrayList;
import java.util.List;

public class ElementosRepositorio {

    List<Elemento> elementos = new ArrayList<>();

    interface Callback {
        void cuandoFinalice(List<Elemento> elementos);
    }

    ElementosRepositorio() {
        elementos.add(new Elemento(R.drawable.bulbasaur, "Bulbasaur", "Bulbasaur (フシギダネ Fushigidane en japonés) es un Pokémon de tipo planta/veneno introducido en la primera generación. Es uno de los tres Pokémon iniciales que pueden elegir los entrenadores que empiezan su aventura en la región de Kanto, junto a Charmander y Squirtle. Se destaca por ser el primer Pokémon de la Pokédex Nacional."));
        elementos.add(new Elemento(R.drawable.ivysaur,"Ivysaur", "Ivysaur (フシギソウ Fushigisou en japonés) es un Pokémon de tipo planta/veneno introducido en la primera generación. Es la evolución de Bulbasaur, uno de los Pokémon iniciales de Kanto"));
        elementos.add(new Elemento(R.drawable.venusaur, "Venusaur", "Venusaur (フシギバナ Fushigibana en japonés) es un Pokémon de tipo planta/veneno introducido en la primera generación. Es la evolución de Ivysaur."));
        elementos.add(new Elemento(R.drawable.charmander,"Charmander", "Charmander (ヒトカゲ Hitokage en japonés) es un Pokémon de tipo fuego introducido en la primera generación. Es uno de los tres Pokémon iniciales que pueden elegir los entrenadores que empiezan su aventura en la región de Kanto, junto a Bulbasaur y Squirtle."));
        elementos.add(new Elemento(R.drawable.charmeleon,"Charmeleon", "Charmeleon (リザード Lizardo en japonés) es un Pokémon de tipo fuego introducido en la primera generación. Es la evolución de Charmander, uno de los Pokémon iniciales de los entrenadores que comienzan su aventura en la región de Kanto."));
        elementos.add(new Elemento(R.drawable.charizard,"Charizard", "Charizard (リザードン Lizardon en japonés) es un Pokémon de tipo fuego/volador introducido en la primera generación. Es la evolución de Charmeleon."));
        elementos.add(new Elemento(R.drawable.squirtle,"Squirtle", "Squirtle (ゼニガメ Zenigame en japonés) es un Pokémon de tipo agua introducido en la primera generación. Es uno de los tres Pokémon iniciales que pueden elegir los entrenadores que empiezan su aventura en la región de Kanto, junto a Bulbasaur y Charmander."));
        elementos.add(new Elemento(R.drawable.wartortle, "Wartortle", "Wartortle (カメール Kameil en japonés) es un Pokémon de tipo agua introducido en la primera generación. Es la evolución de Squirtle, uno de los Pokémon iniciales de Kanto."));
        elementos.add(new Elemento(R.drawable.blastoise,"Blastoise", "Blastoise (カメックス Kamex en japonés) es un Pokémon de tipo agua introducido en la primera generación. Es la evolución de Wartortle."));
        elementos.add(new Elemento(R.drawable.caterpie,"Caterpie", "Caterpie (キャタピー Caterpie en japonés) es un Pokémon de tipo bicho introducido en la primera generación."));
        elementos.add(new Elemento(R.drawable.metapod,"Metapod", "Metapod (トランセル Transel en japonés) es un Pokémon de tipo bicho introducido en la primera generación. Es la evolución de Caterpie."));
        elementos.add(new Elemento(R.drawable.butter,"Butterfree", "Butterfree (バタフリー Butterfree en japonés) es un Pokémon de tipo bicho/volador introducido en la primera generación. Es la evolución de Metapod."));
        elementos.add(new Elemento(R.drawable.weedle,"Weedle", "Weedle (ビードル Beedle en japonés) es un Pokémon de tipo bicho/veneno introducido en la primera generación."));
        elementos.add(new Elemento(R.drawable.kakuna,"Kakuna", "Kakuna (コクーン Cocoon en japonés) es un Pokémon tipo bicho/veneno introducido en la primera generación. Es la evolución de Weedle."));
        elementos.add(new Elemento(R.drawable.beedrill,"Beedrill", "Beedrill (スピアー Spear en japonés) es un Pokémon de tipo bicho/veneno introducido en la primera generación. Es la evolución de Kakuna."));
        elementos.add(new Elemento(R.drawable.pidgey,"Pidgey", "Pidgey (ポッポ Poppo en japonés) es un Pokémon de tipo normal/volador introducido en la primera generación."));
        elementos.add(new Elemento(R.drawable.pidgeotto,"Pidgeotto", "Pidgeotto (ピジョン Pigeon en japonés) es un Pokémon de tipo normal/volador introducido en la primera generación. Es la evolución de Pidgey."));
        elementos.add(new Elemento(R.drawable.pidgeot,"Pidgeot", "Pidgeot (ピジョット Pigeot en japonés) es un Pokémon de tipo normal/volador introducido en la primera generación. Es la evolución de Pidgeotto."));
        elementos.add(new Elemento(R.drawable.rattata,"Rattata", "Rattata (コラッタ Koratta en japonés) es un Pokémon de tipo normal introducido en la primera generación. Es la forma habitual del Rattata de Alola."));
        elementos.add(new Elemento(R.drawable.raticate,"Raticate", "Raticate (ラッタ Ratta en japonés) es un Pokémon tipo normal introducido en la primera generación. Es la evolución de Rattata."));
    }

    List<Elemento> obtener() {
        return elementos;
    }

    void insertar(Elemento elemento, Callback callback){
        elementos.add(elemento);
        callback.cuandoFinalice(elementos);
    }

    void eliminar(Elemento elemento, Callback callback) {
        elementos.remove(elemento);
        callback.cuandoFinalice(elementos);
    }
}
