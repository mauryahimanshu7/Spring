package com.zensar.spring.performer;

import com.zensar.spring.poems.Poem;

/**
 * @author akansh_sai
 *
 */
public class PoeticJuggler extends Juggler {
private Poem poem;
public PoeticJuggler() {
	// TODO Auto-generated constructor stub
	System.out.println("no arg constructor");
}
public PoeticJuggler(int beanBags, Poem poem) {
	super(beanBags);
	this.poem = poem;
	System.out.println("parameterized of poetic juggler constructor");
}
@Override
public void perform() {
	// TODO Auto-generated method stub
	super.perform();
	System.out.println("while reciting a poem...");
	poem.recite();
}

}
