package com.example.numeritos;

public class Auxiliares {

    String unidades[] = {"", "uno","dos","tres","cuatro","cinco",
            "seis","siete","ocho","nueve","diez"};
    String decenas[] = {"","diez","veinte","treinta","cuarenta",
            "cincuenta","sesenta","setenta","ochenta","noventa"};
    String centenas[] = {"","cien","doscientos","trescientos","cuatrocientos",
            "quinientos","seiscientos","setecientos","ochocientos","novecientos"};

    String cienes = "to";
    String miles = "mil";

    String veintes[] = {"","veintiuno","veintidos","veintitres","veinticuatro",
            "veinticinco","veintiseis","veintisiete","veintiocho","veintinueve"};

    String dieces[] = {"","once","doce","trece","catorce",
            "quince","dieciseis","diecisiete","dieciocho","diecinueve"};


    public String mil2es0(String textote){

        int mil1 = Integer.parseInt(textote.substring(0, 1));
        int mil2 = Integer.parseInt(textote.substring(1, 2));
        int centenita = Integer.parseInt(textote.substring(2, 3));
        int decenita = Integer.parseInt(textote.substring(3, 4));
        int unidadcita = Integer.parseInt(textote.substring(4, 5));

            if (centenita==0){
                if (decenita == 0) {
                    return decenas[mil1] + " " + miles + " "  + unidades[unidadcita];
                } else
                if (decenita == 1 && unidadcita > 0) {
                    return decenas[mil1] + " " + miles + " " + dieces[unidadcita];
                }
                else
                if (decenita == 2 && unidadcita > 0) {
                    return decenas[mil1] + " " + miles + " " +  veintes[unidadcita];
                } else
                if (unidadcita==0){
                    return decenas[mil1] + " " + miles + " " + decenas[decenita];
                }else
                    return decenas[mil1] + " " + miles + " " + decenas[decenita] + " y " + unidades[unidadcita];
            } else if (centenita==1) {
                if (decenita == 0 && unidadcita == 0) {
                    return decenas[mil1] + " " + miles + " "  + centenas[centenita];
                } else if (decenita == 0) {
                    return decenas[mil1] + " " + miles + " "  + centenas[centenita] + cienes + " " +  unidades[unidadcita];
                }  else
                if (decenita == 1 && unidadcita > 0) {
                    return decenas[mil1] + " " + miles + " " + centenas[centenita] + cienes + " " + dieces[unidadcita];
                }
                else
                if (decenita == 2 && unidadcita > 0) {
                    return decenas[mil1] + " " + miles + " " +  centenas[centenita] + cienes + " " + veintes[unidadcita];
                } else
                if (unidadcita==0){
                    return decenas[mil1] + " " + miles + " " + centenas[centenita] + cienes + " " + decenas[decenita];
                }else
                    return decenas[mil1] + " " + miles + " " + centenas[centenita] + cienes + " " + decenas[decenita] + " y " + unidades[unidadcita];
            } else {
                if (decenita == 0 && unidadcita == 0) {
                    return decenas[mil1] + " " + miles + " "  + centenas[centenita];
                }else
                if (decenita == 0) {
                    return decenas[mil1] + " " + miles + " "  + centenas[centenita] + " " +  unidades[unidadcita];
                } else
                if (decenita == 1 && unidadcita > 0) {
                    return decenas[mil1] + " " + miles + " " + centenas[centenita] + " " + dieces[unidadcita];
                }
                else
                if (decenita == 2 && unidadcita > 0) {
                    return decenas[mil1] + " " + miles + " " +  centenas[centenita] + " " + veintes[unidadcita];
                } else
                if (unidadcita==0){
                    return decenas[mil1] + " " + miles + " " + centenas[centenita] + " " + decenas[decenita];
                }else
                    return decenas[mil1] + " " + miles + " " + centenas[centenita] + " " + decenas[decenita] + " y " + unidades[unidadcita];
            }
    }

