package crypt;

import java.util.Map;
import java.util.HashMap;

public class Morse extends Spielsprache
{
    private Map <String, String> dict = new HashMap<>();
    
    String mutatables = "abcdefghijklmnopqrstuvwxyz1234567890?.,ßäöü ";
    String[] encoded = {". -", "- . . .", "- . - .", "- . .", ".", ". . - .", "- - .", ". . . .", ". .", ". - - -",
    "- . -", ". - . .", "- -", "- .", "- - -", ". - - .", "- - . -", ". - .", ". . .", "-", ". . -", ". . . -",
    ". - -", "- . . -", "- . - -", "- - . .", ". - - - -", ". . - - -", ". . . - -", ". . . . -", ". . . . .",
    "- . . . .", "- - . . .", "- - - . .", "- - - - .", "- - - - -", ". . - - . .", ". - . - . -", "- - . . - -",
    ". . . - - . .", ". - . -", "- - - .", ". . - -", " "
    };
        
    public Morse()
    {
        this.setup();
    } 
    
    private void setup(){
	    for(int i = 0; i < mutatables.length(); i++) {
            dict.put(String.valueOf(mutatables.charAt(i)), encoded[i]);
            dict.put(encoded[i], String.valueOf(mutatables.charAt(i)));
	    }
    }
    
    public String encrypt(String t)
    {          
        t = t.toLowerCase();
        String out = "";
        
        for(int i = 0; i < t.length(); i++) {
            System.out.println("Betrachte " + t.charAt(i));
        	if (mutatables.contains(String.valueOf(t.charAt(i)))){
        		out += dict.get(String.valueOf(t.charAt(i))) + "   ";
                        System.out.println(out);
        	}
        	else{
        		out += t.charAt(i);
        	}
        }
        
        return out;
    }

    
    
    
    
