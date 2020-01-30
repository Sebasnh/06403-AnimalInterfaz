/*
 * Copyright 2019 Sebastian Najarro Heredia - sebastian.najarro.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.app;

import org.japo.java.entities.Animal;
import org.japo.java.interfaces.IAnimal;

/**
 *
 * @author Sebastian Najarro Heredia - sebastian.najarro.alum@iescamp.es
 */
public final class App {

    public final void launchApp() {

        System.out.println("Objeto 1");
        System.out.println("========");
        Animal ob1 = new Animal();
        ob1.mostrarPatas();
        System.out.println("Actualizando ...");
        ob1.setPatas(8);
        ob1.mostrarPatas();

        System.out.println("---");

        System.out.println("Objeto 2");
        System.out.println("========");

        Animal ob2 = new Animal();
        ob2.mostrarPatas();
        System.out.println("Actualizando ...");
        ob2.setPatas(9);
        ob2.mostrarPatas();

        System.out.println("---");
        
        System.out.println("Comparación de objetos");
        System.out.println("======================");
        System.out.println(ob1.equals(ob2) ? "SI son iguales"
                : "NO son iguales");

    }

}