    public String mil2random(String textote){

        int mil1 = Integer.parseInt(textote.substring(0, 1));
        int mil2 = Integer.parseInt(textote.substring(1, 2));
        int centenita = Integer.parseInt(textote.substring(2, 3));
        int decenita = Integer.parseInt(textote.substring(3, 4));
        int unidadcita = Integer.parseInt(textote.substring(4, 5));

        if (mil2 == 0) {
            return decenas[mil1] + " " + miles + " " + centenas[centenita] + " " + decenas[decenita] + " y " + unidades[unidadcita];
        } else if (centenita==1 && decenita==0 && unidadcita==0) {
            return decenas[mil1] + " y " + unidades[mil2] + " " + miles + " "  + centenas[centenita];
        }else if (decenita==0 && unidadcita==0) {
            return decenas[mil1] + " y " + unidades[mil2] + " " + miles + " "  + centenas[centenita];
        }else
        if (centenita==0){
                if (decenita == 0) {
                    return decenas[mil1] + " y " + unidades[mil2] + " " + miles + " "  + unidades[unidadcita];
                } else
                if (decenita == 1 && unidadcita > 0) {
                    return decenas[mil1] + " y " + unidades[mil2] +  " " + miles + " " + dieces[unidadcita];
                }
                else
                if (decenita == 2 && unidadcita > 0) {
                    return decenas[mil1] + " y " + unidades[mil2] + " "+ miles + " " +  veintes[unidadcita];
                } else
                if (unidadcita==0){
                    return decenas[mil1] + " y " + unidades[mil2] + " " + miles + " " + decenas[decenita];
                }else
                    return decenas[mil1] + " y " + unidades[mil2] + " " + miles + " " + decenas[decenita] + " y " + unidades[unidadcita];
            } else if (centenita==1) {
                if (decenita == 0) {
                    return decenas[mil1] + " y " + unidades[mil2] + " " + miles + " "  + centenas[centenita] + cienes + " " +  unidades[unidadcita];
                } else
                if (decenita == 1 && unidadcita > 0) {
                    return decenas[mil1] + " y " + unidades[mil2] + " " + miles + " " + centenas[centenita] + cienes + " " + dieces[unidadcita];
                }
                else
                if (decenita == 2 && unidadcita > 0) {
                    return decenas[mil1] + " y " + unidades[mil2] + " " + miles + " " +  centenas[centenita] + cienes + " " + veintes[unidadcita];
                } else
                if (unidadcita==0){
                    return decenas[mil1] + " y " + unidades[mil2] + " " + miles + " " + centenas[centenita] + cienes + " " + decenas[decenita];
                }else
                    return decenas[mil1] + " y " + unidades[mil2] + " " + miles + " " + centenas[centenita] + cienes + " " + decenas[decenita] + " y " + unidades[unidadcita];
            } else {
                if (decenita == 0) {
                    return decenas[mil1] + " y " + unidades[mil2] + " " + miles + " "  + centenas[centenita] + " " +  unidades[unidadcita];
                } else
                if (decenita == 1 && unidadcita > 0) {
                    return decenas[mil1] + " y " + unidades[mil2] + " " + miles + " " + centenas[centenita] + " " + dieces[unidadcita];
                }
                else
                if (decenita == 2 && unidadcita > 0) {
                    return decenas[mil1] + " y " + unidades[mil2] + " " + miles + " " +  centenas[centenita] + " " + veintes[unidadcita];
                } else
                if (unidadcita==0){
                    return decenas[mil1] + " y " + unidades[mil2] + " " + miles + " " + centenas[centenita] + " " + decenas[decenita];
                }else
                    return decenas[mil1] + " y " + unidades[mil2] + " " + miles + " " + centenas[centenita] + " " + decenas[decenita] + " y " + unidades[unidadcita];
            }
    }