    public String decrypt(String m)
    {
        String t = "";
        String x = "";
        for( int i=0; i<m.length(); i++)
            {
              if( i + 10 <= m.length()&& m.charAt(i) == '-' && m.charAt(i+2) == '-' && m.charAt(i+4) == '.' && m.charAt(i+6) == '.' && m.charAt(i+8) == '-' && m.charAt(i+10) == '-')
              {
                  x = ",";
                  i = i+10;
              }
              else if( i + 10 <= m.length()&& m.charAt(i) == '.' && m.charAt(i+2) == '-' && m.charAt(i+4) == '.' && m.charAt(i+6) == '-' && m.charAt(i+8) == '.' && m.charAt(i+10) == '-')
              {
                  x = ".";
                  i = i+10;
              }
              else if( i + 10 <= m.length()&& m.charAt(i) == '.' && m.charAt(i+2) == '.' && m.charAt(i+4) == '-' && m.charAt(i+6) == '-' && m.charAt(i+8) == '.' && m.charAt(i+10) == '.')
              {
                  x = "?";
                  i = i+10;
              }
              else if( i + 12 <= m.length()&& m.charAt(i) == '.' && m.charAt(i+2) == '.' && m.charAt(i+4) == '.' && m.charAt(i+6) == '-' && m.charAt(i+8) == '-' && m.charAt(i+10) == '.' && m.charAt(i+12) == '.')
              {
                  x = "�";  //ss
                  i = i+12;
              }
              //Ziffern
              else if( i + 8 <= m.length()&& m.charAt(i) == '.' && m.charAt(i+2) == '-' && m.charAt(i+4) == '-' && m.charAt(i+6) == '-' && m.charAt(i+8) == '-')
              {
                  x = "1";
                  i = i+8;
              }
              else if( i + 8 <= m.length()&& m.charAt(i) == '.' && m.charAt(i+2) == '.' && m.charAt(i+4) == '-' && m.charAt(i+6) == '-' && m.charAt(i+8) == '-')
              {
                  x = "2";
                  i = i+8;
              }
              else if( i + 8 <= m.length()&& m.charAt(i) == '.' && m.charAt(i+2) == '.' && m.charAt(i+4) == '.' && m.charAt(i+6) == '-' && m.charAt(i+8) == '-')
              {
                  x = "3";
                  i = i+8;
              }
              else if( i + 8 <= m.length()&& m.charAt(i) == '.' && m.charAt(i+2) == '.' && m.charAt(i+4) == '.' && m.charAt(i+6) == '.' && m.charAt(i+8) == '-')
              {
                  x = "4";
                  i = i+8;
              }
              else if( i + 8 <= m.length()&& m.charAt(i) == '.' && m.charAt(i+2) == '.' && m.charAt(i+4) == '.' && m.charAt(i+6) == '.' && m.charAt(i+8) == '.')
              {
                  x = "5";
                  i = i+8;
              }
              else if( i + 8 <= m.length()&& m.charAt(i) == '-' && m.charAt(i+2) == '.' && m.charAt(i+4) == '.' && m.charAt(i+6) == '.' && m.charAt(i+8) == '.')
              {
                  x = "6";
                  i = i+8;
              }
              else if( i + 8 <= m.length()&& m.charAt(i) == '-' && m.charAt(i+2) == '-' && m.charAt(i+4) == '.' && m.charAt(i+6) == '.' && m.charAt(i+8) == '.')
              {
                  x = "7";
                  i = i+8;
              }
              else if( i + 8 <= m.length()&& m.charAt(i) == '-' && m.charAt(i+2) == '-' && m.charAt(i+4) == '-' && m.charAt(i+6) == '.' && m.charAt(i+8) == '.')
              {
                  x = "8";
                  i = i+8;
              }
              else if( i + 8 <= m.length()&& m.charAt(i) == '-' && m.charAt(i+2) == '-' && m.charAt(i+4) == '-' && m.charAt(i+6) == '-' && m.charAt(i+8) == '.')
              {
                  x = "9";
                  i = i+8;
              }
              else if( i + 8 <= m.length()&& m.charAt(i) == '-' && m.charAt(i+2) == '-' && m.charAt(i+4) == '-' && m.charAt(i+6) == '-' && m.charAt(i+8) == '-')
              {
                  x = "0";
                  i = i+8;
              }
              
              // Ende Ziffern
                
                 else if( i + 1 <= m.length())
                  {
                        if ( i + 3 <= m.length())
                        {
                            if ( i + 5 <= m.length())
                            {
                                if ( i + 7 <= m.length())
                                {
                                   
                          // mind 4 Zeichen beginnend mit -xxx          
                          if (m.charAt(i) == '-')
                          {
                                        if (m.charAt(i+2) == '-')
                                        {
                                            if (m.charAt(i+4) == '-')
                                            {
                                                if (m.charAt(i+6) == '-')
                                                {
                                                    x = "ch";
                                                    i = i+6;
                                                }
                                                else if (m.charAt(i+6) == '.')
                                                {
                                                    x = "ö";       //oe
                                                    i = i+6;
                                                }
                                                else if (m.charAt(i+6) == ' ')
                                                {
                                                    x = "o";
                                                    i = i+4;
                                                }
                                            }
                                            else if (m.charAt(i+4) == '.')
                                            {
                                                if (m.charAt(i+6) == '-')
                                                {
                                                    x = "q";
                                                    i = i+6;
                                                }
                                                else if (m.charAt(i+6) == '.')
                                                {
                                                    x = "z";
                                                    i = i+6;
                                                }
                                                else if (m.charAt(i+6) == ' ')
                                                {
                                                    x = "g";
                                                    i = i+4;
                                                }
                                            }
                                            else if (m.charAt(i+4) == ' ')
                                            {
                                                x = "m";
                                                i = i+2;
                                            }
                                  
                                        }
                                        else if (m.charAt(i+2) == '.')
                                        {
                                            if (m.charAt(i+4) == '-')
                                            {
                                                if (m.charAt(i+6) == '-')
                                                {
                                                    x = "y";
                                                    i = i+6;
                                                }
                                                else if (m.charAt(i+6) == '.')
                                                {
                                                    x = "c";
                                                    i = i+6;
                                                }
                                                else if (m.charAt(i+6) == ' ')
                                                {
                                                    x = "k";
                                                    i = i+4;
                                                }
                                            }
                                            else if (m.charAt(i+4) == '.')
                                            {
                                                if (m.charAt(i+6) == '-')
                                                {
                                                    x = "x";
                                                    i = i+6;
                                                }
                                                else if (m.charAt(i+6) == '.')
                                                {
                                                    x = "b";
                                                    i = i+6;
                                                }
                                                else if (m.charAt(i+6) == ' ')
                                                {
                                                    x = "d";
                                                    i = i+4;
                                                }
                                            }
                                            else if (m.charAt(i+4) == ' ')
                                            {
                                                x = "n";
                                                i = i+2;
                                            }
                                        }
                                        else if (m.charAt(i+2) == ' ')
                                        {
                                            x = "t";
                                        }
                                               
                          }
                          // mind 4 Zeichen beginnend mit .xxx
                          else if (m.charAt(i ) == '.')
                          {
                              if (m.charAt(i+2) == '-')
                                        {
                                            if (m.charAt(i+4) == '-')
                                            {
                                                if (m.charAt(i+6) == '-')
                                                {
                                                    x = "j";
                                                    i = i+6;
                                                }
                                                else if (m.charAt(i+6) == '.')
                                                {
                                                    x = "p";
                                                    i = i+6;
                                                }
                                                else if (m.charAt(i+6) == ' ')
                                                {
                                                    x = "w";
                                                    i = i+4;
                                                }
                                            }
                                            else if (m.charAt(i+4) == '.')
                                            {
                                                if (m.charAt(i+6) == '-')
                                                {
                                                    x = "ä";    //ae
                                                    i = i+6;
                                                }
                                                else if (m.charAt(i+6) == '.')
                                                {
                                                    x = "l";
                                                    i = i+6;
                                                }
                                                else if (m.charAt(i+6) == ' ')
                                                {
                                                    x = "r";
                                                    i = i+4;
                                                }
                                            }
                                            else if (m.charAt(i+4) == ' ')
                                            {
                                                x = "a";
                                                i = i+2;
                                            }
                                  
                                        }
                                        else if (m.charAt(i+2) == '.')
                                        {
                                            if (m.charAt(i+4) == '-')
                                            {
                                                if (m.charAt(i+6) == '-')
                                                {
                                                    x = "ü";    //ue
                                                    i = i+6;
                                                }
                                                else if (m.charAt(i+6) == '.')
                                                {
                                                    x = "f";
                                                    i = i+6;
                                                }
                                                else if (m.charAt(i+6) == ' ')
                                                {
                                                    x = "u";
                                                    i = i+4;
                                                }
                                            }
                                            else if (m.charAt(i+4) == '.')
                                            {
                                                if (m.charAt(i+6) == '-')
                                                {
                                                    x = "v";
                                                    i = i+6;
                                                }
                                                else if (m.charAt(i+6) == '.')
                                                {
                                                    x = "h";
                                                    i = i+6;
                                                }
                                                else if (m.charAt(i+6) == ' ')
                                                {
                                                    x = "s";
                                                    i = i+4;
                                                }
                                            }
                                            else if (m.charAt(i+4) == ' ')
                                            {
                                                x = "i";
                                                i = i+2;
                                            }
                                        }
                                        else if (m.charAt(i+2) == ' ')
                                        {
                                            x = "e";
                                        }         
                          }
                          else if ( m.charAt(i) == ' ')
                          {
                              x = " ";
                          }
                          
                          
                          }
                           
                          else if (m.charAt(i) == '-') // 3 lang --x
                          {
                              if (m.charAt(i+2) == '-')
                              {
                                  if (m.charAt(i+4) == '-')
                                  {
                                      x = "o";
                                      i = i+4;
                                  }
                                  else if (m.charAt(i+4) == '.')
                                  {
                                      x = "g";
                                      i = i+4;
                                  }
                                  else if (m.charAt(i+4) == ' ')
                                  {
                                      x = "m";
                                      i = i+2;
                                  }
                                  
                              }
                              else if (m.charAt(i+2) == '.') // 3 lang -.x
                              {
                                  if (m.charAt(i+4) == '-')
                                  {
                                      x = "k";
                                      i = i+4;
                                  }
                                  else if (m.charAt(i+4) == '.')
                                  {
                                      x = "d";
                                      i = i+4;
                                  }
                                  else if (m.charAt(i+4) == ' ')
                                  {
                                      x = "n";
                                      i = i+2;
                                  }
                              }
                              else if (m.charAt(i+2) == ' ')
                              {
                                  x = "t";
                              }
                              
                         }
                         
                         else if (m.charAt(i) == '.') // 3 lang .-x
                          {
                              if (m.charAt(i+2) == '-')
                              {
                                  if (m.charAt(i+4) == '-')
                                  {
                                      x = "w";
                                      i = i+4;
                                  }
                                  else if (m.charAt(i+4) == '.')
                                  {
                                      x = "r";
                                      i = i+4;
                                  }
                                  else if (m.charAt(i+4) == ' ')
                                  {
                                      x = "a";
                                      i = i+2;
                                  }
                                  
                              }
                              else if (m.charAt(i+2) == '.') // 3 lang ..x
                              {
                                  if (m.charAt(i+4) == '-')
                                  {
                                      x = "u";
                                      i = i+4;
                                  }
                                  else if (m.charAt(i+4) == '.')
                                  {
                                      x = "s";
                                      i = i+4;
                                  }
                                  else if (m.charAt(i+4) == ' ')
                                  {
                                      x = "i";
                                      i = i+2;
                                  }
                              }
                              else if (m.charAt(i+2) == ' ')
                              {
                                  x = "e";
                              }
                              
                         }
                         else if ( m.charAt(i) == ' ')
                          {
                              x = " ";
                          }
                         
                         
                        
                         
                        }
                      else if (m.charAt(i) == '-') // 2 lang -x 
                      {
                          if (m.charAt(i+2) == '-')
                          {
                              x = "m";
                              i = i+2;
                          }
                          else if (m.charAt(i+2) == '.')
                          {
                              x = "n";
                              i = i+2;
                          }
                          else if (m.charAt(i+2) == ' ')
                          {
                              x = "t";
                              i = i+1;
                          }
                        }
                      else if (m.charAt(i) == '.') // 2 lang .x
                      {
                          if (m.charAt(i+2) == '-')
                          {
                              x = "a";
                              i = i+2;
                          }
                          else if (m.charAt(i+2) == '.')
                          {
                              x = "i";
                              i = i+2;
                          }
                          else if (m.charAt(i+2) == ' ')
                          {
                              x = "e";
                              i = i+1;
                          }
                      }
                      else if ( m.charAt(i) == ' ')
                          {
                              x = " ";
                          }
                    
                  }
                else if (m.charAt(i) == '-') // 1 lang -
                {
                    x = "t";
                }
                else if (m.charAt(i) == '.') // 1 lang .
                {
                    x = "e";
                }
                else if ( m.charAt(i) == ' ')
                          {
                              x = " ";
                          }
                         
               
            }
               t = t + x;
               x = "";
               if( i+3 <= m.length())
               {
                   i = i+3;
               }
               else 
               {
                   i = i+1;
               }
            }
               
               
        return t;
      }
    }    
