package com.book.practice;

interface Hungry<E> {
	void munch(E x);
}

interface Carnivore<E extends Animal11> extends Hungry<E> {
}

interface Herbivore<E extends Animal11> extends Hungry<E> {
}

abstract class Plant {
}

class Grass extends Plant {
}

abstract class Animal11 {
}

class Sheep extends Animal11 implements Herbivore<Sheep> {
	public void munch(Sheep x) {
	}
}

class Wolf extends Animal11 implements Carnivore<Sheep> {
	public void munch(Sheep x) {
	}
}