    public String diecesmet5(String textote){

        int mil2 = Integer.parseInt(textote.substring(1, 2));
        int centenita = Integer.parseInt(textote.substring(2, 3));
        int decenita = Integer.parseInt(textote.substring(3, 4));
        int unidadcita = Integer.parseInt(textote.substring(4, 5));

        if (centenita==0){
            if (decenita == 0) {
                return dieces[mil2] + " " + miles + " "  + unidades[unidadcita];
            } else
            if (decenita == 1 && unidadcita > 0) {
                return dieces[mil2] + " " + miles + " " + dieces[unidadcita];
            }
            else
            if (decenita == 2 && unidadcita > 0) {
                return dieces[mil2] + " " + miles + " " +  veintes[unidadcita];
            } else
            if (unidadcita==0){
                return dieces[mil2] + " " + miles + " " + decenas[decenita];
            }else
                return dieces[mil2] + " " + miles + " " + decenas[decenita] + " y " + unidades[unidadcita];
        } else if (centenita==1) {
            if (decenita == 0 && unidadcita == 0) {
                return dieces[mil2] + " " + miles + " "  + centenas[centenita];
            } else if (decenita == 0) {
                return dieces[mil2] + " " + miles + " "  + centenas[centenita] + cienes + " " +  unidades[unidadcita];
            } else
            if (decenita == 1 && unidadcita > 0) {
                return dieces[mil2] + " " + miles + " " + centenas[centenita] + cienes + " " + dieces[unidadcita];
            }
            else
            if (decenita == 2 && unidadcita > 0) {
                return dieces[mil2] + " " + miles + " " +  centenas[centenita] + cienes + " " + veintes[unidadcita];
            } else
            if (unidadcita==0){
                return dieces[mil2] + " " + miles + " " + centenas[centenita] + cienes + " " + decenas[decenita];
            }else
                return dieces[mil2] + " " + miles + " " + centenas[centenita] + cienes + " " + decenas[decenita] + " y " + unidades[unidadcita];
        } else {
            if (decenita == 0) {
                return dieces[mil2] + " " + miles + " "  + centenas[centenita] + " " +  unidades[unidadcita];
            } else
            if (decenita == 1 && unidadcita > 0) {
                return dieces[mil2] + " " + miles + " " + centenas[centenita] + " " + dieces[unidadcita];
            }
            else
            if (decenita == 2 && unidadcita > 0) {
                return dieces[mil2] + " " + miles + " " +  centenas[centenita] + " " + veintes[unidadcita];
            } else
            if (unidadcita==0){
                return dieces[mil2] + " " + miles + " " + centenas[centenita] + " " + decenas[decenita];
            }else
                return dieces[mil2] + " " + miles + " " + centenas[centenita] + " " + decenas[decenita] + " y " + unidades[unidadcita];
        }
    }

    public String veintesmet5(String textote){

        int mil2 = Integer.parseInt(textote.substring(1, 2));
        int centenita = Integer.parseInt(textote.substring(2, 3));
        int decenita = Integer.parseInt(textote.substring(3, 4));
        int unidadcita = Integer.parseInt(textote.substring(4, 5));


        if (centenita==0){
            if (decenita == 0) {
                return veintes[mil2] + " " + miles + " "  + unidades[unidadcita];
            } else
            if (decenita == 1 && unidadcita > 0) {
                return veintes[mil2] + " " + miles + " " + dieces[unidadcita];
            }
            else
            if (decenita == 2 && unidadcita > 0) {
                return veintes[mil2] + " " + miles + " " +  veintes[unidadcita];
            } else
            if (unidadcita==0){
                return veintes[mil2] + " " + miles + " " + decenas[decenita];
            }else
                return veintes[mil2] + " " + miles + " " + decenas[decenita] + " y " + unidades[unidadcita];
        } else if (centenita==1) {
            if (decenita == 0 && unidadcita ==0) {
                return veintes[mil2] + " " + miles + " "  + centenas[centenita];
            }else if (decenita == 0) {
                return veintes[mil2] + " " + miles + " "  + centenas[centenita] + cienes + " " +  unidades[unidadcita];
            } else
            if (decenita == 1 && unidadcita > 0) {
                return veintes[mil2] + " " + miles + " " + centenas[centenita] + cienes + " " + dieces[unidadcita];
            }
            else
            if (decenita == 2 && unidadcita > 0) {
                return veintes[mil2] + " " + miles + " " +  centenas[centenita] + cienes + " " + veintes[unidadcita];
            } else
            if (unidadcita==0){
                return veintes[mil2] + " " + miles + " " + centenas[centenita] + cienes + " " + decenas[decenita];
            }else
                return veintes[mil2] + " " + miles + " " + centenas[centenita] + cienes + " " + decenas[decenita] + " y " + unidades[unidadcita];
        } else {
            if (decenita == 0) {
                return veintes[mil2] + " " + miles + " "  + centenas[centenita] + " " +  unidades[unidadcita];
            } else
            if (decenita == 1 && unidadcita > 0) {
                return veintes[mil2] + " " + miles + " " + centenas[centenita] + " " + dieces[unidadcita];
            }
            else
            if (decenita == 2 && unidadcita > 0) {
                return veintes[mil2] + " " + miles + " " +  centenas[centenita] + " " + veintes[unidadcita];
            } else
            if (unidadcita==0){
                return veintes[mil2] + " " + miles + " " + centenas[centenita] + " " + decenas[decenita];
            }else
                return veintes[mil2] + " " + miles + " " + centenas[centenita] + " " + decenas[decenita] + " y " + unidades[unidadcita];
        }
    }

