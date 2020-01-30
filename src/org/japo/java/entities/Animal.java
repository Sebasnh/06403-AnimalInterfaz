/*
 * Copyright 2020 Sebastian Najarro Heredia - sebastian.najarro.alum@iescamp.es.
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
package org.japo.java.entities;

import org.japo.java.interfaces.IAnimal;

/**
 *
 * @author Sebastian Najarro Heredia - sebastian.najarro.alum@iescamp.es
 */
public class Animal implements IAnimal {

    public static final int DEF_PATAS = 4;

    private int patas;

    public Animal() {
        patas = DEF_PATAS;
    }

    public Animal(int patas) {
        if (validar(patas)) {
            this.patas = patas;

        } else {
            this.patas = DEF_PATAS;
        }

    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
         if (validar(patas)) {
            this.patas = patas;

        } 
    }

    @Override
    public final boolean equals(Object o) {
        boolean testOK;
        if (o == null) {
            testOK = false;
        } else if (!(o instanceof Animal)) {
            testOK = false;
        } else {
            testOK = patas == ((Animal) o).getPatas();
        }
        return testOK;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.patas;
        return hash;
    }


    @Override //String que contiene el valor de la entidad.
    public String toString() {
        return String.format("%s - El número de patas del animal son: %d.",
                 getClass().getSimpleName(), patas);
    }

    private boolean validar(int patas) {
        return patas >= 2 && patas % 2 == 0;
    }

    @Override
    public void mostrarPatas() {
        System.out.println(toString());
    }

}
