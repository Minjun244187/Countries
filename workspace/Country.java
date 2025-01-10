public class Country
{
  // add private instance variables for the name, capital, language, and image file.
  private String name;
  private String capital;
  private String lang;
  private String imageFile;

  // add constructors
  public Country(String name, String cap, String lang, String imageFile) {

    this.name = name;
    capital = cap;
    this.lang = lang;
    this.imageFile = imageFile;

  }

  // Write accessor/get methods for each instance variable that returns it.

  public void setName(String name) {

    this.name = name;

  }

  public void setCap(String cap) {
    
    capital = cap;

  } 

  public void setLang(String lang) {
    
    this.lang = lang;

  }

  public void setFile(String file) {
    
    this.imageFile = file;

  }

  public String getName() {

    return(name);

  }

  public String getCap() {

    return(capital);

  }

  public String getLang() {

    return(lang);

  }

  public String getFile() {

    return(imageFile);

  }

  // Write a toString() method that returns a concatenated String of 3 of the instance variables in a sentence like "..'s capital is .. and its primary language is ..."
  public String toString() {
    
    return(name + "'s capital is " + capital + " and its primary language is " + lang);

  }
 


  
}