    public String cienmilesmet6(String textote) {

        int mil3 = Integer.parseInt(textote.substring(0, 1));
        int mil1 = Integer.parseInt(textote.substring(1, 2));
        int mil2 = Integer.parseInt(textote.substring(2, 3));
        int centenita = Integer.parseInt(textote.substring(3, 4));
        int decenita = Integer.parseInt(textote.substring(4, 5));
        int unidadcita = Integer.parseInt(textote.substring(5, 6));


        if (mil1==0){
            if (mil2 == 0) {
                if (centenita == 0) {
                    if (decenita == 0) {
                        return miles + " " + unidades[unidadcita];
                    } else if (decenita == 1 && unidadcita > 0) {
                        return miles + " " + dieces[unidadcita];
                    } else if (decenita == 2 && unidadcita > 0) {
                        return miles + " " + veintes[unidadcita];
                    } else if (unidadcita == 0) {
                        return miles + " " + decenas[decenita];
                    } else
                        return miles + " " + decenas[decenita] + " y " + unidades[unidadcita];
                } else if (centenita == 1) {
                    if (decenita == 0) {
                        return miles + " " + centenas[centenita] + cienes + " " + unidades[unidadcita];
                    } else if (decenita == 1 && unidadcita > 0) {
                        return miles + " " + centenas[centenita] + cienes + " " + dieces[unidadcita];
                    } else if (decenita == 2 && unidadcita > 0) {
                        return miles + " " + centenas[centenita] + cienes + " " + veintes[unidadcita];
                    } else if (unidadcita == 0) {
                        return miles + " " + centenas[centenita] + cienes + " " + decenas[decenita];
                    } else
                        return miles + " " + centenas[centenita] + cienes + " " + decenas[decenita] + " y " + unidades[unidadcita];
                } else {
                    if (decenita == 0) {
                        return miles + " " + centenas[centenita] + " " + unidades[unidadcita];
                    } else if (decenita == 1 && unidadcita > 0) {
                        return miles + " " + centenas[centenita] + " " + dieces[unidadcita];
                    } else if (decenita == 2 && unidadcita > 0) {
                        return miles + " " + centenas[centenita] + " " + veintes[unidadcita];
                    } else if (unidadcita == 0) {
                        return miles + " " + centenas[centenita] + " " + decenas[decenita];
                    } else
                        return miles + " " + centenas[centenita] + " " + decenas[decenita] + " y " + unidades[unidadcita];
                }
            }else{
                if (centenita == 0) {
                    if (decenita == 0) {
                        return unidades[mil2] + " " + miles + " " + unidades[unidadcita];
                    } else if (decenita == 1 && unidadcita > 0) {
                        return unidades[mil2] + " " + miles + " " + dieces[unidadcita];
                    } else if (decenita == 2 && unidadcita > 0) {
                        return unidades[mil2] + " " + miles + " " + veintes[unidadcita];
                    } else if (unidadcita == 0) {
                        return unidades[mil2] + " " + miles + " " + decenas[decenita];
                    } else
                        return unidades[mil2] + " " + miles + " " + decenas[decenita] + " y " + unidades[unidadcita];
                } else if (centenita == 1) {
                    if (decenita == 0) {
                        return unidades[mil2] + " " + miles + " " + centenas[centenita] + cienes + " " + unidades[unidadcita];
                    } else if (decenita == 1 && unidadcita > 0) {
                        return unidades[mil2] + " " + miles + " " + centenas[centenita] + cienes + " " + dieces[unidadcita];
                    } else if (decenita == 2 && unidadcita > 0) {
                        return unidades[mil2] + " " + miles + " " + centenas[centenita] + cienes + " " + veintes[unidadcita];
                    } else if (unidadcita == 0) {
                        return unidades[mil2] + " " + miles + " " + centenas[centenita] + cienes + " " + decenas[decenita];
                    } else
                        return unidades[mil2] + " " + miles + " " + centenas[centenita] + cienes + " " + decenas[decenita] + " y " + unidades[unidadcita];
                } else {
                    if (decenita == 0) {
                        return unidades[mil2] + " " + miles + " " + centenas[centenita] + " " + unidades[unidadcita];
                    } else if (decenita == 1 && unidadcita > 0) {
                        return unidades[mil2] + " " + miles + " " + centenas[centenita] + " " + dieces[unidadcita];
                    } else if (decenita == 2 && unidadcita > 0) {
                        return unidades[mil2] + " " + miles + " " + centenas[centenita] + " " + veintes[unidadcita];
                    } else if (unidadcita == 0) {
                        return unidades[mil2] + " " + miles + " " + centenas[centenita] + " " + decenas[decenita];
                    } else
                        return unidades[mil2] + " " + miles + " " + centenas[centenita] + " " + decenas[decenita] + " y " + unidades[unidadcita];
                }
            }
        }
        else if (mil1 == 1){
            return diecesmet6(textote);
        }
        else if (mil1 == 2){
            return veintesmet6(textote);
        } else {
            if (mil2 == 0) {
                if (centenita == 0) {
                    if (decenita == 0) {
                        return decenas[mil1] + " " + miles + " " + unidades[unidadcita];
                    } else if (decenita == 1 && unidadcita > 0) {
                        return decenas[mil1] + " " + miles + " " + dieces[unidadcita];
                    } else if (decenita == 2 && unidadcita > 0) {
                        return decenas[mil1] + " " + miles + " " + veintes[unidadcita];
                    } else if (unidadcita == 0) {
                        return decenas[mil1] + " " + miles + " " + decenas[decenita];
                    } else
                        return decenas[mil1] + " " + miles + " " + decenas[decenita] + " y " + unidades[unidadcita];
                } else if (centenita == 1) {
                    if (decenita == 0) {
                        return decenas[mil1] + " " + miles + " " + centenas[centenita] + cienes + " " + unidades[unidadcita];
                    } else if (decenita == 1 && unidadcita > 0) {
                        return decenas[mil1] + " " + miles + " " + centenas[centenita] + cienes + " " + dieces[unidadcita];
                    } else if (decenita == 2 && unidadcita > 0) {
                        return decenas[mil1] + " " + miles + " " + centenas[centenita] + cienes + " " + veintes[unidadcita];
                    } else if (unidadcita == 0) {
                        return decenas[mil1] + " " + miles + " " + centenas[centenita] + cienes + " " + decenas[decenita];
                    } else
                        return decenas[mil1] + " " + miles + " " + centenas[centenita] + cienes + " " + decenas[decenita] + " y " + unidades[unidadcita];
                } else {
                    if (decenita == 0) {
                        return decenas[mil1] + " " + miles + " " + centenas[centenita] + " " + unidades[unidadcita];
                    } else if (decenita == 1 && unidadcita > 0) {
                        return decenas[mil1] + " " + miles + " " + centenas[centenita] + " " + dieces[unidadcita];
                    } else if (decenita == 2 && unidadcita > 0) {
                        return decenas[mil1] + " " + miles + " " + centenas[centenita] + " " + veintes[unidadcita];
                    }
                    else if (unidadcita == 0) {
                        return decenas[mil1] + " " + miles + " " + centenas[centenita] + " " + decenas[decenita];
                    } else
                        return decenas[mil1] + " " + miles + " " + centenas[centenita] + " " + decenas[decenita] + " y " + unidades[unidadcita];
                }
            }else{
                if (centenita == 0) {
                    if (decenita == 0) {
                        return decenas[mil1] + " y " + unidades[mil2] + " " + miles + " " + unidades[unidadcita];
                    } else if (decenita == 1 && unidadcita > 0) {
                        return decenas[mil1] + " y " + unidades[mil2] + " " + miles + " " + dieces[unidadcita];
                    } else if (decenita == 2 && unidadcita > 0) {
                        return decenas[mil1] + unidades[mil2] + " " + miles + " " + veintes[unidadcita];
                    } else if (unidadcita == 0) {
                        return decenas[mil1] + " y " + unidades[mil2] + " " + miles + " " + decenas[decenita];
                    } else
                        return decenas[mil1] + " y " + unidades[mil2] + " " + miles + " " + decenas[decenita] + " y " + unidades[unidadcita];
                } else if (centenita == 1) {
                    if (decenita == 0) {
                        return decenas[mil1] + " y " + unidades[mil2] + " " + miles + " " + centenas[centenita] + cienes + " " + unidades[unidadcita];
                    } else if (decenita == 1 && unidadcita > 0) {
                        return decenas[mil1] + " y " + unidades[mil2] + " " + miles + " " + centenas[centenita] + cienes + " " + dieces[unidadcita];
                    } else if (decenita == 2 && unidadcita > 0) {
                        return decenas[mil1] + " y " + unidades[mil2] + " " + miles + " " + centenas[centenita] + cienes + " " + veintes[unidadcita];
                    } else if (unidadcita == 0) {
                        return decenas[mil1] + " y " + unidades[mil2] + " " + miles + " " + centenas[centenita] + cienes + " " + decenas[decenita];
                    } else
                        return decenas[mil1] + " y " + unidades[mil2] + " " + miles + " " + centenas[centenita] + cienes + " " + decenas[decenita] + " y " + unidades[unidadcita];
                } else {
                    if (decenita == 0) {
                        return decenas[mil1] + " y " + unidades[mil2] + " " + miles + " " + centenas[centenita] + " " + unidades[unidadcita];
                    } else if (decenita == 1 && unidadcita > 0) {
                        return decenas[mil1] + " y " + unidades[mil2] + " " + miles + " " + centenas[centenita] + " " + dieces[unidadcita];
                    } else if (decenita == 2 && unidadcita > 0) {
                        return decenas[mil1] + " y " + unidades[mil2] + " " + miles + " " + centenas[centenita] + " " + veintes[unidadcita];
                    } else if (unidadcita == 0) {
                        return decenas[mil1] + " y " + unidades[mil2] + " " + miles + " " + centenas[centenita] + " " + decenas[decenita];
                    } else
                        return decenas[mil1] + " y " + unidades[mil2] + " " + miles + " " + centenas[centenita] + " " + decenas[decenita] + " y " + unidades[unidadcita];
                }
            }
        }
    }

