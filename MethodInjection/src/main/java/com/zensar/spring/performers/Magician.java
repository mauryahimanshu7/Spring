package com.zensar.spring.performers;

import com.zensar.spring.magicboxs.Magicbox;

public class Magician implements Performer {
	private String magicWords;
	private Magicbox magicBox;

	public String getMagicWords() {
		return magicWords;
	}

	public void setMagicWords(String magicWords) {
		this.magicWords = magicWords;
	}

	public Magicbox getMagicBox() {
		return magicBox;
	}

	public void setMagicBox(Magicbox magicBox) {
		this.magicBox = magicBox;
	}

	@Override
	public void perform() {
		System.out.println("Magician says : " + magicWords);
		System.out.println(magicBox.getContents());

	}

}
