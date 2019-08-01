package com.raman;

public class TextEditor {
	
	private SpellChecker spellChecker;
	public TextEditor(SpellChecker spellchecker)
	{
	System.out.println("Inside TextEditor");
	this.spellChecker = spellChecker;
	}
	public void spellCheck()
	{
		spellChecker.checkSpelling();
	}

}