    public String diecesmet6(String textote){

        int mil2 = Integer.parseInt(textote.substring(2, 3));
        int centenita = Integer.parseInt(textote.substring(3, 4));
        int decenita = Integer.parseInt(textote.substring(4, 5));
        int unidadcita = Integer.parseInt(textote.substring(5, 6));

        if (centenita==0){
            if (decenita == 0) {
                return dieces[mil2] + " " + miles + " "  + unidades[unidadcita];
            } else
            if (decenita == 1 && unidadcita > 0) {
                return dieces[mil2] + " " + miles + " " + dieces[unidadcita];
            }
            else
            if (decenita == 2 && unidadcita > 0) {
                return dieces[mil2] + " " + miles + " " +  veintes[unidadcita];
            } else
            if (unidadcita==0){
                return dieces[mil2] + " " + miles + " " + decenas[decenita];
            }else
                return dieces[mil2] + " " + miles + " " + decenas[decenita] + " y " + unidades[unidadcita];
        } else if (centenita==1) {
            if (decenita == 0 && unidadcita==0) {
                return dieces[mil2] + " " + miles + " "  + centenas[centenita];
            } else if (decenita == 0) {
                return dieces[mil2] + " " + miles + " "  + centenas[centenita] + cienes + " " +  unidades[unidadcita];
            } else
            if (decenita == 1 && unidadcita > 0) {
                return dieces[mil2] + " " + miles + " " + centenas[centenita] + cienes + " " + dieces[unidadcita];
            }
            else
            if (decenita == 2 && unidadcita > 0) {
                return dieces[mil2] + " " + miles + " " +  centenas[centenita] + cienes + " " + veintes[unidadcita];
            } else
            if (unidadcita==0){
                return dieces[mil2] + " " + miles + " " + centenas[centenita] + cienes + " " + decenas[decenita];
            }else
                return dieces[mil2] + " " + miles + " " + centenas[centenita] + cienes + " " + decenas[decenita] + " y " + unidades[unidadcita];
        } else {
            if (decenita == 0) {
                return dieces[mil2] + " " + miles + " "  + centenas[centenita] + " " +  unidades[unidadcita];
            } else
            if (decenita == 1 && unidadcita > 0) {
                return dieces[mil2] + " " + miles + " " + centenas[centenita] + " " + dieces[unidadcita];
            }
            else
            if (decenita == 2 && unidadcita > 0) {
                return dieces[mil2] + " " + miles + " " +  centenas[centenita] + " " + veintes[unidadcita];
            } else
            if (unidadcita==0){
                return dieces[mil2] + " " + miles + " " + centenas[centenita] + " " + decenas[decenita];
            }else
                return dieces[mil2] + " " + miles + " " + centenas[centenita] + " " + decenas[decenita] + " y " + unidades[unidadcita];
        }
    }

    public String veintesmet6(String textote){

        int mil2 = Integer.parseInt(textote.substring(2, 3));
        int centenita = Integer.parseInt(textote.substring(3, 4));
        int decenita = Integer.parseInt(textote.substring(4, 5));
        int unidadcita = Integer.parseInt(textote.substring(5, 6));


        if (centenita==0){
            if (decenita == 0) {
                return miles + " "  + unidades[unidadcita];
            } else
            if (decenita == 1 && unidadcita > 0) {
                return miles + " " + dieces[unidadcita];
            }
            else
            if (decenita == 2 && unidadcita > 0) {
                return miles + " " +  veintes[unidadcita];
            } else
            if (unidadcita==0){
                return miles + " " + decenas[decenita];
            }else
                return miles + " " + decenas[decenita] + " y " + unidades[unidadcita];
        } else if (centenita==1) {
            if (decenita == 0) {
                return miles + " "  + centenas[centenita] + cienes + " " +  unidades[unidadcita];
            } else
            if (decenita == 1 && unidadcita > 0) {
                return miles + " " + centenas[centenita] + cienes + " " + dieces[unidadcita];
            }
            else
            if (decenita == 2 && unidadcita > 0) {
                return miles + " " +  centenas[centenita] + cienes + " " + veintes[unidadcita];
            } else
            if (unidadcita==0){
                return miles + " " + centenas[centenita] + cienes + " " + decenas[decenita];
            }else
                return miles + " " + centenas[centenita] + cienes + " " + decenas[decenita] + " y " + unidades[unidadcita];
        } else {
            if (decenita == 0) {
                return miles + " "  + centenas[centenita] + " " +  unidades[unidadcita];
            } else
            if (decenita == 1 && unidadcita > 0) {
                return miles + " " + centenas[centenita] + " " + dieces[unidadcita];
            }
            else
            if (decenita == 2 && unidadcita > 0) {
                return miles + " " +  centenas[centenita] + " " + veintes[unidadcita];
            } else
            if (unidadcita==0){
                return miles + " " + centenas[centenita] + " " + decenas[decenita];
            }else
                return miles + " " + centenas[centenita] + " " + decenas[decenita] + " y " + unidades[unidadcita];
        }
    }

    public String excepmet6(String textote){

        int centenita = Integer.parseInt(textote.substring(3, 4));
        int decenita = Integer.parseInt(textote.substring(4, 5));
        int unidadcita = Integer.parseInt(textote.substring(5, 6));

            if (centenita==0){
                if (decenita == 0) {
                    return unidades[unidadcita];
                } else
                if (decenita == 1 && unidadcita > 0) {
                    return dieces[unidadcita];
                }
                else
                if (decenita == 2 && unidadcita > 0) {
                    return veintes[unidadcita];
                } else
                if (unidadcita==0){
                    return decenas[decenita];
                }else
                    return decenas[decenita] + " y " + unidades[unidadcita];
            } else if (centenita==1) {
                if (decenita == 0 && unidadcita==0) {
                    return centenas[centenita];
                }else if (decenita == 0) {
                    return centenas[centenita] + cienes + " " +  unidades[unidadcita];
                } else
                if (decenita == 1 && unidadcita > 0) {
                    return centenas[centenita] + cienes + " " + dieces[unidadcita];
                }
                else
                if (decenita == 2 && unidadcita > 0) {
                    return centenas[centenita] + cienes + " " + veintes[unidadcita];
                } else
                if (unidadcita==0){
                    return centenas[centenita] + cienes + " " + decenas[decenita];
                }else
                    return centenas[centenita] + cienes + " " + decenas[decenita] + " y " + unidades[unidadcita];
            } else {
                if (decenita == 0) {
                    return centenas[centenita] + " " +  unidades[unidadcita];
                } else
                if (decenita == 1 && unidadcita > 0) {
                    return centenas[centenita] + " " + dieces[unidadcita];
                }
                else
                if (decenita == 2 && unidadcita > 0) {
                    return centenas[centenita] + " " + veintes[unidadcita];
                } else
                if (unidadcita==0){
                    return centenas[centenita] + " " + decenas[decenita];
                }else
                    return centenas[centenita] + " " + decenas[decenita] + " y " + unidades[unidadcita];
            }
    }

    public String excepmet5(String textote){

        int centenita = Integer.parseInt(textote.substring(2, 3));
        int decenita = Integer.parseInt(textote.substring(3, 4));
        int unidadcita = Integer.parseInt(textote.substring(4, 5));

        if (centenita==0){
            if (decenita == 0) {
                return unidades[unidadcita];
            } else
            if (decenita == 1 && unidadcita > 0) {
                return dieces[unidadcita];
            }
            else
            if (decenita == 2 && unidadcita > 0) {
                return veintes[unidadcita];
            } else
            if (unidadcita==0){
                return decenas[decenita];
            }else
                return decenas[decenita] + " y " + unidades[unidadcita];
        } else if (centenita==1) {
            if (decenita == 0) {
                return centenas[centenita] + cienes + " " +  unidades[unidadcita];
            } else
            if (decenita == 1 && unidadcita > 0) {
                return centenas[centenita] + cienes + " " + dieces[unidadcita];
            }
            else
            if (decenita == 2 && unidadcita > 0) {
                return centenas[centenita] + cienes + " " + veintes[unidadcita];
            } else
            if (unidadcita==0){
                return centenas[centenita] + cienes + " " + decenas[decenita];
            }else
                return centenas[centenita] + cienes + " " + decenas[decenita] + " y " + unidades[unidadcita];
        } else {
            if (decenita == 0) {
                return centenas[centenita] + " " +  unidades[unidadcita];
            } else
            if (decenita == 1 && unidadcita > 0) {
                return centenas[centenita] + " " + dieces[unidadcita];
            }
            else
            if (decenita == 2 && unidadcita > 0) {
                return centenas[centenita] + " " + veintes[unidadcita];
            } else
            if (unidadcita==0){
                return centenas[centenita] + " " + decenas[decenita];
            }else
                return centenas[centenita] + " " + decenas[decenita] + " y " + unidades[unidadcita];
        }
    }

}
